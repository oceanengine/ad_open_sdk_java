/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoGroupImage;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoHorizontalImageVideo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoHorizontalVideo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoLargeImage;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoSmallImage;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVariableImageVideo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalImageVideo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVideoCreative;
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
 * 基础创意信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo {
  public static final String SERIALIZED_NAME_CREATIVE_TYPE = "creative_type";
  @SerializedName(SERIALIZED_NAME_CREATIVE_TYPE)
  private BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType creativeType = null;

  public static final String SERIALIZED_NAME_GROUP_IMAGE = "group_image";
  @SerializedName(SERIALIZED_NAME_GROUP_IMAGE)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoGroupImage groupImage = null;

  public static final String SERIALIZED_NAME_HORIZONTAL_IMAGE_VIDEO = "horizontal_image_video";
  @SerializedName(SERIALIZED_NAME_HORIZONTAL_IMAGE_VIDEO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoHorizontalImageVideo horizontalImageVideo = null;

  public static final String SERIALIZED_NAME_HORIZONTAL_VIDEO = "horizontal_video";
  @SerializedName(SERIALIZED_NAME_HORIZONTAL_VIDEO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoHorizontalVideo horizontalVideo = null;

  public static final String SERIALIZED_NAME_LARGE_IMAGE = "large_image";
  @SerializedName(SERIALIZED_NAME_LARGE_IMAGE)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoLargeImage largeImage = null;

  public static final String SERIALIZED_NAME_SMALL_IMAGE = "small_image";
  @SerializedName(SERIALIZED_NAME_SMALL_IMAGE)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoSmallImage smallImage = null;

  public static final String SERIALIZED_NAME_VARIABLE_IMAGE_VIDEO = "variable_image_video";
  @SerializedName(SERIALIZED_NAME_VARIABLE_IMAGE_VIDEO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVariableImageVideo variableImageVideo = null;

  public static final String SERIALIZED_NAME_VERTICAL_IMAGE_VIDEO = "vertical_image_video";
  @SerializedName(SERIALIZED_NAME_VERTICAL_IMAGE_VIDEO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalImageVideo verticalImageVideo = null;

  public static final String SERIALIZED_NAME_VERTICAL_VIDEO = "vertical_video";
  @SerializedName(SERIALIZED_NAME_VERTICAL_VIDEO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideo verticalVideo = null;

  public static final String SERIALIZED_NAME_VIDEO_CREATIVE = "video_creative";
  @SerializedName(SERIALIZED_NAME_VIDEO_CREATIVE)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVideoCreative videoCreative = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo creativeType(BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType creativeType) {
    
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Get creativeType
   * @return creativeType
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType getCreativeType() {
    return creativeType;
  }


  public void setCreativeType(BrandCreativeGetV30DataCreativesCreativeCreativeInfoCreativeType creativeType) {
    this.creativeType = creativeType;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo groupImage(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoGroupImage groupImage) {
    
    this.groupImage = groupImage;
    return this;
  }

   /**
   * Get groupImage
   * @return groupImage
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoGroupImage getGroupImage() {
    return groupImage;
  }


  public void setGroupImage(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoGroupImage groupImage) {
    this.groupImage = groupImage;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo horizontalImageVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoHorizontalImageVideo horizontalImageVideo) {
    
    this.horizontalImageVideo = horizontalImageVideo;
    return this;
  }

   /**
   * Get horizontalImageVideo
   * @return horizontalImageVideo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoHorizontalImageVideo getHorizontalImageVideo() {
    return horizontalImageVideo;
  }


  public void setHorizontalImageVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoHorizontalImageVideo horizontalImageVideo) {
    this.horizontalImageVideo = horizontalImageVideo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo horizontalVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoHorizontalVideo horizontalVideo) {
    
    this.horizontalVideo = horizontalVideo;
    return this;
  }

   /**
   * Get horizontalVideo
   * @return horizontalVideo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoHorizontalVideo getHorizontalVideo() {
    return horizontalVideo;
  }


  public void setHorizontalVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoHorizontalVideo horizontalVideo) {
    this.horizontalVideo = horizontalVideo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo largeImage(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoLargeImage largeImage) {
    
    this.largeImage = largeImage;
    return this;
  }

   /**
   * Get largeImage
   * @return largeImage
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoLargeImage getLargeImage() {
    return largeImage;
  }


  public void setLargeImage(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoLargeImage largeImage) {
    this.largeImage = largeImage;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo smallImage(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoSmallImage smallImage) {
    
    this.smallImage = smallImage;
    return this;
  }

   /**
   * Get smallImage
   * @return smallImage
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoSmallImage getSmallImage() {
    return smallImage;
  }


  public void setSmallImage(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoSmallImage smallImage) {
    this.smallImage = smallImage;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo variableImageVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVariableImageVideo variableImageVideo) {
    
    this.variableImageVideo = variableImageVideo;
    return this;
  }

   /**
   * Get variableImageVideo
   * @return variableImageVideo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVariableImageVideo getVariableImageVideo() {
    return variableImageVideo;
  }


  public void setVariableImageVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVariableImageVideo variableImageVideo) {
    this.variableImageVideo = variableImageVideo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo verticalImageVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalImageVideo verticalImageVideo) {
    
    this.verticalImageVideo = verticalImageVideo;
    return this;
  }

   /**
   * Get verticalImageVideo
   * @return verticalImageVideo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalImageVideo getVerticalImageVideo() {
    return verticalImageVideo;
  }


  public void setVerticalImageVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalImageVideo verticalImageVideo) {
    this.verticalImageVideo = verticalImageVideo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo verticalVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideo verticalVideo) {
    
    this.verticalVideo = verticalVideo;
    return this;
  }

   /**
   * Get verticalVideo
   * @return verticalVideo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideo getVerticalVideo() {
    return verticalVideo;
  }


  public void setVerticalVideo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideo verticalVideo) {
    this.verticalVideo = verticalVideo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo videoCreative(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVideoCreative videoCreative) {
    
    this.videoCreative = videoCreative;
    return this;
  }

   /**
   * Get videoCreative
   * @return videoCreative
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVideoCreative getVideoCreative() {
    return videoCreative;
  }


  public void setVideoCreative(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVideoCreative videoCreative) {
    this.videoCreative = videoCreative;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo = (BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo) o;
    return Objects.equals(this.creativeType, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.creativeType) &&
        Objects.equals(this.groupImage, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.groupImage) &&
        Objects.equals(this.horizontalImageVideo, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.horizontalImageVideo) &&
        Objects.equals(this.horizontalVideo, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.horizontalVideo) &&
        Objects.equals(this.largeImage, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.largeImage) &&
        Objects.equals(this.smallImage, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.smallImage) &&
        Objects.equals(this.variableImageVideo, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.variableImageVideo) &&
        Objects.equals(this.verticalImageVideo, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.verticalImageVideo) &&
        Objects.equals(this.verticalVideo, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.verticalVideo) &&
        Objects.equals(this.videoCreative, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.videoCreative);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeType, groupImage, horizontalImageVideo, horizontalVideo, largeImage, smallImage, variableImageVideo, verticalImageVideo, verticalVideo, videoCreative);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo {\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    groupImage: ").append(toIndentedString(groupImage)).append("\n");
    sb.append("    horizontalImageVideo: ").append(toIndentedString(horizontalImageVideo)).append("\n");
    sb.append("    horizontalVideo: ").append(toIndentedString(horizontalVideo)).append("\n");
    sb.append("    largeImage: ").append(toIndentedString(largeImage)).append("\n");
    sb.append("    smallImage: ").append(toIndentedString(smallImage)).append("\n");
    sb.append("    variableImageVideo: ").append(toIndentedString(variableImageVideo)).append("\n");
    sb.append("    verticalImageVideo: ").append(toIndentedString(verticalImageVideo)).append("\n");
    sb.append("    verticalVideo: ").append(toIndentedString(verticalVideo)).append("\n");
    sb.append("    videoCreative: ").append(toIndentedString(videoCreative)).append("\n");
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
    openapiFields.add("creative_type");
    openapiFields.add("group_image");
    openapiFields.add("horizontal_image_video");
    openapiFields.add("horizontal_video");
    openapiFields.add("large_image");
    openapiFields.add("small_image");
    openapiFields.add("variable_image_video");
    openapiFields.add("vertical_image_video");
    openapiFields.add("vertical_video");
    openapiFields.add("video_creative");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

