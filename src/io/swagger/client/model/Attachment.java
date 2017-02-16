package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An attachment within an activity
 **/

@ApiModel(description = "An attachment within an activity")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class Attachment   {
  
  private String contentType = null;
  private String contentUrl = null;
  private Object content = null;
  private String name = null;
  private String thumbnailUrl = null;

  
  /**
   * mimetype/Contenttype for the file
   **/
  public Attachment contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "mimetype/Contenttype for the file")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  
  /**
   * Content Url
   **/
  public Attachment contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content Url")
  @JsonProperty("contentUrl")
  public String getContentUrl() {
    return contentUrl;
  }
  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  
  /**
   * Embedded content
   **/
  public Attachment content(Object content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Embedded content")
  @JsonProperty("content")
  public Object getContent() {
    return content;
  }
  public void setContent(Object content) {
    this.content = content;
  }

  
  /**
   * (OPTIONAL) The name of the attachment
   **/
  public Attachment name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(OPTIONAL) The name of the attachment")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * (OPTIONAL) Thumbnail associated with attachment
   **/
  public Attachment thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(OPTIONAL) Thumbnail associated with attachment")
  @JsonProperty("thumbnailUrl")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.contentType, attachment.contentType) &&
        Objects.equals(this.contentUrl, attachment.contentUrl) &&
        Objects.equals(this.content, attachment.content) &&
        Objects.equals(this.name, attachment.name) &&
        Objects.equals(this.thumbnailUrl, attachment.thumbnailUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, contentUrl, content, name, thumbnailUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
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

