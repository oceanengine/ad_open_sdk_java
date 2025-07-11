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
@JsonAdapter(ToolsAipThirdSiteGetV2DataValidateStatus.Adapter.class)
public enum ToolsAipThirdSiteGetV2DataValidateStatus {
  
  VALIDATE_SUCCESS("VALIDATE_SUCCESS"),
  
  VALIDATE_FAIL("VALIDATE_FAIL"),
  
  HIGH_RISK_INDUSTRY_VALIDATE_FAIL("HIGH_RISK_INDUSTRY_VALIDATE_FAIL"),
  
  UN_VALIDATE("UN_VALIDATE"),
  
  PUBLISH("PUBLISH");

  private String value;

  ToolsAipThirdSiteGetV2DataValidateStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAipThirdSiteGetV2DataValidateStatus fromValue(String value) {
    for (ToolsAipThirdSiteGetV2DataValidateStatus b : ToolsAipThirdSiteGetV2DataValidateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAipThirdSiteGetV2DataValidateStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAipThirdSiteGetV2DataValidateStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAipThirdSiteGetV2DataValidateStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAipThirdSiteGetV2DataValidateStatus.fromValue(value);
    }
  }
}

