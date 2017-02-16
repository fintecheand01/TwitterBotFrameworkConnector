package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ChannelAccount;



/**
 * Mention information (entity type: \&quot;mention\&quot;)
 **/

@ApiModel(description = "Mention information (entity type: \"mention\")")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class Mention   {
  
  private ChannelAccount mentioned = null;
  private String text = null;
  private String type = null;

  
  /**
   * The mentioned user
   **/
  public Mention mentioned(ChannelAccount mentioned) {
    this.mentioned = mentioned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The mentioned user")
  @JsonProperty("mentioned")
  public ChannelAccount getMentioned() {
    return mentioned;
  }
  public void setMentioned(ChannelAccount mentioned) {
    this.mentioned = mentioned;
  }

  
  /**
   * Sub Text which represents the mention (can be null or empty)
   **/
  public Mention text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sub Text which represents the mention (can be null or empty)")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Entity Type (typically from schema.org types)
   **/
  public Mention type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Entity Type (typically from schema.org types)")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mention mention = (Mention) o;
    return Objects.equals(this.mentioned, mention.mentioned) &&
        Objects.equals(this.text, mention.text) &&
        Objects.equals(this.type, mention.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mentioned, text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mention {\n");
    
    sb.append("    mentioned: ").append(toIndentedString(mentioned)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

