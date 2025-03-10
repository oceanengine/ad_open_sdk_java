/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NICK_NAME = "nick_name";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName = null;

  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser() {
  }

  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser nickName(String nickName) {
    
    this.nickName = nickName;
    return this;
  }

   /**
   * 
   * @return nickName
  **/
  @javax.annotation.Nullable
  public String getNickName() {
    return nickName;
  }


  public void setNickName(String nickName) {
    this.nickName = nickName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser starMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser = (StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser) o;
    return Objects.equals(this.id, starMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser.id) &&
        Objects.equals(this.nickName, starMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser.nickName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nickName);
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
    sb.append("class StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("nick_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser>() {
           @Override
           public void write(JsonWriter out, StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser
  * @throws IOException if the JSON string is invalid with respect to StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser
  */
  public static StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser.class);
  }

 /**
  * Convert an instance of StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerItemInfoCoreUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

