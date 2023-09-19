/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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
@JsonAdapter(PromotionListV30FilteringDeliveryMode.Adapter.class)
public enum PromotionListV30FilteringDeliveryMode {
  
  MANUAL("MANUAL"),
  
  PROCEDURAL("PROCEDURAL");

  private String value;

  PromotionListV30FilteringDeliveryMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30FilteringDeliveryMode fromValue(String value) {
    for (PromotionListV30FilteringDeliveryMode b : PromotionListV30FilteringDeliveryMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionListV30FilteringDeliveryMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30FilteringDeliveryMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30FilteringDeliveryMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30FilteringDeliveryMode.fromValue(value);
    }
  }
}

