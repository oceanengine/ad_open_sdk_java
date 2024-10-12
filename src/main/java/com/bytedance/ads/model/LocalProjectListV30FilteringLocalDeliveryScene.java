/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(LocalProjectListV30FilteringLocalDeliveryScene.Adapter.class)
public enum LocalProjectListV30FilteringLocalDeliveryScene {
  
  ALL("ALL"),
  
  CONTENT_HEAT("CONTENT_HEAT"),
  
  POI_RECOMMEND("POI_RECOMMEND"),
  
  PRODUCT_PAY("PRODUCT_PAY");

  private String value;

  LocalProjectListV30FilteringLocalDeliveryScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectListV30FilteringLocalDeliveryScene fromValue(String value) {
    for (LocalProjectListV30FilteringLocalDeliveryScene b : LocalProjectListV30FilteringLocalDeliveryScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectListV30FilteringLocalDeliveryScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectListV30FilteringLocalDeliveryScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectListV30FilteringLocalDeliveryScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectListV30FilteringLocalDeliveryScene.fromValue(value);
    }
  }
}

