/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
 * CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner {
  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private Long targetId = null;

  public CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner() {
  }

  public CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner targetId(Long targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 可转账户id
   * @return targetId
  **/
  @javax.annotation.Nullable
  public Long getTargetId() {
    return targetId;
  }


  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner cgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner = (CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner) o;
    return Objects.equals(this.targetId, cgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner.targetId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId);
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
    sb.append("class CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner {\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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
    openapiFields.add("target_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner
  */
  public static CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner.class);
  }

 /**
  * Convert an instance of CgTransferCanTransferTargetListV30ResponseDataCanTransferTargetListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

