/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType.Adapter.class)
public enum StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l);

  private Long value;

  StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType fromValue(Long value) {
    for (StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType b : StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType.fromValue(value);
    }
  }
}

