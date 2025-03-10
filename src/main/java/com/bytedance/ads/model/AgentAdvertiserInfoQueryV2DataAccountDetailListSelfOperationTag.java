/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag.Adapter.class)
public enum AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag {
  
  DECREASE_QUANTITY("DECREASE_QUANTITY"),
  
  EMPTY("EMPTY"),
  
  INCREASE_QUANTITY("INCREASE_QUANTITY"),
  
  SELF_OPERATION("SELF_OPERATION");

  private String value;

  AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag fromValue(String value) {
    for (AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag b : AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag.fromValue(value);
    }
  }
}

