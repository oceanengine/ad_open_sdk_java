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
public class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton {
  public static final String SERIALIZED_NAME_SPLASH_ACTIVITY_TIME = "splash_activity_time";
  @SerializedName(SERIALIZED_NAME_SPLASH_ACTIVITY_TIME)
  private String splashActivityTime = null;

  public static final String SERIALIZED_NAME_SPLASH_BUTTON_TEXT = "splash_button_text";
  @SerializedName(SERIALIZED_NAME_SPLASH_BUTTON_TEXT)
  private String splashButtonText = null;

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton splashActivityTime(String splashActivityTime) {
    
    this.splashActivityTime = splashActivityTime;
    return this;
  }

   /**
   * 
   * @return splashActivityTime
  **/
  @javax.annotation.Nullable
  public String getSplashActivityTime() {
    return splashActivityTime;
  }


  public void setSplashActivityTime(String splashActivityTime) {
    this.splashActivityTime = splashActivityTime;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton splashButtonText(String splashButtonText) {
    
    this.splashButtonText = splashButtonText;
    return this;
  }

   /**
   * 
   * @return splashButtonText
  **/
  @javax.annotation.Nullable
  public String getSplashButtonText() {
    return splashButtonText;
  }


  public void setSplashButtonText(String splashButtonText) {
    this.splashButtonText = splashButtonText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton = (BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton) o;
    return Objects.equals(this.splashActivityTime, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton.splashActivityTime) &&
        Objects.equals(this.splashButtonText, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton.splashButtonText);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(splashActivityTime, splashButtonText);
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
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton {\n");
    sb.append("    splashActivityTime: ").append(toIndentedString(splashActivityTime)).append("\n");
    sb.append("    splashButtonText: ").append(toIndentedString(splashButtonText)).append("\n");
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
    openapiFields.add("splash_activity_time");
    openapiFields.add("splash_button_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton
  */
  public static BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentSemicCircleButton to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

