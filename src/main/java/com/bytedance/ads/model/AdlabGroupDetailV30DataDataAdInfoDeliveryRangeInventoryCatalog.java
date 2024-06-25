/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog.Adapter.class)
public enum AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog {
  
  MANUAL("MANUAL"),
  
  SCENE("SCENE"),
  
  SMART("SMART"),
  
  UNIVERSAL("UNIVERSAL"),
  
  UNIVERSAL_SMART("UNIVERSAL_SMART");

  private String value;

  AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog fromValue(String value) {
    for (AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog b : AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupDetailV30DataDataAdInfoDeliveryRangeInventoryCatalog.fromValue(value);
    }
  }
}

