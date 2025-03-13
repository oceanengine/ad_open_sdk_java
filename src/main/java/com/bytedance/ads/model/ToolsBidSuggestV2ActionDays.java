/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(ToolsBidSuggestV2ActionDays.Adapter.class)
public enum ToolsBidSuggestV2ActionDays {
  
  NUMBER_7(7l),
  
  NUMBER_15(15l),
  
  NUMBER_30(30l),
  
  NUMBER_60(60l),
  
  NUMBER_90(90l),
  
  NUMBER_180(180l),
  
  NUMBER_365(365l);

  private Long value;

  ToolsBidSuggestV2ActionDays(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2ActionDays fromValue(Long value) {
    for (ToolsBidSuggestV2ActionDays b : ToolsBidSuggestV2ActionDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2ActionDays> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2ActionDays enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2ActionDays read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ToolsBidSuggestV2ActionDays.fromValue(value);
    }
  }
}

