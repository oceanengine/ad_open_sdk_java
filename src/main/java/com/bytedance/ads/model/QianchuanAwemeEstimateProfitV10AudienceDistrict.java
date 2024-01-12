/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
@JsonAdapter(QianchuanAwemeEstimateProfitV10AudienceDistrict.Adapter.class)
public enum QianchuanAwemeEstimateProfitV10AudienceDistrict {
  
  CITY("CITY"),
  
  COUNTY("COUNTY");

  private String value;

  QianchuanAwemeEstimateProfitV10AudienceDistrict(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeEstimateProfitV10AudienceDistrict fromValue(String value) {
    for (QianchuanAwemeEstimateProfitV10AudienceDistrict b : QianchuanAwemeEstimateProfitV10AudienceDistrict.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeEstimateProfitV10AudienceDistrict> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeEstimateProfitV10AudienceDistrict enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeEstimateProfitV10AudienceDistrict read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeEstimateProfitV10AudienceDistrict.fromValue(value);
    }
  }
}

