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
@JsonAdapter(LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag.Adapter.class)
public enum LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag {
  
  COPY_ACCOUNT("COPY_ACCOUNT"),
  
  MAIN_ACCOUNT("MAIN_ACCOUNT");

  private String value;

  LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag fromValue(String value) {
    for (LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag b : LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalLifeAdvertiserListV30DataAdvListAccountMainCopyTag.fromValue(value);
    }
  }
}

