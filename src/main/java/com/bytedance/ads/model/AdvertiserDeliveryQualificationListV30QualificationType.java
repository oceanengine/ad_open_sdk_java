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
@JsonAdapter(AdvertiserDeliveryQualificationListV30QualificationType.Adapter.class)
public enum AdvertiserDeliveryQualificationListV30QualificationType {
  
  AGENT_ARRANGEMENT("AGENT_ARRANGEMENT"),
  
  AUTHORIZATION_CONTRACT("AUTHORIZATION_CONTRACT"),
  
  DISTRIBUTION_AUTHORIZATION("DISTRIBUTION_AUTHORIZATION"),
  
  FOOD_BUSINESS_LICENSE("FOOD_BUSINESS_LICENSE"),
  
  ICP_RECORD_AUTHORIZATION("ICP_RECORD_AUTHORIZATION"),
  
  OTHER_CERTIFICATION("OTHER_CERTIFICATION"),
  
  PATENT_CERTIFICATE("PATENT_CERTIFICATE"),
  
  PORTRAIT_AUTHORIZATION("PORTRAIT_AUTHORIZATION"),
  
  QUALITY_REPORT("QUALITY_REPORT"),
  
  SOFTWARE_COPYRIGHT_REGISTRATION_CERTIFICATE("SOFTWARE_COPYRIGHT_REGISTRATION_CERTIFICATE"),
  
  TRADEMARK_REGISTRATION_CERTIFICATE("TRADEMARK_REGISTRATION_CERTIFICATE"),
  
  VIDEO_MATERIAL_PRODUCTION_IP_AUTHORIZATION("VIDEO_MATERIAL_PRODUCTION_IP_AUTHORIZATION");

  private String value;

  AdvertiserDeliveryQualificationListV30QualificationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserDeliveryQualificationListV30QualificationType fromValue(String value) {
    for (AdvertiserDeliveryQualificationListV30QualificationType b : AdvertiserDeliveryQualificationListV30QualificationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdvertiserDeliveryQualificationListV30QualificationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserDeliveryQualificationListV30QualificationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserDeliveryQualificationListV30QualificationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserDeliveryQualificationListV30QualificationType.fromValue(value);
    }
  }
}

