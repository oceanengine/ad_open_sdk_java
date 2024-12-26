/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoBkListInner;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoListInner;
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
 * 动态-全屏-图片
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen {
  public static final String SERIALIZED_NAME_IMAGE_INFO_BK_LIST = "image_info_bk_list";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO_BK_LIST)
  private List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoBkListInner> imageInfoBkList = null;

  public static final String SERIALIZED_NAME_IMAGE_INFO_LIST = "image_info_list";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO_LIST)
  private List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoListInner> imageInfoList = null;

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen imageInfoBkList(List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoBkListInner> imageInfoBkList) {
    
    this.imageInfoBkList = imageInfoBkList;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen addImageInfoBkListItem(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoBkListInner imageInfoBkListItem) {
    if (this.imageInfoBkList == null) {
      this.imageInfoBkList = new ArrayList<>();
    }
    this.imageInfoBkList.add(imageInfoBkListItem);
    return this;
  }

   /**
   * 底图
   * @return imageInfoBkList
  **/
  @javax.annotation.Nullable
  public List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoBkListInner> getImageInfoBkList() {
    return imageInfoBkList;
  }


  public void setImageInfoBkList(List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoBkListInner> imageInfoBkList) {
    this.imageInfoBkList = imageInfoBkList;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen imageInfoList(List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoListInner> imageInfoList) {
    
    this.imageInfoList = imageInfoList;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen addImageInfoListItem(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoListInner imageInfoListItem) {
    if (this.imageInfoList == null) {
      this.imageInfoList = new ArrayList<>();
    }
    this.imageInfoList.add(imageInfoListItem);
    return this;
  }

   /**
   * 
   * @return imageInfoList
  **/
  @javax.annotation.Nullable
  public List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoListInner> getImageInfoList() {
    return imageInfoList;
  }


  public void setImageInfoList(List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreenImageInfoListInner> imageInfoList) {
    this.imageInfoList = imageInfoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen = (BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen) o;
    return Objects.equals(this.imageInfoBkList, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen.imageInfoBkList) &&
        Objects.equals(this.imageInfoList, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen.imageInfoList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfoBkList, imageInfoList);
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
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen {\n");
    sb.append("    imageInfoBkList: ").append(toIndentedString(imageInfoBkList)).append("\n");
    sb.append("    imageInfoList: ").append(toIndentedString(imageInfoList)).append("\n");
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
    openapiFields.add("image_info_bk_list");
    openapiFields.add("image_info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen
  */
  public static BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDynamicFullScreen to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

