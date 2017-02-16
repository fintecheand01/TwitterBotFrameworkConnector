package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CardAction;
import io.swagger.client.model.CardImage;
import java.util.ArrayList;
import java.util.List;



/**
 * A Hero card (card with a single, large image)
 **/

@ApiModel(description = "A Hero card (card with a single, large image)")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class HeroCard   {
  
  private String title = null;
  private String subtitle = null;
  private String text = null;
  private List<CardImage> images = new ArrayList<CardImage>();
  private List<CardAction> buttons = new ArrayList<CardAction>();
  private CardAction tap = null;

  
  /**
   * Title of the card
   **/
  public HeroCard title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title of the card")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Subtitle of the card
   **/
  public HeroCard subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subtitle of the card")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  
  /**
   * Text for the card
   **/
  public HeroCard text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text for the card")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Array of images for the card
   **/
  public HeroCard images(List<CardImage> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of images for the card")
  @JsonProperty("images")
  public List<CardImage> getImages() {
    return images;
  }
  public void setImages(List<CardImage> images) {
    this.images = images;
  }

  
  /**
   * Set of actions applicable to the current card
   **/
  public HeroCard buttons(List<CardAction> buttons) {
    this.buttons = buttons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of actions applicable to the current card")
  @JsonProperty("buttons")
  public List<CardAction> getButtons() {
    return buttons;
  }
  public void setButtons(List<CardAction> buttons) {
    this.buttons = buttons;
  }

  
  /**
   * This action will be activated when user taps on the card itself
   **/
  public HeroCard tap(CardAction tap) {
    this.tap = tap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This action will be activated when user taps on the card itself")
  @JsonProperty("tap")
  public CardAction getTap() {
    return tap;
  }
  public void setTap(CardAction tap) {
    this.tap = tap;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeroCard heroCard = (HeroCard) o;
    return Objects.equals(this.title, heroCard.title) &&
        Objects.equals(this.subtitle, heroCard.subtitle) &&
        Objects.equals(this.text, heroCard.text) &&
        Objects.equals(this.images, heroCard.images) &&
        Objects.equals(this.buttons, heroCard.buttons) &&
        Objects.equals(this.tap, heroCard.tap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle, text, images, buttons, tap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeroCard {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    tap: ").append(toIndentedString(tap)).append("\n");
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

