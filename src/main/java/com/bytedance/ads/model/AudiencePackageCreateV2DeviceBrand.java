/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@JsonAdapter(AudiencePackageCreateV2DeviceBrand.Adapter.class)
public enum AudiencePackageCreateV2DeviceBrand {
  
  APPLE("APPLE"),
  
  PEPPER("PEPPER"),
  
  QIKU("QIKU"),
  
  NUBIA("NUBIA"),
  
  OPPO("OPPO"),
  
  GOOGLE("GOOGLE"),
  
  HISENSE("HISENSE"),
  
  COOLPAD("COOLPAD"),
  
  SAMSUNG("SAMSUNG"),
  
  SMARTISAN("SMARTISAN"),
  
  ONEPLUS("ONEPLUS"),
  
  ZTE("ZTE"),
  
  HTC("HTC"),
  
  LG("LG"),
  
  XIAOMI("XIAOMI"),
  
  MEIZU("MEIZU"),
  
  HONOR("HONOR"),
  
  LETV("LETV"),
  
  TCL("TCL"),
  
  HUAWEI("HUAWEI"),
  
  SONY("SONY"),
  
  Enum_360("360"),
  
  CHINAMOBILE("CHINAMOBILE"),
  
  GIONEE("GIONEE"),
  
  VIVO("VIVO"),
  
  NOKIA("NOKIA"),
  
  MOTO("MOTO"),
  
  LENOVO("LENOVO");

  private String value;

  AudiencePackageCreateV2DeviceBrand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageCreateV2DeviceBrand fromValue(String value) {
    for (AudiencePackageCreateV2DeviceBrand b : AudiencePackageCreateV2DeviceBrand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageCreateV2DeviceBrand> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageCreateV2DeviceBrand enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageCreateV2DeviceBrand read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageCreateV2DeviceBrand.fromValue(value);
    }
  }
}

