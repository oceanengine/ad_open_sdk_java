/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@JsonAdapter(QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate.Adapter.class)
public enum QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate fromValue(Long value) {
    for (QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate b : QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeSettingCreativeAutoGenerate.fromValue(value);
    }
  }
}
