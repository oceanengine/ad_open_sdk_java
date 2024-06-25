/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * DmpBrandGetV2ResponseDataBrandInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class DmpBrandGetV2ResponseDataBrandInfoInner {
  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Long brandId = null;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public static final String SERIALIZED_NAME_VIRTUAL_ADV_ID = "virtual_adv_id";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_ADV_ID)
  private Long virtualAdvId = null;

  public DmpBrandGetV2ResponseDataBrandInfoInner() {
  }

  public DmpBrandGetV2ResponseDataBrandInfoInner brandId(Long brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Long getBrandId() {
    return brandId;
  }


  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }


  public DmpBrandGetV2ResponseDataBrandInfoInner brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public DmpBrandGetV2ResponseDataBrandInfoInner virtualAdvId(Long virtualAdvId) {
    
    this.virtualAdvId = virtualAdvId;
    return this;
  }

   /**
   * 
   * @return virtualAdvId
  **/
  @javax.annotation.Nullable
  public Long getVirtualAdvId() {
    return virtualAdvId;
  }


  public void setVirtualAdvId(Long virtualAdvId) {
    this.virtualAdvId = virtualAdvId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpBrandGetV2ResponseDataBrandInfoInner dmpBrandGetV2ResponseDataBrandInfoInner = (DmpBrandGetV2ResponseDataBrandInfoInner) o;
    return Objects.equals(this.brandId, dmpBrandGetV2ResponseDataBrandInfoInner.brandId) &&
        Objects.equals(this.brandName, dmpBrandGetV2ResponseDataBrandInfoInner.brandName) &&
        Objects.equals(this.virtualAdvId, dmpBrandGetV2ResponseDataBrandInfoInner.virtualAdvId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, brandName, virtualAdvId);
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
    sb.append("class DmpBrandGetV2ResponseDataBrandInfoInner {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    virtualAdvId: ").append(toIndentedString(virtualAdvId)).append("\n");
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
    openapiFields.add("brand_id");
    openapiFields.add("brand_name");
    openapiFields.add("virtual_adv_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpBrandGetV2ResponseDataBrandInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpBrandGetV2ResponseDataBrandInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpBrandGetV2ResponseDataBrandInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpBrandGetV2ResponseDataBrandInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpBrandGetV2ResponseDataBrandInfoInner>() {
           @Override
           public void write(JsonWriter out, DmpBrandGetV2ResponseDataBrandInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpBrandGetV2ResponseDataBrandInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpBrandGetV2ResponseDataBrandInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpBrandGetV2ResponseDataBrandInfoInner
  * @throws IOException if the JSON string is invalid with respect to DmpBrandGetV2ResponseDataBrandInfoInner
  */
  public static DmpBrandGetV2ResponseDataBrandInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpBrandGetV2ResponseDataBrandInfoInner.class);
  }

 /**
  * Convert an instance of DmpBrandGetV2ResponseDataBrandInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

