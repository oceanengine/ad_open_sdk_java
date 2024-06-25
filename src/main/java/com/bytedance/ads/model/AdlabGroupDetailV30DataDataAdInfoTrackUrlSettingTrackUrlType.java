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
@JsonAdapter(AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType.Adapter.class)
public enum AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType {
  
  CUSTOM("CUSTOM"),
  
  EXISTED("EXISTED");

  private String value;

  AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType fromValue(String value) {
    for (AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType b : AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType.fromValue(value);
    }
  }
}

