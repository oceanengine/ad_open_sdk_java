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
@JsonAdapter(CarouselListV2DataCarouselsSource.Adapter.class)
public enum CarouselListV2DataCarouselsSource {
  
  ACCOUNT_PUSH("ACCOUNT_PUSH"),
  
  AD_SITE("AD_SITE"),
  
  AIC("AIC"),
  
  BP("BP"),
  
  CEWEBRITY_CAROUSEL("CEWEBRITY_CAROUSEL"),
  
  OPEN_API("OPEN_API");

  private String value;

  CarouselListV2DataCarouselsSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CarouselListV2DataCarouselsSource fromValue(String value) {
    for (CarouselListV2DataCarouselsSource b : CarouselListV2DataCarouselsSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CarouselListV2DataCarouselsSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final CarouselListV2DataCarouselsSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CarouselListV2DataCarouselsSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CarouselListV2DataCarouselsSource.fromValue(value);
    }
  }
}

