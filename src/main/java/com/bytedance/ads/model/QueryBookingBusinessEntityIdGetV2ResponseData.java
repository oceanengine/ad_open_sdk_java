/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QueryBookingBusinessEntityIdGetV2ResponseDataBusinessEntityIdInfosInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class QueryBookingBusinessEntityIdGetV2ResponseData {
  public static final String SERIALIZED_NAME_BUSINESS_ENTITY_ID_INFOS = "business_entity_id_infos";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ENTITY_ID_INFOS)
  private List<QueryBookingBusinessEntityIdGetV2ResponseDataBusinessEntityIdInfosInner> businessEntityIdInfos = null;

  public QueryBookingBusinessEntityIdGetV2ResponseData() {
  }

  public QueryBookingBusinessEntityIdGetV2ResponseData businessEntityIdInfos(List<QueryBookingBusinessEntityIdGetV2ResponseDataBusinessEntityIdInfosInner> businessEntityIdInfos) {
    
    this.businessEntityIdInfos = businessEntityIdInfos;
    return this;
  }

  public QueryBookingBusinessEntityIdGetV2ResponseData addBusinessEntityIdInfosItem(QueryBookingBusinessEntityIdGetV2ResponseDataBusinessEntityIdInfosInner businessEntityIdInfosItem) {
    if (this.businessEntityIdInfos == null) {
      this.businessEntityIdInfos = new ArrayList<>();
    }
    this.businessEntityIdInfos.add(businessEntityIdInfosItem);
    return this;
  }

   /**
   * 业务实体信息
   * @return businessEntityIdInfos
  **/
  @javax.annotation.Nullable
  public List<QueryBookingBusinessEntityIdGetV2ResponseDataBusinessEntityIdInfosInner> getBusinessEntityIdInfos() {
    return businessEntityIdInfos;
  }


  public void setBusinessEntityIdInfos(List<QueryBookingBusinessEntityIdGetV2ResponseDataBusinessEntityIdInfosInner> businessEntityIdInfos) {
    this.businessEntityIdInfos = businessEntityIdInfos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryBookingBusinessEntityIdGetV2ResponseData queryBookingBusinessEntityIdGetV2ResponseData = (QueryBookingBusinessEntityIdGetV2ResponseData) o;
    return Objects.equals(this.businessEntityIdInfos, queryBookingBusinessEntityIdGetV2ResponseData.businessEntityIdInfos);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessEntityIdInfos);
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
    sb.append("class QueryBookingBusinessEntityIdGetV2ResponseData {\n");
    sb.append("    businessEntityIdInfos: ").append(toIndentedString(businessEntityIdInfos)).append("\n");
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
    openapiFields.add("business_entity_id_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryBookingBusinessEntityIdGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryBookingBusinessEntityIdGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryBookingBusinessEntityIdGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryBookingBusinessEntityIdGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryBookingBusinessEntityIdGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, QueryBookingBusinessEntityIdGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryBookingBusinessEntityIdGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryBookingBusinessEntityIdGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryBookingBusinessEntityIdGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to QueryBookingBusinessEntityIdGetV2ResponseData
  */
  public static QueryBookingBusinessEntityIdGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryBookingBusinessEntityIdGetV2ResponseData.class);
  }

 /**
  * Convert an instance of QueryBookingBusinessEntityIdGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

