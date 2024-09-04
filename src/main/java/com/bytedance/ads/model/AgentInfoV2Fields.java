/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(AgentInfoV2Fields.Adapter.class)
public enum AgentInfoV2Fields {
  
  CUSTOMER_NAME("customer_name"),
  
  ACCOUNT_STATUS("account_status"),
  
  AGENT_ID("agent_id"),
  
  AGENT_NAME("agent_name"),
  
  COMPANY_NAME("company_name"),
  
  CREATE_TIME("create_time"),
  
  ROLE("role"),
  
  CUSTOMER_ID("customer_id"),
  
  COMPANY_ID("company_id");

  private String value;

  AgentInfoV2Fields(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentInfoV2Fields fromValue(String value) {
    for (AgentInfoV2Fields b : AgentInfoV2Fields.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentInfoV2Fields> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentInfoV2Fields enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentInfoV2Fields read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentInfoV2Fields.fromValue(value);
    }
  }
}

