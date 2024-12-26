/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@JsonAdapter(CreativeProceduralCreativeUpdateV2AdDataIsCommentDisable.Adapter.class)
public enum CreativeProceduralCreativeUpdateV2AdDataIsCommentDisable {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  CreativeProceduralCreativeUpdateV2AdDataIsCommentDisable(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeProceduralCreativeUpdateV2AdDataIsCommentDisable fromValue(Long value) {
    for (CreativeProceduralCreativeUpdateV2AdDataIsCommentDisable b : CreativeProceduralCreativeUpdateV2AdDataIsCommentDisable.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeProceduralCreativeUpdateV2AdDataIsCommentDisable> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeProceduralCreativeUpdateV2AdDataIsCommentDisable enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeProceduralCreativeUpdateV2AdDataIsCommentDisable read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return CreativeProceduralCreativeUpdateV2AdDataIsCommentDisable.fromValue(value);
    }
  }
}

