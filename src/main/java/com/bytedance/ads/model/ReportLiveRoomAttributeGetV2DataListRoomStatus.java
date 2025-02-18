/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
@JsonAdapter(ReportLiveRoomAttributeGetV2DataListRoomStatus.Adapter.class)
public enum ReportLiveRoomAttributeGetV2DataListRoomStatus {
  
  PAUSE("PAUSE"),
  
  PREPARING("PREPARING"),
  
  LIVING("LIVING"),
  
  END("END");

  private String value;

  ReportLiveRoomAttributeGetV2DataListRoomStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportLiveRoomAttributeGetV2DataListRoomStatus fromValue(String value) {
    for (ReportLiveRoomAttributeGetV2DataListRoomStatus b : ReportLiveRoomAttributeGetV2DataListRoomStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportLiveRoomAttributeGetV2DataListRoomStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportLiveRoomAttributeGetV2DataListRoomStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportLiveRoomAttributeGetV2DataListRoomStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportLiveRoomAttributeGetV2DataListRoomStatus.fromValue(value);
    }
  }
}

