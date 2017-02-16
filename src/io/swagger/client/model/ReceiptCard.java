package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CardAction;
import io.swagger.client.model.Fact;
import io.swagger.client.model.ReceiptItem;
import java.util.ArrayList;
import java.util.List;



/**
 * A receipt card
 **/

@ApiModel(description = "A receipt card")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class ReceiptCard   {
  
  private String title = null;
  private List<ReceiptItem> items = new ArrayList<ReceiptItem>();
  private List<Fact> facts = new ArrayList<Fact>();
  private CardAction tap = null;
  private String total = null;
  private String tax = null;
  private String vat = null;
  private List<CardAction> buttons = new ArrayList<CardAction>();

  
  /**
   * Title of the card
   **/
  public ReceiptCard title(String title) {
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
   * Array of Receipt Items
   **/
  public ReceiptCard items(List<ReceiptItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of Receipt Items")
  @JsonProperty("items")
  public List<ReceiptItem> getItems() {
    return items;
  }
  public void setItems(List<ReceiptItem> items) {
    this.items = items;
  }

  
  /**
   * Array of Fact Objects   Array of key-value pairs.
   **/
  public ReceiptCard facts(List<Fact> facts) {
    this.facts = facts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of Fact Objects   Array of key-value pairs.")
  @JsonProperty("facts")
  public List<Fact> getFacts() {
    return facts;
  }
  public void setFacts(List<Fact> facts) {
    this.facts = facts;
  }

  
  /**
   * This action will be activated when user taps on the card
   **/
  public ReceiptCard tap(CardAction tap) {
    this.tap = tap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This action will be activated when user taps on the card")
  @JsonProperty("tap")
  public CardAction getTap() {
    return tap;
  }
  public void setTap(CardAction tap) {
    this.tap = tap;
  }

  
  /**
   * Total amount of money paid (or should be paid)
   **/
  public ReceiptCard total(String total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total amount of money paid (or should be paid)")
  @JsonProperty("total")
  public String getTotal() {
    return total;
  }
  public void setTotal(String total) {
    this.total = total;
  }

  
  /**
   * Total amount of TAX paid(or should be paid)
   **/
  public ReceiptCard tax(String tax) {
    this.tax = tax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total amount of TAX paid(or should be paid)")
  @JsonProperty("tax")
  public String getTax() {
    return tax;
  }
  public void setTax(String tax) {
    this.tax = tax;
  }

  
  /**
   * Total amount of VAT paid(or should be paid)
   **/
  public ReceiptCard vat(String vat) {
    this.vat = vat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total amount of VAT paid(or should be paid)")
  @JsonProperty("vat")
  public String getVat() {
    return vat;
  }
  public void setVat(String vat) {
    this.vat = vat;
  }

  
  /**
   * Set of actions applicable to the current card
   **/
  public ReceiptCard buttons(List<CardAction> buttons) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptCard receiptCard = (ReceiptCard) o;
    return Objects.equals(this.title, receiptCard.title) &&
        Objects.equals(this.items, receiptCard.items) &&
        Objects.equals(this.facts, receiptCard.facts) &&
        Objects.equals(this.tap, receiptCard.tap) &&
        Objects.equals(this.total, receiptCard.total) &&
        Objects.equals(this.tax, receiptCard.tax) &&
        Objects.equals(this.vat, receiptCard.vat) &&
        Objects.equals(this.buttons, receiptCard.buttons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, items, facts, tap, total, tax, vat, buttons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptCard {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    facts: ").append(toIndentedString(facts)).append("\n");
    sb.append("    tap: ").append(toIndentedString(tap)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
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

