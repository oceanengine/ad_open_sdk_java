/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes.Adapter.class)
public enum LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes {
  
  ALL_ANCHOR("ALL_ANCHOR"),
  
  POI_ANCHOR("POI_ANCHOR"),
  
  PRODUCT_ANCHOR("PRODUCT_ANCHOR");

  private String value;

  LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes fromValue(String value) {
    for (LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes b : LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes.fromValue(value);
    }
  }
}

