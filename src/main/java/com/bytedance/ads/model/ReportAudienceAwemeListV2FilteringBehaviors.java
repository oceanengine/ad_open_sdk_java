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
@JsonAdapter(ReportAudienceAwemeListV2FilteringBehaviors.Adapter.class)
public enum ReportAudienceAwemeListV2FilteringBehaviors {
  
  GOODS_CARTS_ORDER("GOODS_CARTS_ORDER"),
  
  LIVE_COMMENT("LIVE_COMMENT"),
  
  LIVE_EXCEPTIONAL("LIVE_EXCEPTIONAL"),
  
  LIVE_GOODS_ORDER("LIVE_GOODS_ORDER"),
  
  LIVE_WATCH("LIVE_WATCH"),
  
  GOODS_CARTS_CLICK("GOODS_CARTS_CLICK"),
  
  COMMENTED_USER("COMMENTED_USER"),
  
  LIVE_EFFECTIVE_WATCH("LIVE_EFFECTIVE_WATCH"),
  
  FOLLOWED_USER("FOLLOWED_USER"),
  
  SHARED_USER("SHARED_USER"),
  
  LIKED_USER("LIKED_USER"),
  
  LIVE_GOODS_CLICK("LIVE_GOODS_CLICK");

  private String value;

  ReportAudienceAwemeListV2FilteringBehaviors(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAudienceAwemeListV2FilteringBehaviors fromValue(String value) {
    for (ReportAudienceAwemeListV2FilteringBehaviors b : ReportAudienceAwemeListV2FilteringBehaviors.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAudienceAwemeListV2FilteringBehaviors> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAudienceAwemeListV2FilteringBehaviors enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAudienceAwemeListV2FilteringBehaviors read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAudienceAwemeListV2FilteringBehaviors.fromValue(value);
    }
  }
}

