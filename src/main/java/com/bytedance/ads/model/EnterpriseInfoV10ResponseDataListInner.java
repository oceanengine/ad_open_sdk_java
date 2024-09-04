/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
 * EnterpriseInfoV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class EnterpriseInfoV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_E_DOUYIN_ID = "e_douyin_id";
  @SerializedName(SERIALIZED_NAME_E_DOUYIN_ID)
  private String eDouyinId = null;

  public static final String SERIALIZED_NAME_E_DOUYIN_NAME = "e_douyin_name";
  @SerializedName(SERIALIZED_NAME_E_DOUYIN_NAME)
  private String eDouyinName = null;

  public EnterpriseInfoV10ResponseDataListInner() {
  }

  public EnterpriseInfoV10ResponseDataListInner eDouyinId(String eDouyinId) {
    
    this.eDouyinId = eDouyinId;
    return this;
  }

   /**
   * 
   * @return eDouyinId
  **/
  @javax.annotation.Nullable
  public String geteDouyinId() {
    return eDouyinId;
  }


  public void seteDouyinId(String eDouyinId) {
    this.eDouyinId = eDouyinId;
  }


  public EnterpriseInfoV10ResponseDataListInner eDouyinName(String eDouyinName) {
    
    this.eDouyinName = eDouyinName;
    return this;
  }

   /**
   * 
   * @return eDouyinName
  **/
  @javax.annotation.Nullable
  public String geteDouyinName() {
    return eDouyinName;
  }


  public void seteDouyinName(String eDouyinName) {
    this.eDouyinName = eDouyinName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseInfoV10ResponseDataListInner enterpriseInfoV10ResponseDataListInner = (EnterpriseInfoV10ResponseDataListInner) o;
    return Objects.equals(this.eDouyinId, enterpriseInfoV10ResponseDataListInner.eDouyinId) &&
        Objects.equals(this.eDouyinName, enterpriseInfoV10ResponseDataListInner.eDouyinName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eDouyinId, eDouyinName);
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
    sb.append("class EnterpriseInfoV10ResponseDataListInner {\n");
    sb.append("    eDouyinId: ").append(toIndentedString(eDouyinId)).append("\n");
    sb.append("    eDouyinName: ").append(toIndentedString(eDouyinName)).append("\n");
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
    openapiFields.add("e_douyin_id");
    openapiFields.add("e_douyin_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseInfoV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseInfoV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseInfoV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseInfoV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseInfoV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseInfoV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseInfoV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseInfoV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseInfoV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseInfoV10ResponseDataListInner
  */
  public static EnterpriseInfoV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseInfoV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of EnterpriseInfoV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

