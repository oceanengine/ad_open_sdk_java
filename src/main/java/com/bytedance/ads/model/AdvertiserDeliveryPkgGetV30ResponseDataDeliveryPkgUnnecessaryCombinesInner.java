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
import com.bytedance.ads.model.AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInnerDeliveryRulesInner;
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
 * AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner {
  public static final String SERIALIZED_NAME_COMBINE_ID = "combine_id";
  @SerializedName(SERIALIZED_NAME_COMBINE_ID)
  private Long combineId = null;

  public static final String SERIALIZED_NAME_DELIVERY_RULES = "delivery_rules";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RULES)
  private List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInnerDeliveryRulesInner> deliveryRules = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner() {
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner combineId(Long combineId) {
    
    this.combineId = combineId;
    return this;
  }

   /**
   * 来自【推广产品资质规则配置查询接口】，行业的资质规则中的combine_id
   * @return combineId
  **/
  @javax.annotation.Nullable
  public Long getCombineId() {
    return combineId;
  }


  public void setCombineId(Long combineId) {
    this.combineId = combineId;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner deliveryRules(List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInnerDeliveryRulesInner> deliveryRules) {
    
    this.deliveryRules = deliveryRules;
    return this;
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner addDeliveryRulesItem(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInnerDeliveryRulesInner deliveryRulesItem) {
    if (this.deliveryRules == null) {
      this.deliveryRules = new ArrayList<>();
    }
    this.deliveryRules.add(deliveryRulesItem);
    return this;
  }

   /**
   * 资质规则
   * @return deliveryRules
  **/
  @javax.annotation.Nullable
  public List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInnerDeliveryRulesInner> getDeliveryRules() {
    return deliveryRules;
  }


  public void setDeliveryRules(List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInnerDeliveryRulesInner> deliveryRules) {
    this.deliveryRules = deliveryRules;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 选填资质描述
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner = (AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner) o;
    return Objects.equals(this.combineId, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner.combineId) &&
        Objects.equals(this.deliveryRules, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner.deliveryRules) &&
        Objects.equals(this.description, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner.description);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(combineId, deliveryRules, description);
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
    sb.append("class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner {\n");
    sb.append("    combineId: ").append(toIndentedString(combineId)).append("\n");
    sb.append("    deliveryRules: ").append(toIndentedString(deliveryRules)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("combine_id");
    openapiFields.add("delivery_rules");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("combine_id");
    openapiRequiredFields.add("delivery_rules");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner
  */
  public static AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

