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
@JsonAdapter(LocalPromotionListV30FilteringRejectReasonType.Adapter.class)
public enum LocalPromotionListV30FilteringRejectReasonType {
  
  ALL("ALL"),
  
  DISCOMFORT("DISCOMFORT"),
  
  ELSE("ELSE"),
  
  EXAGGERATION("EXAGGERATION"),
  
  LOW_MATERAIL("LOW_MATERAIL"),
  
  NONE("NONE"),
  
  QUALITY_POOR("QUALITY_POOR"),
  
  REVIEW_REJECT("REVIEW_REJECT");

  private String value;

  LocalPromotionListV30FilteringRejectReasonType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalPromotionListV30FilteringRejectReasonType fromValue(String value) {
    for (LocalPromotionListV30FilteringRejectReasonType b : LocalPromotionListV30FilteringRejectReasonType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalPromotionListV30FilteringRejectReasonType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalPromotionListV30FilteringRejectReasonType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalPromotionListV30FilteringRejectReasonType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalPromotionListV30FilteringRejectReasonType.fromValue(value);
    }
  }
}

