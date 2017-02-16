/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.botframework.connector;

import java.util.List;

import twitter4j.DirectMessage;
import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.UserStreamListener;
import twitter4j.auth.AccessToken;
import twitter4j.conf.ConfigurationBuilder;

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
    public static void main(String[] args) throws TwitterException{
        // TODO code application logic here
        //access the twitter API using your twitter4j.properties file
        Twitter twitter = TwitterFactory.getSingleton();
        GetDirectMessage(twitter);          
        //print a message so we know when it finishes
        System.out.println("Done.");
    }
    
    public static void GetDirectMessage(Twitter twitter) {
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
                    Status status = twitter.updateStatus("Hola " +user_name +" ¡Estamos atendiendo tu peticion! #Fintechando #HaciendoElParo");
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
            System.exit(-1);
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
}
