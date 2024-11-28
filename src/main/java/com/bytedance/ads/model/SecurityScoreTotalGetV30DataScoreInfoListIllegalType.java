/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(SecurityScoreTotalGetV30DataScoreInfoListIllegalType.Adapter.class)
public enum SecurityScoreTotalGetV30DataScoreInfoListIllegalType {
  
  GENERAL("GENERAL"),
  
  ONECLASS("ONECLASS"),
  
  SERIOUS("SERIOUS"),
  
  TWOTHREECLASS("TWOTHREECLASS");

  private String value;

  SecurityScoreTotalGetV30DataScoreInfoListIllegalType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecurityScoreTotalGetV30DataScoreInfoListIllegalType fromValue(String value) {
    for (SecurityScoreTotalGetV30DataScoreInfoListIllegalType b : SecurityScoreTotalGetV30DataScoreInfoListIllegalType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SecurityScoreTotalGetV30DataScoreInfoListIllegalType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecurityScoreTotalGetV30DataScoreInfoListIllegalType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SecurityScoreTotalGetV30DataScoreInfoListIllegalType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SecurityScoreTotalGetV30DataScoreInfoListIllegalType.fromValue(value);
    }
  }
}

