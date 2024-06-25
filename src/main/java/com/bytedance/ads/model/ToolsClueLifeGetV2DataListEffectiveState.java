/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(ToolsClueLifeGetV2DataListEffectiveState.Adapter.class)
public enum ToolsClueLifeGetV2DataListEffectiveState {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_6(6l),
  
  NUMBER_7(7l),
  
  NUMBER_204(204l);

  private Long value;

  ToolsClueLifeGetV2DataListEffectiveState(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueLifeGetV2DataListEffectiveState fromValue(Long value) {
    for (ToolsClueLifeGetV2DataListEffectiveState b : ToolsClueLifeGetV2DataListEffectiveState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsClueLifeGetV2DataListEffectiveState> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueLifeGetV2DataListEffectiveState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueLifeGetV2DataListEffectiveState read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ToolsClueLifeGetV2DataListEffectiveState.fromValue(value);
    }
  }
}

