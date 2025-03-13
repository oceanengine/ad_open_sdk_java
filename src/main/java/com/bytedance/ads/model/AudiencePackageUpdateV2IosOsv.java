/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(AudiencePackageUpdateV2IosOsv.Adapter.class)
public enum AudiencePackageUpdateV2IosOsv {
  
  Enum_8_0("8.0"),
  
  Enum_10_1("10.1"),
  
  Enum_11_1("11.1"),
  
  Enum_12_0("12.0"),
  
  Enum_13_2("13.2"),
  
  NONE("NONE"),
  
  Enum_7_0("7.0"),
  
  Enum_8_1("8.1"),
  
  Enum_9_2("9.2"),
  
  Enum_10_3("10.3"),
  
  Enum_12_1("12.1"),
  
  Enum_5_0("5.0"),
  
  Enum_11_4("11.4"),
  
  Enum_0_0("0.0"),
  
  Enum_7_1("7.1"),
  
  Enum_9_3("9.3"),
  
  Enum_4_3("4.3"),
  
  Enum_4_1("4.1"),
  
  Enum_4_0("4.0"),
  
  Enum_11_3("11.3"),
  
  Enum_4_2("4.2"),
  
  Enum_13_3("13.3"),
  
  Enum_6_0("6.0"),
  
  Enum_9_1("9.1"),
  
  Enum_10_2("10.2"),
  
  Enum_12_2("12.2"),
  
  Enum_11_0("11.0"),
  
  Enum_13_1("13.1"),
  
  Enum_9_0("9.0"),
  
  Enum_8_2("8.2"),
  
  Enum_12_4("12.4"),
  
  Enum_11_2("11.2"),
  
  Enum_13_4("13.4"),
  
  Enum_14_0("14.0"),
  
  Enum_13_0("13.0"),
  
  Enum_12_3("12.3"),
  
  Enum_5_1("5.1");

  private String value;

  AudiencePackageUpdateV2IosOsv(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageUpdateV2IosOsv fromValue(String value) {
    for (AudiencePackageUpdateV2IosOsv b : AudiencePackageUpdateV2IosOsv.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageUpdateV2IosOsv> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageUpdateV2IosOsv enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageUpdateV2IosOsv read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageUpdateV2IosOsv.fromValue(value);
    }
  }
}

