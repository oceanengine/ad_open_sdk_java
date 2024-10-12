/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@JsonAdapter(PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial.Adapter.class)
public enum PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial {
  
  LEVEL1("LEVEL1"),
  
  LEVEL2("LEVEL2"),
  
  LEVEL3("LEVEL3"),
  
  LEVEL4("LEVEL4"),
  
  LEVEL5("LEVEL5");

  private String value;

  PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial fromValue(String value) {
    for (PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial b : PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListMaterialScoreInfoScoreValueOfMaterial.fromValue(value);
    }
  }
}

