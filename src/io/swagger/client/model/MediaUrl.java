package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * MediaUrl data
 **/

@ApiModel(description = "MediaUrl data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class MediaUrl   {
  
  private String url = null;
  private String profile = null;

  
  /**
   * Url for the media
   **/
  public MediaUrl url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Url for the media")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Optional profile hint to the client to differentiate multiple MediaUrl objects from each other
   **/
  public MediaUrl profile(String profile) {
    this.profile = profile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional profile hint to the client to differentiate multiple MediaUrl objects from each other")
  @JsonProperty("profile")
  public String getProfile() {
    return profile;
  }
  public void setProfile(String profile) {
    this.profile = profile;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUrl mediaUrl = (MediaUrl) o;
    return Objects.equals(this.url, mediaUrl.url) &&
        Objects.equals(this.profile, mediaUrl.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUrl {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

