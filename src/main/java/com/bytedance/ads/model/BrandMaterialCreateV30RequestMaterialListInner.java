/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandMaterialCreateV30MaterialListCreativeTemplate;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * BrandMaterialCreateV30RequestMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class BrandMaterialCreateV30RequestMaterialListInner {
  public static final String SERIALIZED_NAME_CREATIVE_IS_AIGC = "creative_is_aigc";
  @SerializedName(SERIALIZED_NAME_CREATIVE_IS_AIGC)
  private Boolean creativeIsAigc = null;

  public static final String SERIALIZED_NAME_CREATIVE_TEMPLATE = "creative_template";
  @SerializedName(SERIALIZED_NAME_CREATIVE_TEMPLATE)
  private BrandMaterialCreateV30MaterialListCreativeTemplate creativeTemplate = null;

  public static final String SERIALIZED_NAME_MATERIAL_COMPONENT = "material_component";
  @SerializedName(SERIALIZED_NAME_MATERIAL_COMPONENT)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent materialComponent = null;

  public static final String SERIALIZED_NAME_MATERIAL_NAME = "material_name";
  @SerializedName(SERIALIZED_NAME_MATERIAL_NAME)
  private String materialName = null;

  public BrandMaterialCreateV30RequestMaterialListInner() {
  }

  public BrandMaterialCreateV30RequestMaterialListInner creativeIsAigc(Boolean creativeIsAigc) {
    
    this.creativeIsAigc = creativeIsAigc;
    return this;
  }

   /**
   * 素材是否是ai生成，true为是
   * @return creativeIsAigc
  **/
  @javax.annotation.Nullable
  public Boolean getCreativeIsAigc() {
    return creativeIsAigc;
  }


  public void setCreativeIsAigc(Boolean creativeIsAigc) {
    this.creativeIsAigc = creativeIsAigc;
  }


  public BrandMaterialCreateV30RequestMaterialListInner creativeTemplate(BrandMaterialCreateV30MaterialListCreativeTemplate creativeTemplate) {
    
    this.creativeTemplate = creativeTemplate;
    return this;
  }

   /**
   * Get creativeTemplate
   * @return creativeTemplate
  **/
  @javax.annotation.Nonnull
  public BrandMaterialCreateV30MaterialListCreativeTemplate getCreativeTemplate() {
    return creativeTemplate;
  }


  public void setCreativeTemplate(BrandMaterialCreateV30MaterialListCreativeTemplate creativeTemplate) {
    this.creativeTemplate = creativeTemplate;
  }


  public BrandMaterialCreateV30RequestMaterialListInner materialComponent(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent materialComponent) {
    
    this.materialComponent = materialComponent;
    return this;
  }

   /**
   * Get materialComponent
   * @return materialComponent
  **/
  @javax.annotation.Nonnull
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent getMaterialComponent() {
    return materialComponent;
  }


  public void setMaterialComponent(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent materialComponent) {
    this.materialComponent = materialComponent;
  }


  public BrandMaterialCreateV30RequestMaterialListInner materialName(String materialName) {
    
    this.materialName = materialName;
    return this;
  }

   /**
   * 创意名称
   * @return materialName
  **/
  @javax.annotation.Nonnull
  public String getMaterialName() {
    return materialName;
  }


  public void setMaterialName(String materialName) {
    this.materialName = materialName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialCreateV30RequestMaterialListInner brandMaterialCreateV30RequestMaterialListInner = (BrandMaterialCreateV30RequestMaterialListInner) o;
    return Objects.equals(this.creativeIsAigc, brandMaterialCreateV30RequestMaterialListInner.creativeIsAigc) &&
        Objects.equals(this.creativeTemplate, brandMaterialCreateV30RequestMaterialListInner.creativeTemplate) &&
        Objects.equals(this.materialComponent, brandMaterialCreateV30RequestMaterialListInner.materialComponent) &&
        Objects.equals(this.materialName, brandMaterialCreateV30RequestMaterialListInner.materialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeIsAigc, creativeTemplate, materialComponent, materialName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialCreateV30RequestMaterialListInner {\n");
    sb.append("    creativeIsAigc: ").append(toIndentedString(creativeIsAigc)).append("\n");
    sb.append("    creativeTemplate: ").append(toIndentedString(creativeTemplate)).append("\n");
    sb.append("    materialComponent: ").append(toIndentedString(materialComponent)).append("\n");
    sb.append("    materialName: ").append(toIndentedString(materialName)).append("\n");
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
    openapiFields.add("creative_is_aigc");
    openapiFields.add("creative_template");
    openapiFields.add("material_component");
    openapiFields.add("material_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("creative_template");
    openapiRequiredFields.add("material_component");
    openapiRequiredFields.add("material_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialCreateV30RequestMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialCreateV30RequestMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialCreateV30RequestMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialCreateV30RequestMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialCreateV30RequestMaterialListInner>() {
           @Override
           public void write(JsonWriter out, BrandMaterialCreateV30RequestMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialCreateV30RequestMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialCreateV30RequestMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialCreateV30RequestMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialCreateV30RequestMaterialListInner
  */
  public static BrandMaterialCreateV30RequestMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialCreateV30RequestMaterialListInner.class);
  }

 /**
  * Convert an instance of BrandMaterialCreateV30RequestMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

