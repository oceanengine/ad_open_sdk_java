/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(QianchuanAudienceListGetV10FilteringAudienceType.Adapter.class)
public enum QianchuanAudienceListGetV10FilteringAudienceType {
  
  BASIC("BASIC"),
  
  EXTEND("EXTEND"),
  
  UPLOAD("UPLOAD");

  private String value;

  QianchuanAudienceListGetV10FilteringAudienceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAudienceListGetV10FilteringAudienceType fromValue(String value) {
    for (QianchuanAudienceListGetV10FilteringAudienceType b : QianchuanAudienceListGetV10FilteringAudienceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAudienceListGetV10FilteringAudienceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAudienceListGetV10FilteringAudienceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAudienceListGetV10FilteringAudienceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAudienceListGetV10FilteringAudienceType.fromValue(value);
    }
  }
}

