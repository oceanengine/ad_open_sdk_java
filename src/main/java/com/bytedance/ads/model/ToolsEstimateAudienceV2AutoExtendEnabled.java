/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@JsonAdapter(ToolsEstimateAudienceV2AutoExtendEnabled.Adapter.class)
public enum ToolsEstimateAudienceV2AutoExtendEnabled {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  ToolsEstimateAudienceV2AutoExtendEnabled(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEstimateAudienceV2AutoExtendEnabled fromValue(Long value) {
    for (ToolsEstimateAudienceV2AutoExtendEnabled b : ToolsEstimateAudienceV2AutoExtendEnabled.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEstimateAudienceV2AutoExtendEnabled> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEstimateAudienceV2AutoExtendEnabled enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEstimateAudienceV2AutoExtendEnabled read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ToolsEstimateAudienceV2AutoExtendEnabled.fromValue(value);
    }
  }
}

