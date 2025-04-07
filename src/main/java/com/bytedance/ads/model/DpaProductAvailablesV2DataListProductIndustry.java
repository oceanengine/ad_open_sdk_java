/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
  
  ECOMMERCE("ECOMMERCE"),
  
  COMPREHENSIVESHOOT("COMPREHENSIVESHOOT"),
  
  COMMUNICATION("COMMUNICATION"),
  
  OTHER("OTHER"),
  
  GENERAL("GENERAL"),
  
  TRANSPORT_TICKET("TRANSPORT_TICKET"),
  
  MEDICAL_SERVICE("MEDICAL_SERVICE"),
  
  NOVEL("NOVEL"),
  
  LARGELOANS("LARGELOANS"),
  
  SPECIALMAKEUP("SPECIALMAKEUP"),
  
  BASE_HOUSE("BASE_HOUSE"),
  
  FURNITURE("FURNITURE"),
  
  ESTATE("ESTATE"),
  
  MERCHANTS("MERCHANTS"),
  
  TOUR_ROUTE("TOUR_ROUTE"),
  
  EDUCATION("EDUCATION"),
  
  GAME("GAME"),
  
  AUTO_OLD("AUTO_OLD"),
  
  VIDEO("VIDEO"),
  
  TOUR_HOTEL("TOUR_HOTEL"),
  
  ECOMMERCE_V2("ECOMMERCE_V2"),
  
  HEALTHPRODUCTS("HEALTHPRODUCTS"),
  
  LAW("LAW"),
  
  MEDICINE("MEDICINE"),
  
  BEAUTYSALON("BEAUTYSALON"),
  
  HOME("HOME"),
  
  TRAVELSHOOT("TRAVELSHOOT"),
  
  TOUR_TICKET("TOUR_TICKET"),
  
  RECRUITMENT("RECRUITMENT"),
  
  FAMILYSHOOT("FAMILYSHOOT"),
  
  PLAYLET("PLAYLET"),
  
  IAAPLAYLET("IAAPLAYLET"),
  
  INVESTMENTPROMOTION("INVESTMENTPROMOTION"),
  
  NEW_HOUSE("NEW_HOUSE"),
  
  WEALTH("WEALTH"),
  
  LIVE("LIVE"),
  
  CREDIT("CREDIT"),
  
  JOBS("JOBS"),
  
  LOCALSHOOT("LOCALSHOOT"),
  
  AUTO_NEW("AUTO_NEW"),
  
  FINANCE("FINANCE");

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

