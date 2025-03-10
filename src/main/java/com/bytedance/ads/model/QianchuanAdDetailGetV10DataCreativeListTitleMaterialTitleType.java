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
@JsonAdapter(QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType.Adapter.class)
public enum QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType {
  
  AWEME_CAROUSEL("AWEME_CAROUSEL"),
  
  COMMODITY_CARD("COMMODITY_CARD"),
  
  CUSTOM("CUSTOM");

  private String value;

  QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType fromValue(String value) {
    for (QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType b : QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataCreativeListTitleMaterialTitleType.fromValue(value);
    }
  }
}

