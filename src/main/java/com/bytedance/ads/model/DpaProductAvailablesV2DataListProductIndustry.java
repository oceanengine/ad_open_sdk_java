/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
@JsonAdapter(DpaProductAvailablesV2DataListProductIndustry.Adapter.class)
public enum DpaProductAvailablesV2DataListProductIndustry {
  
  AUTO_OLD("AUTO_OLD"),
  
  TOUR_ROUTE("TOUR_ROUTE"),
  
  NEW_HOUSE("NEW_HOUSE"),
  
  TRANSPORT_TICKET("TRANSPORT_TICKET"),
  
  RECRUITMENT("RECRUITMENT"),
  
  GAME("GAME"),
  
  EDUCATION("EDUCATION"),
  
  FINANCE("FINANCE"),
  
  MEDICINE("MEDICINE"),
  
  ECOMMERCE_V2("ECOMMERCE_V2"),
  
  AUTO_NEW("AUTO_NEW"),
  
  WEALTH("WEALTH"),
  
  ECOMMERCE("ECOMMERCE"),
  
  LIVE("LIVE"),
  
  GENERAL("GENERAL"),
  
  ESTATE("ESTATE"),
  
  OTHER("OTHER"),
  
  VIDEO("VIDEO"),
  
  FURNITURE("FURNITURE"),
  
  TOUR_TICKET("TOUR_TICKET"),
  
  NOVEL("NOVEL"),
  
  COMMUNICATION("COMMUNICATION"),
  
  MERCHANTS("MERCHANTS"),
  
  MEDICAL_SERVICE("MEDICAL_SERVICE"),
  
  TOUR_HOTEL("TOUR_HOTEL"),
  
  CREDIT("CREDIT");

  private String value;

  DpaProductAvailablesV2DataListProductIndustry(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaProductAvailablesV2DataListProductIndustry fromValue(String value) {
    for (DpaProductAvailablesV2DataListProductIndustry b : DpaProductAvailablesV2DataListProductIndustry.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DpaProductAvailablesV2DataListProductIndustry> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaProductAvailablesV2DataListProductIndustry enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaProductAvailablesV2DataListProductIndustry read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaProductAvailablesV2DataListProductIndustry.fromValue(value);
    }
  }
}

