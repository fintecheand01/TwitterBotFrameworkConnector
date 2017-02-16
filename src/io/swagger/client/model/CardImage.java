package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CardAction;



/**
 * An image on a card
 **/

@ApiModel(description = "An image on a card")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class CardImage   {
  
  private String url = null;
  private String alt = null;
  private CardAction tap = null;

  
  /**
   * URL Thumbnail image for major content property.
   **/
  public CardImage url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL Thumbnail image for major content property.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Image description intended for screen readers
   **/
  public CardImage alt(String alt) {
    this.alt = alt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Image description intended for screen readers")
  @JsonProperty("alt")
  public String getAlt() {
    return alt;
  }
  public void setAlt(String alt) {
    this.alt = alt;
  }

  
  /**
   * Action assigned to specific Attachment.E.g.navigate to specific URL or play/open media content
   **/
  public CardImage tap(CardAction tap) {
    this.tap = tap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action assigned to specific Attachment.E.g.navigate to specific URL or play/open media content")
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
    CardImage cardImage = (CardImage) o;
    return Objects.equals(this.url, cardImage.url) &&
        Objects.equals(this.alt, cardImage.alt) &&
        Objects.equals(this.tap, cardImage.tap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, alt, tap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardImage {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
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

