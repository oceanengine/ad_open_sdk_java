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
@JsonAdapter(QianchuanDmpAudiencesGetV10DataRetargetingTagsSource.Adapter.class)
public enum QianchuanDmpAudiencesGetV10DataRetargetingTagsSource {
  
  CUSTOM_AUDIENCE_TYPE_BRAND("CUSTOM_AUDIENCE_TYPE_BRAND"),
  
  CUSTOM_AUDIENCE_TYPE_DATA_SOURCE("CUSTOM_AUDIENCE_TYPE_DATA_SOURCE"),
  
  CUSTOM_AUDIENCE_TYPE_DOU_PLUS("CUSTOM_AUDIENCE_TYPE_DOU_PLUS"),
  
  CUSTOM_AUDIENCE_TYPE_EXTEND("CUSTOM_AUDIENCE_TYPE_EXTEND"),
  
  CUSTOM_AUDIENCE_TYPE_FRIEND("CUSTOM_AUDIENCE_TYPE_FRIEND"),
  
  CUSTOM_AUDIENCE_TYPE_ONE_KEY("CUSTOM_AUDIENCE_TYPE_ONE_KEY"),
  
  CUSTOM_AUDIENCE_TYPE_OPERATE("CUSTOM_AUDIENCE_TYPE_OPERATE"),
  
  CUSTOM_AUDIENCE_TYPE_PACK_RULE("CUSTOM_AUDIENCE_TYPE_PACK_RULE"),
  
  CUSTOM_AUDIENCE_TYPE_RULE("CUSTOM_AUDIENCE_TYPE_RULE"),
  
  CUSTOM_AUDIENCE_TYPE_THEME("CUSTOM_AUDIENCE_TYPE_THEME"),
  
  CUSTOM_AUDIENCE_TYPE_THIRD_PARTY("CUSTOM_AUDIENCE_TYPE_THIRD_PARTY"),
  
  CUSTOM_AUDIENCE_TYPE_UPLOAD("CUSTOM_AUDIENCE_TYPE_UPLOAD"),
  
  FINANCECUSTOM_AUDIENCE_TYPE_FINANCE("FINANCECUSTOM_AUDIENCE_TYPE_FINANCE");

  private String value;

  QianchuanDmpAudiencesGetV10DataRetargetingTagsSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanDmpAudiencesGetV10DataRetargetingTagsSource fromValue(String value) {
    for (QianchuanDmpAudiencesGetV10DataRetargetingTagsSource b : QianchuanDmpAudiencesGetV10DataRetargetingTagsSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanDmpAudiencesGetV10DataRetargetingTagsSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanDmpAudiencesGetV10DataRetargetingTagsSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanDmpAudiencesGetV10DataRetargetingTagsSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanDmpAudiencesGetV10DataRetargetingTagsSource.fromValue(value);
    }
  }
}

