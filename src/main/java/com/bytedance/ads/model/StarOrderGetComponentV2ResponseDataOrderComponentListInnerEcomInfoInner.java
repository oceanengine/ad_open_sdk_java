/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
 * StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner() {
  }

  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner starOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner = (StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner) o;
    return Objects.equals(this.title, starOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner.title) &&
        Objects.equals(this.url, starOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, url);
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
    sb.append("class StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner>() {
           @Override
           public void write(JsonWriter out, StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner
  */
  public static StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner.class);
  }

 /**
  * Convert an instance of StarOrderGetComponentV2ResponseDataOrderComponentListInnerEcomInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

