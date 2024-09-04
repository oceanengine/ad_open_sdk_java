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
@JsonAdapter(FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType.Adapter.class)
public enum FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType {
  
  NORMAL_POLICY("NORMAL_POLICY"),
  
  EXCLUSIVE_POLICY("EXCLUSIVE_POLICY"),
  
  CAR_POLICY("CAR_POLICY");

  private String value;

  FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType fromValue(String value) {
    for (FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType b : FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType.fromValue(value);
    }
  }
}

