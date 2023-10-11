/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@JsonAdapter(ToolsCommentReplyGetV30DataReplyListReplyStatus.Adapter.class)
public enum ToolsCommentReplyGetV30DataReplyListReplyStatus {
  
  NO_REPLY("NO_REPLY"),
  
  REPLY_AUDIT_FAIL("REPLY_AUDIT_FAIL"),
  
  REPLY_AUDIT_SUCCESS("REPLY_AUDIT_SUCCESS"),
  
  REPLY_TO_AUDIT("REPLY_TO_AUDIT");

  private String value;

  ToolsCommentReplyGetV30DataReplyListReplyStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsCommentReplyGetV30DataReplyListReplyStatus fromValue(String value) {
    for (ToolsCommentReplyGetV30DataReplyListReplyStatus b : ToolsCommentReplyGetV30DataReplyListReplyStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsCommentReplyGetV30DataReplyListReplyStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsCommentReplyGetV30DataReplyListReplyStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsCommentReplyGetV30DataReplyListReplyStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsCommentReplyGetV30DataReplyListReplyStatus.fromValue(value);
    }
  }
}

