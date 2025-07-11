/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(PromotionListV30DataListNativeSettingAnchorRelatedType.Adapter.class)
public enum PromotionListV30DataListNativeSettingAnchorRelatedType {
  
  AUTO("AUTO"),
  
  OFF("OFF"),
  
  SELECT("SELECT");

  private String value;

  PromotionListV30DataListNativeSettingAnchorRelatedType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListNativeSettingAnchorRelatedType fromValue(String value) {
    for (PromotionListV30DataListNativeSettingAnchorRelatedType b : PromotionListV30DataListNativeSettingAnchorRelatedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListNativeSettingAnchorRelatedType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListNativeSettingAnchorRelatedType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListNativeSettingAnchorRelatedType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListNativeSettingAnchorRelatedType.fromValue(value);
    }
  }
}

