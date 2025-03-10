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
@JsonAdapter(LocalLifeAdvertiserListV30FilteringLocalAccountRole.Adapter.class)
public enum LocalLifeAdvertiserListV30FilteringLocalAccountRole {
  
  ALL("ALL"),
  
  DIRECT_ACCOUNT("DIRECT_ACCOUNT"),
  
  VIRTUAL_ACCOUNT("VIRTUAL_ACCOUNT");

  private String value;

  LocalLifeAdvertiserListV30FilteringLocalAccountRole(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalLifeAdvertiserListV30FilteringLocalAccountRole fromValue(String value) {
    for (LocalLifeAdvertiserListV30FilteringLocalAccountRole b : LocalLifeAdvertiserListV30FilteringLocalAccountRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalLifeAdvertiserListV30FilteringLocalAccountRole> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalLifeAdvertiserListV30FilteringLocalAccountRole enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalLifeAdvertiserListV30FilteringLocalAccountRole read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalLifeAdvertiserListV30FilteringLocalAccountRole.fromValue(value);
    }
  }
}

