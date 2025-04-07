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
@JsonAdapter(BrandMaterialUpdateV30TrackUrlInfoTrackUrlSendType.Adapter.class)
public enum BrandMaterialUpdateV30TrackUrlInfoTrackUrlSendType {
  
  CLIENT("CLIENT"),
  
  SERVER("SERVER");

  private String value;

  BrandMaterialUpdateV30TrackUrlInfoTrackUrlSendType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandMaterialUpdateV30TrackUrlInfoTrackUrlSendType fromValue(String value) {
    for (BrandMaterialUpdateV30TrackUrlInfoTrackUrlSendType b : BrandMaterialUpdateV30TrackUrlInfoTrackUrlSendType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandMaterialUpdateV30TrackUrlInfoTrackUrlSendType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandMaterialUpdateV30TrackUrlInfoTrackUrlSendType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandMaterialUpdateV30TrackUrlInfoTrackUrlSendType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandMaterialUpdateV30TrackUrlInfoTrackUrlSendType.fromValue(value);
    }
  }
}

