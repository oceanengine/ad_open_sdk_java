/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus.Adapter.class)
public enum StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus {
  
  AUDITING("AUDITING"),
  
  CANCEL("CANCEL"),
  
  CLOSE("CLOSE"),
  
  DOING("DOING"),
  
  FAIL_CREATE("FAIL_CREATE"),
  
  FINISH("FINISH"),
  
  PREPARE("PREPARE"),
  
  REJECT_AUDIT("REJECT_AUDIT"),
  
  SETTLE("SETTLE"),
  
  WAIT_CANCEL("WAIT_CANCEL");

  private String value;

  StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus fromValue(String value) {
    for (StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus b : StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus.fromValue(value);
    }
  }
}

