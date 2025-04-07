/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
@JsonAdapter(QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialStarTraffic.Adapter.class)
public enum QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialStarTraffic {
  
  NUMBER_1(1l);

  private Long value;

  QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialStarTraffic(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialStarTraffic fromValue(Long value) {
    for (QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialStarTraffic b : QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialStarTraffic.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialStarTraffic> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialStarTraffic enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialStarTraffic read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialStarTraffic.fromValue(value);
    }
  }
}

