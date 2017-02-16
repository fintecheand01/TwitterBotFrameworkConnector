package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Activity;
import java.util.ArrayList;
import java.util.List;



/**
 * A collection of activities
 **/

@ApiModel(description = "A collection of activities")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-15T21:57:26.280-06:00")
public class ActivitySet   {
  
  private List<Activity> activities = new ArrayList<Activity>();
  private String watermark = null;

  
  /**
   * Activities
   **/
  public ActivitySet activities(List<Activity> activities) {
    this.activities = activities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activities")
  @JsonProperty("activities")
  public List<Activity> getActivities() {
    return activities;
  }
  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }

  
  /**
   * Maximum watermark of activities within this set
   **/
  public ActivitySet watermark(String watermark) {
    this.watermark = watermark;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum watermark of activities within this set")
  @JsonProperty("watermark")
  public String getWatermark() {
    return watermark;
  }
  public void setWatermark(String watermark) {
    this.watermark = watermark;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivitySet activitySet = (ActivitySet) o;
    return Objects.equals(this.activities, activitySet.activities) &&
        Objects.equals(this.watermark, activitySet.watermark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activities, watermark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivitySet {\n");
    
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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

