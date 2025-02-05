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
@JsonAdapter(QianchuanAwemeOrderGetV10FilteringStatus.Adapter.class)
public enum QianchuanAwemeOrderGetV10FilteringStatus {
  
  AUDIT("AUDIT"),
  
  BOOK("BOOK"),
  
  CREATING("CREATING"),
  
  DELIVERY_OK("DELIVERY_OK"),
  
  FAILED("FAILED"),
  
  FINISHED("FINISHED"),
  
  FROZEN("FROZEN"),
  
  OFFLINE_AUDIT("OFFLINE_AUDIT"),
  
  OVER("OVER"),
  
  TIMEOUT("TIMEOUT"),
  
  UNPAID("UNPAID"),
  
  UNPAIDCANCEL("UNPAIDCANCEL");

  private String value;

  QianchuanAwemeOrderGetV10FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderGetV10FilteringStatus fromValue(String value) {
    for (QianchuanAwemeOrderGetV10FilteringStatus b : QianchuanAwemeOrderGetV10FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderGetV10FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderGetV10FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderGetV10FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeOrderGetV10FilteringStatus.fromValue(value);
    }
  }
}

