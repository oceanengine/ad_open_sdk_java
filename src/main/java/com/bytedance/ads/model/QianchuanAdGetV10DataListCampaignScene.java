/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
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
@JsonAdapter(QianchuanAdGetV10DataListCampaignScene.Adapter.class)
public enum QianchuanAdGetV10DataListCampaignScene {
  
  DAILY_SALE("DAILY_SALE"),
  
  LIVE_HEAT("LIVE_HEAT"),
  
  NEW_CUSTOMER_TRANSFORMATION("NEW_CUSTOMER_TRANSFORMATION"),
  
  PLANT_GRASS("PLANT_GRASS"),
  
  PRODUCT_HEAT("PRODUCT_HEAT");

  private String value;

  QianchuanAdGetV10DataListCampaignScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdGetV10DataListCampaignScene fromValue(String value) {
    for (QianchuanAdGetV10DataListCampaignScene b : QianchuanAdGetV10DataListCampaignScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdGetV10DataListCampaignScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdGetV10DataListCampaignScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdGetV10DataListCampaignScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdGetV10DataListCampaignScene.fromValue(value);
    }
  }
}

