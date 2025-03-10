/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@JsonAdapter(ToolsClueLifeCallbackV2EventDataReasonCode.Adapter.class)
public enum ToolsClueLifeCallbackV2EventDataReasonCode {
  
  CALL_THREE_TIMES_NO_RESPONSE("CALL_THREE_TIMES_NO_RESPONSE"),
  
  CONNECTED_NO_INTENTION("CONNECTED_NO_INTENTION"),
  
  EDU_FIRST_CLASS_ATTENDED("EDU_FIRST_CLASS_ATTENDED"),
  
  EDU_INTERESTED("EDU_INTERESTED"),
  
  EDU_MISMATCH_CLASS_TIME("EDU_MISMATCH_CLASS_TIME"),
  
  EDU_MISMATCH_COURSE("EDU_MISMATCH_COURSE"),
  
  EDU_MISMATCH_DIFFERENT_LOCATIONS("EDU_MISMATCH_DIFFERENT_LOCATIONS"),
  
  EDU_UNABLE_TO_ATTEND_IN_PERSON("EDU_UNABLE_TO_ATTEND_IN_PERSON"),
  
  HOME_APPOINTMENT_SCHEDULED("HOME_APPOINTMENT_SCHEDULED"),
  
  HOME_CAN_ADD_WECHAT("HOME_CAN_ADD_WECHAT"),
  
  HOME_COLLABORATION_WITH_PEERS("HOME_COLLABORATION_WITH_PEERS"),
  
  HOME_CONNECTED_WITH_INTERESTED_PARTY("HOME_CONNECTED_WITH_INTERESTED_PARTY"),
  
  HOME_CONTRACT_SIGNED("HOME_CONTRACT_SIGNED"),
  
  HOME_MEASUREMENT_COMPLETED("HOME_MEASUREMENT_COMPLETED"),
  
  HOME_MISMATCH_DIFFERENT_LOCATIONS("HOME_MISMATCH_DIFFERENT_LOCATIONS"),
  
  HOME_MISMATCH_LOW_BUDGET("HOME_MISMATCH_LOW_BUDGET"),
  
  HOME_NO_SHOW_FOR_MEASUREMENT_VISIT("HOME_NO_SHOW_FOR_MEASUREMENT_VISIT"),
  
  HOME_ORDER_DISPATCHED("HOME_ORDER_DISPATCHED"),
  
  HOME_RENOVATION_TYPE_NOT_ACCEPTABLE("HOME_RENOVATION_TYPE_NOT_ACCEPTABLE"),
  
  HOME_SERVICE_DELIVERY_COMPLETED("HOME_SERVICE_DELIVERY_COMPLETED"),
  
  INVALID_NUMBER("INVALID_NUMBER"),
  
  MISMATCH_DIFFERENT_LOCATIONS("MISMATCH_DIFFERENT_LOCATIONS"),
  
  MISMATCH_LOW_BUDGET("MISMATCH_LOW_BUDGET"),
  
  NO_AD_RESPONSE("NO_AD_RESPONSE"),
  
  OFFENSIVE_LANGUAGE("OFFENSIVE_LANGUAGE"),
  
  OTHER("OTHER");

  private String value;

  ToolsClueLifeCallbackV2EventDataReasonCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueLifeCallbackV2EventDataReasonCode fromValue(String value) {
    for (ToolsClueLifeCallbackV2EventDataReasonCode b : ToolsClueLifeCallbackV2EventDataReasonCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsClueLifeCallbackV2EventDataReasonCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueLifeCallbackV2EventDataReasonCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueLifeCallbackV2EventDataReasonCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueLifeCallbackV2EventDataReasonCode.fromValue(value);
    }
  }
}

