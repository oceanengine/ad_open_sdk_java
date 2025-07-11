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
@JsonAdapter(QianchuanSuggestRoiGoalV10EcomGuestType.Adapter.class)
public enum QianchuanSuggestRoiGoalV10EcomGuestType {
  
  BUY("NO_BUY"),
  
  BUY_BRAND("NO_BUY_BRAND"),
  
  BUY_DOUYIN("NO_BUY_DOUYIN");

  private String value;

  QianchuanSuggestRoiGoalV10EcomGuestType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanSuggestRoiGoalV10EcomGuestType fromValue(String value) {
    for (QianchuanSuggestRoiGoalV10EcomGuestType b : QianchuanSuggestRoiGoalV10EcomGuestType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanSuggestRoiGoalV10EcomGuestType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanSuggestRoiGoalV10EcomGuestType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanSuggestRoiGoalV10EcomGuestType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanSuggestRoiGoalV10EcomGuestType.fromValue(value);
    }
  }
}

