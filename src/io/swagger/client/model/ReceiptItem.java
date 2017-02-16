package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CardAction;
import io.swagger.client.model.CardImage;



/**
 * An item on a receipt card
 **/

@ApiModel(description = "An item on a receipt card")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class ReceiptItem   {
  
  private String title = null;
  private String subtitle = null;
  private String text = null;
  private CardImage image = null;
  private String price = null;
  private String quantity = null;
  private CardAction tap = null;

  
  /**
   * Title of the Card
   **/
  public ReceiptItem title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title of the Card")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Subtitle appears just below Title field, differs from Title in font styling only
   **/
  public ReceiptItem subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subtitle appears just below Title field, differs from Title in font styling only")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  
  /**
   * Text field appears just below subtitle, differs from Subtitle in font styling only
   **/
  public ReceiptItem text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text field appears just below subtitle, differs from Subtitle in font styling only")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Image
   **/
  public ReceiptItem image(CardImage image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Image")
  @JsonProperty("image")
  public CardImage getImage() {
    return image;
  }
  public void setImage(CardImage image) {
    this.image = image;
  }

  
  /**
   * Amount with currency
   **/
  public ReceiptItem price(String price) {
    this.price = price;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Amount with currency")
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  
  /**
   * Number of items of given kind
   **/
  public ReceiptItem quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of items of given kind")
  @JsonProperty("quantity")
  public String getQuantity() {
    return quantity;
  }
  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  
  /**
   * This action will be activated when user taps on the Item bubble.
   **/
  public ReceiptItem tap(CardAction tap) {
    this.tap = tap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This action will be activated when user taps on the Item bubble.")
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
    ReceiptItem receiptItem = (ReceiptItem) o;
    return Objects.equals(this.title, receiptItem.title) &&
        Objects.equals(this.subtitle, receiptItem.subtitle) &&
        Objects.equals(this.text, receiptItem.text) &&
        Objects.equals(this.image, receiptItem.image) &&
        Objects.equals(this.price, receiptItem.price) &&
        Objects.equals(this.quantity, receiptItem.quantity) &&
        Objects.equals(this.tap, receiptItem.tap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle, text, image, price, quantity, tap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptItem {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

