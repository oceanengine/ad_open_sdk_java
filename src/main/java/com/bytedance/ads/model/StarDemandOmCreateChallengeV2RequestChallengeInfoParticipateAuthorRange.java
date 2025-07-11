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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange {
  public static final String SERIALIZED_NAME_UNIQUE_IDS = "unique_ids";
  @SerializedName(SERIALIZED_NAME_UNIQUE_IDS)
  private List<String> uniqueIds = null;

  public StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange() {
  }

  public StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange uniqueIds(List<String> uniqueIds) {
    
    this.uniqueIds = uniqueIds;
    return this;
  }

  public StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange addUniqueIdsItem(String uniqueIdsItem) {
    if (this.uniqueIds == null) {
      this.uniqueIds = new ArrayList<>();
    }
    this.uniqueIds.add(uniqueIdsItem);
    return this;
  }

   /**
   * 达人抖音号,此字段非必填，仅在专属任务challenge_info.author_scope&#x3D;2时需要传
   * @return uniqueIds
  **/
  @javax.annotation.Nullable
  public List<String> getUniqueIds() {
    return uniqueIds;
  }


  public void setUniqueIds(List<String> uniqueIds) {
    this.uniqueIds = uniqueIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange starDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange = (StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange) o;
    return Objects.equals(this.uniqueIds, starDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.uniqueIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange {\n");
    sb.append("    uniqueIds: ").append(toIndentedString(uniqueIds)).append("\n");
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
    openapiFields.add("unique_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange>() {
           @Override
           public void write(JsonWriter out, StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange
  */
  public static StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.class);
  }

 /**
  * Convert an instance of StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

