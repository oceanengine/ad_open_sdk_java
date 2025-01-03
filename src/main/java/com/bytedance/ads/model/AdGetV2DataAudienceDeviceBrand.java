/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(AdGetV2DataAudienceDeviceBrand.Adapter.class)
public enum AdGetV2DataAudienceDeviceBrand {
  
  APPLE("APPLE"),
  
  LETV("LETV"),
  
  OPPO("OPPO"),
  
  HONOR("HONOR"),
  
  ONEPLUS("ONEPLUS"),
  
  SONY("SONY"),
  
  ZTE("ZTE"),
  
  HTC("HTC"),
  
  MEIZU("MEIZU"),
  
  GIONEE("GIONEE"),
  
  HUAWEI("HUAWEI"),
  
  COOLPAD("COOLPAD"),
  
  HISENSE("HISENSE"),
  
  Enum_360("360"),
  
  NOKIA("NOKIA"),
  
  QIKU("QIKU"),
  
  SAMSUNG("SAMSUNG"),
  
  TCL("TCL"),
  
  VIVO("VIVO"),
  
  LENOVO("LENOVO"),
  
  SMARTISAN("SMARTISAN"),
  
  CHINAMOBILE("CHINAMOBILE"),
  
  NUBIA("NUBIA"),
  
  PEPPER("PEPPER"),
  
  GOOGLE("GOOGLE"),
  
  MOTO("MOTO"),
  
  XIAOMI("XIAOMI"),
  
  LG("LG");

  private String value;

  AdGetV2DataAudienceDeviceBrand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceDeviceBrand fromValue(String value) {
    for (AdGetV2DataAudienceDeviceBrand b : AdGetV2DataAudienceDeviceBrand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceDeviceBrand> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceDeviceBrand enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceDeviceBrand read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceDeviceBrand.fromValue(value);
    }
  }
}

