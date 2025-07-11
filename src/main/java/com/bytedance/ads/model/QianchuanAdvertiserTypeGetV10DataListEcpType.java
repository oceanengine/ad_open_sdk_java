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
@JsonAdapter(QianchuanAdvertiserTypeGetV10DataListEcpType.Adapter.class)
public enum QianchuanAdvertiserTypeGetV10DataListEcpType {
  
  SHOP("SHOP"),
  
  SHOP_STAR("SHOP_STAR"),
  
  COMMON_STAR("COMMON_STAR"),
  
  AGENT("AGENT");

  private String value;

  QianchuanAdvertiserTypeGetV10DataListEcpType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdvertiserTypeGetV10DataListEcpType fromValue(String value) {
    for (QianchuanAdvertiserTypeGetV10DataListEcpType b : QianchuanAdvertiserTypeGetV10DataListEcpType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdvertiserTypeGetV10DataListEcpType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdvertiserTypeGetV10DataListEcpType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdvertiserTypeGetV10DataListEcpType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdvertiserTypeGetV10DataListEcpType.fromValue(value);
    }
  }
}

