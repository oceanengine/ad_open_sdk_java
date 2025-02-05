/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(StarDemandListV2FilteringTaskCategory.Adapter.class)
public enum StarDemandListV2FilteringTaskCategory {
  
  CHALLENGE("DOUYIN_CHALLENGE"),
  
  LIVE("DOUYIN_LIVE"),
  
  LIVE_CHALLENGE("DOUYIN_LIVE_CHALLENGE"),
  
  LIVE_RECRUIT("DOUYIN_LIVE_RECRUIT"),
  
  PIC("DOUYIN_PIC"),
  
  PIC_CHALLENGE("DOUYIN_PIC_CHALLENGE"),
  
  VIDEO("DOUYIN_VIDEO"),
  
  VIDEO_RECRUIT("DOUYIN_VIDEO_RECRUIT");

  private String value;

  StarDemandListV2FilteringTaskCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandListV2FilteringTaskCategory fromValue(String value) {
    for (StarDemandListV2FilteringTaskCategory b : StarDemandListV2FilteringTaskCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarDemandListV2FilteringTaskCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandListV2FilteringTaskCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandListV2FilteringTaskCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarDemandListV2FilteringTaskCategory.fromValue(value);
    }
  }
}

