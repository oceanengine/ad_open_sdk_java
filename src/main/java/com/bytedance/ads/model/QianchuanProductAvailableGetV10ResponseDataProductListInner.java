/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanProductAvailableGetV10DataProductListChannelType;
import com.bytedance.ads.model.QianchuanProductAvailableGetV10DataProductListTags;
import com.bytedance.ads.model.QianchuanProductAvailableGetV10ResponseDataProductListInnerImgListInner;
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
 * QianchuanProductAvailableGetV10ResponseDataProductListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class QianchuanProductAvailableGetV10ResponseDataProductListInner {
  public static final String SERIALIZED_NAME_BENEFITS = "benefits";
  @SerializedName(SERIALIZED_NAME_BENEFITS)
  private List<String> benefits = null;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName = null;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private Long channelId = null;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private QianchuanProductAvailableGetV10DataProductListChannelType channelType = null;

  public static final String SERIALIZED_NAME_DISCOUNT_HIGHER_PRICE = "discount_higher_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_HIGHER_PRICE)
  private Double discountHigherPrice = null;

  public static final String SERIALIZED_NAME_DISCOUNT_LOWER_PRICE = "discount_lower_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LOWER_PRICE)
  private Double discountLowerPrice = null;

  public static final String SERIALIZED_NAME_DISCOUNT_PRICE = "discount_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_PRICE)
  private Long discountPrice = null;

  public static final String SERIALIZED_NAME_FIRST_ON_SHELF_TIME = "first_on_shelf_time";
  @SerializedName(SERIALIZED_NAME_FIRST_ON_SHELF_TIME)
  private Long firstOnShelfTime = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_IMG = "img";
  @SerializedName(SERIALIZED_NAME_IMG)
  private String img = null;

  public static final String SERIALIZED_NAME_IMG_LIST = "img_list";
  @SerializedName(SERIALIZED_NAME_IMG_LIST)
  private List<QianchuanProductAvailableGetV10ResponseDataProductListInnerImgListInner> imgList = null;

  public static final String SERIALIZED_NAME_INVENTORY = "inventory";
  @SerializedName(SERIALIZED_NAME_INVENTORY)
  private Long inventory = null;

  public static final String SERIALIZED_NAME_MARKET_PRICE = "market_price";
  @SerializedName(SERIALIZED_NAME_MARKET_PRICE)
  private Double marketPrice = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PRODUCT_RATE = "product_rate";
  @SerializedName(SERIALIZED_NAME_PRODUCT_RATE)
  private Long productRate = null;

  public static final String SERIALIZED_NAME_RECOMMEND_REASONS = "recommend_reasons";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_REASONS)
  private List<String> recommendReasons = null;

  public static final String SERIALIZED_NAME_SALE_TIME = "sale_time";
  @SerializedName(SERIALIZED_NAME_SALE_TIME)
  private String saleTime = null;

  public static final String SERIALIZED_NAME_SELL_NUM = "sell_num";
  @SerializedName(SERIALIZED_NAME_SELL_NUM)
  private Long sellNum = null;

  public static final String SERIALIZED_NAME_SUPPORT_PRODUCT_NEW_OPEN = "support_product_new_open";
  @SerializedName(SERIALIZED_NAME_SUPPORT_PRODUCT_NEW_OPEN)
  private Boolean supportProductNewOpen = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private QianchuanProductAvailableGetV10DataProductListTags tags = null;

  public QianchuanProductAvailableGetV10ResponseDataProductListInner() {
  }

  public QianchuanProductAvailableGetV10ResponseDataProductListInner benefits(List<String> benefits) {
    
    this.benefits = benefits;
    return this;
  }

  public QianchuanProductAvailableGetV10ResponseDataProductListInner addBenefitsItem(String benefitsItem) {
    if (this.benefits == null) {
      this.benefits = new ArrayList<>();
    }
    this.benefits.add(benefitsItem);
    return this;
  }

   /**
   * 商品权益
   * @return benefits
  **/
  @javax.annotation.Nullable
  public List<String> getBenefits() {
    return benefits;
  }


  public void setBenefits(List<String> benefits) {
    this.benefits = benefits;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner categoryName(String categoryName) {
    
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


  public QianchuanProductAvailableGetV10ResponseDataProductListInner channelId(Long channelId) {
    
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


  public QianchuanProductAvailableGetV10ResponseDataProductListInner channelType(QianchuanProductAvailableGetV10DataProductListChannelType channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * Get channelType
   * @return channelType
  **/
  @javax.annotation.Nullable
  public QianchuanProductAvailableGetV10DataProductListChannelType getChannelType() {
    return channelType;
  }


  public void setChannelType(QianchuanProductAvailableGetV10DataProductListChannelType channelType) {
    this.channelType = channelType;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner discountHigherPrice(Double discountHigherPrice) {
    
    this.discountHigherPrice = discountHigherPrice;
    return this;
  }

   /**
   * 
   * @return discountHigherPrice
  **/
  @javax.annotation.Nullable
  public Double getDiscountHigherPrice() {
    return discountHigherPrice;
  }


  public void setDiscountHigherPrice(Double discountHigherPrice) {
    this.discountHigherPrice = discountHigherPrice;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner discountLowerPrice(Double discountLowerPrice) {
    
    this.discountLowerPrice = discountLowerPrice;
    return this;
  }

   /**
   * 
   * @return discountLowerPrice
  **/
  @javax.annotation.Nullable
  public Double getDiscountLowerPrice() {
    return discountLowerPrice;
  }


  public void setDiscountLowerPrice(Double discountLowerPrice) {
    this.discountLowerPrice = discountLowerPrice;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner discountPrice(Long discountPrice) {
    
    this.discountPrice = discountPrice;
    return this;
  }

   /**
   * 
   * @return discountPrice
  **/
  @javax.annotation.Nullable
  public Long getDiscountPrice() {
    return discountPrice;
  }


  public void setDiscountPrice(Long discountPrice) {
    this.discountPrice = discountPrice;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner firstOnShelfTime(Long firstOnShelfTime) {
    
    this.firstOnShelfTime = firstOnShelfTime;
    return this;
  }

   /**
   * 首次上架时间
   * @return firstOnShelfTime
  **/
  @javax.annotation.Nullable
  public Long getFirstOnShelfTime() {
    return firstOnShelfTime;
  }


  public void setFirstOnShelfTime(Long firstOnShelfTime) {
    this.firstOnShelfTime = firstOnShelfTime;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner id(Long id) {
    
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


  public QianchuanProductAvailableGetV10ResponseDataProductListInner img(String img) {
    
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


  public QianchuanProductAvailableGetV10ResponseDataProductListInner imgList(List<QianchuanProductAvailableGetV10ResponseDataProductListInnerImgListInner> imgList) {
    
    this.imgList = imgList;
    return this;
  }

  public QianchuanProductAvailableGetV10ResponseDataProductListInner addImgListItem(QianchuanProductAvailableGetV10ResponseDataProductListInnerImgListInner imgListItem) {
    if (this.imgList == null) {
      this.imgList = new ArrayList<>();
    }
    this.imgList.add(imgListItem);
    return this;
  }

   /**
   * 
   * @return imgList
  **/
  @javax.annotation.Nullable
  public List<QianchuanProductAvailableGetV10ResponseDataProductListInnerImgListInner> getImgList() {
    return imgList;
  }


  public void setImgList(List<QianchuanProductAvailableGetV10ResponseDataProductListInnerImgListInner> imgList) {
    this.imgList = imgList;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner inventory(Long inventory) {
    
    this.inventory = inventory;
    return this;
  }

   /**
   * 
   * @return inventory
  **/
  @javax.annotation.Nullable
  public Long getInventory() {
    return inventory;
  }


  public void setInventory(Long inventory) {
    this.inventory = inventory;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner marketPrice(Double marketPrice) {
    
    this.marketPrice = marketPrice;
    return this;
  }

   /**
   * 
   * @return marketPrice
  **/
  @javax.annotation.Nullable
  public Double getMarketPrice() {
    return marketPrice;
  }


  public void setMarketPrice(Double marketPrice) {
    this.marketPrice = marketPrice;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner name(String name) {
    
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


  public QianchuanProductAvailableGetV10ResponseDataProductListInner productRate(Long productRate) {
    
    this.productRate = productRate;
    return this;
  }

   /**
   * 
   * @return productRate
  **/
  @javax.annotation.Nullable
  public Long getProductRate() {
    return productRate;
  }


  public void setProductRate(Long productRate) {
    this.productRate = productRate;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner recommendReasons(List<String> recommendReasons) {
    
    this.recommendReasons = recommendReasons;
    return this;
  }

  public QianchuanProductAvailableGetV10ResponseDataProductListInner addRecommendReasonsItem(String recommendReasonsItem) {
    if (this.recommendReasons == null) {
      this.recommendReasons = new ArrayList<>();
    }
    this.recommendReasons.add(recommendReasonsItem);
    return this;
  }

   /**
   * 推荐理由
   * @return recommendReasons
  **/
  @javax.annotation.Nullable
  public List<String> getRecommendReasons() {
    return recommendReasons;
  }


  public void setRecommendReasons(List<String> recommendReasons) {
    this.recommendReasons = recommendReasons;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner saleTime(String saleTime) {
    
    this.saleTime = saleTime;
    return this;
  }

   /**
   * 
   * @return saleTime
  **/
  @javax.annotation.Nullable
  public String getSaleTime() {
    return saleTime;
  }


  public void setSaleTime(String saleTime) {
    this.saleTime = saleTime;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner sellNum(Long sellNum) {
    
    this.sellNum = sellNum;
    return this;
  }

   /**
   * 销量
   * @return sellNum
  **/
  @javax.annotation.Nullable
  public Long getSellNum() {
    return sellNum;
  }


  public void setSellNum(Long sellNum) {
    this.sellNum = sellNum;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner supportProductNewOpen(Boolean supportProductNewOpen) {
    
    this.supportProductNewOpen = supportProductNewOpen;
    return this;
  }

   /**
   * 
   * @return supportProductNewOpen
  **/
  @javax.annotation.Nullable
  public Boolean getSupportProductNewOpen() {
    return supportProductNewOpen;
  }


  public void setSupportProductNewOpen(Boolean supportProductNewOpen) {
    this.supportProductNewOpen = supportProductNewOpen;
  }


  public QianchuanProductAvailableGetV10ResponseDataProductListInner tags(QianchuanProductAvailableGetV10DataProductListTags tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public QianchuanProductAvailableGetV10DataProductListTags getTags() {
    return tags;
  }


  public void setTags(QianchuanProductAvailableGetV10DataProductListTags tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanProductAvailableGetV10ResponseDataProductListInner qianchuanProductAvailableGetV10ResponseDataProductListInner = (QianchuanProductAvailableGetV10ResponseDataProductListInner) o;
    return Objects.equals(this.benefits, qianchuanProductAvailableGetV10ResponseDataProductListInner.benefits) &&
        Objects.equals(this.categoryName, qianchuanProductAvailableGetV10ResponseDataProductListInner.categoryName) &&
        Objects.equals(this.channelId, qianchuanProductAvailableGetV10ResponseDataProductListInner.channelId) &&
        Objects.equals(this.channelType, qianchuanProductAvailableGetV10ResponseDataProductListInner.channelType) &&
        Objects.equals(this.discountHigherPrice, qianchuanProductAvailableGetV10ResponseDataProductListInner.discountHigherPrice) &&
        Objects.equals(this.discountLowerPrice, qianchuanProductAvailableGetV10ResponseDataProductListInner.discountLowerPrice) &&
        Objects.equals(this.discountPrice, qianchuanProductAvailableGetV10ResponseDataProductListInner.discountPrice) &&
        Objects.equals(this.firstOnShelfTime, qianchuanProductAvailableGetV10ResponseDataProductListInner.firstOnShelfTime) &&
        Objects.equals(this.id, qianchuanProductAvailableGetV10ResponseDataProductListInner.id) &&
        Objects.equals(this.img, qianchuanProductAvailableGetV10ResponseDataProductListInner.img) &&
        Objects.equals(this.imgList, qianchuanProductAvailableGetV10ResponseDataProductListInner.imgList) &&
        Objects.equals(this.inventory, qianchuanProductAvailableGetV10ResponseDataProductListInner.inventory) &&
        Objects.equals(this.marketPrice, qianchuanProductAvailableGetV10ResponseDataProductListInner.marketPrice) &&
        Objects.equals(this.name, qianchuanProductAvailableGetV10ResponseDataProductListInner.name) &&
        Objects.equals(this.productRate, qianchuanProductAvailableGetV10ResponseDataProductListInner.productRate) &&
        Objects.equals(this.recommendReasons, qianchuanProductAvailableGetV10ResponseDataProductListInner.recommendReasons) &&
        Objects.equals(this.saleTime, qianchuanProductAvailableGetV10ResponseDataProductListInner.saleTime) &&
        Objects.equals(this.sellNum, qianchuanProductAvailableGetV10ResponseDataProductListInner.sellNum) &&
        Objects.equals(this.supportProductNewOpen, qianchuanProductAvailableGetV10ResponseDataProductListInner.supportProductNewOpen) &&
        Objects.equals(this.tags, qianchuanProductAvailableGetV10ResponseDataProductListInner.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefits, categoryName, channelId, channelType, discountHigherPrice, discountLowerPrice, discountPrice, firstOnShelfTime, id, img, imgList, inventory, marketPrice, name, productRate, recommendReasons, saleTime, sellNum, supportProductNewOpen, tags);
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
    sb.append("class QianchuanProductAvailableGetV10ResponseDataProductListInner {\n");
    sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    discountHigherPrice: ").append(toIndentedString(discountHigherPrice)).append("\n");
    sb.append("    discountLowerPrice: ").append(toIndentedString(discountLowerPrice)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    firstOnShelfTime: ").append(toIndentedString(firstOnShelfTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    imgList: ").append(toIndentedString(imgList)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    marketPrice: ").append(toIndentedString(marketPrice)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productRate: ").append(toIndentedString(productRate)).append("\n");
    sb.append("    recommendReasons: ").append(toIndentedString(recommendReasons)).append("\n");
    sb.append("    saleTime: ").append(toIndentedString(saleTime)).append("\n");
    sb.append("    sellNum: ").append(toIndentedString(sellNum)).append("\n");
    sb.append("    supportProductNewOpen: ").append(toIndentedString(supportProductNewOpen)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("benefits");
    openapiFields.add("category_name");
    openapiFields.add("channel_id");
    openapiFields.add("channel_type");
    openapiFields.add("discount_higher_price");
    openapiFields.add("discount_lower_price");
    openapiFields.add("discount_price");
    openapiFields.add("first_on_shelf_time");
    openapiFields.add("id");
    openapiFields.add("img");
    openapiFields.add("img_list");
    openapiFields.add("inventory");
    openapiFields.add("market_price");
    openapiFields.add("name");
    openapiFields.add("product_rate");
    openapiFields.add("recommend_reasons");
    openapiFields.add("sale_time");
    openapiFields.add("sell_num");
    openapiFields.add("support_product_new_open");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanProductAvailableGetV10ResponseDataProductListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanProductAvailableGetV10ResponseDataProductListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanProductAvailableGetV10ResponseDataProductListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanProductAvailableGetV10ResponseDataProductListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanProductAvailableGetV10ResponseDataProductListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanProductAvailableGetV10ResponseDataProductListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanProductAvailableGetV10ResponseDataProductListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanProductAvailableGetV10ResponseDataProductListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanProductAvailableGetV10ResponseDataProductListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanProductAvailableGetV10ResponseDataProductListInner
  */
  public static QianchuanProductAvailableGetV10ResponseDataProductListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanProductAvailableGetV10ResponseDataProductListInner.class);
  }

 /**
  * Convert an instance of QianchuanProductAvailableGetV10ResponseDataProductListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

