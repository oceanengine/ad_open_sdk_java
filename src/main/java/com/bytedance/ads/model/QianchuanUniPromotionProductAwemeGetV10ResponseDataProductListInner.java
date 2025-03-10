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
import com.bytedance.ads.model.QianchuanUniPromotionProductAwemeGetV10DataProductListChannelType;
import com.bytedance.ads.model.QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInnerSquareImageListInner;
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
 * QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner {
  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName = null;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private Long channelId = null;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private QianchuanUniPromotionProductAwemeGetV10DataProductListChannelType channelType = null;

  public static final String SERIALIZED_NAME_GRAY_REASON = "gray_reason";
  @SerializedName(SERIALIZED_NAME_GRAY_REASON)
  private List<String> grayReason = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_IMG = "img";
  @SerializedName(SERIALIZED_NAME_IMG)
  private String img = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SELL_NUM = "sell_num";
  @SerializedName(SERIALIZED_NAME_SELL_NUM)
  private Long sellNum = null;

  public static final String SERIALIZED_NAME_SQUARE_IMAGE_LIST = "square_image_list";
  @SerializedName(SERIALIZED_NAME_SQUARE_IMAGE_LIST)
  private List<QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInnerSquareImageListInner> squareImageList = null;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private List<String> tag = null;

  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner() {
  }

  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 
   * @return categoryName
  **/
  @javax.annotation.Nullable
  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner channelId(Long channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * 
   * @return channelId
  **/
  @javax.annotation.Nullable
  public Long getChannelId() {
    return channelId;
  }


  public void setChannelId(Long channelId) {
    this.channelId = channelId;
  }


  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner channelType(QianchuanUniPromotionProductAwemeGetV10DataProductListChannelType channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * Get channelType
   * @return channelType
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionProductAwemeGetV10DataProductListChannelType getChannelType() {
    return channelType;
  }


  public void setChannelType(QianchuanUniPromotionProductAwemeGetV10DataProductListChannelType channelType) {
    this.channelType = channelType;
  }


  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner grayReason(List<String> grayReason) {
    
    this.grayReason = grayReason;
    return this;
  }

  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner addGrayReasonItem(String grayReasonItem) {
    if (this.grayReason == null) {
      this.grayReason = new ArrayList<>();
    }
    this.grayReason.add(grayReasonItem);
    return this;
  }

   /**
   * 
   * @return grayReason
  **/
  @javax.annotation.Nullable
  public List<String> getGrayReason() {
    return grayReason;
  }


  public void setGrayReason(List<String> grayReason) {
    this.grayReason = grayReason;
  }


  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner img(String img) {
    
    this.img = img;
    return this;
  }

   /**
   * 
   * @return img
  **/
  @javax.annotation.Nullable
  public String getImg() {
    return img;
  }


  public void setImg(String img) {
    this.img = img;
  }


  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner sellNum(Long sellNum) {
    
    this.sellNum = sellNum;
    return this;
  }

   /**
   * 
   * @return sellNum
  **/
  @javax.annotation.Nullable
  public Long getSellNum() {
    return sellNum;
  }


  public void setSellNum(Long sellNum) {
    this.sellNum = sellNum;
  }


  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner squareImageList(List<QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInnerSquareImageListInner> squareImageList) {
    
    this.squareImageList = squareImageList;
    return this;
  }

  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner addSquareImageListItem(QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInnerSquareImageListInner squareImageListItem) {
    if (this.squareImageList == null) {
      this.squareImageList = new ArrayList<>();
    }
    this.squareImageList.add(squareImageListItem);
    return this;
  }

   /**
   * 
   * @return squareImageList
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInnerSquareImageListInner> getSquareImageList() {
    return squareImageList;
  }


  public void setSquareImageList(List<QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInnerSquareImageListInner> squareImageList) {
    this.squareImageList = squareImageList;
  }


  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner tag(List<String> tag) {
    
    this.tag = tag;
    return this;
  }

  public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * 
   * @return tag
  **/
  @javax.annotation.Nullable
  public List<String> getTag() {
    return tag;
  }


  public void setTag(List<String> tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner qianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner = (QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner) o;
    return Objects.equals(this.categoryName, qianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.categoryName) &&
        Objects.equals(this.channelId, qianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.channelId) &&
        Objects.equals(this.channelType, qianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.channelType) &&
        Objects.equals(this.grayReason, qianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.grayReason) &&
        Objects.equals(this.id, qianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.id) &&
        Objects.equals(this.img, qianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.img) &&
        Objects.equals(this.name, qianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.name) &&
        Objects.equals(this.sellNum, qianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.sellNum) &&
        Objects.equals(this.squareImageList, qianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.squareImageList) &&
        Objects.equals(this.tag, qianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.tag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, channelId, channelType, grayReason, id, img, name, sellNum, squareImageList, tag);
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
    sb.append("class QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner {\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    grayReason: ").append(toIndentedString(grayReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sellNum: ").append(toIndentedString(sellNum)).append("\n");
    sb.append("    squareImageList: ").append(toIndentedString(squareImageList)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("category_name");
    openapiFields.add("channel_id");
    openapiFields.add("channel_type");
    openapiFields.add("gray_reason");
    openapiFields.add("id");
    openapiFields.add("img");
    openapiFields.add("name");
    openapiFields.add("sell_num");
    openapiFields.add("square_image_list");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner
  */
  public static QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionProductAwemeGetV10ResponseDataProductListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

