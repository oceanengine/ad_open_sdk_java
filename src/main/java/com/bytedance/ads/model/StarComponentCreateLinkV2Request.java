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
import com.bytedance.ads.model.StarComponentCreateLinkV2RequestLinkComponentInfo;
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
 * StarComponentCreateLinkV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class StarComponentCreateLinkV2Request {
  public static final String SERIALIZED_NAME_LINK_COMPONENT_INFO = "link_component_info";
  @SerializedName(SERIALIZED_NAME_LINK_COMPONENT_INFO)
  private StarComponentCreateLinkV2RequestLinkComponentInfo linkComponentInfo = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarComponentCreateLinkV2Request() {
  }

  public StarComponentCreateLinkV2Request linkComponentInfo(StarComponentCreateLinkV2RequestLinkComponentInfo linkComponentInfo) {
    
    this.linkComponentInfo = linkComponentInfo;
    return this;
  }

   /**
   * Get linkComponentInfo
   * @return linkComponentInfo
  **/
  @javax.annotation.Nullable
  public StarComponentCreateLinkV2RequestLinkComponentInfo getLinkComponentInfo() {
    return linkComponentInfo;
  }


  public void setLinkComponentInfo(StarComponentCreateLinkV2RequestLinkComponentInfo linkComponentInfo) {
    this.linkComponentInfo = linkComponentInfo;
  }


  public StarComponentCreateLinkV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 星图客户ID
   * @return starId
  **/
  @javax.annotation.Nullable
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarComponentCreateLinkV2Request starComponentCreateLinkV2Request = (StarComponentCreateLinkV2Request) o;
    return Objects.equals(this.linkComponentInfo, starComponentCreateLinkV2Request.linkComponentInfo) &&
        Objects.equals(this.starId, starComponentCreateLinkV2Request.starId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkComponentInfo, starId);
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
    sb.append("class StarComponentCreateLinkV2Request {\n");
    sb.append("    linkComponentInfo: ").append(toIndentedString(linkComponentInfo)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarComponentCreateLinkV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarComponentCreateLinkV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarComponentCreateLinkV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarComponentCreateLinkV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarComponentCreateLinkV2Request>() {
           @Override
           public void write(JsonWriter out, StarComponentCreateLinkV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarComponentCreateLinkV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarComponentCreateLinkV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarComponentCreateLinkV2Request
  * @throws IOException if the JSON string is invalid with respect to StarComponentCreateLinkV2Request
  */
  public static StarComponentCreateLinkV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarComponentCreateLinkV2Request.class);
  }

 /**
  * Convert an instance of StarComponentCreateLinkV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

