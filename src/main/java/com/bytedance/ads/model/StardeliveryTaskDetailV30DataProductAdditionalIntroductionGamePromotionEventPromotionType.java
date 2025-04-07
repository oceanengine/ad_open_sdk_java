/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType.Adapter.class)
public enum StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType {
  
  ANNIVERSARY_CELEBRATION("ANNIVERSARY_CELEBRATION"),
  
  FESTIVAL("FESTIVAL"),
  
  LAUNCH("LAUNCH"),
  
  OTHERS("OTHERS"),
  
  REGULAR("REGULAR"),
  
  VERSION_UPDATE("VERSION_UPDATE");

  private String value;

  StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType fromValue(String value) {
    for (StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType b : StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StardeliveryTaskDetailV30DataProductAdditionalIntroductionGamePromotionEventPromotionType.fromValue(value);
    }
  }
}

