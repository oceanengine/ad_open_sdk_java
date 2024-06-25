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
@JsonAdapter(QianchuanAwemeOrderGetV10DataListStatus.Adapter.class)
public enum QianchuanAwemeOrderGetV10DataListStatus {
  
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

  QianchuanAwemeOrderGetV10DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderGetV10DataListStatus fromValue(String value) {
    for (QianchuanAwemeOrderGetV10DataListStatus b : QianchuanAwemeOrderGetV10DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderGetV10DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderGetV10DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderGetV10DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeOrderGetV10DataListStatus.fromValue(value);
    }
  }
}

