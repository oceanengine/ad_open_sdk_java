/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
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
@JsonAdapter(PromotionUpdateV30AutoExtendTraffic.Adapter.class)
public enum PromotionUpdateV30AutoExtendTraffic {
  
  OFF("OFF"),
  
  ON("ON");

  private String value;

  PromotionUpdateV30AutoExtendTraffic(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionUpdateV30AutoExtendTraffic fromValue(String value) {
    for (PromotionUpdateV30AutoExtendTraffic b : PromotionUpdateV30AutoExtendTraffic.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionUpdateV30AutoExtendTraffic> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionUpdateV30AutoExtendTraffic enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionUpdateV30AutoExtendTraffic read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionUpdateV30AutoExtendTraffic.fromValue(value);
    }
  }
}

