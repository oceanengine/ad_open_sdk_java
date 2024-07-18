/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@JsonAdapter(QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors.Adapter.class)
public enum QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors {
  
  ALL("ALL"),
  
  FOLLOWED_USER("FOLLOWED_USER"),
  
  GOODS_SHARE("GOODS_SHARE"),
  
  LIKED_USER("LIKED_USER"),
  
  LIVE_WATCH("LIVE_WATCH");

  private String value;

  QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors fromValue(String value) {
    for (QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors b : QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors.fromValue(value);
    }
  }
}

