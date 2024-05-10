/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(StardeliveryTaskDetailV30DataStarTaskSubStatus.Adapter.class)
public enum StardeliveryTaskDetailV30DataStarTaskSubStatus {
  
  AWAITING_ISV_ACCEPT("AWAITING_ISV_ACCEPT"),
  
  CALCULATING_COSTS("CALCULATING_COSTS"),
  
  NO_ISV_ACCEPT("NO_ISV_ACCEPT"),
  
  REJECTED("REJECTED"),
  
  SUBMISSION_IN_PROGRESS("SUBMISSION_IN_PROGRESS"),
  
  UNDER_REVIEW("UNDER_REVIEW");

  private String value;

  StardeliveryTaskDetailV30DataStarTaskSubStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StardeliveryTaskDetailV30DataStarTaskSubStatus fromValue(String value) {
    for (StardeliveryTaskDetailV30DataStarTaskSubStatus b : StardeliveryTaskDetailV30DataStarTaskSubStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StardeliveryTaskDetailV30DataStarTaskSubStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StardeliveryTaskDetailV30DataStarTaskSubStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StardeliveryTaskDetailV30DataStarTaskSubStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StardeliveryTaskDetailV30DataStarTaskSubStatus.fromValue(value);
    }
  }
}
