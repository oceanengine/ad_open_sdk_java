/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
 * 通话详情列表
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail {
  public static final String SERIALIZED_NAME_ANSWERED = "answered";
  @SerializedName(SERIALIZED_NAME_ANSWERED)
  private Long answered = null;

  public static final String SERIALIZED_NAME_INVALID = "invalid";
  @SerializedName(SERIALIZED_NAME_INVALID)
  private Long invalid = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total = null;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Long valid = null;

  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail() {
  }

  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail answered(Long answered) {
    
    this.answered = answered;
    return this;
  }

   /**
   * 已接通话单数
   * @return answered
  **/
  @javax.annotation.Nullable
  public Long getAnswered() {
    return answered;
  }


  public void setAnswered(Long answered) {
    this.answered = answered;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail invalid(Long invalid) {
    
    this.invalid = invalid;
    return this;
  }

   /**
   * 不满足要求话单数
   * @return invalid
  **/
  @javax.annotation.Nullable
  public Long getInvalid() {
    return invalid;
  }


  public void setInvalid(Long invalid) {
    this.invalid = invalid;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * 话单总数
   * @return total
  **/
  @javax.annotation.Nullable
  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    this.total = total;
  }


  public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail valid(Long valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * 满足要求话单数
   * @return valid
  **/
  @javax.annotation.Nullable
  public Long getValid() {
    return valid;
  }


  public void setValid(Long valid) {
    this.valid = valid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail = (ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail) o;
    return Objects.equals(this.answered, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail.answered) &&
        Objects.equals(this.invalid, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail.invalid) &&
        Objects.equals(this.total, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail.total) &&
        Objects.equals(this.valid, toolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail.valid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(answered, invalid, total, valid);
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
    sb.append("class ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail {\n");
    sb.append("    answered: ").append(toIndentedString(answered)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
    openapiFields.add("answered");
    openapiFields.add("invalid");
    openapiFields.add("total");
    openapiFields.add("valid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail>() {
           @Override
           public void write(JsonWriter out, ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail
  */
  public static ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail.class);
  }

 /**
  * Convert an instance of ToolsClueRefundViewGetV2ResponseDataShowOuterStagesInnerCallCountDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

