package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Channel account information for a conversation
 **/

@ApiModel(description = "Channel account information for a conversation")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class ConversationAccount   {
  
  private Boolean isGroup = null;
  private String id = null;
  private String name = null;

  
  /**
   * Is this a reference to a group
   **/
  public ConversationAccount isGroup(Boolean isGroup) {
    this.isGroup = isGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is this a reference to a group")
  @JsonProperty("isGroup")
  public Boolean getIsGroup() {
    return isGroup;
  }
  public void setIsGroup(Boolean isGroup) {
    this.isGroup = isGroup;
  }

  
  /**
   * Channel id for the user or bot on this channel (Example: joe@smith.com, or @joesmith or 123456)
   **/
  public ConversationAccount id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Channel id for the user or bot on this channel (Example: joe@smith.com, or @joesmith or 123456)")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Display friendly name
   **/
  public ConversationAccount name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Display friendly name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAccount conversationAccount = (ConversationAccount) o;
    return Objects.equals(this.isGroup, conversationAccount.isGroup) &&
        Objects.equals(this.id, conversationAccount.id) &&
        Objects.equals(this.name, conversationAccount.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isGroup, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAccount {\n");
    
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

