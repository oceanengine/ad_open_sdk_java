/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@JsonAdapter(StardeliveryTaskCreateV30StarTaskExternalAction.Adapter.class)
public enum StardeliveryTaskCreateV30StarTaskExternalAction {
  
  ACTIVE("AD_CONVERT_TYPE_ACTIVE"),
  
  ACTIVE_REGISTER("AD_CONVERT_TYPE_ACTIVE_REGISTER"),
  
  PAY("AD_CONVERT_TYPE_PAY");

  private String value;

  StardeliveryTaskCreateV30StarTaskExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StardeliveryTaskCreateV30StarTaskExternalAction fromValue(String value) {
    for (StardeliveryTaskCreateV30StarTaskExternalAction b : StardeliveryTaskCreateV30StarTaskExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StardeliveryTaskCreateV30StarTaskExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final StardeliveryTaskCreateV30StarTaskExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StardeliveryTaskCreateV30StarTaskExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StardeliveryTaskCreateV30StarTaskExternalAction.fromValue(value);
    }
  }
}

