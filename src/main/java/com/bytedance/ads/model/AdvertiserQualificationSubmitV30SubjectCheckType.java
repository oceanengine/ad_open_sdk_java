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
@JsonAdapter(AdvertiserQualificationSubmitV30SubjectCheckType.Adapter.class)
public enum AdvertiserQualificationSubmitV30SubjectCheckType {
  
  COMPANY("COMPANY"),
  
  GOVERNMENT("GOVERNMENT"),
  
  HK_MACAO_TAIWAN("HK_MACAO_TAIWAN"),
  
  INDIVIDUAL("INDIVIDUAL"),
  
  OTHERS("OTHERS"),
  
  OVERSEA("OVERSEA"),
  
  SELF_EMPLOY("SELF_EMPLOY");

  private String value;

  AdvertiserQualificationSubmitV30SubjectCheckType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserQualificationSubmitV30SubjectCheckType fromValue(String value) {
    for (AdvertiserQualificationSubmitV30SubjectCheckType b : AdvertiserQualificationSubmitV30SubjectCheckType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdvertiserQualificationSubmitV30SubjectCheckType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserQualificationSubmitV30SubjectCheckType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserQualificationSubmitV30SubjectCheckType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserQualificationSubmitV30SubjectCheckType.fromValue(value);
    }
  }
}

