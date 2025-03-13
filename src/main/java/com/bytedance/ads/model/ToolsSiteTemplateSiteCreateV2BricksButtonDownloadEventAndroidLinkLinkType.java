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
@JsonAdapter(ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventAndroidLinkLinkType.Adapter.class)
public enum ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventAndroidLinkLinkType {
  
  QUICK_APP("QUICK_APP"),
  
  SCHEME("SCHEME"),
  
  URL("URL");

  private String value;

  ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventAndroidLinkLinkType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventAndroidLinkLinkType fromValue(String value) {
    for (ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventAndroidLinkLinkType b : ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventAndroidLinkLinkType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventAndroidLinkLinkType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventAndroidLinkLinkType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventAndroidLinkLinkType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventAndroidLinkLinkType.fromValue(value);
    }
  }
}

