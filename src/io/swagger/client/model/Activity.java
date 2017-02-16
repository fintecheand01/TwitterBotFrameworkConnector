package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Attachment;
import io.swagger.client.model.ChannelAccount;
import io.swagger.client.model.ConversationAccount;
import io.swagger.client.model.Entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * An Activity is the basic communication type for the Bot Framework 3.0 protocol
 **/

@ApiModel(description = "An Activity is the basic communication type for the Bot Framework 3.0 protocol")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class Activity   {
  
  private String type = null;
  private String id = null;
  private Date timestamp = null;
  private Date localTimestamp = null;
  private String serviceUrl = null;
  private String channelId = null;
  private ChannelAccount from = null;
  private ConversationAccount conversation = null;
  private ChannelAccount recipient = null;
  private String textFormat = null;
  private String attachmentLayout = null;
  private List<ChannelAccount> membersAdded = new ArrayList<ChannelAccount>();
  private List<ChannelAccount> membersRemoved = new ArrayList<ChannelAccount>();
  private String topicName = null;
  private Boolean historyDisclosed = null;
  private String locale = null;
  private String text = null;
  private String summary = null;
  private List<Attachment> attachments = new ArrayList<Attachment>();
  private List<Entity> entities = new ArrayList<Entity>();
  private Object channelData = null;
  private String action = null;
  private String replyToId = null;
  private Object value = null;

  
  /**
   * The type of the activity [message|contactRelationUpdate|converationUpdate|typing]
   **/
  public Activity type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the activity [message|contactRelationUpdate|converationUpdate|typing]")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Id for the activity
   **/
  public Activity id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id for the activity")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * UTC Time when message was sent (Set by service)
   **/
  public Activity timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "UTC Time when message was sent (Set by service)")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * Local time when message was sent (set by client Ex: 2016-09-23T13:07:49.4714686-07:00)
   **/
  public Activity localTimestamp(Date localTimestamp) {
    this.localTimestamp = localTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Local time when message was sent (set by client Ex: 2016-09-23T13:07:49.4714686-07:00)")
  @JsonProperty("localTimestamp")
  public Date getLocalTimestamp() {
    return localTimestamp;
  }
  public void setLocalTimestamp(Date localTimestamp) {
    this.localTimestamp = localTimestamp;
  }

  
  /**
   * Service endpoint
   **/
  public Activity serviceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service endpoint")
  @JsonProperty("serviceUrl")
  public String getServiceUrl() {
    return serviceUrl;
  }
  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  
  /**
   * ChannelId the activity was on
   **/
  public Activity channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ChannelId the activity was on")
  @JsonProperty("channelId")
  public String getChannelId() {
    return channelId;
  }
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  
  /**
   * Sender address
   **/
  public Activity from(ChannelAccount from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sender address")
  @JsonProperty("from")
  public ChannelAccount getFrom() {
    return from;
  }
  public void setFrom(ChannelAccount from) {
    this.from = from;
  }

  
  /**
   * Conversation
   **/
  public Activity conversation(ConversationAccount conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversation")
  @JsonProperty("conversation")
  public ConversationAccount getConversation() {
    return conversation;
  }
  public void setConversation(ConversationAccount conversation) {
    this.conversation = conversation;
  }

  
  /**
   * (Outbound to bot only) Bot's address that received the message
   **/
  public Activity recipient(ChannelAccount recipient) {
    this.recipient = recipient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Outbound to bot only) Bot's address that received the message")
  @JsonProperty("recipient")
  public ChannelAccount getRecipient() {
    return recipient;
  }
  public void setRecipient(ChannelAccount recipient) {
    this.recipient = recipient;
  }

  
  /**
   * Format of text fields [plain|markdown] Default:markdown
   **/
  public Activity textFormat(String textFormat) {
    this.textFormat = textFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Format of text fields [plain|markdown] Default:markdown")
  @JsonProperty("textFormat")
  public String getTextFormat() {
    return textFormat;
  }
  public void setTextFormat(String textFormat) {
    this.textFormat = textFormat;
  }

  
  /**
   * AttachmentLayout - hint for how to deal with multiple attachments Values: [list|carousel] Default:list
   **/
  public Activity attachmentLayout(String attachmentLayout) {
    this.attachmentLayout = attachmentLayout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "AttachmentLayout - hint for how to deal with multiple attachments Values: [list|carousel] Default:list")
  @JsonProperty("attachmentLayout")
  public String getAttachmentLayout() {
    return attachmentLayout;
  }
  public void setAttachmentLayout(String attachmentLayout) {
    this.attachmentLayout = attachmentLayout;
  }

  
  /**
   * Array of address added
   **/
  public Activity membersAdded(List<ChannelAccount> membersAdded) {
    this.membersAdded = membersAdded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of address added")
  @JsonProperty("membersAdded")
  public List<ChannelAccount> getMembersAdded() {
    return membersAdded;
  }
  public void setMembersAdded(List<ChannelAccount> membersAdded) {
    this.membersAdded = membersAdded;
  }

  
  /**
   * Array of addresses removed
   **/
  public Activity membersRemoved(List<ChannelAccount> membersRemoved) {
    this.membersRemoved = membersRemoved;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of addresses removed")
  @JsonProperty("membersRemoved")
  public List<ChannelAccount> getMembersRemoved() {
    return membersRemoved;
  }
  public void setMembersRemoved(List<ChannelAccount> membersRemoved) {
    this.membersRemoved = membersRemoved;
  }

  
  /**
   * Conversations new topic name
   **/
  public Activity topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversations new topic name")
  @JsonProperty("topicName")
  public String getTopicName() {
    return topicName;
  }
  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  
  /**
   * the previous history of the channel was disclosed
   **/
  public Activity historyDisclosed(Boolean historyDisclosed) {
    this.historyDisclosed = historyDisclosed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the previous history of the channel was disclosed")
  @JsonProperty("historyDisclosed")
  public Boolean getHistoryDisclosed() {
    return historyDisclosed;
  }
  public void setHistoryDisclosed(Boolean historyDisclosed) {
    this.historyDisclosed = historyDisclosed;
  }

  
  /**
   * The language code of the Text field
   **/
  public Activity locale(String locale) {
    this.locale = locale;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language code of the Text field")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * Content for the message
   **/
  public Activity text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content for the message")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Text to display if you can't render cards
   **/
  public Activity summary(String summary) {
    this.summary = summary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to display if you can't render cards")
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }
  public void setSummary(String summary) {
    this.summary = summary;
  }

  
  /**
   * Attachments
   **/
  public Activity attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attachments")
  @JsonProperty("attachments")
  public List<Attachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  
  /**
   * Collection of Entity objects, each of which contains metadata about this activity. Each Entity object is typed.
   **/
  public Activity entities(List<Entity> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Collection of Entity objects, each of which contains metadata about this activity. Each Entity object is typed.")
  @JsonProperty("entities")
  public List<Entity> getEntities() {
    return entities;
  }
  public void setEntities(List<Entity> entities) {
    this.entities = entities;
  }

  
  /**
   * Channel specific payload
   **/
  public Activity channelData(Object channelData) {
    this.channelData = channelData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Channel specific payload")
  @JsonProperty("channelData")
  public Object getChannelData() {
    return channelData;
  }
  public void setChannelData(Object channelData) {
    this.channelData = channelData;
  }

  
  /**
   * ContactAdded/Removed action
   **/
  public Activity action(String action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ContactAdded/Removed action")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   * the original id this message is a response to
   **/
  public Activity replyToId(String replyToId) {
    this.replyToId = replyToId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the original id this message is a response to")
  @JsonProperty("replyToId")
  public String getReplyToId() {
    return replyToId;
  }
  public void setReplyToId(String replyToId) {
    this.replyToId = replyToId;
  }

  
  /**
   * Open ended value
   **/
  public Activity value(Object value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Open ended value")
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }
  public void setValue(Object value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.type, activity.type) &&
        Objects.equals(this.id, activity.id) &&
        Objects.equals(this.timestamp, activity.timestamp) &&
        Objects.equals(this.localTimestamp, activity.localTimestamp) &&
        Objects.equals(this.serviceUrl, activity.serviceUrl) &&
        Objects.equals(this.channelId, activity.channelId) &&
        Objects.equals(this.from, activity.from) &&
        Objects.equals(this.conversation, activity.conversation) &&
        Objects.equals(this.recipient, activity.recipient) &&
        Objects.equals(this.textFormat, activity.textFormat) &&
        Objects.equals(this.attachmentLayout, activity.attachmentLayout) &&
        Objects.equals(this.membersAdded, activity.membersAdded) &&
        Objects.equals(this.membersRemoved, activity.membersRemoved) &&
        Objects.equals(this.topicName, activity.topicName) &&
        Objects.equals(this.historyDisclosed, activity.historyDisclosed) &&
        Objects.equals(this.locale, activity.locale) &&
        Objects.equals(this.text, activity.text) &&
        Objects.equals(this.summary, activity.summary) &&
        Objects.equals(this.attachments, activity.attachments) &&
        Objects.equals(this.entities, activity.entities) &&
        Objects.equals(this.channelData, activity.channelData) &&
        Objects.equals(this.action, activity.action) &&
        Objects.equals(this.replyToId, activity.replyToId) &&
        Objects.equals(this.value, activity.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, timestamp, localTimestamp, serviceUrl, channelId, from, conversation, recipient, textFormat, attachmentLayout, membersAdded, membersRemoved, topicName, historyDisclosed, locale, text, summary, attachments, entities, channelData, action, replyToId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    localTimestamp: ").append(toIndentedString(localTimestamp)).append("\n");
    sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    textFormat: ").append(toIndentedString(textFormat)).append("\n");
    sb.append("    attachmentLayout: ").append(toIndentedString(attachmentLayout)).append("\n");
    sb.append("    membersAdded: ").append(toIndentedString(membersAdded)).append("\n");
    sb.append("    membersRemoved: ").append(toIndentedString(membersRemoved)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    historyDisclosed: ").append(toIndentedString(historyDisclosed)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    channelData: ").append(toIndentedString(channelData)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    replyToId: ").append(toIndentedString(replyToId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

