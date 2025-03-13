/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(LocalReportAccountGetV30FilteringLocalDeliveryScene.Adapter.class)
public enum LocalReportAccountGetV30FilteringLocalDeliveryScene {
  
  CLUE("CLUE"),
  
  CONTENT_HEATING("CONTENT_HEATING"),
  
  POI_CUSTOMER("POI_CUSTOMER"),
  
  PURCHASE("PURCHASE");

  private String value;

  LocalReportAccountGetV30FilteringLocalDeliveryScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalReportAccountGetV30FilteringLocalDeliveryScene fromValue(String value) {
    for (LocalReportAccountGetV30FilteringLocalDeliveryScene b : LocalReportAccountGetV30FilteringLocalDeliveryScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalReportAccountGetV30FilteringLocalDeliveryScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalReportAccountGetV30FilteringLocalDeliveryScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalReportAccountGetV30FilteringLocalDeliveryScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalReportAccountGetV30FilteringLocalDeliveryScene.fromValue(value);
    }
  }
}

