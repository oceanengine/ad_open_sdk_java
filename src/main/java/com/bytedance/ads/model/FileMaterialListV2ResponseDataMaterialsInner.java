/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileMaterialListV2DataMaterialsMaterialProperties;
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
 * FileMaterialListV2ResponseDataMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class FileMaterialListV2ResponseDataMaterialsInner {
  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_PROPERTIES = "material_properties";
  @SerializedName(SERIALIZED_NAME_MATERIAL_PROPERTIES)
  private List<FileMaterialListV2DataMaterialsMaterialProperties> materialProperties = null;

  public static final String SERIALIZED_NAME_MATETRIAL_ID = "matetrial_id";
  @SerializedName(SERIALIZED_NAME_MATETRIAL_ID)
  private Long matetrialId = null;

  public FileMaterialListV2ResponseDataMaterialsInner() {
  }

  public FileMaterialListV2ResponseDataMaterialsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public FileMaterialListV2ResponseDataMaterialsInner materialProperties(List<FileMaterialListV2DataMaterialsMaterialProperties> materialProperties) {
    
    this.materialProperties = materialProperties;
    return this;
  }

  public FileMaterialListV2ResponseDataMaterialsInner addMaterialPropertiesItem(FileMaterialListV2DataMaterialsMaterialProperties materialPropertiesItem) {
    if (this.materialProperties == null) {
      this.materialProperties = new ArrayList<>();
    }
    this.materialProperties.add(materialPropertiesItem);
    return this;
  }

   /**
   * 
   * @return materialProperties
  **/
  @javax.annotation.Nullable
  public List<FileMaterialListV2DataMaterialsMaterialProperties> getMaterialProperties() {
    return materialProperties;
  }


  public void setMaterialProperties(List<FileMaterialListV2DataMaterialsMaterialProperties> materialProperties) {
    this.materialProperties = materialProperties;
  }


  public FileMaterialListV2ResponseDataMaterialsInner matetrialId(Long matetrialId) {
    
    this.matetrialId = matetrialId;
    return this;
  }

   /**
   * 
   * @return matetrialId
  **/
  @javax.annotation.Nullable
  public Long getMatetrialId() {
    return matetrialId;
  }


  public void setMatetrialId(Long matetrialId) {
    this.matetrialId = matetrialId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMaterialListV2ResponseDataMaterialsInner fileMaterialListV2ResponseDataMaterialsInner = (FileMaterialListV2ResponseDataMaterialsInner) o;
    return Objects.equals(this.materialId, fileMaterialListV2ResponseDataMaterialsInner.materialId) &&
        Objects.equals(this.materialProperties, fileMaterialListV2ResponseDataMaterialsInner.materialProperties) &&
        Objects.equals(this.matetrialId, fileMaterialListV2ResponseDataMaterialsInner.matetrialId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialId, materialProperties, matetrialId);
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
    sb.append("class FileMaterialListV2ResponseDataMaterialsInner {\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialProperties: ").append(toIndentedString(materialProperties)).append("\n");
    sb.append("    matetrialId: ").append(toIndentedString(matetrialId)).append("\n");
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
    openapiFields.add("material_id");
    openapiFields.add("material_properties");
    openapiFields.add("matetrial_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileMaterialListV2ResponseDataMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileMaterialListV2ResponseDataMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileMaterialListV2ResponseDataMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileMaterialListV2ResponseDataMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileMaterialListV2ResponseDataMaterialsInner>() {
           @Override
           public void write(JsonWriter out, FileMaterialListV2ResponseDataMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileMaterialListV2ResponseDataMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileMaterialListV2ResponseDataMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileMaterialListV2ResponseDataMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to FileMaterialListV2ResponseDataMaterialsInner
  */
  public static FileMaterialListV2ResponseDataMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileMaterialListV2ResponseDataMaterialsInner.class);
  }

 /**
  * Convert an instance of FileMaterialListV2ResponseDataMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

