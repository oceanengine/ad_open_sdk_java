/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarOrderDetailV2ResponseDataComponentInfoInnerLinkComponentInfo;
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
 * StarOrderDetailV2ResponseDataComponentInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class StarOrderDetailV2ResponseDataComponentInfoInner {
  public static final String SERIALIZED_NAME_LINK_COMPONENT_INFO = "link_component_info";
  @SerializedName(SERIALIZED_NAME_LINK_COMPONENT_INFO)
  private StarOrderDetailV2ResponseDataComponentInfoInnerLinkComponentInfo linkComponentInfo = null;

  public StarOrderDetailV2ResponseDataComponentInfoInner() {
  }

  public StarOrderDetailV2ResponseDataComponentInfoInner linkComponentInfo(StarOrderDetailV2ResponseDataComponentInfoInnerLinkComponentInfo linkComponentInfo) {
    
    this.linkComponentInfo = linkComponentInfo;
    return this;
  }

   /**
   * Get linkComponentInfo
   * @return linkComponentInfo
  **/
  @javax.annotation.Nullable
  public StarOrderDetailV2ResponseDataComponentInfoInnerLinkComponentInfo getLinkComponentInfo() {
    return linkComponentInfo;
  }


  public void setLinkComponentInfo(StarOrderDetailV2ResponseDataComponentInfoInnerLinkComponentInfo linkComponentInfo) {
    this.linkComponentInfo = linkComponentInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderDetailV2ResponseDataComponentInfoInner starOrderDetailV2ResponseDataComponentInfoInner = (StarOrderDetailV2ResponseDataComponentInfoInner) o;
    return Objects.equals(this.linkComponentInfo, starOrderDetailV2ResponseDataComponentInfoInner.linkComponentInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkComponentInfo);
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
    sb.append("class StarOrderDetailV2ResponseDataComponentInfoInner {\n");
    sb.append("    linkComponentInfo: ").append(toIndentedString(linkComponentInfo)).append("\n");
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
    openapiFields.add("link_component_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderDetailV2ResponseDataComponentInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderDetailV2ResponseDataComponentInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderDetailV2ResponseDataComponentInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderDetailV2ResponseDataComponentInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderDetailV2ResponseDataComponentInfoInner>() {
           @Override
           public void write(JsonWriter out, StarOrderDetailV2ResponseDataComponentInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderDetailV2ResponseDataComponentInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderDetailV2ResponseDataComponentInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderDetailV2ResponseDataComponentInfoInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderDetailV2ResponseDataComponentInfoInner
  */
  public static StarOrderDetailV2ResponseDataComponentInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderDetailV2ResponseDataComponentInfoInner.class);
  }

 /**
  * Convert an instance of StarOrderDetailV2ResponseDataComponentInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

