/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.11
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
@JsonAdapter(ProjectCreateV30DeliverySettingDeepBidType.Adapter.class)
public enum ProjectCreateV30DeliverySettingDeepBidType {
  
  ALI_FL("ALI_FL"),
  
  AUTO_MIN_SECOND_STAGE("AUTO_MIN_SECOND_STAGE"),
  
  BID_PER_ACTION("BID_PER_ACTION"),
  
  DEEP_BID_DEFAULT("DEEP_BID_DEFAULT"),
  
  DEEP_BID_MIN("DEEP_BID_MIN"),
  
  DEEP_BID_PACING("DEEP_BID_PACING"),
  
  DEEP_BID_TYPE_RETENTION_DAYS("DEEP_BID_TYPE_RETENTION_DAYS"),
  
  MIN_SECOND_STAGE("MIN_SECOND_STAGE"),
  
  PACING_SECOND_STAGE("PACING_SECOND_STAGE"),
  
  ROI_COEFFICIENT("ROI_COEFFICIENT"),
  
  ROI_PACING("ROI_PACING"),
  
  SMARTBID("SMARTBID"),
  
  SOCIAL_ROI("SOCIAL_ROI"),
  
  FORM_BID("FORM_BID"),
  
  PHONE_CONNECT_BID("PHONE_CONNECT_BID"),
  
  ROI_DIRECT_MAIL("ROI_DIRECT_MAIL");

  private String value;

  ProjectCreateV30DeliverySettingDeepBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCreateV30DeliverySettingDeepBidType fromValue(String value) {
    for (ProjectCreateV30DeliverySettingDeepBidType b : ProjectCreateV30DeliverySettingDeepBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectCreateV30DeliverySettingDeepBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCreateV30DeliverySettingDeepBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCreateV30DeliverySettingDeepBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectCreateV30DeliverySettingDeepBidType.fromValue(value);
    }
  }
}

