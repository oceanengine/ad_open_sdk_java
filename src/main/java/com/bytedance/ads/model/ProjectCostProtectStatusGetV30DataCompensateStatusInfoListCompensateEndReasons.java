/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons.Adapter.class)
public enum ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons {
  
  CONVERT_UNDER_THRESHOLD("CONVERT_UNDER_THRESHOLD"),
  
  CURRENCY_PRECISION("CURRENCY_PRECISION"),
  
  ROI_REAL_EXPECTED("ROI_REAL_EXPECTED"),
  
  UN_OBERCOST("UN_OBERCOST");

  private String value;

  ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons fromValue(String value) {
    for (ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons b : ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons.fromValue(value);
    }
  }
}

