package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * GeoCoordinates (entity type: \&quot;https://schema.org/GeoCoordinates\&quot;)
 **/

@ApiModel(description = "GeoCoordinates (entity type: \"https://schema.org/GeoCoordinates\")")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class GeoCoordinates   {
  
  private Double elevation = null;
  private Double latitude = null;
  private Double longitude = null;
  private String type = null;
  private String name = null;

  
  /**
   * Elevation of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
   **/
  public GeoCoordinates elevation(Double elevation) {
    this.elevation = elevation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Elevation of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)")
  @JsonProperty("elevation")
  public Double getElevation() {
    return elevation;
  }
  public void setElevation(Double elevation) {
    this.elevation = elevation;
  }

  
  /**
   * Latitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
   **/
  public GeoCoordinates latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
   **/
  public GeoCoordinates longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Longitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  
  /**
   * The type of the thing
   **/
  public GeoCoordinates type(String type) {
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
  public GeoCoordinates name(String name) {
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
    GeoCoordinates geoCoordinates = (GeoCoordinates) o;
    return Objects.equals(this.elevation, geoCoordinates.elevation) &&
        Objects.equals(this.latitude, geoCoordinates.latitude) &&
        Objects.equals(this.longitude, geoCoordinates.longitude) &&
        Objects.equals(this.type, geoCoordinates.type) &&
        Objects.equals(this.name, geoCoordinates.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elevation, latitude, longitude, type, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoCoordinates {\n");
    
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

