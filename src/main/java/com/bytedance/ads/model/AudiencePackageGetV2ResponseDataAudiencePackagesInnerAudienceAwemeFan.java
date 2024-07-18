/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan {
  public static final String SERIALIZED_NAME_OLD_AWEME_FAN_CATEGORIES = "old_aweme_fan_categories";
  @SerializedName(SERIALIZED_NAME_OLD_AWEME_FAN_CATEGORIES)
  private List<String> oldAwemeFanCategories = null;

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan() {
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan oldAwemeFanCategories(List<String> oldAwemeFanCategories) {
    
    this.oldAwemeFanCategories = oldAwemeFanCategories;
    return this;
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan addOldAwemeFanCategoriesItem(String oldAwemeFanCategoriesItem) {
    if (this.oldAwemeFanCategories == null) {
      this.oldAwemeFanCategories = new ArrayList<>();
    }
    this.oldAwemeFanCategories.add(oldAwemeFanCategoriesItem);
    return this;
  }

   /**
   * 
   * @return oldAwemeFanCategories
  **/
  @javax.annotation.Nullable
  public List<String> getOldAwemeFanCategories() {
    return oldAwemeFanCategories;
  }


  public void setOldAwemeFanCategories(List<String> oldAwemeFanCategories) {
    this.oldAwemeFanCategories = oldAwemeFanCategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan = (AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan) o;
    return Objects.equals(this.oldAwemeFanCategories, audiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan.oldAwemeFanCategories);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldAwemeFanCategories);
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
    sb.append("class AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan {\n");
    sb.append("    oldAwemeFanCategories: ").append(toIndentedString(oldAwemeFanCategories)).append("\n");
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
    openapiFields.add("old_aweme_fan_categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan.class));

       return (TypeAdapter<T>) new TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan>() {
           @Override
           public void write(JsonWriter out, AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan
  * @throws IOException if the JSON string is invalid with respect to AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan
  */
  public static AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan.class);
  }

 /**
  * Convert an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudienceAwemeFan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

