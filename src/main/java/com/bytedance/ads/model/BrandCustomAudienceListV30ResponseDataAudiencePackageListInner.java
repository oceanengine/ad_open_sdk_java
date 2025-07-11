/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandCustomAudienceListV30DataAudiencePackageListCategory;
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
 * BrandCustomAudienceListV30ResponseDataAudiencePackageListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandCustomAudienceListV30ResponseDataAudiencePackageListInner {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private BrandCustomAudienceListV30DataAudiencePackageListCategory category = null;

  public static final String SERIALIZED_NAME_EXPIRE_TIME = "expire_time";
  @SerializedName(SERIALIZED_NAME_EXPIRE_TIME)
  private Long expireTime = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public BrandCustomAudienceListV30ResponseDataAudiencePackageListInner() {
  }

  public BrandCustomAudienceListV30ResponseDataAudiencePackageListInner category(BrandCustomAudienceListV30DataAudiencePackageListCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  public BrandCustomAudienceListV30DataAudiencePackageListCategory getCategory() {
    return category;
  }


  public void setCategory(BrandCustomAudienceListV30DataAudiencePackageListCategory category) {
    this.category = category;
  }


  public BrandCustomAudienceListV30ResponseDataAudiencePackageListInner expireTime(Long expireTime) {
    
    this.expireTime = expireTime;
    return this;
  }

   /**
   * 过期时间
   * @return expireTime
  **/
  @javax.annotation.Nullable
  public Long getExpireTime() {
    return expireTime;
  }


  public void setExpireTime(Long expireTime) {
    this.expireTime = expireTime;
  }


  public BrandCustomAudienceListV30ResponseDataAudiencePackageListInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 人群包ID
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public BrandCustomAudienceListV30ResponseDataAudiencePackageListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 人群包名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCustomAudienceListV30ResponseDataAudiencePackageListInner brandCustomAudienceListV30ResponseDataAudiencePackageListInner = (BrandCustomAudienceListV30ResponseDataAudiencePackageListInner) o;
    return Objects.equals(this.category, brandCustomAudienceListV30ResponseDataAudiencePackageListInner.category) &&
        Objects.equals(this.expireTime, brandCustomAudienceListV30ResponseDataAudiencePackageListInner.expireTime) &&
        Objects.equals(this.id, brandCustomAudienceListV30ResponseDataAudiencePackageListInner.id) &&
        Objects.equals(this.name, brandCustomAudienceListV30ResponseDataAudiencePackageListInner.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, expireTime, id, name);
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
    sb.append("class BrandCustomAudienceListV30ResponseDataAudiencePackageListInner {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("category");
    openapiFields.add("expire_time");
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expire_time");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCustomAudienceListV30ResponseDataAudiencePackageListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCustomAudienceListV30ResponseDataAudiencePackageListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCustomAudienceListV30ResponseDataAudiencePackageListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCustomAudienceListV30ResponseDataAudiencePackageListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCustomAudienceListV30ResponseDataAudiencePackageListInner>() {
           @Override
           public void write(JsonWriter out, BrandCustomAudienceListV30ResponseDataAudiencePackageListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCustomAudienceListV30ResponseDataAudiencePackageListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCustomAudienceListV30ResponseDataAudiencePackageListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCustomAudienceListV30ResponseDataAudiencePackageListInner
  * @throws IOException if the JSON string is invalid with respect to BrandCustomAudienceListV30ResponseDataAudiencePackageListInner
  */
  public static BrandCustomAudienceListV30ResponseDataAudiencePackageListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCustomAudienceListV30ResponseDataAudiencePackageListInner.class);
  }

 /**
  * Convert an instance of BrandCustomAudienceListV30ResponseDataAudiencePackageListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

