/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@JsonAdapter(LocalProjectDetailV30DataDeliveryPoiMode.Adapter.class)
public enum LocalProjectDetailV30DataDeliveryPoiMode {
  
  ALL("ALL"),
  
  PART("PART");

  private String value;

  LocalProjectDetailV30DataDeliveryPoiMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectDetailV30DataDeliveryPoiMode fromValue(String value) {
    for (LocalProjectDetailV30DataDeliveryPoiMode b : LocalProjectDetailV30DataDeliveryPoiMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProjectDetailV30DataDeliveryPoiMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectDetailV30DataDeliveryPoiMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectDetailV30DataDeliveryPoiMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectDetailV30DataDeliveryPoiMode.fromValue(value);
    }
  }
}

