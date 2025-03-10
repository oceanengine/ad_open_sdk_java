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
@JsonAdapter(QianchuanAdUpdateV10MultiProductCreativeListCreativeSettingIsHomepageHide.Adapter.class)
public enum QianchuanAdUpdateV10MultiProductCreativeListCreativeSettingIsHomepageHide {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  QianchuanAdUpdateV10MultiProductCreativeListCreativeSettingIsHomepageHide(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdUpdateV10MultiProductCreativeListCreativeSettingIsHomepageHide fromValue(Long value) {
    for (QianchuanAdUpdateV10MultiProductCreativeListCreativeSettingIsHomepageHide b : QianchuanAdUpdateV10MultiProductCreativeListCreativeSettingIsHomepageHide.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdUpdateV10MultiProductCreativeListCreativeSettingIsHomepageHide> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdUpdateV10MultiProductCreativeListCreativeSettingIsHomepageHide enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdUpdateV10MultiProductCreativeListCreativeSettingIsHomepageHide read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanAdUpdateV10MultiProductCreativeListCreativeSettingIsHomepageHide.fromValue(value);
    }
  }
}

