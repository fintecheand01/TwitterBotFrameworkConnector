package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An object representing a conversation or a conversation token
 **/

@ApiModel(description = "An object representing a conversation or a conversation token")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class Conversation   {
  
  private String conversationId = null;
  private String token = null;
  private Integer expiresIn = null;
  private String streamUrl = null;
  private String eTag = null;

  
  /**
   * ID for this conversation
   **/
  public Conversation conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID for this conversation")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   * Token scoped to this conversation
   **/
  public Conversation token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token scoped to this conversation")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Expiration for token
   **/
  public Conversation expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration for token")
  @JsonProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  
  /**
   * URL for this conversation's message stream
   **/
  public Conversation streamUrl(String streamUrl) {
    this.streamUrl = streamUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL for this conversation's message stream")
  @JsonProperty("streamUrl")
  public String getStreamUrl() {
    return streamUrl;
  }
  public void setStreamUrl(String streamUrl) {
    this.streamUrl = streamUrl;
  }

  
  /**
   **/
  public Conversation eTag(String eTag) {
    this.eTag = eTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eTag")
  public String getETag() {
    return eTag;
  }
  public void setETag(String eTag) {
    this.eTag = eTag;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conversation conversation = (Conversation) o;
    return Objects.equals(this.conversationId, conversation.conversationId) &&
        Objects.equals(this.token, conversation.token) &&
        Objects.equals(this.expiresIn, conversation.expiresIn) &&
        Objects.equals(this.streamUrl, conversation.streamUrl) &&
        Objects.equals(this.eTag, conversation.eTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, token, expiresIn, streamUrl, eTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    streamUrl: ").append(toIndentedString(streamUrl)).append("\n");
    sb.append("    eTag: ").append(toIndentedString(eTag)).append("\n");
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

