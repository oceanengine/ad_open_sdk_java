/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
@JsonAdapter(ReportAdGetV2FilteringInventoryTypes.Adapter.class)
public enum ReportAdGetV2FilteringInventoryTypes {
  
  INVENTORY_STUDY("INVENTORY_STUDY"),
  
  INVENTORY_UNIVERSAL("INVENTORY_UNIVERSAL"),
  
  INVENTORY_FEED("INVENTORY_FEED"),
  
  INVENTORY_AUTOMOBILE("INVENTORY_AUTOMOBILE"),
  
  INVENTORY_SEARCH("INVENTORY_SEARCH"),
  
  UNION_BOUTIQUE_GAME("UNION_BOUTIQUE_GAME"),
  
  INVENTORY_FURNISH("INVENTORY_FURNISH"),
  
  INVENTORY_BEAUTY("INVENTORY_BEAUTY"),
  
  INVENTORY_TOMATO_NOVEL("INVENTORY_TOMATO_NOVEL"),
  
  INVENTORY_AWEME_FEED("INVENTORY_AWEME_FEED"),
  
  INVENTORY_FACE_U("INVENTORY_FACE_U"),
  
  INVENTORY_PIPIXIA("INVENTORY_PIPIXIA"),
  
  INVENTORY_UNION_SLOT("INVENTORY_UNION_SLOT"),
  
  INVENTORY_VIDEO_FEED("INVENTORY_VIDEO_FEED"),
  
  INVENTORY_HOTSOON_FEED("INVENTORY_HOTSOON_FEED");

  private String value;

  ReportAdGetV2FilteringInventoryTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdGetV2FilteringInventoryTypes fromValue(String value) {
    for (ReportAdGetV2FilteringInventoryTypes b : ReportAdGetV2FilteringInventoryTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdGetV2FilteringInventoryTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdGetV2FilteringInventoryTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdGetV2FilteringInventoryTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdGetV2FilteringInventoryTypes.fromValue(value);
    }
  }
}

