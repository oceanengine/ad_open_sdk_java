/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus.Adapter.class)
public enum ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus {
  
  BILLING_IN_PROGRESS("BILLING_IN_PROGRESS"),
  
  CANCELLED("CANCELLED"),
  
  COMPLETED("COMPLETED"),
  
  PENDING_LAUNCH("PENDING_LAUNCH"),
  
  PREPARATION("PREPARATION");

  private String value;

  ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus fromValue(String value) {
    for (ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus b : ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus.fromValue(value);
    }
  }
}

