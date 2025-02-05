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
import com.bytedance.ads.model.AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner;
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
 * 必填资质模块
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine {
  public static final String SERIALIZED_NAME_COMBINE_ID = "combine_id";
  @SerializedName(SERIALIZED_NAME_COMBINE_ID)
  private Long combineId = null;

  public static final String SERIALIZED_NAME_DELIVERY_RULES = "delivery_rules";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RULES)
  private List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner> deliveryRules = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine() {
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine combineId(Long combineId) {
    
    this.combineId = combineId;
    return this;
  }

   /**
   * 推广类型id，来自【推广产品资质规则配置查询接口】，行业的资质规则中的promotion_type_id
   * @return combineId
  **/
  @javax.annotation.Nullable
  public Long getCombineId() {
    return combineId;
  }


  public void setCombineId(Long combineId) {
    this.combineId = combineId;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine deliveryRules(List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner> deliveryRules) {
    
    this.deliveryRules = deliveryRules;
    return this;
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine addDeliveryRulesItem(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner deliveryRulesItem) {
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
  public List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner> getDeliveryRules() {
    return deliveryRules;
  }


  public void setDeliveryRules(List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombineDeliveryRulesInner> deliveryRules) {
    this.deliveryRules = deliveryRules;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 推广类型描述
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
    AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine = (AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine) o;
    return Objects.equals(this.combineId, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine.combineId) &&
        Objects.equals(this.deliveryRules, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine.deliveryRules) &&
        Objects.equals(this.description, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine.description);
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
    sb.append("class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine {\n");
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
       if (!AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine
  */
  public static AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

