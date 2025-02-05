/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
@JsonAdapter(ToolsMicroAppListV30DataListMembershipType.Adapter.class)
public enum ToolsMicroAppListV30DataListMembershipType {
  
  ANNUAL("ANNUAL"),
  
  LIFETIME("LIFETIME"),
  
  MONTHLY("MONTHLY"),
  
  NONE("NONE"),
  
  WEEKLY_DAILY("WEEKLY_DAILY");

  private String value;

  ToolsMicroAppListV30DataListMembershipType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroAppListV30DataListMembershipType fromValue(String value) {
    for (ToolsMicroAppListV30DataListMembershipType b : ToolsMicroAppListV30DataListMembershipType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsMicroAppListV30DataListMembershipType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroAppListV30DataListMembershipType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroAppListV30DataListMembershipType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroAppListV30DataListMembershipType.fromValue(value);
    }
  }
}

