/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandAwemeListV30ResponseDataAwemeUserInfoListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class BrandAwemeListV30ResponseData {
  public static final String SERIALIZED_NAME_AWEME_USER_INFO_LIST = "aweme_user_info_list";
  @SerializedName(SERIALIZED_NAME_AWEME_USER_INFO_LIST)
  private List<BrandAwemeListV30ResponseDataAwemeUserInfoListInner> awemeUserInfoList = null;

  public BrandAwemeListV30ResponseData() {
  }

  public BrandAwemeListV30ResponseData awemeUserInfoList(List<BrandAwemeListV30ResponseDataAwemeUserInfoListInner> awemeUserInfoList) {
    
    this.awemeUserInfoList = awemeUserInfoList;
    return this;
  }

  public BrandAwemeListV30ResponseData addAwemeUserInfoListItem(BrandAwemeListV30ResponseDataAwemeUserInfoListInner awemeUserInfoListItem) {
    if (this.awemeUserInfoList == null) {
      this.awemeUserInfoList = new ArrayList<>();
    }
    this.awemeUserInfoList.add(awemeUserInfoListItem);
    return this;
  }

   /**
   * 抖音号列表
   * @return awemeUserInfoList
  **/
  @javax.annotation.Nullable
  public List<BrandAwemeListV30ResponseDataAwemeUserInfoListInner> getAwemeUserInfoList() {
    return awemeUserInfoList;
  }


  public void setAwemeUserInfoList(List<BrandAwemeListV30ResponseDataAwemeUserInfoListInner> awemeUserInfoList) {
    this.awemeUserInfoList = awemeUserInfoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAwemeListV30ResponseData brandAwemeListV30ResponseData = (BrandAwemeListV30ResponseData) o;
    return Objects.equals(this.awemeUserInfoList, brandAwemeListV30ResponseData.awemeUserInfoList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeUserInfoList);
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
    sb.append("class BrandAwemeListV30ResponseData {\n");
    sb.append("    awemeUserInfoList: ").append(toIndentedString(awemeUserInfoList)).append("\n");
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
    openapiFields.add("aweme_user_info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAwemeListV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAwemeListV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAwemeListV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAwemeListV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAwemeListV30ResponseData>() {
           @Override
           public void write(JsonWriter out, BrandAwemeListV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAwemeListV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAwemeListV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAwemeListV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to BrandAwemeListV30ResponseData
  */
  public static BrandAwemeListV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAwemeListV30ResponseData.class);
  }

 /**
  * Convert an instance of BrandAwemeListV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

