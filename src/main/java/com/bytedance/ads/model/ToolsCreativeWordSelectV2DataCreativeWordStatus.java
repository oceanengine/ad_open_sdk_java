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
@JsonAdapter(ToolsCreativeWordSelectV2DataCreativeWordStatus.Adapter.class)
public enum ToolsCreativeWordSelectV2DataCreativeWordStatus {
  
  APPROVE("CREATIVE_WORD_STATUS_APPROVE"),
  
  AUDIT("CREATIVE_WORD_STATUS_AUDIT"),
  
  REAUDIT("CREATIVE_WORD_STATUS_REAUDIT"),
  
  REJECT("CREATIVE_WORD_STATUS_REJECT");

  private String value;

  ToolsCreativeWordSelectV2DataCreativeWordStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsCreativeWordSelectV2DataCreativeWordStatus fromValue(String value) {
    for (ToolsCreativeWordSelectV2DataCreativeWordStatus b : ToolsCreativeWordSelectV2DataCreativeWordStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsCreativeWordSelectV2DataCreativeWordStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsCreativeWordSelectV2DataCreativeWordStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsCreativeWordSelectV2DataCreativeWordStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsCreativeWordSelectV2DataCreativeWordStatus.fromValue(value);
    }
  }
}

