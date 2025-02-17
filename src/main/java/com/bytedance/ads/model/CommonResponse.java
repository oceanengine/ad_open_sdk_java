/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import com.bytedance.ads.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class CommonResponse {
    public static final String SERIALIZED_NAME_CODE = "code";
    @SerializedName(SERIALIZED_NAME_CODE)
    private Long code;

    public static final String SERIALIZED_NAME_DATA = "data";
    @SerializedName(SERIALIZED_NAME_DATA)
    private Map<String, Object> data;

    public static final String SERIALIZED_NAME_MESSAGE = "message";
    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
    @SerializedName(SERIALIZED_NAME_REQUEST_ID)
    private String requestId;

    public CommonResponse() {
    }

    public CommonResponse code(Long code) {

        this.code = code;
        return this;
    }

    /**
     *
     * @return code
     **/
    @javax.annotation.Nullable
    public Long getCode() {
        return code;
    }


    public void setCode(Long code) {
        this.code = code;
    }


    public CommonResponse data(Map<String, Object> data) {

        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     **/
    @javax.annotation.Nullable
    public Map<String, Object> getData() {
        return data;
    }


    public void setData(Map<String, Object> data) {
        this.data = data;
    }


    public CommonResponse message(String message) {

        this.message = message;
        return this;
    }

    /**
     *
     * @return message
     **/
    @javax.annotation.Nullable
    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public CommonResponse requestId(String requestId) {

        this.requestId = requestId;
        return this;
    }

    /**
     *
     * @return requestId
     **/
    @javax.annotation.Nullable
    public String getRequestId() {
        return requestId;
    }


    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonResponse commonResponse = (CommonResponse) o;
        return Objects.equals(this.code, commonResponse.code) &&
                Objects.equals(this.data, commonResponse.data) &&
                Objects.equals(this.message, commonResponse.message) &&
                Objects.equals(this.requestId, commonResponse.requestId);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, data, message, requestId);
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
        sb.append("class CommonResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
        openapiFields.add("code");
        openapiFields.add("data");
        openapiFields.add("message");
        openapiFields.add("request_id");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }


    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CommonResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreativeStrategyListV2Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CommonResponse> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(CommonResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<CommonResponse>() {
                @Override
                public void write(JsonWriter out, CommonResponse value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public CommonResponse read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of CommonResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreativeStrategyListV2Response
     * @throws IOException if the JSON string is invalid with respect to CreativeStrategyListV2Response
     */
    public static CommonResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CommonResponse.class);
    }

    /**
     * Convert an instance of CreativeStrategyListV2Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}