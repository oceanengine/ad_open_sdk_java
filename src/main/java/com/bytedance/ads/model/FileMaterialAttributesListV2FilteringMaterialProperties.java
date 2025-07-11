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
@JsonAdapter(FileMaterialAttributesListV2FilteringMaterialProperties.Adapter.class)
public enum FileMaterialAttributesListV2FilteringMaterialProperties {
  
  AD_HIGH_QUALITY_MATERIAL("AD_HIGH_QUALITY_MATERIAL"),
  
  AD_LOW_QUALITY_MATERIAL("AD_LOW_QUALITY_MATERIAL"),
  
  AIGC("AIGC"),
  
  CARRY_MATERIAL("CARRY_MATERIAL"),
  
  ECP_HIGH_QUALITY_MATERIAL("ECP_HIGH_QUALITY_MATERIAL"),
  
  ECP_LOW_QUALITY_MATERIAL("ECP_LOW_QUALITY_MATERIAL"),
  
  FIRST_PUBLISH_MATERIAL("FIRST_PUBLISH_MATERIAL"),
  
  INEFFICIENT_MATERIAL("INEFFICIENT_MATERIAL"),
  
  SIMILAR_MATERIAL("SIMILAR_MATERIAL"),
  
  SIMILAR_QUEUE_MATERIAL("SIMILAR_QUEUE_MATERIAL");

  private String value;

  FileMaterialAttributesListV2FilteringMaterialProperties(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileMaterialAttributesListV2FilteringMaterialProperties fromValue(String value) {
    for (FileMaterialAttributesListV2FilteringMaterialProperties b : FileMaterialAttributesListV2FilteringMaterialProperties.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileMaterialAttributesListV2FilteringMaterialProperties> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileMaterialAttributesListV2FilteringMaterialProperties enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileMaterialAttributesListV2FilteringMaterialProperties read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileMaterialAttributesListV2FilteringMaterialProperties.fromValue(value);
    }
  }
}

