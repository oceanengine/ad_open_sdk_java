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
@JsonAdapter(QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode.Adapter.class)
public enum QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode {
  
  DEFAULT("QCPX_MODE_DEFAULT"),
  
  OFF("QCPX_MODE_OFF"),
  
  ON("QCPX_MODE_ON");

  private String value;

  QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode fromValue(String value) {
    for (QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode b : QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode.fromValue(value);
    }
  }
}

