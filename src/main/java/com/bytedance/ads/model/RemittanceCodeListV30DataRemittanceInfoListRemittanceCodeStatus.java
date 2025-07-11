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
@JsonAdapter(RemittanceCodeListV30DataRemittanceInfoListRemittanceCodeStatus.Adapter.class)
public enum RemittanceCodeListV30DataRemittanceInfoListRemittanceCodeStatus {
  
  ABANDON("ABANDON"),
  
  CHARGE_FAILED("CHARGE_FAILED"),
  
  CHARGE_SUCCESS("CHARGE_SUCCESS"),
  
  NOT_USED("NOT_USED");

  private String value;

  RemittanceCodeListV30DataRemittanceInfoListRemittanceCodeStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RemittanceCodeListV30DataRemittanceInfoListRemittanceCodeStatus fromValue(String value) {
    for (RemittanceCodeListV30DataRemittanceInfoListRemittanceCodeStatus b : RemittanceCodeListV30DataRemittanceInfoListRemittanceCodeStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RemittanceCodeListV30DataRemittanceInfoListRemittanceCodeStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final RemittanceCodeListV30DataRemittanceInfoListRemittanceCodeStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RemittanceCodeListV30DataRemittanceInfoListRemittanceCodeStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RemittanceCodeListV30DataRemittanceInfoListRemittanceCodeStatus.fromValue(value);
    }
  }
}

