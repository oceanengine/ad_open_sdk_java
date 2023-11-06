/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
@JsonAdapter(ToolsRtaGetInfoV2DataInterfaceInfoDeliveryRange.Adapter.class)
public enum ToolsRtaGetInfoV2DataInterfaceInfoDeliveryRange {
  
  LOCAL_ONLY("LOCAL_ONLY"),
  
  UNION_ONLY("UNION_ONLY"),
  
  UNIVERSAL_DELIVERY("UNIVERSAL_DELIVERY");

  private String value;

  ToolsRtaGetInfoV2DataInterfaceInfoDeliveryRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsRtaGetInfoV2DataInterfaceInfoDeliveryRange fromValue(String value) {
    for (ToolsRtaGetInfoV2DataInterfaceInfoDeliveryRange b : ToolsRtaGetInfoV2DataInterfaceInfoDeliveryRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsRtaGetInfoV2DataInterfaceInfoDeliveryRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsRtaGetInfoV2DataInterfaceInfoDeliveryRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsRtaGetInfoV2DataInterfaceInfoDeliveryRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsRtaGetInfoV2DataInterfaceInfoDeliveryRange.fromValue(value);
    }
  }
}

