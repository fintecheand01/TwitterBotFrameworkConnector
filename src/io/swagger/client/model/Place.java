package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Place (entity type: \&quot;https://schema.org/Place\&quot;)
 **/

@ApiModel(description = "Place (entity type: \"https://schema.org/Place\")")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class Place   {
  
  private Object address = null;
  private Object geo = null;
  private Object hasMap = null;
  private String type = null;
  private String name = null;

  
  /**
   * Address of the place (may be `string` or complex object of type `PostalAddress`)
   **/
  public Place address(Object address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address of the place (may be `string` or complex object of type `PostalAddress`)")
  @JsonProperty("address")
  public Object getAddress() {
    return address;
  }
  public void setAddress(Object address) {
    this.address = address;
  }

  
  /**
   * Geo coordinates of the place (may be complex object of type `GeoCoordinates` or `GeoShape`)
   **/
  public Place geo(Object geo) {
    this.geo = geo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Geo coordinates of the place (may be complex object of type `GeoCoordinates` or `GeoShape`)")
  @JsonProperty("geo")
  public Object getGeo() {
    return geo;
  }
  public void setGeo(Object geo) {
    this.geo = geo;
  }

  
  /**
   * Map to the place (may be `string` (URL) or complex object of type `Map`)
   **/
  public Place hasMap(Object hasMap) {
    this.hasMap = hasMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map to the place (may be `string` (URL) or complex object of type `Map`)")
  @JsonProperty("hasMap")
  public Object getHasMap() {
    return hasMap;
  }
  public void setHasMap(Object hasMap) {
    this.hasMap = hasMap;
  }

  
  /**
   * The type of the thing
   **/
  public Place type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the thing")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * The name of the thing
   **/
  public Place name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the thing")
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
    Place place = (Place) o;
    return Objects.equals(this.address, place.address) &&
        Objects.equals(this.geo, place.geo) &&
        Objects.equals(this.hasMap, place.hasMap) &&
        Objects.equals(this.type, place.type) &&
        Objects.equals(this.name, place.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, geo, hasMap, type, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Place {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    hasMap: ").append(toIndentedString(hasMap)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

