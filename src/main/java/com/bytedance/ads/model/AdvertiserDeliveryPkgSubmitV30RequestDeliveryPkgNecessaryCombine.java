/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine {
  public static final String SERIALIZED_NAME_COMBINE_ID = "combine_id";
  @SerializedName(SERIALIZED_NAME_COMBINE_ID)
  private Long combineId = null;

  public static final String SERIALIZED_NAME_DELIVERY_RULES = "delivery_rules";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RULES)
  private List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner> deliveryRules = null;

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine() {
  }

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine combineId(Long combineId) {
    
    this.combineId = combineId;
    return this;
  }

   /**
   * 来自【推广产品资质规则配置查询接口】，行业的资质规则中的promotion_type_id
   * @return combineId
  **/
  @javax.annotation.Nonnull
  public Long getCombineId() {
    return combineId;
  }


  public void setCombineId(Long combineId) {
    this.combineId = combineId;
  }


  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine deliveryRules(List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner> deliveryRules) {
    
    this.deliveryRules = deliveryRules;
    return this;
  }

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine addDeliveryRulesItem(AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner deliveryRulesItem) {
    if (this.deliveryRules == null) {
      this.deliveryRules = new ArrayList<>();
    }
    this.deliveryRules.add(deliveryRulesItem);
    return this;
  }

   /**
   * 资质规则的组成类型，数组长度最小为1
   * @return deliveryRules
  **/
  @javax.annotation.Nonnull
  public List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner> getDeliveryRules() {
    return deliveryRules;
  }


  public void setDeliveryRules(List<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInner> deliveryRules) {
    this.deliveryRules = deliveryRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine advertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine = (AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine) o;
    return Objects.equals(this.combineId, advertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine.combineId) &&
        Objects.equals(this.deliveryRules, advertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine.deliveryRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combineId, deliveryRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine {\n");
    sb.append("    combineId: ").append(toIndentedString(combineId)).append("\n");
    sb.append("    deliveryRules: ").append(toIndentedString(deliveryRules)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("combine_id");
    openapiRequiredFields.add("delivery_rules");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine
  */
  public static AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombine to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

