package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Set of key-value pairs. Advantage of this section is that key and value properties will be \r\n            rendered with default style information with some delimiter between them. So there is no need for developer to specify style information.
 **/

@ApiModel(description = "Set of key-value pairs. Advantage of this section is that key and value properties will be \r\n            rendered with default style information with some delimiter between them. So there is no need for developer to specify style information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class Fact   {
  
  private String key = null;
  private String value = null;

  
  /**
   * The key for this Fact
   **/
  public Fact key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The key for this Fact")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * The value for this Fact
   **/
  public Fact value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value for this Fact")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
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
    Fact fact = (Fact) o;
    return Objects.equals(this.key, fact.key) &&
        Objects.equals(this.value, fact.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fact {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

