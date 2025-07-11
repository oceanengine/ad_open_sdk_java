/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandMaterialListV30DataMaterialsTrackUrlInfoTrackUrlSendType;
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
 * 监测链接配置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo {
  public static final String SERIALIZED_NAME_ACTION_TRACK_URL = "action_track_url";
  @SerializedName(SERIALIZED_NAME_ACTION_TRACK_URL)
  private List<String> actionTrackUrl = null;

  public static final String SERIALIZED_NAME_CARD_SHOW_TRACK_URL = "card_show_track_url";
  @SerializedName(SERIALIZED_NAME_CARD_SHOW_TRACK_URL)
  private List<String> cardShowTrackUrl = null;

  public static final String SERIALIZED_NAME_COMMENT_TRACK_URL = "comment_track_url";
  @SerializedName(SERIALIZED_NAME_COMMENT_TRACK_URL)
  private List<String> commentTrackUrl = null;

  public static final String SERIALIZED_NAME_CONTEXT_TRACK_URL = "context_track_url";
  @SerializedName(SERIALIZED_NAME_CONTEXT_TRACK_URL)
  private List<String> contextTrackUrl = null;

  public static final String SERIALIZED_NAME_EFFECTIVE_FRAME = "effective_frame";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_FRAME)
  private List<String> effectiveFrame = null;

  public static final String SERIALIZED_NAME_FIRST_FRAME = "first_frame";
  @SerializedName(SERIALIZED_NAME_FIRST_FRAME)
  private List<String> firstFrame = null;

  public static final String SERIALIZED_NAME_INTERACT_TRACK_URL = "interact_track_url";
  @SerializedName(SERIALIZED_NAME_INTERACT_TRACK_URL)
  private List<String> interactTrackUrl = null;

  public static final String SERIALIZED_NAME_LAST_FRAME = "last_frame";
  @SerializedName(SERIALIZED_NAME_LAST_FRAME)
  private List<String> lastFrame = null;

  public static final String SERIALIZED_NAME_LIKE_CANCEL_TRACK_URL = "like_cancel_track_url";
  @SerializedName(SERIALIZED_NAME_LIKE_CANCEL_TRACK_URL)
  private List<String> likeCancelTrackUrl = null;

  public static final String SERIALIZED_NAME_LIKE_TRACK_URL = "like_track_url";
  @SerializedName(SERIALIZED_NAME_LIKE_TRACK_URL)
  private List<String> likeTrackUrl = null;

  public static final String SERIALIZED_NAME_MANUAL_FRAME = "manual_frame";
  @SerializedName(SERIALIZED_NAME_MANUAL_FRAME)
  private List<String> manualFrame = null;

  public static final String SERIALIZED_NAME_SHARE_TRACK_URL = "share_track_url";
  @SerializedName(SERIALIZED_NAME_SHARE_TRACK_URL)
  private List<String> shareTrackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL = "track_url";
  @SerializedName(SERIALIZED_NAME_TRACK_URL)
  private List<String> trackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL_SEND_TYPE = "track_url_send_type";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_SEND_TYPE)
  private BrandMaterialListV30DataMaterialsTrackUrlInfoTrackUrlSendType trackUrlSendType = null;

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo actionTrackUrl(List<String> actionTrackUrl) {
    
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addActionTrackUrlItem(String actionTrackUrlItem) {
    if (this.actionTrackUrl == null) {
      this.actionTrackUrl = new ArrayList<>();
    }
    this.actionTrackUrl.add(actionTrackUrlItem);
    return this;
  }

   /**
   * 点击监测链接
   * @return actionTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getActionTrackUrl() {
    return actionTrackUrl;
  }


  public void setActionTrackUrl(List<String> actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo cardShowTrackUrl(List<String> cardShowTrackUrl) {
    
    this.cardShowTrackUrl = cardShowTrackUrl;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addCardShowTrackUrlItem(String cardShowTrackUrlItem) {
    if (this.cardShowTrackUrl == null) {
      this.cardShowTrackUrl = new ArrayList<>();
    }
    this.cardShowTrackUrl.add(cardShowTrackUrlItem);
    return this;
  }

   /**
   * 卡片展现第三方监测链接
   * @return cardShowTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getCardShowTrackUrl() {
    return cardShowTrackUrl;
  }


  public void setCardShowTrackUrl(List<String> cardShowTrackUrl) {
    this.cardShowTrackUrl = cardShowTrackUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo commentTrackUrl(List<String> commentTrackUrl) {
    
    this.commentTrackUrl = commentTrackUrl;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addCommentTrackUrlItem(String commentTrackUrlItem) {
    if (this.commentTrackUrl == null) {
      this.commentTrackUrl = new ArrayList<>();
    }
    this.commentTrackUrl.add(commentTrackUrlItem);
    return this;
  }

   /**
   * 评论监测链接
   * @return commentTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getCommentTrackUrl() {
    return commentTrackUrl;
  }


  public void setCommentTrackUrl(List<String> commentTrackUrl) {
    this.commentTrackUrl = commentTrackUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo contextTrackUrl(List<String> contextTrackUrl) {
    
    this.contextTrackUrl = contextTrackUrl;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addContextTrackUrlItem(String contextTrackUrlItem) {
    if (this.contextTrackUrl == null) {
      this.contextTrackUrl = new ArrayList<>();
    }
    this.contextTrackUrl.add(contextTrackUrlItem);
    return this;
  }

   /**
   * 第三方上下文内容监测链接
   * @return contextTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getContextTrackUrl() {
    return contextTrackUrl;
  }


  public void setContextTrackUrl(List<String> contextTrackUrl) {
    this.contextTrackUrl = contextTrackUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo effectiveFrame(List<String> effectiveFrame) {
    
    this.effectiveFrame = effectiveFrame;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addEffectiveFrameItem(String effectiveFrameItem) {
    if (this.effectiveFrame == null) {
      this.effectiveFrame = new ArrayList<>();
    }
    this.effectiveFrame.add(effectiveFrameItem);
    return this;
  }

   /**
   * 视频有效播放监测链接
   * @return effectiveFrame
  **/
  @javax.annotation.Nullable
  public List<String> getEffectiveFrame() {
    return effectiveFrame;
  }


  public void setEffectiveFrame(List<String> effectiveFrame) {
    this.effectiveFrame = effectiveFrame;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo firstFrame(List<String> firstFrame) {
    
    this.firstFrame = firstFrame;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addFirstFrameItem(String firstFrameItem) {
    if (this.firstFrame == null) {
      this.firstFrame = new ArrayList<>();
    }
    this.firstFrame.add(firstFrameItem);
    return this;
  }

   /**
   * 视频开始播放监测链接
   * @return firstFrame
  **/
  @javax.annotation.Nullable
  public List<String> getFirstFrame() {
    return firstFrame;
  }


  public void setFirstFrame(List<String> firstFrame) {
    this.firstFrame = firstFrame;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo interactTrackUrl(List<String> interactTrackUrl) {
    
    this.interactTrackUrl = interactTrackUrl;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addInteractTrackUrlItem(String interactTrackUrlItem) {
    if (this.interactTrackUrl == null) {
      this.interactTrackUrl = new ArrayList<>();
    }
    this.interactTrackUrl.add(interactTrackUrlItem);
    return this;
  }

   /**
   * 互动监控链接监测链接
   * @return interactTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getInteractTrackUrl() {
    return interactTrackUrl;
  }


  public void setInteractTrackUrl(List<String> interactTrackUrl) {
    this.interactTrackUrl = interactTrackUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo lastFrame(List<String> lastFrame) {
    
    this.lastFrame = lastFrame;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addLastFrameItem(String lastFrameItem) {
    if (this.lastFrame == null) {
      this.lastFrame = new ArrayList<>();
    }
    this.lastFrame.add(lastFrameItem);
    return this;
  }

   /**
   * 视频播放完成监测链接
   * @return lastFrame
  **/
  @javax.annotation.Nullable
  public List<String> getLastFrame() {
    return lastFrame;
  }


  public void setLastFrame(List<String> lastFrame) {
    this.lastFrame = lastFrame;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo likeCancelTrackUrl(List<String> likeCancelTrackUrl) {
    
    this.likeCancelTrackUrl = likeCancelTrackUrl;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addLikeCancelTrackUrlItem(String likeCancelTrackUrlItem) {
    if (this.likeCancelTrackUrl == null) {
      this.likeCancelTrackUrl = new ArrayList<>();
    }
    this.likeCancelTrackUrl.add(likeCancelTrackUrlItem);
    return this;
  }

   /**
   * 点赞取消监测链接
   * @return likeCancelTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getLikeCancelTrackUrl() {
    return likeCancelTrackUrl;
  }


  public void setLikeCancelTrackUrl(List<String> likeCancelTrackUrl) {
    this.likeCancelTrackUrl = likeCancelTrackUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo likeTrackUrl(List<String> likeTrackUrl) {
    
    this.likeTrackUrl = likeTrackUrl;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addLikeTrackUrlItem(String likeTrackUrlItem) {
    if (this.likeTrackUrl == null) {
      this.likeTrackUrl = new ArrayList<>();
    }
    this.likeTrackUrl.add(likeTrackUrlItem);
    return this;
  }

   /**
   * 点赞监测链接
   * @return likeTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getLikeTrackUrl() {
    return likeTrackUrl;
  }


  public void setLikeTrackUrl(List<String> likeTrackUrl) {
    this.likeTrackUrl = likeTrackUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo manualFrame(List<String> manualFrame) {
    
    this.manualFrame = manualFrame;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addManualFrameItem(String manualFrameItem) {
    if (this.manualFrame == null) {
      this.manualFrame = new ArrayList<>();
    }
    this.manualFrame.add(manualFrameItem);
    return this;
  }

   /**
   * 视频主动播放监测链接
   * @return manualFrame
  **/
  @javax.annotation.Nullable
  public List<String> getManualFrame() {
    return manualFrame;
  }


  public void setManualFrame(List<String> manualFrame) {
    this.manualFrame = manualFrame;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo shareTrackUrl(List<String> shareTrackUrl) {
    
    this.shareTrackUrl = shareTrackUrl;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addShareTrackUrlItem(String shareTrackUrlItem) {
    if (this.shareTrackUrl == null) {
      this.shareTrackUrl = new ArrayList<>();
    }
    this.shareTrackUrl.add(shareTrackUrlItem);
    return this;
  }

   /**
   * 分享监测链接
   * @return shareTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getShareTrackUrl() {
    return shareTrackUrl;
  }


  public void setShareTrackUrl(List<String> shareTrackUrl) {
    this.shareTrackUrl = shareTrackUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo trackUrl(List<String> trackUrl) {
    
    this.trackUrl = trackUrl;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo addTrackUrlItem(String trackUrlItem) {
    if (this.trackUrl == null) {
      this.trackUrl = new ArrayList<>();
    }
    this.trackUrl.add(trackUrlItem);
    return this;
  }

   /**
   * 展示监测链接
   * @return trackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getTrackUrl() {
    return trackUrl;
  }


  public void setTrackUrl(List<String> trackUrl) {
    this.trackUrl = trackUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo trackUrlSendType(BrandMaterialListV30DataMaterialsTrackUrlInfoTrackUrlSendType trackUrlSendType) {
    
    this.trackUrlSendType = trackUrlSendType;
    return this;
  }

   /**
   * Get trackUrlSendType
   * @return trackUrlSendType
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30DataMaterialsTrackUrlInfoTrackUrlSendType getTrackUrlSendType() {
    return trackUrlSendType;
  }


  public void setTrackUrlSendType(BrandMaterialListV30DataMaterialsTrackUrlInfoTrackUrlSendType trackUrlSendType) {
    this.trackUrlSendType = trackUrlSendType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo = (BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo) o;
    return Objects.equals(this.actionTrackUrl, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.actionTrackUrl) &&
        Objects.equals(this.cardShowTrackUrl, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.cardShowTrackUrl) &&
        Objects.equals(this.commentTrackUrl, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.commentTrackUrl) &&
        Objects.equals(this.contextTrackUrl, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.contextTrackUrl) &&
        Objects.equals(this.effectiveFrame, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.effectiveFrame) &&
        Objects.equals(this.firstFrame, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.firstFrame) &&
        Objects.equals(this.interactTrackUrl, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.interactTrackUrl) &&
        Objects.equals(this.lastFrame, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.lastFrame) &&
        Objects.equals(this.likeCancelTrackUrl, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.likeCancelTrackUrl) &&
        Objects.equals(this.likeTrackUrl, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.likeTrackUrl) &&
        Objects.equals(this.manualFrame, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.manualFrame) &&
        Objects.equals(this.shareTrackUrl, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.shareTrackUrl) &&
        Objects.equals(this.trackUrl, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.trackUrl) &&
        Objects.equals(this.trackUrlSendType, brandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.trackUrlSendType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTrackUrl, cardShowTrackUrl, commentTrackUrl, contextTrackUrl, effectiveFrame, firstFrame, interactTrackUrl, lastFrame, likeCancelTrackUrl, likeTrackUrl, manualFrame, shareTrackUrl, trackUrl, trackUrlSendType);
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
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo {\n");
    sb.append("    actionTrackUrl: ").append(toIndentedString(actionTrackUrl)).append("\n");
    sb.append("    cardShowTrackUrl: ").append(toIndentedString(cardShowTrackUrl)).append("\n");
    sb.append("    commentTrackUrl: ").append(toIndentedString(commentTrackUrl)).append("\n");
    sb.append("    contextTrackUrl: ").append(toIndentedString(contextTrackUrl)).append("\n");
    sb.append("    effectiveFrame: ").append(toIndentedString(effectiveFrame)).append("\n");
    sb.append("    firstFrame: ").append(toIndentedString(firstFrame)).append("\n");
    sb.append("    interactTrackUrl: ").append(toIndentedString(interactTrackUrl)).append("\n");
    sb.append("    lastFrame: ").append(toIndentedString(lastFrame)).append("\n");
    sb.append("    likeCancelTrackUrl: ").append(toIndentedString(likeCancelTrackUrl)).append("\n");
    sb.append("    likeTrackUrl: ").append(toIndentedString(likeTrackUrl)).append("\n");
    sb.append("    manualFrame: ").append(toIndentedString(manualFrame)).append("\n");
    sb.append("    shareTrackUrl: ").append(toIndentedString(shareTrackUrl)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
    sb.append("    trackUrlSendType: ").append(toIndentedString(trackUrlSendType)).append("\n");
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
    openapiFields.add("action_track_url");
    openapiFields.add("card_show_track_url");
    openapiFields.add("comment_track_url");
    openapiFields.add("context_track_url");
    openapiFields.add("effective_frame");
    openapiFields.add("first_frame");
    openapiFields.add("interact_track_url");
    openapiFields.add("last_frame");
    openapiFields.add("like_cancel_track_url");
    openapiFields.add("like_track_url");
    openapiFields.add("manual_frame");
    openapiFields.add("share_track_url");
    openapiFields.add("track_url");
    openapiFields.add("track_url_send_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo
  */
  public static BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInnerTrackUrlInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

