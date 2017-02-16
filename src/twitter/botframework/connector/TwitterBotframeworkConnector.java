/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.botframework.connector;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ConversationsApi;
import io.swagger.client.model.Activity;
import io.swagger.client.model.ActivitySet;
import io.swagger.client.model.ChannelAccount;
import io.swagger.client.model.Conversation;
import io.swagger.client.model.ResourceResponse;
import java.util.List;

import twitter4j.DirectMessage;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author victor
 */
public class TwitterBotframeworkConnector {

    private static String user_message = "";
    private static String user_name = "@";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException, ApiException, InterruptedException{
        // TODO code application logic here
        //access the twitter API using your twitter4j.properties file
        Twitter twitter = TwitterFactory.getSingleton();        
        GetDirectMessage(twitter);          
        //print a message so we know when it finishes
        System.out.println("Done.");
    }
    
    public static void GetDirectMessage(Twitter twitter) throws ApiException, InterruptedException{
        //Twitter twitter = new TwitterFactory().getInstance();        
        try {
            Paging paging = new Paging(1);
            List<DirectMessage> messages;
            do {
                messages = twitter.getDirectMessages(paging);
                for (DirectMessage message : messages) {
                    
                    System.out.println("From: @" + message.getSenderScreenName() + " id:" + message.getId() + " - "
                            + message.getText());
                    user_name = user_name.concat(message.getSenderScreenName());
                    user_message = message.getText();
                    //send a tweet
                    //Status status = twitter.updateStatus("Hola " +user_name +" ¡Estamos atendiendo tu peticion! #Fintechando #HaciendoElParo");
                    DirectLineToBot(user_name, user_message);
                    SendDirectMessageAsResponse(twitter);
                }
                paging.setPage(paging.getPage() + 1);
            } 
            while (messages.size() > 0 && paging.getPage() < 10);
            /*System.out.println("done.");
            System.exit(0);*/
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get messages: " + te.getMessage());            
        }
         catch (ApiException te) {
            te.printStackTrace();
            System.out.println("Failed to get messages: " + te.getMessage());            
        }
    }
    
    public static void SendDirectMessageAsResponse(Twitter twitter){
        //Twitter twitter = new TwitterFactory().getInstance();
        try {
            DirectMessage message = twitter.sendDirectMessage(user_name, user_message);
            System.out.println("Direct message successfully sent to " + message.getRecipientScreenName());
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to send a direct message: " + te.getMessage());
            System.exit(-1);
        }
    }    

    public static void DirectLineToBot(String user_name, String user_message) throws ApiException, InterruptedException {
		String apiKey = "NoB7NVwpKtU.cwA.S8Y.9gSmVTbxanULuDQBYl7p0ILUFlJkAwm65qYo5Tp4Feo";
		ConversationsApi conversationsApi = new ConversationsApi();
		ApiClient client = conversationsApi.getApiClient();
		client.addDefaultHeader("Authorization", "Bearer " + apiKey);

		// Enable Jersey LoggingFilter and you can check contents of requests
		client.setDebugging(true);

		System.out.println("@@conversation start");
		Conversation conv = conversationsApi.conversationsStartConversation();
		{
			System.out.println("@@post a conversation message");
			Activity activity = new Activity();
			ChannelAccount channelAccount = new ChannelAccount();
			channelAccount.setName(user_name);
			channelAccount.setId("directline");
			activity.setFrom(channelAccount);
			activity.setType("Message");
			activity.setText(user_message);
			ResourceResponse response = conversationsApi.conversationsPostActivity(conv.getConversationId(), activity);
		}

		{
			System.out.println("@@get conversation messages");
			String watermark = "";
			do {
				ActivitySet activitySet = //
						conversationsApi.conversationsGetActivities(conv.getConversationId(), watermark);
				System.out.println("@@activitySet size = " + activitySet.getActivities().size());
				for (Activity activity : activitySet.getActivities()) {
					System.out.println("\t" + activity.getFrom().getName() + " says \"" + activity.getText() + "\"");
                                        user_message = activity.getText();
				}
				if (activitySet.getWatermark() == null || watermark.equals(activitySet.getWatermark()) == false)
					break;
				watermark = activitySet.getWatermark();
				System.out.println("\twatermark = " + watermark);
			} while (true);
		}
        System.out.println("@@end");
    }
    
}
