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
 * StarDemandOmGetDemandListV2ResponseDataDemandsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class StarDemandOmGetDemandListV2ResponseDataDemandsInner {
  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public StarDemandOmGetDemandListV2ResponseDataDemandsInner() {
  }

  public StarDemandOmGetDemandListV2ResponseDataDemandsInner demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 任务ID
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmGetDemandListV2ResponseDataDemandsInner starDemandOmGetDemandListV2ResponseDataDemandsInner = (StarDemandOmGetDemandListV2ResponseDataDemandsInner) o;
    return Objects.equals(this.demandId, starDemandOmGetDemandListV2ResponseDataDemandsInner.demandId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(demandId);
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
    sb.append("class StarDemandOmGetDemandListV2ResponseDataDemandsInner {\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
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
    openapiFields.add("demand_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetDemandListV2ResponseDataDemandsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetDemandListV2ResponseDataDemandsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetDemandListV2ResponseDataDemandsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetDemandListV2ResponseDataDemandsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetDemandListV2ResponseDataDemandsInner>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetDemandListV2ResponseDataDemandsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetDemandListV2ResponseDataDemandsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetDemandListV2ResponseDataDemandsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetDemandListV2ResponseDataDemandsInner
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetDemandListV2ResponseDataDemandsInner
  */
  public static StarDemandOmGetDemandListV2ResponseDataDemandsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetDemandListV2ResponseDataDemandsInner.class);
  }

 /**
  * Convert an instance of StarDemandOmGetDemandListV2ResponseDataDemandsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

