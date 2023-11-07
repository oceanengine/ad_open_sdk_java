/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
@JsonAdapter(ToolsOrangeSiteGetV30DataListSiteType.Adapter.class)
public enum ToolsOrangeSiteGetV30DataListSiteType {
  
  ADL_AB_TEST("ADL_AB_TEST"),
  
  ADL_BIZ("ADL_BIZ"),
  
  ADL_DCAR("ADL_DCAR"),
  
  ADL_EDU("ADL_EDU"),
  
  ADL_FORM_GROUP("ADL_FORM_GROUP"),
  
  ADL_GAME("ADL_GAME"),
  
  ADL_HOME("ADL_HOME"),
  
  ADL_LIFE("ADL_LIFE"),
  
  ADL_NOVEL("ADL_NOVEL"),
  
  AD_APP("AD_APP"),
  
  AUTOGEN_CAR("AUTOGEN_CAR"),
  
  AUTOGEN_GAME("AUTOGEN_GAME"),
  
  AUTOGEN_NOVEL("AUTOGEN_NOVEL"),
  
  BUSINESS_FORM_COMMENT("BUSINESS_FORM_COMMENT"),
  
  BUSINESS_FORM_INTERACTIVE("BUSINESS_FORM_INTERACTIVE"),
  
  BUSINESS_FORM_SEARCH("BUSINESS_FORM_SEARCH"),
  
  BUSINESS_FORM_V4("BUSINESS_FORM_V4"),
  
  CONSULT_PAGE("CONSULT_PAGE"),
  
  CREATIVE_COMP("CREATIVE_COMP"),
  
  CREATIVE_FORM("CREATIVE_FORM"),
  
  CREATIVE_FORM_OLD("CREATIVE_FORM_OLD"),
  
  DPA("DPA"),
  
  ECOMMERCEPAGE("ECOMMERCEPAGE"),
  
  ENTERPRISE("ENTERPRISE"),
  
  ENTERPRISE_CLOUD_CAR_SHOP("ENTERPRISE_CLOUD_CAR_SHOP"),
  
  ENTERPRISE_CLUE("ENTERPRISE_CLUE"),
  
  ENTERPRISE_CONTACT("ENTERPRISE_CONTACT"),
  
  ENTERPRISE_GROUP_BUY("ENTERPRISE_GROUP_BUY"),
  
  ENTERPRISE_HOMEPAGE("ENTERPRISE_HOMEPAGE"),
  
  ENTERPRISE_RESERVE("ENTERPRISE_RESERVE"),
  
  ENTERPRISE_TOOLS("ENTERPRISE_TOOLS"),
  
  FORM("FORM"),
  
  HEALTH("HEALTH"),
  
  INNER_EXP("INNER_EXP"),
  
  LOCAL_INDUSTRY("LOCAL_INDUSTRY"),
  
  MICRO_APP("MICRO_APP"),
  
  MICRO_APP_SHELL("MICRO_APP_SHELL"),
  
  MICRO_GAME("MICRO_GAME"),
  
  MINIAPP("MINIAPP"),
  
  MULTI_GOODS("MULTI_GOODS"),
  
  NATIVE("NATIVE"),
  
  NATIVE_FORM("NATIVE_FORM"),
  
  NO_PUBLISH_SITE("NO_PUBLISH_SITE"),
  
  OCEAN_ENGINE_APP("OCEAN_ENGINE_APP"),
  
  POLL("POLL"),
  
  PRIVACY_POLICY("PRIVACY_POLICY"),
  
  PROGRAM("PROGRAM"),
  
  SELF("SELF"),
  
  SELF_CREATIVE("SELF_CREATIVE"),
  
  SLIDE("SLIDE"),
  
  STAR("STAR"),
  
  STAR_API("STAR_API"),
  
  STORE_SITE("STORE_SITE"),
  
  STREAMING("STREAMING"),
  
  STRUCTURED_LANDING_PAGE("STRUCTURED_LANDING_PAGE"),
  
  SUBCHAIN("SUBCHAIN"),
  
  THIRD_EXP("THIRD_EXP"),
  
  THIRD_SITE("THIRD_SITE"),
  
  ULTRA("ULTRA"),
  
  UNIVERSAL("UNIVERSAL"),
  
  WECHAT_APPLET("WECHAT_APPLET"),
  
  WECHAT_GAME("WECHAT_GAME");

  private String value;

  ToolsOrangeSiteGetV30DataListSiteType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsOrangeSiteGetV30DataListSiteType fromValue(String value) {
    for (ToolsOrangeSiteGetV30DataListSiteType b : ToolsOrangeSiteGetV30DataListSiteType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsOrangeSiteGetV30DataListSiteType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsOrangeSiteGetV30DataListSiteType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsOrangeSiteGetV30DataListSiteType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsOrangeSiteGetV30DataListSiteType.fromValue(value);
    }
  }
}

