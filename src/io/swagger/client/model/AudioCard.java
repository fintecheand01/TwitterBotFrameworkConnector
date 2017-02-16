package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CardAction;
import io.swagger.client.model.MediaUrl;
import io.swagger.client.model.ThumbnailUrl;
import java.util.ArrayList;
import java.util.List;



/**
 * A audio card
 **/

@ApiModel(description = "A audio card")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class AudioCard   {
  
  private String aspect = null;
  private String title = null;
  private String subtitle = null;
  private String text = null;
  private ThumbnailUrl image = null;
  private List<MediaUrl> media = new ArrayList<MediaUrl>();
  private List<CardAction> buttons = new ArrayList<CardAction>();
  private Boolean shareable = null;
  private Boolean autoloop = null;
  private Boolean autostart = null;

  
  /**
   * Aspect ratio of thumbnail/media placeholder, allowed values are \"16x9\" and \"9x16\"
   **/
  public AudioCard aspect(String aspect) {
    this.aspect = aspect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aspect ratio of thumbnail/media placeholder, allowed values are \"16x9\" and \"9x16\"")
  @JsonProperty("aspect")
  public String getAspect() {
    return aspect;
  }
  public void setAspect(String aspect) {
    this.aspect = aspect;
  }

  
  /**
   * Title of the card
   **/
  public AudioCard title(String title) {
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
  public AudioCard subtitle(String subtitle) {
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
   * Text of the card
   **/
  public AudioCard text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text of the card")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Thumbnail placeholder
   **/
  public AudioCard image(ThumbnailUrl image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Thumbnail placeholder")
  @JsonProperty("image")
  public ThumbnailUrl getImage() {
    return image;
  }
  public void setImage(ThumbnailUrl image) {
    this.image = image;
  }

  
  /**
   * Array of media Url objects
   **/
  public AudioCard media(List<MediaUrl> media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of media Url objects")
  @JsonProperty("media")
  public List<MediaUrl> getMedia() {
    return media;
  }
  public void setMedia(List<MediaUrl> media) {
    this.media = media;
  }

  
  /**
   * Set of actions applicable to the current card
   **/
  public AudioCard buttons(List<CardAction> buttons) {
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
   * Is it OK for this content to be shareable with others (default:true)
   **/
  public AudioCard shareable(Boolean shareable) {
    this.shareable = shareable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is it OK for this content to be shareable with others (default:true)")
  @JsonProperty("shareable")
  public Boolean getShareable() {
    return shareable;
  }
  public void setShareable(Boolean shareable) {
    this.shareable = shareable;
  }

  
  /**
   * Should the client loop playback at end of content (default:true)
   **/
  public AudioCard autoloop(Boolean autoloop) {
    this.autoloop = autoloop;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Should the client loop playback at end of content (default:true)")
  @JsonProperty("autoloop")
  public Boolean getAutoloop() {
    return autoloop;
  }
  public void setAutoloop(Boolean autoloop) {
    this.autoloop = autoloop;
  }

  
  /**
   * Should the client automatically start playback of video in this card (default:true)
   **/
  public AudioCard autostart(Boolean autostart) {
    this.autostart = autostart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Should the client automatically start playback of video in this card (default:true)")
  @JsonProperty("autostart")
  public Boolean getAutostart() {
    return autostart;
  }
  public void setAutostart(Boolean autostart) {
    this.autostart = autostart;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioCard audioCard = (AudioCard) o;
    return Objects.equals(this.aspect, audioCard.aspect) &&
        Objects.equals(this.title, audioCard.title) &&
        Objects.equals(this.subtitle, audioCard.subtitle) &&
        Objects.equals(this.text, audioCard.text) &&
        Objects.equals(this.image, audioCard.image) &&
        Objects.equals(this.media, audioCard.media) &&
        Objects.equals(this.buttons, audioCard.buttons) &&
        Objects.equals(this.shareable, audioCard.shareable) &&
        Objects.equals(this.autoloop, audioCard.autoloop) &&
        Objects.equals(this.autostart, audioCard.autostart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspect, title, subtitle, text, image, media, buttons, shareable, autoloop, autostart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioCard {\n");
    
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
    sb.append("    autoloop: ").append(toIndentedString(autoloop)).append("\n");
    sb.append("    autostart: ").append(toIndentedString(autostart)).append("\n");
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

