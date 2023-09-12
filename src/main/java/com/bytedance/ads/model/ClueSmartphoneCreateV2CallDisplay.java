/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
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
@JsonAdapter(ClueSmartphoneCreateV2CallDisplay.Adapter.class)
public enum ClueSmartphoneCreateV2CallDisplay {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  ClueSmartphoneCreateV2CallDisplay(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueSmartphoneCreateV2CallDisplay fromValue(Long value) {
    for (ClueSmartphoneCreateV2CallDisplay b : ClueSmartphoneCreateV2CallDisplay.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueSmartphoneCreateV2CallDisplay> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueSmartphoneCreateV2CallDisplay enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueSmartphoneCreateV2CallDisplay read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ClueSmartphoneCreateV2CallDisplay.fromValue(value);
    }
  }
}

