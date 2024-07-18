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
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoBkListInner;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoListInner;
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
 * 开屏动态图信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage {
  public static final String SERIALIZED_NAME_IMAGE_INFO_BK_LIST = "image_info_bk_list";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO_BK_LIST)
  private List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoBkListInner> imageInfoBkList = null;

  public static final String SERIALIZED_NAME_IMAGE_INFO_LIST = "image_info_list";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO_LIST)
  private List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoListInner> imageInfoList = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage imageInfoBkList(List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoBkListInner> imageInfoBkList) {
    
    this.imageInfoBkList = imageInfoBkList;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage addImageInfoBkListItem(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoBkListInner imageInfoBkListItem) {
    if (this.imageInfoBkList == null) {
      this.imageInfoBkList = new ArrayList<>();
    }
    this.imageInfoBkList.add(imageInfoBkListItem);
    return this;
  }

   /**
   * 背景图片列表
   * @return imageInfoBkList
  **/
  @javax.annotation.Nullable
  public List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoBkListInner> getImageInfoBkList() {
    return imageInfoBkList;
  }


  public void setImageInfoBkList(List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoBkListInner> imageInfoBkList) {
    this.imageInfoBkList = imageInfoBkList;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage imageInfoList(List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoListInner> imageInfoList) {
    
    this.imageInfoList = imageInfoList;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage addImageInfoListItem(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoListInner imageInfoListItem) {
    if (this.imageInfoList == null) {
      this.imageInfoList = new ArrayList<>();
    }
    this.imageInfoList.add(imageInfoListItem);
    return this;
  }

   /**
   * 图片列表
   * @return imageInfoList
  **/
  @javax.annotation.Nullable
  public List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoListInner> getImageInfoList() {
    return imageInfoList;
  }


  public void setImageInfoList(List<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImageImageInfoListInner> imageInfoList) {
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
    BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage = (BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage) o;
    return Objects.equals(this.imageInfoBkList, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage.imageInfoBkList) &&
        Objects.equals(this.imageInfoList, brandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage.imageInfoList);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage {\n");
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
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeSplashCreativeSplashDynamicImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

