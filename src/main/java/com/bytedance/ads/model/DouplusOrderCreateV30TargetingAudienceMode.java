/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(DouplusOrderCreateV30TargetingAudienceMode.Adapter.class)
public enum DouplusOrderCreateV30TargetingAudienceMode {
  
  AUTO("AUTO"),
  
  CUSTOM("CUSTOM"),
  
  AUDIENCE_PKG("AUDIENCE_PKG"),
  
  DMP_PKG("DMP_PKG");

  private String value;

  DouplusOrderCreateV30TargetingAudienceMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOrderCreateV30TargetingAudienceMode fromValue(String value) {
    for (DouplusOrderCreateV30TargetingAudienceMode b : DouplusOrderCreateV30TargetingAudienceMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DouplusOrderCreateV30TargetingAudienceMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOrderCreateV30TargetingAudienceMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOrderCreateV30TargetingAudienceMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOrderCreateV30TargetingAudienceMode.fromValue(value);
    }
  }
}

