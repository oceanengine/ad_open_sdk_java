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
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner;
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
 * BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue {
  public static final String SERIALIZED_NAME_INFOS = "infos";
  @SerializedName(SERIALIZED_NAME_INFOS)
  private List<BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner> infos = null;

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue() {
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue infos(List<BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner> infos) {
    
    this.infos = infos;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue addInfosItem(BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner infosItem) {
    if (this.infos == null) {
      this.infos = new ArrayList<>();
    }
    this.infos.add(infosItem);
    return this;
  }

   /**
   * 
   * @return infos
  **/
  @javax.annotation.Nullable
  public List<BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner> getInfos() {
    return infos;
  }


  public void setInfos(List<BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner> infos) {
    this.infos = infos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue = (BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue) o;
    return Objects.equals(this.infos, brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue.infos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue {\n");
    sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
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
    openapiFields.add("infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("infos");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue
  */
  public static BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

