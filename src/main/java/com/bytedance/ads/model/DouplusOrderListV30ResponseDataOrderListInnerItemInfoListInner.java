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
 * DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-11T18:54:06.224549627+08:00[PRC]")
public class DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner {
  public static final String SERIALIZED_NAME_AWEME_AUTHOR_AVATAR = "aweme_author_avatar";
  @SerializedName(SERIALIZED_NAME_AWEME_AUTHOR_AVATAR)
  private List<String> awemeAuthorAvatar = null;

  public static final String SERIALIZED_NAME_AWEME_AUTHOR_NAME = "aweme_author_name";
  @SerializedName(SERIALIZED_NAME_AWEME_AUTHOR_NAME)
  private String awemeAuthorName = null;

  public static final String SERIALIZED_NAME_AWEME_AUTHOR_UNIQUE_ID = "aweme_author_unique_id";
  @SerializedName(SERIALIZED_NAME_AWEME_AUTHOR_UNIQUE_ID)
  private String awemeAuthorUniqueId = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_COVER = "aweme_item_cover";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_COVER)
  private List<String> awemeItemCover = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_TITLE = "aweme_item_title";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_TITLE)
  private String awemeItemTitle = null;

  public DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner() {
  }

  public DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner awemeAuthorAvatar(List<String> awemeAuthorAvatar) {
    
    this.awemeAuthorAvatar = awemeAuthorAvatar;
    return this;
  }

  public DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner addAwemeAuthorAvatarItem(String awemeAuthorAvatarItem) {
    if (this.awemeAuthorAvatar == null) {
      this.awemeAuthorAvatar = new ArrayList<>();
    }
    this.awemeAuthorAvatar.add(awemeAuthorAvatarItem);
    return this;
  }

   /**
   * 
   * @return awemeAuthorAvatar
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeAuthorAvatar() {
    return awemeAuthorAvatar;
  }


  public void setAwemeAuthorAvatar(List<String> awemeAuthorAvatar) {
    this.awemeAuthorAvatar = awemeAuthorAvatar;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner awemeAuthorName(String awemeAuthorName) {
    
    this.awemeAuthorName = awemeAuthorName;
    return this;
  }

   /**
   * 
   * @return awemeAuthorName
  **/
  @javax.annotation.Nullable
  public String getAwemeAuthorName() {
    return awemeAuthorName;
  }


  public void setAwemeAuthorName(String awemeAuthorName) {
    this.awemeAuthorName = awemeAuthorName;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner awemeAuthorUniqueId(String awemeAuthorUniqueId) {
    
    this.awemeAuthorUniqueId = awemeAuthorUniqueId;
    return this;
  }

   /**
   * 
   * @return awemeAuthorUniqueId
  **/
  @javax.annotation.Nullable
  public String getAwemeAuthorUniqueId() {
    return awemeAuthorUniqueId;
  }


  public void setAwemeAuthorUniqueId(String awemeAuthorUniqueId) {
    this.awemeAuthorUniqueId = awemeAuthorUniqueId;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner awemeItemCover(List<String> awemeItemCover) {
    
    this.awemeItemCover = awemeItemCover;
    return this;
  }

  public DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner addAwemeItemCoverItem(String awemeItemCoverItem) {
    if (this.awemeItemCover == null) {
      this.awemeItemCover = new ArrayList<>();
    }
    this.awemeItemCover.add(awemeItemCoverItem);
    return this;
  }

   /**
   * 
   * @return awemeItemCover
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeItemCover() {
    return awemeItemCover;
  }


  public void setAwemeItemCover(List<String> awemeItemCover) {
    this.awemeItemCover = awemeItemCover;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner awemeItemTitle(String awemeItemTitle) {
    
    this.awemeItemTitle = awemeItemTitle;
    return this;
  }

   /**
   * 
   * @return awemeItemTitle
  **/
  @javax.annotation.Nullable
  public String getAwemeItemTitle() {
    return awemeItemTitle;
  }


  public void setAwemeItemTitle(String awemeItemTitle) {
    this.awemeItemTitle = awemeItemTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner douplusOrderListV30ResponseDataOrderListInnerItemInfoListInner = (DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner) o;
    return Objects.equals(this.awemeAuthorAvatar, douplusOrderListV30ResponseDataOrderListInnerItemInfoListInner.awemeAuthorAvatar) &&
        Objects.equals(this.awemeAuthorName, douplusOrderListV30ResponseDataOrderListInnerItemInfoListInner.awemeAuthorName) &&
        Objects.equals(this.awemeAuthorUniqueId, douplusOrderListV30ResponseDataOrderListInnerItemInfoListInner.awemeAuthorUniqueId) &&
        Objects.equals(this.awemeItemCover, douplusOrderListV30ResponseDataOrderListInnerItemInfoListInner.awemeItemCover) &&
        Objects.equals(this.awemeItemId, douplusOrderListV30ResponseDataOrderListInnerItemInfoListInner.awemeItemId) &&
        Objects.equals(this.awemeItemTitle, douplusOrderListV30ResponseDataOrderListInnerItemInfoListInner.awemeItemTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeAuthorAvatar, awemeAuthorName, awemeAuthorUniqueId, awemeItemCover, awemeItemId, awemeItemTitle);
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
    sb.append("class DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner {\n");
    sb.append("    awemeAuthorAvatar: ").append(toIndentedString(awemeAuthorAvatar)).append("\n");
    sb.append("    awemeAuthorName: ").append(toIndentedString(awemeAuthorName)).append("\n");
    sb.append("    awemeAuthorUniqueId: ").append(toIndentedString(awemeAuthorUniqueId)).append("\n");
    sb.append("    awemeItemCover: ").append(toIndentedString(awemeItemCover)).append("\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    awemeItemTitle: ").append(toIndentedString(awemeItemTitle)).append("\n");
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
    openapiFields.add("aweme_author_avatar");
    openapiFields.add("aweme_author_name");
    openapiFields.add("aweme_author_unique_id");
    openapiFields.add("aweme_item_cover");
    openapiFields.add("aweme_item_id");
    openapiFields.add("aweme_item_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner>() {
           @Override
           public void write(JsonWriter out, DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner
  */
  public static DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner.class);
  }

 /**
  * Convert an instance of DouplusOrderListV30ResponseDataOrderListInnerItemInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

