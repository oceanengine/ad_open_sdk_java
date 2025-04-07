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
@JsonAdapter(AgentAdvertiserUnassignV2Type.Adapter.class)
public enum AgentAdvertiserUnassignV2Type {
  
  BIDDING("BIDDING"),
  
  BRAND("BRAND");

  private String value;

  AgentAdvertiserUnassignV2Type(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvertiserUnassignV2Type fromValue(String value) {
    for (AgentAdvertiserUnassignV2Type b : AgentAdvertiserUnassignV2Type.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentAdvertiserUnassignV2Type> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvertiserUnassignV2Type enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvertiserUnassignV2Type read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAdvertiserUnassignV2Type.fromValue(value);
    }
  }
}

