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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeCardPromotionCardActionButton.Adapter.class)
public enum QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeCardPromotionCardActionButton {
  
  Enum_专属优惠("专属优惠"),
  
  Enum_了解更多("了解更多"),
  
  Enum_去逛逛("去逛逛"),
  
  Enum_更多秒杀("更多秒杀"),
  
  Enum_更多精彩("更多精彩"),
  
  Enum_查看详情("查看详情"),
  
  Enum_立即抢购("立即抢购"),
  
  Enum_领取福利("领取福利");

  private String value;

  QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeCardPromotionCardActionButton(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeCardPromotionCardActionButton fromValue(String value) {
    for (QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeCardPromotionCardActionButton b : QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeCardPromotionCardActionButton.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeCardPromotionCardActionButton> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeCardPromotionCardActionButton enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeCardPromotionCardActionButton read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeCardPromotionCardActionButton.fromValue(value);
    }
  }
}

