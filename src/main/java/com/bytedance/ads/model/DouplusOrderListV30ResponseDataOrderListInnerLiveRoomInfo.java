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
import com.bytedance.ads.model.DouplusOrderListV30DataOrderListLiveRoomInfoRoomStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-11T18:54:06.224549627+08:00[PRC]")
public class DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo {
  public static final String SERIALIZED_NAME_ROOM_COVER = "room_cover";
  @SerializedName(SERIALIZED_NAME_ROOM_COVER)
  private List<String> roomCover = null;

  public static final String SERIALIZED_NAME_ROOM_ID = "room_id";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private Long roomId = null;

  public static final String SERIALIZED_NAME_ROOM_STATUS = "room_status";
  @SerializedName(SERIALIZED_NAME_ROOM_STATUS)
  private DouplusOrderListV30DataOrderListLiveRoomInfoRoomStatus roomStatus = null;

  public static final String SERIALIZED_NAME_ROOM_TITLE = "room_title";
  @SerializedName(SERIALIZED_NAME_ROOM_TITLE)
  private String roomTitle = null;

  public DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo() {
  }

  public DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo roomCover(List<String> roomCover) {
    
    this.roomCover = roomCover;
    return this;
  }

  public DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo addRoomCoverItem(String roomCoverItem) {
    if (this.roomCover == null) {
      this.roomCover = new ArrayList<>();
    }
    this.roomCover.add(roomCoverItem);
    return this;
  }

   /**
   * 
   * @return roomCover
  **/
  @javax.annotation.Nullable
  public List<String> getRoomCover() {
    return roomCover;
  }


  public void setRoomCover(List<String> roomCover) {
    this.roomCover = roomCover;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo roomId(Long roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * 
   * @return roomId
  **/
  @javax.annotation.Nullable
  public Long getRoomId() {
    return roomId;
  }


  public void setRoomId(Long roomId) {
    this.roomId = roomId;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo roomStatus(DouplusOrderListV30DataOrderListLiveRoomInfoRoomStatus roomStatus) {
    
    this.roomStatus = roomStatus;
    return this;
  }

   /**
   * Get roomStatus
   * @return roomStatus
  **/
  @javax.annotation.Nullable
  public DouplusOrderListV30DataOrderListLiveRoomInfoRoomStatus getRoomStatus() {
    return roomStatus;
  }


  public void setRoomStatus(DouplusOrderListV30DataOrderListLiveRoomInfoRoomStatus roomStatus) {
    this.roomStatus = roomStatus;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo roomTitle(String roomTitle) {
    
    this.roomTitle = roomTitle;
    return this;
  }

   /**
   * 
   * @return roomTitle
  **/
  @javax.annotation.Nullable
  public String getRoomTitle() {
    return roomTitle;
  }


  public void setRoomTitle(String roomTitle) {
    this.roomTitle = roomTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo douplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo = (DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo) o;
    return Objects.equals(this.roomCover, douplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo.roomCover) &&
        Objects.equals(this.roomId, douplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo.roomId) &&
        Objects.equals(this.roomStatus, douplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo.roomStatus) &&
        Objects.equals(this.roomTitle, douplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo.roomTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomCover, roomId, roomStatus, roomTitle);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo {\n");
    sb.append("    roomCover: ").append(toIndentedString(roomCover)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomStatus: ").append(toIndentedString(roomStatus)).append("\n");
    sb.append("    roomTitle: ").append(toIndentedString(roomTitle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("room_cover");
    openapiFields.add("room_id");
    openapiFields.add("room_status");
    openapiFields.add("room_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo>() {
           @Override
           public void write(JsonWriter out, DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo
  */
  public static DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo.class);
  }

 /**
  * Convert an instance of DouplusOrderListV30ResponseDataOrderListInnerLiveRoomInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

