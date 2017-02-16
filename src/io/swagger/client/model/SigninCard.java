package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CardAction;
import java.util.ArrayList;
import java.util.List;



/**
 * A card representing a request to sign in
 **/

@ApiModel(description = "A card representing a request to sign in")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class SigninCard   {
  
  private String text = null;
  private List<CardAction> buttons = new ArrayList<CardAction>();

  
  /**
   * Text for signin request
   **/
  public SigninCard text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text for signin request")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Action to use to perform signin
   **/
  public SigninCard buttons(List<CardAction> buttons) {
    this.buttons = buttons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action to use to perform signin")
  @JsonProperty("buttons")
  public List<CardAction> getButtons() {
    return buttons;
  }
  public void setButtons(List<CardAction> buttons) {
    this.buttons = buttons;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigninCard signinCard = (SigninCard) o;
    return Objects.equals(this.text, signinCard.text) &&
        Objects.equals(this.buttons, signinCard.buttons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, buttons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigninCard {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
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

