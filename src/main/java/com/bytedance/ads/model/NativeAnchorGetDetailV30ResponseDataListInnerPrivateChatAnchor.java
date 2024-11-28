/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorGetDetailV30DataListPrivateChatAnchorButton;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor {
  public static final String SERIALIZED_NAME_BUTTON = "button";
  @SerializedName(SERIALIZED_NAME_BUTTON)
  private NativeAnchorGetDetailV30DataListPrivateChatAnchorButton button = null;

  public static final String SERIALIZED_NAME_CHAT_GUIDE = "chat_guide";
  @SerializedName(SERIALIZED_NAME_CHAT_GUIDE)
  private String chatGuide = null;

  public NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor() {
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor button(NativeAnchorGetDetailV30DataListPrivateChatAnchorButton button) {
    
    this.button = button;
    return this;
  }

   /**
   * Get button
   * @return button
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30DataListPrivateChatAnchorButton getButton() {
    return button;
  }


  public void setButton(NativeAnchorGetDetailV30DataListPrivateChatAnchorButton button) {
    this.button = button;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor chatGuide(String chatGuide) {
    
    this.chatGuide = chatGuide;
    return this;
  }

   /**
   * 
   * @return chatGuide
  **/
  @javax.annotation.Nullable
  public String getChatGuide() {
    return chatGuide;
  }


  public void setChatGuide(String chatGuide) {
    this.chatGuide = chatGuide;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor nativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor = (NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor) o;
    return Objects.equals(this.button, nativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor.button) &&
        Objects.equals(this.chatGuide, nativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor.chatGuide);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(button, chatGuide);
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
    sb.append("class NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor {\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
    sb.append("    chatGuide: ").append(toIndentedString(chatGuide)).append("\n");
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
    openapiFields.add("button");
    openapiFields.add("chat_guide");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor
  */
  public static NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseDataListInnerPrivateChatAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

