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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarReportOrderOverviewGetV2ResponseDataSpread {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private Long comment = null;

  public static final String SERIALIZED_NAME_LIKE = "like";
  @SerializedName(SERIALIZED_NAME_LIKE)
  private Long like = null;

  public static final String SERIALIZED_NAME_PLAY = "play";
  @SerializedName(SERIALIZED_NAME_PLAY)
  private Long play = null;

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private Long share = null;

  public StarReportOrderOverviewGetV2ResponseDataSpread() {
  }

  public StarReportOrderOverviewGetV2ResponseDataSpread comment(Long comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * 
   * @return comment
  **/
  @javax.annotation.Nullable
  public Long getComment() {
    return comment;
  }


  public void setComment(Long comment) {
    this.comment = comment;
  }


  public StarReportOrderOverviewGetV2ResponseDataSpread like(Long like) {
    
    this.like = like;
    return this;
  }

   /**
   * 
   * @return like
  **/
  @javax.annotation.Nullable
  public Long getLike() {
    return like;
  }


  public void setLike(Long like) {
    this.like = like;
  }


  public StarReportOrderOverviewGetV2ResponseDataSpread play(Long play) {
    
    this.play = play;
    return this;
  }

   /**
   * 
   * @return play
  **/
  @javax.annotation.Nullable
  public Long getPlay() {
    return play;
  }


  public void setPlay(Long play) {
    this.play = play;
  }


  public StarReportOrderOverviewGetV2ResponseDataSpread share(Long share) {
    
    this.share = share;
    return this;
  }

   /**
   * 
   * @return share
  **/
  @javax.annotation.Nullable
  public Long getShare() {
    return share;
  }


  public void setShare(Long share) {
    this.share = share;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewGetV2ResponseDataSpread starReportOrderOverviewGetV2ResponseDataSpread = (StarReportOrderOverviewGetV2ResponseDataSpread) o;
    return Objects.equals(this.comment, starReportOrderOverviewGetV2ResponseDataSpread.comment) &&
        Objects.equals(this.like, starReportOrderOverviewGetV2ResponseDataSpread.like) &&
        Objects.equals(this.play, starReportOrderOverviewGetV2ResponseDataSpread.play) &&
        Objects.equals(this.share, starReportOrderOverviewGetV2ResponseDataSpread.share);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, like, play, share);
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
    sb.append("class StarReportOrderOverviewGetV2ResponseDataSpread {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    like: ").append(toIndentedString(like)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("like");
    openapiFields.add("play");
    openapiFields.add("share");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewGetV2ResponseDataSpread.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewGetV2ResponseDataSpread' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewGetV2ResponseDataSpread> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewGetV2ResponseDataSpread.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewGetV2ResponseDataSpread>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewGetV2ResponseDataSpread value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewGetV2ResponseDataSpread read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewGetV2ResponseDataSpread given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewGetV2ResponseDataSpread
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewGetV2ResponseDataSpread
  */
  public static StarReportOrderOverviewGetV2ResponseDataSpread fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewGetV2ResponseDataSpread.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewGetV2ResponseDataSpread to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

