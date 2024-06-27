/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class AnalyticsAttributionV30RequestContextDevice {
  public static final String SERIALIZED_NAME_PHONE_NUM_BLURRED = "phone_num_blurred";
  @SerializedName(SERIALIZED_NAME_PHONE_NUM_BLURRED)
  private String phoneNumBlurred = null;

  public AnalyticsAttributionV30RequestContextDevice() {
  }

  public AnalyticsAttributionV30RequestContextDevice phoneNumBlurred(String phoneNumBlurred) {
    
    this.phoneNumBlurred = phoneNumBlurred;
    return this;
  }

   /**
   * 下单用户的模糊手机号，目前支持以下3种类型： 1. （新）仅后四位：例如*******1234，前七位需要用星号表示；当上传此手机号格式时，receiver_province、receiver_city必填，否则无法上报和正确归因 2. 省略中间四位：例如130****1234，中间四位需用星号表示 3. 原始手机号sha256后的结果，64位字符串 【注意】手机号的加密步骤仅在能获取原值手机号情况下，使用sha256加密，其他两种手机号形式切勿加密！否则会导致归因为0
   * @return phoneNumBlurred
  **/
  @javax.annotation.Nullable
  public String getPhoneNumBlurred() {
    return phoneNumBlurred;
  }


  public void setPhoneNumBlurred(String phoneNumBlurred) {
    this.phoneNumBlurred = phoneNumBlurred;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAttributionV30RequestContextDevice analyticsAttributionV30RequestContextDevice = (AnalyticsAttributionV30RequestContextDevice) o;
    return Objects.equals(this.phoneNumBlurred, analyticsAttributionV30RequestContextDevice.phoneNumBlurred);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumBlurred);
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
    sb.append("class AnalyticsAttributionV30RequestContextDevice {\n");
    sb.append("    phoneNumBlurred: ").append(toIndentedString(phoneNumBlurred)).append("\n");
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
    openapiFields.add("phone_num_blurred");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyticsAttributionV30RequestContextDevice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyticsAttributionV30RequestContextDevice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyticsAttributionV30RequestContextDevice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyticsAttributionV30RequestContextDevice.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyticsAttributionV30RequestContextDevice>() {
           @Override
           public void write(JsonWriter out, AnalyticsAttributionV30RequestContextDevice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalyticsAttributionV30RequestContextDevice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnalyticsAttributionV30RequestContextDevice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyticsAttributionV30RequestContextDevice
  * @throws IOException if the JSON string is invalid with respect to AnalyticsAttributionV30RequestContextDevice
  */
  public static AnalyticsAttributionV30RequestContextDevice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyticsAttributionV30RequestContextDevice.class);
  }

 /**
  * Convert an instance of AnalyticsAttributionV30RequestContextDevice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

