/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class StarOrderGetCancelAmountV2ResponseData {
  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Long cost = null;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc = null;

  public static final String SERIALIZED_NAME_PRECISE_COST = "precise_cost";
  @SerializedName(SERIALIZED_NAME_PRECISE_COST)
  private Double preciseCost = null;

  public StarOrderGetCancelAmountV2ResponseData() {
  }

  public StarOrderGetCancelAmountV2ResponseData cost(Long cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 赔付金额（元）
   * @return cost
  **/
  @javax.annotation.Nullable
  public Long getCost() {
    return cost;
  }


  public void setCost(Long cost) {
    this.cost = cost;
  }


  public StarOrderGetCancelAmountV2ResponseData desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 赔付描述
   * @return desc
  **/
  @javax.annotation.Nullable
  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public StarOrderGetCancelAmountV2ResponseData preciseCost(Double preciseCost) {
    
    this.preciseCost = preciseCost;
    return this;
  }

   /**
   * 精确赔付金额（元）
   * @return preciseCost
  **/
  @javax.annotation.Nullable
  public Double getPreciseCost() {
    return preciseCost;
  }


  public void setPreciseCost(Double preciseCost) {
    this.preciseCost = preciseCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetCancelAmountV2ResponseData starOrderGetCancelAmountV2ResponseData = (StarOrderGetCancelAmountV2ResponseData) o;
    return Objects.equals(this.cost, starOrderGetCancelAmountV2ResponseData.cost) &&
        Objects.equals(this.desc, starOrderGetCancelAmountV2ResponseData.desc) &&
        Objects.equals(this.preciseCost, starOrderGetCancelAmountV2ResponseData.preciseCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, desc, preciseCost);
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
    sb.append("class StarOrderGetCancelAmountV2ResponseData {\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    preciseCost: ").append(toIndentedString(preciseCost)).append("\n");
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
    openapiFields.add("cost");
    openapiFields.add("desc");
    openapiFields.add("precise_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetCancelAmountV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetCancelAmountV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetCancelAmountV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetCancelAmountV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetCancelAmountV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarOrderGetCancelAmountV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetCancelAmountV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetCancelAmountV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetCancelAmountV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetCancelAmountV2ResponseData
  */
  public static StarOrderGetCancelAmountV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetCancelAmountV2ResponseData.class);
  }

 /**
  * Convert an instance of StarOrderGetCancelAmountV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

