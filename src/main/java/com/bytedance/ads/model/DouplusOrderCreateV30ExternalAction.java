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
@JsonAdapter(DouplusOrderCreateV30ExternalAction.Adapter.class)
public enum DouplusOrderCreateV30ExternalAction {
  
  LIKE_COMMENT_AMOUNT("LIKE_COMMENT_AMOUNT"),
  
  FOLLOWER_COUNT("FOLLOWER_COUNT"),
  
  VIDEO_PLAYBACK_VOLUME("VIDEO_PLAYBACK_VOLUME"),
  
  DY_PRIVATE_MESSAGES("DY_PRIVATE_MESSAGES"),
  
  HIGH_INTERACTION_QUALITY("HIGH_INTERACTION_QUALITY"),
  
  HIGH_INTERACTION_FREQUENCY("HIGH_INTERACTION_FREQUENCY"),
  
  ONLY_FOR_ACTIVATION("ONLY_FOR_ACTIVATION"),
  
  COMMENT_LINK_CLICK("COMMENT_LINK_CLICK"),
  
  LIVE_ROOM_POPULARITY("LIVE_ROOM_POPULARITY"),
  
  LIVE_ROOM_FOLLOWER_INCREASE("LIVE_ROOM_FOLLOWER_INCREASE"),
  
  VIEWER_DONATION("VIEWER_DONATION"),
  
  VIEWER_INTERACTION("VIEWER_INTERACTION");

  private String value;

  DouplusOrderCreateV30ExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOrderCreateV30ExternalAction fromValue(String value) {
    for (DouplusOrderCreateV30ExternalAction b : DouplusOrderCreateV30ExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DouplusOrderCreateV30ExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOrderCreateV30ExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOrderCreateV30ExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOrderCreateV30ExternalAction.fromValue(value);
    }
  }
}

