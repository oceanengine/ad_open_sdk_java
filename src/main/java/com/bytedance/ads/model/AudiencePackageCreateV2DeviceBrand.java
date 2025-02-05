/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
  
  QIKU("QIKU"),
  
  SONY("SONY"),
  
  LETV("LETV"),
  
  HUAWEI("HUAWEI"),
  
  MEIZU("MEIZU"),
  
  Enum_360("360"),
  
  NUBIA("NUBIA"),
  
  SAMSUNG("SAMSUNG"),
  
  HTC("HTC"),
  
  HONOR("HONOR"),
  
  LG("LG"),
  
  APPLE("APPLE"),
  
  XIAOMI("XIAOMI"),
  
  TCL("TCL"),
  
  ONEPLUS("ONEPLUS"),
  
  COOLPAD("COOLPAD"),
  
  MOTO("MOTO"),
  
  OPPO("OPPO"),
  
  VIVO("VIVO"),
  
  LENOVO("LENOVO"),
  
  GOOGLE("GOOGLE"),
  
  SMARTISAN("SMARTISAN"),
  
  PEPPER("PEPPER"),
  
  HISENSE("HISENSE"),
  
  ZTE("ZTE"),
  
  GIONEE("GIONEE"),
  
  NOKIA("NOKIA"),
  
  CHINAMOBILE("CHINAMOBILE");

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

