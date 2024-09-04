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
import com.bytedance.ads.model.CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInnerChildrenInner;
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
 * CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInnerChildrenInner> children = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_LABLE = "lable";
  @SerializedName(SERIALIZED_NAME_LABLE)
  private String lable = null;

  public CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner() {
  }

  public CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner children(List<CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInnerChildrenInner> children) {
    
    this.children = children;
    return this;
  }

  public CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner addChildrenItem(CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInnerChildrenInner childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * 
   * @return children
  **/
  @javax.annotation.Nullable
  public List<CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInnerChildrenInner> getChildren() {
    return children;
  }


  public void setChildren(List<CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInnerChildrenInner> children) {
    this.children = children;
  }


  public CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 二级类别id: yuntu_category_id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner lable(String lable) {
    
    this.lable = lable;
    return this;
  }

   /**
   * 二级类别标签
   * @return lable
  **/
  @javax.annotation.Nullable
  public String getLable() {
    return lable;
  }


  public void setLable(String lable) {
    this.lable = lable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner cdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner = (CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner) o;
    return Objects.equals(this.children, cdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner.children) &&
        Objects.equals(this.id, cdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner.id) &&
        Objects.equals(this.lable, cdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner.lable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, id, lable);
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
    sb.append("class CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lable: ").append(toIndentedString(lable)).append("\n");
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
    openapiFields.add("children");
    openapiFields.add("id");
    openapiFields.add("lable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner>() {
           @Override
           public void write(JsonWriter out, CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner
  * @throws IOException if the JSON string is invalid with respect to CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner
  */
  public static CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner.class);
  }

 /**
  * Convert an instance of CdpBrandGetV30ResponseDataBrandCategoryInfoInnerChildrenInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

