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
@JsonAdapter(StarDemandListV2DataListComponentType.Adapter.class)
public enum StarDemandListV2DataListComponentType {
  
  ALL("ALL"),
  
  ANCHOR_CAR("ANCHOR_CAR"),
  
  ANCHOR_DOWNLOAD("ANCHOR_DOWNLOAD"),
  
  ANCHOR_ECOM("ANCHOR_ECOM"),
  
  ANCHOR_EDUCATION("ANCHOR_EDUCATION"),
  
  ANCHOR_ESTATE_SERVICE("ANCHOR_ESTATE_SERVICE"),
  
  ANCHOR_E_GAME("ANCHOR_E_GAME"),
  
  ANCHOR_HOME("ANCHOR_HOME"),
  
  ANCHOR_INSURANCE("ANCHOR_INSURANCE"),
  
  ANCHOR_INVESTMENT("ANCHOR_INVESTMENT"),
  
  ANCHOR_MICRO_APP_POI("ANCHOR_MICRO_APP_POI"),
  
  ANCHOR_MOVIE("ANCHOR_MOVIE"),
  
  ANCHOR_TELECOM("ANCHOR_TELECOM"),
  
  ANCHOR_TOURISM("ANCHOR_TOURISM"),
  
  ANCHOR_XIGUA("ANCHOR_XIGUA"),
  
  BRAND_ANCHOR("BRAND_ANCHOR"),
  
  CART("CART"),
  
  ENTERPRISE_CAR("ENTERPRISE_CAR"),
  
  ENTERPRISE_COUPON("ENTERPRISE_COUPON"),
  
  ENTERPRISE_DOWNLOAD("ENTERPRISE_DOWNLOAD"),
  
  ENTERPRISE_DOWNLOAD_APP("ENTERPRISE_DOWNLOAD_APP"),
  
  ENTERPRISE_ECOM("ENTERPRISE_ECOM"),
  
  ENTERPRISE_MICRO_APP("ENTERPRISE_MICRO_APP"),
  
  ENTERPRISE_NOVEL("ENTERPRISE_NOVEL"),
  
  ENTERPRISE_ORDER_SERVICE("ENTERPRISE_ORDER_SERVICE"),
  
  ENTERPRISE_SALON("ENTERPRISE_SALON"),
  
  ENTERPRISE_WEDDING_PHOTO("ENTERPRISE_WEDDING_PHOTO"),
  
  GAME_ANCHOR("GAME_ANCHOR"),
  
  LINK("LINK"),
  
  LIVE_ORDER_COMPONENT("LIVE_ORDER_COMPONENT"),
  
  MICROAPP_ANCHOR("MICROAPP_ANCHOR"),
  
  POI("POI"),
  
  VARIETY_ANCHOR("VARIETY_ANCHOR");

  private String value;

  StarDemandListV2DataListComponentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandListV2DataListComponentType fromValue(String value) {
    for (StarDemandListV2DataListComponentType b : StarDemandListV2DataListComponentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarDemandListV2DataListComponentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandListV2DataListComponentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandListV2DataListComponentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarDemandListV2DataListComponentType.fromValue(value);
    }
  }
}

