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
@JsonAdapter(ReportAdvertiserGetV2DataListInventory.Adapter.class)
public enum ReportAdvertiserGetV2DataListInventory {
  
  INVENTORY_STUDY("INVENTORY_STUDY"),
  
  INVENTORY_AUTOMOBILE("INVENTORY_AUTOMOBILE"),
  
  INVENTORY_FACE_U("INVENTORY_FACE_U"),
  
  INVENTORY_UNION_SLOT("INVENTORY_UNION_SLOT"),
  
  INVENTORY_PIPIXIA("INVENTORY_PIPIXIA"),
  
  INVENTORY_FEED("INVENTORY_FEED"),
  
  INVENTORY_HOTSOON_FEED("INVENTORY_HOTSOON_FEED"),
  
  INVENTORY_VIDEO_FEED("INVENTORY_VIDEO_FEED"),
  
  INVENTORY_UNIVERSAL("INVENTORY_UNIVERSAL"),
  
  INVENTORY_AWEME_FEED("INVENTORY_AWEME_FEED"),
  
  INVENTORY_FURNISH("INVENTORY_FURNISH"),
  
  INVENTORY_SEARCH("INVENTORY_SEARCH"),
  
  INVENTORY_TOMATO_NOVEL("INVENTORY_TOMATO_NOVEL"),
  
  UNION_BOUTIQUE_GAME("UNION_BOUTIQUE_GAME"),
  
  INVENTORY_BEAUTY("INVENTORY_BEAUTY");

  private String value;

  ReportAdvertiserGetV2DataListInventory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdvertiserGetV2DataListInventory fromValue(String value) {
    for (ReportAdvertiserGetV2DataListInventory b : ReportAdvertiserGetV2DataListInventory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdvertiserGetV2DataListInventory> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdvertiserGetV2DataListInventory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdvertiserGetV2DataListInventory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdvertiserGetV2DataListInventory.fromValue(value);
    }
  }
}

