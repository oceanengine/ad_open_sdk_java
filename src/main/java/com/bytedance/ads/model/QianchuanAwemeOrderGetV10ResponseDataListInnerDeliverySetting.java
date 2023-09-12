/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10DataListDeliverySettingExternalAction;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode;
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
 * 投放设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-12T21:46:42.940450772+08:00[Asia/Shanghai]")
public class QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting {
  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private QianchuanAwemeOrderGetV10DataListDeliverySettingExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_LIVEROOM_HEAT_MODE = "liveroom_heat_mode";
  @SerializedName(SERIALIZED_NAME_LIVEROOM_HEAT_MODE)
  private QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode liveroomHeatMode = null;

  public QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting() {
  }

  public QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting externalAction(QianchuanAwemeOrderGetV10DataListDeliverySettingExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderGetV10DataListDeliverySettingExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(QianchuanAwemeOrderGetV10DataListDeliverySettingExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting liveroomHeatMode(QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode liveroomHeatMode) {
    
    this.liveroomHeatMode = liveroomHeatMode;
    return this;
  }

   /**
   * Get liveroomHeatMode
   * @return liveroomHeatMode
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode getLiveroomHeatMode() {
    return liveroomHeatMode;
  }


  public void setLiveroomHeatMode(QianchuanAwemeOrderGetV10DataListDeliverySettingLiveroomHeatMode liveroomHeatMode) {
    this.liveroomHeatMode = liveroomHeatMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting qianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting = (QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting) o;
    return Objects.equals(this.externalAction, qianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting.externalAction) &&
        Objects.equals(this.liveroomHeatMode, qianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting.liveroomHeatMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalAction, liveroomHeatMode);
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
    sb.append("class QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting {\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    liveroomHeatMode: ").append(toIndentedString(liveroomHeatMode)).append("\n");
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
    openapiFields.add("external_action");
    openapiFields.add("liveroom_heat_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting
  */
  public static QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

