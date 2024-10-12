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
@JsonAdapter(AdCostProtectStatusGetV2DataListStatus.Adapter.class)
public enum AdCostProtectStatusGetV2DataListStatus {
  
  Enum_当前计划还未产生首次send或者不在赔付范围内("当前计划还未产生首次send或者不在赔付范围内"),
  
  Enum_成本保障生效中("成本保障生效中"),
  
  Enum_成本保障已失效("成本保障已失效"),
  
  Enum_成本保障确认中("成本保障确认中"),
  
  Enum_成本保障已到账("成本保障已到账"),
  
  Enum_成本保障已结束("成本保障已结束");

  private String value;

  AdCostProtectStatusGetV2DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdCostProtectStatusGetV2DataListStatus fromValue(String value) {
    for (AdCostProtectStatusGetV2DataListStatus b : AdCostProtectStatusGetV2DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdCostProtectStatusGetV2DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdCostProtectStatusGetV2DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdCostProtectStatusGetV2DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdCostProtectStatusGetV2DataListStatus.fromValue(value);
    }
  }
}

