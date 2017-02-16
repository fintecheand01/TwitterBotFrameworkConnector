package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object describing a media thumbnail
 **/

@ApiModel(description = "Object describing a media thumbnail")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class ThumbnailUrl   {
  
  private String url = null;
  private String alt = null;

  
  /**
   * url pointing to an thumbnail to use for media content
   **/
  public ThumbnailUrl url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "url pointing to an thumbnail to use for media content")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Alt text to display for screen readers on the thumbnail image
   **/
  public ThumbnailUrl alt(String alt) {
    this.alt = alt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Alt text to display for screen readers on the thumbnail image")
  @JsonProperty("alt")
  public String getAlt() {
    return alt;
  }
  public void setAlt(String alt) {
    this.alt = alt;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThumbnailUrl thumbnailUrl = (ThumbnailUrl) o;
    return Objects.equals(this.url, thumbnailUrl.url) &&
        Objects.equals(this.alt, thumbnailUrl.alt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, alt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThumbnailUrl {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
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

