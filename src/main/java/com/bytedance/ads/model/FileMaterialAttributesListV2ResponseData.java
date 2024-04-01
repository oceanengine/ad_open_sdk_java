/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileMaterialAttributesListV2ResponseDataMaterialsInner;
import com.bytedance.ads.model.FileMaterialAttributesListV2ResponseDataPage;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class FileMaterialAttributesListV2ResponseData {
  public static final String SERIALIZED_NAME_MATERIALS = "materials";
  @SerializedName(SERIALIZED_NAME_MATERIALS)
  private List<FileMaterialAttributesListV2ResponseDataMaterialsInner> materials = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private FileMaterialAttributesListV2ResponseDataPage page = null;

  public FileMaterialAttributesListV2ResponseData() {
  }

  public FileMaterialAttributesListV2ResponseData materials(List<FileMaterialAttributesListV2ResponseDataMaterialsInner> materials) {
    
    this.materials = materials;
    return this;
  }

  public FileMaterialAttributesListV2ResponseData addMaterialsItem(FileMaterialAttributesListV2ResponseDataMaterialsInner materialsItem) {
    if (this.materials == null) {
      this.materials = new ArrayList<>();
    }
    this.materials.add(materialsItem);
    return this;
  }

   /**
   * 素材及素材属性列表
   * @return materials
  **/
  @javax.annotation.Nullable
  public List<FileMaterialAttributesListV2ResponseDataMaterialsInner> getMaterials() {
    return materials;
  }


  public void setMaterials(List<FileMaterialAttributesListV2ResponseDataMaterialsInner> materials) {
    this.materials = materials;
  }


  public FileMaterialAttributesListV2ResponseData page(FileMaterialAttributesListV2ResponseDataPage page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  public FileMaterialAttributesListV2ResponseDataPage getPage() {
    return page;
  }


  public void setPage(FileMaterialAttributesListV2ResponseDataPage page) {
    this.page = page;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMaterialAttributesListV2ResponseData fileMaterialAttributesListV2ResponseData = (FileMaterialAttributesListV2ResponseData) o;
    return Objects.equals(this.materials, fileMaterialAttributesListV2ResponseData.materials) &&
        Objects.equals(this.page, fileMaterialAttributesListV2ResponseData.page);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(materials, page);
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
    sb.append("class FileMaterialAttributesListV2ResponseData {\n");
    sb.append("    materials: ").append(toIndentedString(materials)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
    openapiFields.add("materials");
    openapiFields.add("page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("materials");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileMaterialAttributesListV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileMaterialAttributesListV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileMaterialAttributesListV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileMaterialAttributesListV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<FileMaterialAttributesListV2ResponseData>() {
           @Override
           public void write(JsonWriter out, FileMaterialAttributesListV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileMaterialAttributesListV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileMaterialAttributesListV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileMaterialAttributesListV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to FileMaterialAttributesListV2ResponseData
  */
  public static FileMaterialAttributesListV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileMaterialAttributesListV2ResponseData.class);
  }

 /**
  * Convert an instance of FileMaterialAttributesListV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
