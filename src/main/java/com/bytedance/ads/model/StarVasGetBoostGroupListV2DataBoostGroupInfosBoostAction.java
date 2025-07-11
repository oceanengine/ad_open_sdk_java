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
@JsonAdapter(StarVasGetBoostGroupListV2DataBoostGroupInfosBoostAction.Adapter.class)
public enum StarVasGetBoostGroupListV2DataBoostGroupInfosBoostAction {
  
  LINK_ACTION("LINK_ACTION"),
  
  NATIVE_ACTION("NATIVE_ACTION");

  private String value;

  StarVasGetBoostGroupListV2DataBoostGroupInfosBoostAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarVasGetBoostGroupListV2DataBoostGroupInfosBoostAction fromValue(String value) {
    for (StarVasGetBoostGroupListV2DataBoostGroupInfosBoostAction b : StarVasGetBoostGroupListV2DataBoostGroupInfosBoostAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarVasGetBoostGroupListV2DataBoostGroupInfosBoostAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarVasGetBoostGroupListV2DataBoostGroupInfosBoostAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarVasGetBoostGroupListV2DataBoostGroupInfosBoostAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarVasGetBoostGroupListV2DataBoostGroupInfosBoostAction.fromValue(value);
    }
  }
}

