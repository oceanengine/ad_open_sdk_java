/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@JsonAdapter(BrandAdGetV30DataAdsBudgetInfoGdSendType.Adapter.class)
public enum BrandAdGetV30DataAdsBudgetInfoGdSendType {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l),
  
  NUMBER_5(5l),
  
  NUMBER_6(6l),
  
  NUMBER_7(7l),
  
  NUMBER_8(8l),
  
  NUMBER_9(9l),
  
  NUMBER_10(10l),
  
  NUMBER_11(11l),
  
  NUMBER_12(12l),
  
  NUMBER_13(13l),
  
  NUMBER_14(14l),
  
  NUMBER_15(15l),
  
  NUMBER_16(16l),
  
  NUMBER_17(17l),
  
  NUMBER_18(18l),
  
  NUMBER_19(19l),
  
  NUMBER_20(20l),
  
  NUMBER_21(21l),
  
  NUMBER_22(22l),
  
  NUMBER_23(23l),
  
  NUMBER_24(24l),
  
  NUMBER_25(25l),
  
  NUMBER_26(26l),
  
  NUMBER_27(27l),
  
  NUMBER_28(28l),
  
  NUMBER_29(29l),
  
  NUMBER_40(40l);

  private Long value;

  BrandAdGetV30DataAdsBudgetInfoGdSendType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandAdGetV30DataAdsBudgetInfoGdSendType fromValue(Long value) {
    for (BrandAdGetV30DataAdsBudgetInfoGdSendType b : BrandAdGetV30DataAdsBudgetInfoGdSendType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandAdGetV30DataAdsBudgetInfoGdSendType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandAdGetV30DataAdsBudgetInfoGdSendType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandAdGetV30DataAdsBudgetInfoGdSendType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return BrandAdGetV30DataAdsBudgetInfoGdSendType.fromValue(value);
    }
  }
}

