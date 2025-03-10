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
@JsonAdapter(AdGetV2DataAudienceActivateType.Adapter.class)
public enum AdGetV2DataAudienceActivateType {
  
  UNLIMITED("UNLIMITED"),
  
  THREE_MONTH_EAILIER("THREE_MONTH_EAILIER"),
  
  WITH_IN_A_MONTH("WITH_IN_A_MONTH"),
  
  ONE_MONTH_2_THREE_MONTH("ONE_MONTH_2_THREE_MONTH");

  private String value;

  AdGetV2DataAudienceActivateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceActivateType fromValue(String value) {
    for (AdGetV2DataAudienceActivateType b : AdGetV2DataAudienceActivateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceActivateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceActivateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceActivateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceActivateType.fromValue(value);
    }
  }
}

