/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@JsonAdapter(LocalCxtExternalActionUpdateV30ExternalAction.Adapter.class)
public enum LocalCxtExternalActionUpdateV30ExternalAction {
  
  OTO_PAY("OTO_PAY"),
  
  POI_RECOMMEND("POI_RECOMMEND");

  private String value;

  LocalCxtExternalActionUpdateV30ExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalCxtExternalActionUpdateV30ExternalAction fromValue(String value) {
    for (LocalCxtExternalActionUpdateV30ExternalAction b : LocalCxtExternalActionUpdateV30ExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalCxtExternalActionUpdateV30ExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalCxtExternalActionUpdateV30ExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalCxtExternalActionUpdateV30ExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalCxtExternalActionUpdateV30ExternalAction.fromValue(value);
    }
  }
}

