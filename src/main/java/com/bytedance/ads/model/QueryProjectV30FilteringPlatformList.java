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
@JsonAdapter(QueryProjectV30FilteringPlatformList.Adapter.class)
public enum QueryProjectV30FilteringPlatformList {
  
  AD("AD"),
  
  NATIVELIFE("NATIVELIFE"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  QueryProjectV30FilteringPlatformList(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QueryProjectV30FilteringPlatformList fromValue(String value) {
    for (QueryProjectV30FilteringPlatformList b : QueryProjectV30FilteringPlatformList.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QueryProjectV30FilteringPlatformList> {
    @Override
    public void write(final JsonWriter jsonWriter, final QueryProjectV30FilteringPlatformList enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QueryProjectV30FilteringPlatformList read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QueryProjectV30FilteringPlatformList.fromValue(value);
    }
  }
}

