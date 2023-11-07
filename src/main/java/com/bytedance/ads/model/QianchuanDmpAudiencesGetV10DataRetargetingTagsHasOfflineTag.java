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
@JsonAdapter(QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag.Adapter.class)
public enum QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag fromValue(Long value) {
    for (QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag b : QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag.fromValue(value);
    }
  }
}

