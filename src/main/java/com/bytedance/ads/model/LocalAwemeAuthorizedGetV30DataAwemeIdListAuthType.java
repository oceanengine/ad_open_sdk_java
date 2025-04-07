/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(LocalAwemeAuthorizedGetV30DataAwemeIdListAuthType.Adapter.class)
public enum LocalAwemeAuthorizedGetV30DataAwemeIdListAuthType {
  
  AUTH_FREE("AUTH_FREE"),
  
  AWEME_COOPERATOR("AWEME_COOPERATOR"),
  
  ALL("All"),
  
  BIND_TYPE_EXPIRED("BIND_TYPE_EXPIRED"),
  
  BIND_TYPE_UNAUTHORIZED("BIND_TYPE_UNAUTHORIZED"),
  
  OFFICIAL("OFFICIAL"),
  
  SELF("SELF");

  private String value;

  LocalAwemeAuthorizedGetV30DataAwemeIdListAuthType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalAwemeAuthorizedGetV30DataAwemeIdListAuthType fromValue(String value) {
    for (LocalAwemeAuthorizedGetV30DataAwemeIdListAuthType b : LocalAwemeAuthorizedGetV30DataAwemeIdListAuthType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalAwemeAuthorizedGetV30DataAwemeIdListAuthType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalAwemeAuthorizedGetV30DataAwemeIdListAuthType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalAwemeAuthorizedGetV30DataAwemeIdListAuthType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalAwemeAuthorizedGetV30DataAwemeIdListAuthType.fromValue(value);
    }
  }
}

