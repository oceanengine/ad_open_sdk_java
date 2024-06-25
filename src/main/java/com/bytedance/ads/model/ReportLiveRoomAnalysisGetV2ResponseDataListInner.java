/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportLiveRoomAnalysisGetV2DataListRoomStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * ReportLiveRoomAnalysisGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class ReportLiveRoomAnalysisGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ANCHOR_AVATAR = "anchor_avatar";
  @SerializedName(SERIALIZED_NAME_ANCHOR_AVATAR)
  private String anchorAvatar = null;

  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private Long anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_NICK = "anchor_nick";
  @SerializedName(SERIALIZED_NAME_ANCHOR_NICK)
  private String anchorNick = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Object fields = null;

  public static final String SERIALIZED_NAME_ROOM_COVER = "room_cover";
  @SerializedName(SERIALIZED_NAME_ROOM_COVER)
  private String roomCover = null;

  public static final String SERIALIZED_NAME_ROOM_CREATE_TIME = "room_create_time";
  @SerializedName(SERIALIZED_NAME_ROOM_CREATE_TIME)
  private String roomCreateTime = null;

  public static final String SERIALIZED_NAME_ROOM_FINISH_TIME = "room_finish_time";
  @SerializedName(SERIALIZED_NAME_ROOM_FINISH_TIME)
  private String roomFinishTime = null;

  public static final String SERIALIZED_NAME_ROOM_ID = "room_id";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private Long roomId = null;

  public static final String SERIALIZED_NAME_ROOM_QRCODE = "room_qrcode";
  @SerializedName(SERIALIZED_NAME_ROOM_QRCODE)
  private String roomQrcode = null;

  public static final String SERIALIZED_NAME_ROOM_STATUS = "room_status";
  @SerializedName(SERIALIZED_NAME_ROOM_STATUS)
  private ReportLiveRoomAnalysisGetV2DataListRoomStatus roomStatus = null;

  public static final String SERIALIZED_NAME_ROOM_TITLE = "room_title";
  @SerializedName(SERIALIZED_NAME_ROOM_TITLE)
  private String roomTitle = null;

  public ReportLiveRoomAnalysisGetV2ResponseDataListInner() {
  }

  public ReportLiveRoomAnalysisGetV2ResponseDataListInner anchorAvatar(String anchorAvatar) {
    
    this.anchorAvatar = anchorAvatar;
    return this;
  }

   /**
   * 
   * @return anchorAvatar
  **/
  @javax.annotation.Nullable
  public String getAnchorAvatar() {
    return anchorAvatar;
  }


  public void setAnchorAvatar(String anchorAvatar) {
    this.anchorAvatar = anchorAvatar;
  }


  public ReportLiveRoomAnalysisGetV2ResponseDataListInner anchorId(Long anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 
   * @return anchorId
  **/
  @javax.annotation.Nullable
  public Long getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(Long anchorId) {
    this.anchorId = anchorId;
  }


  public ReportLiveRoomAnalysisGetV2ResponseDataListInner anchorNick(String anchorNick) {
    
    this.anchorNick = anchorNick;
    return this;
  }

   /**
   * 
   * @return anchorNick
  **/
  @javax.annotation.Nullable
  public String getAnchorNick() {
    return anchorNick;
  }


  public void setAnchorNick(String anchorNick) {
    this.anchorNick = anchorNick;
  }


  public ReportLiveRoomAnalysisGetV2ResponseDataListInner fields(Object fields) {
    
    this.fields = fields;
    return this;
  }

   /**
   * 
   * @return fields
  **/
  @javax.annotation.Nullable
  public Object getFields() {
    return fields;
  }


  public void setFields(Object fields) {
    this.fields = fields;
  }


  public ReportLiveRoomAnalysisGetV2ResponseDataListInner roomCover(String roomCover) {
    
    this.roomCover = roomCover;
    return this;
  }

   /**
   * 
   * @return roomCover
  **/
  @javax.annotation.Nullable
  public String getRoomCover() {
    return roomCover;
  }


  public void setRoomCover(String roomCover) {
    this.roomCover = roomCover;
  }


  public ReportLiveRoomAnalysisGetV2ResponseDataListInner roomCreateTime(String roomCreateTime) {
    
    this.roomCreateTime = roomCreateTime;
    return this;
  }

   /**
   * 
   * @return roomCreateTime
  **/
  @javax.annotation.Nullable
  public String getRoomCreateTime() {
    return roomCreateTime;
  }


  public void setRoomCreateTime(String roomCreateTime) {
    this.roomCreateTime = roomCreateTime;
  }


  public ReportLiveRoomAnalysisGetV2ResponseDataListInner roomFinishTime(String roomFinishTime) {
    
    this.roomFinishTime = roomFinishTime;
    return this;
  }

   /**
   * 
   * @return roomFinishTime
  **/
  @javax.annotation.Nullable
  public String getRoomFinishTime() {
    return roomFinishTime;
  }


  public void setRoomFinishTime(String roomFinishTime) {
    this.roomFinishTime = roomFinishTime;
  }


  public ReportLiveRoomAnalysisGetV2ResponseDataListInner roomId(Long roomId) {
    
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


  public ReportLiveRoomAnalysisGetV2ResponseDataListInner roomQrcode(String roomQrcode) {
    
    this.roomQrcode = roomQrcode;
    return this;
  }

   /**
   * 
   * @return roomQrcode
  **/
  @javax.annotation.Nullable
  public String getRoomQrcode() {
    return roomQrcode;
  }


  public void setRoomQrcode(String roomQrcode) {
    this.roomQrcode = roomQrcode;
  }


  public ReportLiveRoomAnalysisGetV2ResponseDataListInner roomStatus(ReportLiveRoomAnalysisGetV2DataListRoomStatus roomStatus) {
    
    this.roomStatus = roomStatus;
    return this;
  }

   /**
   * Get roomStatus
   * @return roomStatus
  **/
  @javax.annotation.Nullable
  public ReportLiveRoomAnalysisGetV2DataListRoomStatus getRoomStatus() {
    return roomStatus;
  }


  public void setRoomStatus(ReportLiveRoomAnalysisGetV2DataListRoomStatus roomStatus) {
    this.roomStatus = roomStatus;
  }


  public ReportLiveRoomAnalysisGetV2ResponseDataListInner roomTitle(String roomTitle) {
    
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
    ReportLiveRoomAnalysisGetV2ResponseDataListInner reportLiveRoomAnalysisGetV2ResponseDataListInner = (ReportLiveRoomAnalysisGetV2ResponseDataListInner) o;
    return Objects.equals(this.anchorAvatar, reportLiveRoomAnalysisGetV2ResponseDataListInner.anchorAvatar) &&
        Objects.equals(this.anchorId, reportLiveRoomAnalysisGetV2ResponseDataListInner.anchorId) &&
        Objects.equals(this.anchorNick, reportLiveRoomAnalysisGetV2ResponseDataListInner.anchorNick) &&
        Objects.equals(this.fields, reportLiveRoomAnalysisGetV2ResponseDataListInner.fields) &&
        Objects.equals(this.roomCover, reportLiveRoomAnalysisGetV2ResponseDataListInner.roomCover) &&
        Objects.equals(this.roomCreateTime, reportLiveRoomAnalysisGetV2ResponseDataListInner.roomCreateTime) &&
        Objects.equals(this.roomFinishTime, reportLiveRoomAnalysisGetV2ResponseDataListInner.roomFinishTime) &&
        Objects.equals(this.roomId, reportLiveRoomAnalysisGetV2ResponseDataListInner.roomId) &&
        Objects.equals(this.roomQrcode, reportLiveRoomAnalysisGetV2ResponseDataListInner.roomQrcode) &&
        Objects.equals(this.roomStatus, reportLiveRoomAnalysisGetV2ResponseDataListInner.roomStatus) &&
        Objects.equals(this.roomTitle, reportLiveRoomAnalysisGetV2ResponseDataListInner.roomTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorAvatar, anchorId, anchorNick, fields, roomCover, roomCreateTime, roomFinishTime, roomId, roomQrcode, roomStatus, roomTitle);
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
    sb.append("class ReportLiveRoomAnalysisGetV2ResponseDataListInner {\n");
    sb.append("    anchorAvatar: ").append(toIndentedString(anchorAvatar)).append("\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorNick: ").append(toIndentedString(anchorNick)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    roomCover: ").append(toIndentedString(roomCover)).append("\n");
    sb.append("    roomCreateTime: ").append(toIndentedString(roomCreateTime)).append("\n");
    sb.append("    roomFinishTime: ").append(toIndentedString(roomFinishTime)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    roomQrcode: ").append(toIndentedString(roomQrcode)).append("\n");
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
    openapiFields.add("anchor_avatar");
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_nick");
    openapiFields.add("fields");
    openapiFields.add("room_cover");
    openapiFields.add("room_create_time");
    openapiFields.add("room_finish_time");
    openapiFields.add("room_id");
    openapiFields.add("room_qrcode");
    openapiFields.add("room_status");
    openapiFields.add("room_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportLiveRoomAnalysisGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportLiveRoomAnalysisGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportLiveRoomAnalysisGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportLiveRoomAnalysisGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportLiveRoomAnalysisGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportLiveRoomAnalysisGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportLiveRoomAnalysisGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportLiveRoomAnalysisGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportLiveRoomAnalysisGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportLiveRoomAnalysisGetV2ResponseDataListInner
  */
  public static ReportLiveRoomAnalysisGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportLiveRoomAnalysisGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportLiveRoomAnalysisGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

