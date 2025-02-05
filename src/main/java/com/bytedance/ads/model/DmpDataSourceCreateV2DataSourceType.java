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
@JsonAdapter(DmpDataSourceCreateV2DataSourceType.Adapter.class)
public enum DmpDataSourceCreateV2DataSourceType {
  
  UID("UID"),
  
  DID("DID");

  private String value;

  DmpDataSourceCreateV2DataSourceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DmpDataSourceCreateV2DataSourceType fromValue(String value) {
    for (DmpDataSourceCreateV2DataSourceType b : DmpDataSourceCreateV2DataSourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DmpDataSourceCreateV2DataSourceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DmpDataSourceCreateV2DataSourceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DmpDataSourceCreateV2DataSourceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DmpDataSourceCreateV2DataSourceType.fromValue(value);
    }
  }
}

