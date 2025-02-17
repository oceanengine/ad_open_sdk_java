/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
@JsonAdapter(QianchuanCarouselAwemeGetV10DataPageInfoHasMore.Adapter.class)
public enum QianchuanCarouselAwemeGetV10DataPageInfoHasMore {
  
  NUMBER_1(1l),
  
  NUMBER_0(0l);

  private Long value;

  QianchuanCarouselAwemeGetV10DataPageInfoHasMore(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanCarouselAwemeGetV10DataPageInfoHasMore fromValue(Long value) {
    for (QianchuanCarouselAwemeGetV10DataPageInfoHasMore b : QianchuanCarouselAwemeGetV10DataPageInfoHasMore.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanCarouselAwemeGetV10DataPageInfoHasMore> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanCarouselAwemeGetV10DataPageInfoHasMore enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanCarouselAwemeGetV10DataPageInfoHasMore read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanCarouselAwemeGetV10DataPageInfoHasMore.fromValue(value);
    }
  }
}

