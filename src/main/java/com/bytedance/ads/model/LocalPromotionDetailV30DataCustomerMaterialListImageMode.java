/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(LocalPromotionDetailV30DataCustomerMaterialListImageMode.Adapter.class)
public enum LocalPromotionDetailV30DataCustomerMaterialListImageMode {
  
  VIDEO("IMAGE_MODE_VIDEO"),
  
  VIDEO_VERTICAL("IMAGE_MODE_VIDEO_VERTICAL");

  private String value;

  LocalPromotionDetailV30DataCustomerMaterialListImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalPromotionDetailV30DataCustomerMaterialListImageMode fromValue(String value) {
    for (LocalPromotionDetailV30DataCustomerMaterialListImageMode b : LocalPromotionDetailV30DataCustomerMaterialListImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalPromotionDetailV30DataCustomerMaterialListImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalPromotionDetailV30DataCustomerMaterialListImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalPromotionDetailV30DataCustomerMaterialListImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalPromotionDetailV30DataCustomerMaterialListImageMode.fromValue(value);
    }
  }
}

