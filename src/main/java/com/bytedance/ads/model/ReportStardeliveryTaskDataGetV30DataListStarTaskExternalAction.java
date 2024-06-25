/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction.Adapter.class)
public enum ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction {
  
  ACTIVE("AD_CONVERT_TYPE_ACTIVE"),
  
  ACTIVE_REGISTER("AD_CONVERT_TYPE_ACTIVE_REGISTER"),
  
  PAY("AD_CONVERT_TYPE_PAY");

  private String value;

  ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction fromValue(String value) {
    for (ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction b : ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction.fromValue(value);
    }
  }
}

