/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
@JsonAdapter(ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus.Adapter.class)
public enum ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus {
  
  NUMBER_10(10l),
  
  NUMBER_30(30l),
  
  NUMBER_40(40l),
  
  NUMBER_45(45l),
  
  NUMBER_50(50l),
  
  NUMBER_60(60l),
  
  NUMBER_100(100l);

  private Long value;

  ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus fromValue(Long value) {
    for (ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus b : ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ServeMarketCidVerifyTokenV10DataFacilitatorSubStatus.fromValue(value);
    }
  }
}

