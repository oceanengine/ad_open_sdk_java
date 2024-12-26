/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange.Adapter.class)
public enum StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange {
  
  ALL_SUBMITTED_ITEM("ALL_SUBMITTED_ITEM"),
  
  CAN_DELIVERY_ITEM("CAN_DELIVERY_ITEM");

  private String value;

  StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange fromValue(String value) {
    for (StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange b : StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange.fromValue(value);
    }
  }
}

