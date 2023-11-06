/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
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
@JsonAdapter(DmpCustomAudienceReadV2DataCustomAudienceListSource.Adapter.class)
public enum DmpCustomAudienceReadV2DataCustomAudienceListSource {
  
  UPLOAD("CUSTOM_AUDIENCE_TYPE_UPLOAD"),
  
  DOU_PLUS("CUSTOM_AUDIENCE_TYPE_DOU_PLUS"),
  
  DATA_SOURCE("CUSTOM_AUDIENCE_TYPE_DATA_SOURCE"),
  
  OPERATE("CUSTOM_AUDIENCE_TYPE_OPERATE"),
  
  FRIEND("CUSTOM_AUDIENCE_TYPE_FRIEND"),
  
  THIRD_PARTY("CUSTOM_AUDIENCE_TYPE_THIRD_PARTY"),
  
  FINANCE("CUSTOM_AUDIENCE_TYPE_FINANCE"),
  
  RULE("CUSTOM_AUDIENCE_TYPE_RULE"),
  
  THEME("CUSTOM_AUDIENCE_TYPE_THEME"),
  
  BRAND("CUSTOM_AUDIENCE_TYPE_BRAND"),
  
  EXTEND("CUSTOM_AUDIENCE_TYPE_EXTEND"),
  
  PACK_RULE("CUSTOM_AUDIENCE_TYPE_PACK_RULE"),
  
  ONE_KEY("CUSTOM_AUDIENCE_TYPE_ONE_KEY");

  private String value;

  DmpCustomAudienceReadV2DataCustomAudienceListSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DmpCustomAudienceReadV2DataCustomAudienceListSource fromValue(String value) {
    for (DmpCustomAudienceReadV2DataCustomAudienceListSource b : DmpCustomAudienceReadV2DataCustomAudienceListSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DmpCustomAudienceReadV2DataCustomAudienceListSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final DmpCustomAudienceReadV2DataCustomAudienceListSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DmpCustomAudienceReadV2DataCustomAudienceListSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DmpCustomAudienceReadV2DataCustomAudienceListSource.fromValue(value);
    }
  }
}

