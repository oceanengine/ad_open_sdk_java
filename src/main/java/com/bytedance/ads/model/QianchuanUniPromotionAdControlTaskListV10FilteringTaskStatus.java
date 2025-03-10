/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(QianchuanUniPromotionAdControlTaskListV10FilteringTaskStatus.Adapter.class)
public enum QianchuanUniPromotionAdControlTaskListV10FilteringTaskStatus {
  
  DELETED("DELETED"),
  
  DISABLE("DISABLE"),
  
  OFFLINE_BALANCE("OFFLINE_BALANCE"),
  
  OFFLINE_BUDGET("OFFLINE_BUDGET"),
  
  OFFLINE_TIME("OFFLINE_TIME"),
  
  PROCESSING("PROCESSING"),
  
  ROI2_DISABLE("ROI2_DISABLE");

  private String value;

  QianchuanUniPromotionAdControlTaskListV10FilteringTaskStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionAdControlTaskListV10FilteringTaskStatus fromValue(String value) {
    for (QianchuanUniPromotionAdControlTaskListV10FilteringTaskStatus b : QianchuanUniPromotionAdControlTaskListV10FilteringTaskStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionAdControlTaskListV10FilteringTaskStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionAdControlTaskListV10FilteringTaskStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionAdControlTaskListV10FilteringTaskStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionAdControlTaskListV10FilteringTaskStatus.fromValue(value);
    }
  }
}

