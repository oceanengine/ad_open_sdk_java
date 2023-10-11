/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@JsonAdapter(ReportCreativeGetV2DataListInventory.Adapter.class)
public enum ReportCreativeGetV2DataListInventory {
  
  INVENTORY_UNIVERSAL("INVENTORY_UNIVERSAL"),
  
  INVENTORY_HOTSOON_FEED("INVENTORY_HOTSOON_FEED"),
  
  INVENTORY_AUTOMOBILE("INVENTORY_AUTOMOBILE"),
  
  INVENTORY_UNION_SLOT("INVENTORY_UNION_SLOT"),
  
  INVENTORY_FACE_U("INVENTORY_FACE_U"),
  
  INVENTORY_TOMATO_NOVEL("INVENTORY_TOMATO_NOVEL"),
  
  INVENTORY_FURNISH("INVENTORY_FURNISH"),
  
  INVENTORY_FEED("INVENTORY_FEED"),
  
  INVENTORY_VIDEO_FEED("INVENTORY_VIDEO_FEED"),
  
  INVENTORY_AWEME_FEED("INVENTORY_AWEME_FEED"),
  
  INVENTORY_STUDY("INVENTORY_STUDY"),
  
  INVENTORY_SEARCH("INVENTORY_SEARCH"),
  
  INVENTORY_BEAUTY("INVENTORY_BEAUTY"),
  
  UNION_BOUTIQUE_GAME("UNION_BOUTIQUE_GAME"),
  
  INVENTORY_PIPIXIA("INVENTORY_PIPIXIA");

  private String value;

  ReportCreativeGetV2DataListInventory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2DataListInventory fromValue(String value) {
    for (ReportCreativeGetV2DataListInventory b : ReportCreativeGetV2DataListInventory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2DataListInventory> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2DataListInventory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2DataListInventory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2DataListInventory.fromValue(value);
    }
  }
}

