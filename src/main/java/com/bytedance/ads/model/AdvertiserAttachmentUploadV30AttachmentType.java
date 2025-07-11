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
@JsonAdapter(AdvertiserAttachmentUploadV30AttachmentType.Adapter.class)
public enum AdvertiserAttachmentUploadV30AttachmentType {
  
  DELIVERY_ATTACHMENT("DELIVERY_ATTACHMENT");

  private String value;

  AdvertiserAttachmentUploadV30AttachmentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserAttachmentUploadV30AttachmentType fromValue(String value) {
    for (AdvertiserAttachmentUploadV30AttachmentType b : AdvertiserAttachmentUploadV30AttachmentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdvertiserAttachmentUploadV30AttachmentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserAttachmentUploadV30AttachmentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserAttachmentUploadV30AttachmentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserAttachmentUploadV30AttachmentType.fromValue(value);
    }
  }
}

