/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(AdvertiserVerifyInfoGetV30DataRecordsVerifyType.Adapter.class)
public enum AdvertiserVerifyInfoGetV30DataRecordsVerifyType {
  
  AD_ARK_SKIP("AD_ARK_SKIP"),
  
  AUTH("AUTH"),
  
  AUTH_LETTER("AUTH_LETTER"),
  
  BYTEDANCE_PAY("BYTEDANCE_PAY"),
  
  CUSTOMER_PAY("CUSTOMER_PAY"),
  
  ELEC_CERT_SKIP("ELEC_CERT_SKIP"),
  
  FACE_DETECT("FACE_DETECT"),
  
  PERSON_VERIFY3("PERSON_VERIFY3"),
  
  PERSON_VERIFY4("PERSON_VERIFY4"),
  
  SKIP("SKIP"),
  
  THRID_PARTY_AUTH("THRID_PARTY_AUTH");

  private String value;

  AdvertiserVerifyInfoGetV30DataRecordsVerifyType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserVerifyInfoGetV30DataRecordsVerifyType fromValue(String value) {
    for (AdvertiserVerifyInfoGetV30DataRecordsVerifyType b : AdvertiserVerifyInfoGetV30DataRecordsVerifyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdvertiserVerifyInfoGetV30DataRecordsVerifyType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserVerifyInfoGetV30DataRecordsVerifyType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserVerifyInfoGetV30DataRecordsVerifyType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserVerifyInfoGetV30DataRecordsVerifyType.fromValue(value);
    }
  }
}

