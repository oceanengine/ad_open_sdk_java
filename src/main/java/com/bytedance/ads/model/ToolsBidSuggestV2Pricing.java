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
@JsonAdapter(ToolsBidSuggestV2Pricing.Adapter.class)
public enum ToolsBidSuggestV2Pricing {
  
  CPC_OCPM("PRICING_CPC_OCPM"),
  
  CPV("PRICING_CPV"),
  
  CPM("PRICING_CPM"),
  
  CPA("PRICING_CPA"),
  
  CPC("PRICING_CPC"),
  
  OCPM("PRICING_OCPM"),
  
  OCPC("PRICING_OCPC");

  private String value;

  ToolsBidSuggestV2Pricing(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2Pricing fromValue(String value) {
    for (ToolsBidSuggestV2Pricing b : ToolsBidSuggestV2Pricing.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2Pricing> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2Pricing enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2Pricing read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidSuggestV2Pricing.fromValue(value);
    }
  }
}

