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
@JsonAdapter(QianchuanAdDetailGetV10DataAudienceAutoExtendTargets.Adapter.class)
public enum QianchuanAdDetailGetV10DataAudienceAutoExtendTargets {
  
  AD_TAG("AD_TAG"),
  
  AGE("AGE"),
  
  CUSTOM_AUDIENCE("CUSTOM_AUDIENCE"),
  
  GENDER("GENDER"),
  
  INTEREST_ACTION("INTEREST_ACTION"),
  
  INTEREST_TAG("INTEREST_TAG"),
  
  REGION("REGION");

  private String value;

  QianchuanAdDetailGetV10DataAudienceAutoExtendTargets(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataAudienceAutoExtendTargets fromValue(String value) {
    for (QianchuanAdDetailGetV10DataAudienceAutoExtendTargets b : QianchuanAdDetailGetV10DataAudienceAutoExtendTargets.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataAudienceAutoExtendTargets> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataAudienceAutoExtendTargets enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataAudienceAutoExtendTargets read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataAudienceAutoExtendTargets.fromValue(value);
    }
  }
}

