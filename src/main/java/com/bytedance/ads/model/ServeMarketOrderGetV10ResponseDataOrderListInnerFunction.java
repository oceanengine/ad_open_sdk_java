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
 * 功能点信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class ServeMarketOrderGetV10ResponseDataOrderListInnerFunction {
  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc = null;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public ServeMarketOrderGetV10ResponseDataOrderListInnerFunction() {
  }

  public ServeMarketOrderGetV10ResponseDataOrderListInnerFunction desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 
   * @return desc
  **/
  @javax.annotation.Nullable
  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInnerFunction key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInnerFunction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServeMarketOrderGetV10ResponseDataOrderListInnerFunction serveMarketOrderGetV10ResponseDataOrderListInnerFunction = (ServeMarketOrderGetV10ResponseDataOrderListInnerFunction) o;
    return Objects.equals(this.desc, serveMarketOrderGetV10ResponseDataOrderListInnerFunction.desc) &&
        Objects.equals(this.key, serveMarketOrderGetV10ResponseDataOrderListInnerFunction.key) &&
        Objects.equals(this.name, serveMarketOrderGetV10ResponseDataOrderListInnerFunction.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(desc, key, name);
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
    sb.append("class ServeMarketOrderGetV10ResponseDataOrderListInnerFunction {\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("desc");
    openapiFields.add("key");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServeMarketOrderGetV10ResponseDataOrderListInnerFunction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServeMarketOrderGetV10ResponseDataOrderListInnerFunction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServeMarketOrderGetV10ResponseDataOrderListInnerFunction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServeMarketOrderGetV10ResponseDataOrderListInnerFunction.class));

       return (TypeAdapter<T>) new TypeAdapter<ServeMarketOrderGetV10ResponseDataOrderListInnerFunction>() {
           @Override
           public void write(JsonWriter out, ServeMarketOrderGetV10ResponseDataOrderListInnerFunction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServeMarketOrderGetV10ResponseDataOrderListInnerFunction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServeMarketOrderGetV10ResponseDataOrderListInnerFunction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServeMarketOrderGetV10ResponseDataOrderListInnerFunction
  * @throws IOException if the JSON string is invalid with respect to ServeMarketOrderGetV10ResponseDataOrderListInnerFunction
  */
  public static ServeMarketOrderGetV10ResponseDataOrderListInnerFunction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServeMarketOrderGetV10ResponseDataOrderListInnerFunction.class);
  }

 /**
  * Convert an instance of ServeMarketOrderGetV10ResponseDataOrderListInnerFunction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

