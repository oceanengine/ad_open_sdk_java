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
@JsonAdapter(YuntuAudienceLabelCreateV30CalculateRuleBehaviorFiltersBehaviors.Adapter.class)
public enum YuntuAudienceLabelCreateV30CalculateRuleBehaviorFiltersBehaviors {
  
  ADD_CART("add_cart"),
  
  BROWSE("browse"),
  
  CLICK("click"),
  
  COMMENT("comment"),
  
  ENTER_DETAIL("enter_detail"),
  
  FAVORITES("favorites"),
  
  FORWARD("forward"),
  
  LIKE("like"),
  
  ORDER("order"),
  
  QUERY("query"),
  
  SHOW("show");

  private String value;

  YuntuAudienceLabelCreateV30CalculateRuleBehaviorFiltersBehaviors(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static YuntuAudienceLabelCreateV30CalculateRuleBehaviorFiltersBehaviors fromValue(String value) {
    for (YuntuAudienceLabelCreateV30CalculateRuleBehaviorFiltersBehaviors b : YuntuAudienceLabelCreateV30CalculateRuleBehaviorFiltersBehaviors.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<YuntuAudienceLabelCreateV30CalculateRuleBehaviorFiltersBehaviors> {
    @Override
    public void write(final JsonWriter jsonWriter, final YuntuAudienceLabelCreateV30CalculateRuleBehaviorFiltersBehaviors enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public YuntuAudienceLabelCreateV30CalculateRuleBehaviorFiltersBehaviors read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return YuntuAudienceLabelCreateV30CalculateRuleBehaviorFiltersBehaviors.fromValue(value);
    }
  }
}

