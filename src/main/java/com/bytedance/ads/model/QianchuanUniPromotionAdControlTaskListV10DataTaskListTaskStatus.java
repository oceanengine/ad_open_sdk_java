/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(QianchuanUniPromotionAdControlTaskListV10DataTaskListTaskStatus.Adapter.class)
public enum QianchuanUniPromotionAdControlTaskListV10DataTaskListTaskStatus {
  
  DELETED("DELETED"),
  
  DISABLE("DISABLE"),
  
  OFFLINE_BALANCE("OFFLINE_BALANCE"),
  
  OFFLINE_BUDGET("OFFLINE_BUDGET"),
  
  OFFLINE_TIME("OFFLINE_TIME"),
  
  PROCESSING("PROCESSING"),
  
  ROI2_DISABLE("ROI2_DISABLE");

  private String value;

  QianchuanUniPromotionAdControlTaskListV10DataTaskListTaskStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionAdControlTaskListV10DataTaskListTaskStatus fromValue(String value) {
    for (QianchuanUniPromotionAdControlTaskListV10DataTaskListTaskStatus b : QianchuanUniPromotionAdControlTaskListV10DataTaskListTaskStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionAdControlTaskListV10DataTaskListTaskStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionAdControlTaskListV10DataTaskListTaskStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionAdControlTaskListV10DataTaskListTaskStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionAdControlTaskListV10DataTaskListTaskStatus.fromValue(value);
    }
  }
}

