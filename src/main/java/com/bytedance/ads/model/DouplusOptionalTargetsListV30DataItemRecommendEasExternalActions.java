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
@JsonAdapter(DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions.Adapter.class)
public enum DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions {
  
  COMMENT_LINK_CLICK("COMMENT_LINK_CLICK"),
  
  DY_PRIVATE_MESSAGES("DY_PRIVATE_MESSAGES"),
  
  FOLLOWER_COUNT("FOLLOWER_COUNT"),
  
  HIGH_INTERACTION_FREQUENCY("HIGH_INTERACTION_FREQUENCY"),
  
  HIGH_INTERACTION_QUALITY("HIGH_INTERACTION_QUALITY"),
  
  LIKE_COMMENT_AMOUNT("LIKE_COMMENT_AMOUNT"),
  
  LIVE_ROOM_FOLLOWER_INCREASE("LIVE_ROOM_FOLLOWER_INCREASE"),
  
  LIVE_ROOM_POPULARITY("LIVE_ROOM_POPULARITY"),
  
  ONLY_FOR_ACTIVATION("ONLY_FOR_ACTIVATION"),
  
  VIDEO_PLAYBACK_VOLUME("VIDEO_PLAYBACK_VOLUME"),
  
  VIEWER_DONATION("VIEWER_DONATION"),
  
  VIEWER_INTERACTION("VIEWER_INTERACTION");

  private String value;

  DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions fromValue(String value) {
    for (DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions b : DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions.fromValue(value);
    }
  }
}

