/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
@JsonAdapter(QianchuanOrientationPackageGetV10DataListAutoExtendTargets.Adapter.class)
public enum QianchuanOrientationPackageGetV10DataListAutoExtendTargets {
  
  AGE("AGE"),
  
  REGION("REGION"),
  
  GENDER("GENDER"),
  
  CUSTOM_AUDIENCE("CUSTOM_AUDIENCE"),
  
  INTEREST_ACTION("INTEREST_ACTION");

  private String value;

  QianchuanOrientationPackageGetV10DataListAutoExtendTargets(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanOrientationPackageGetV10DataListAutoExtendTargets fromValue(String value) {
    for (QianchuanOrientationPackageGetV10DataListAutoExtendTargets b : QianchuanOrientationPackageGetV10DataListAutoExtendTargets.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanOrientationPackageGetV10DataListAutoExtendTargets> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanOrientationPackageGetV10DataListAutoExtendTargets enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanOrientationPackageGetV10DataListAutoExtendTargets read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanOrientationPackageGetV10DataListAutoExtendTargets.fromValue(value);
    }
  }
}

