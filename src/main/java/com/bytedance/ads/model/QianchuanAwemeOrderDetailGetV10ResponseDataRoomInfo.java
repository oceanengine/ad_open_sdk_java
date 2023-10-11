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
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataRoomInfoRoomStatus;
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
 * 直播间信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-11T18:54:06.224549627+08:00[PRC]")
public class QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo {
  public static final String SERIALIZED_NAME_ROOM_COVER = "room_cover";
  @SerializedName(SERIALIZED_NAME_ROOM_COVER)
  private String roomCover = null;

  public static final String SERIALIZED_NAME_ROOM_ID = "room_id";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private Long roomId = null;

  public static final String SERIALIZED_NAME_ROOM_STATUS = "room_status";
  @SerializedName(SERIALIZED_NAME_ROOM_STATUS)
  private QianchuanAwemeOrderDetailGetV10DataRoomInfoRoomStatus roomStatus = null;

  public static final String SERIALIZED_NAME_ROOM_TITLE = "room_title";
  @SerializedName(SERIALIZED_NAME_ROOM_TITLE)
  private String roomTitle = null;

  public QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo() {
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo roomCover(String roomCover) {
    
    this.roomCover = roomCover;
    return this;
  }

   /**
   * 直播间封面
   * @return roomCover
  **/
  @javax.annotation.Nullable
  public String getRoomCover() {
    return roomCover;
  }


  public void setRoomCover(String roomCover) {
    this.roomCover = roomCover;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo roomId(Long roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * 直播间id
   * @return roomId
  **/
  @javax.annotation.Nullable
  public Long getRoomId() {
    return roomId;
  }


  public void setRoomId(Long roomId) {
    this.roomId = roomId;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo roomStatus(QianchuanAwemeOrderDetailGetV10DataRoomInfoRoomStatus roomStatus) {
    
    this.roomStatus = roomStatus;
    return this;
  }

   /**
   * Get roomStatus
   * @return roomStatus
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataRoomInfoRoomStatus getRoomStatus() {
    return roomStatus;
  }


  public void setRoomStatus(QianchuanAwemeOrderDetailGetV10DataRoomInfoRoomStatus roomStatus) {
    this.roomStatus = roomStatus;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo roomTitle(String roomTitle) {
    
    this.roomTitle = roomTitle;
    return this;
  }

   /**
   * 直播间标题
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
    QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo qianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo = (QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo) o;
    return Objects.equals(this.roomCover, qianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo.roomCover) &&
        Objects.equals(this.roomId, qianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo.roomId) &&
        Objects.equals(this.roomStatus, qianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo.roomStatus) &&
        Objects.equals(this.roomTitle, qianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo.roomTitle);
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
    sb.append("class QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo {\n");
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
       if (!QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo
  */
  public static QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

