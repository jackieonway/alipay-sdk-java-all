/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-09-06
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.PointCard;
import com.alipay.v3.model.SendRule;
import com.alipay.v3.model.Voucher;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * PromoTool
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PromoTool {
  public static final String SERIALIZED_NAME_POINT_CARD = "point_card";
  @SerializedName(SERIALIZED_NAME_POINT_CARD)
  private PointCard pointCard;

  public static final String SERIALIZED_NAME_SEND_RULE = "send_rule";
  @SerializedName(SERIALIZED_NAME_SEND_RULE)
  private SendRule sendRule;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private Voucher voucher;

  public static final String SERIALIZED_NAME_VOUCHER_NO = "voucher_no";
  @SerializedName(SERIALIZED_NAME_VOUCHER_NO)
  private String voucherNo;

  public PromoTool() { 
  }

  public PromoTool pointCard(PointCard pointCard) {
    
    this.pointCard = pointCard;
    return this;
  }

   /**
   * Get pointCard
   * @return pointCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PointCard getPointCard() {
    return pointCard;
  }


  public void setPointCard(PointCard pointCard) {
    this.pointCard = pointCard;
  }


  public PromoTool sendRule(SendRule sendRule) {
    
    this.sendRule = sendRule;
    return this;
  }

   /**
   * Get sendRule
   * @return sendRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendRule getSendRule() {
    return sendRule;
  }


  public void setSendRule(SendRule sendRule) {
    this.sendRule = sendRule;
  }


  public PromoTool status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 单个营销工具的生效状态，当在招商部分券失效后会使用这个字段
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STARTED", value = "单个营销工具的生效状态，当在招商部分券失效后会使用这个字段")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public PromoTool voucher(Voucher voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Voucher getVoucher() {
    return voucher;
  }


  public void setVoucher(Voucher voucher) {
    this.voucher = voucher;
  }


  public PromoTool voucherNo(String voucherNo) {
    
    this.voucherNo = voucherNo;
    return this;
  }

   /**
   * 营销工具uid,创建营销活动时无需设置
   * @return voucherNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2342343245234234", value = "营销工具uid,创建营销活动时无需设置")

  public String getVoucherNo() {
    return voucherNo;
  }


  public void setVoucherNo(String voucherNo) {
    this.voucherNo = voucherNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoTool promoTool = (PromoTool) o;
    return Objects.equals(this.pointCard, promoTool.pointCard) &&
        Objects.equals(this.sendRule, promoTool.sendRule) &&
        Objects.equals(this.status, promoTool.status) &&
        Objects.equals(this.voucher, promoTool.voucher) &&
        Objects.equals(this.voucherNo, promoTool.voucherNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointCard, sendRule, status, voucher, voucherNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoTool {\n");
    sb.append("    pointCard: ").append(toIndentedString(pointCard)).append("\n");
    sb.append("    sendRule: ").append(toIndentedString(sendRule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    voucherNo: ").append(toIndentedString(voucherNo)).append("\n");
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
    openapiFields.add("point_card");
    openapiFields.add("send_rule");
    openapiFields.add("status");
    openapiFields.add("voucher");
    openapiFields.add("voucher_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PromoTool
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PromoTool.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromoTool is not found in the empty JSON string", PromoTool.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PromoTool.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PromoTool` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `point_card`
      if (jsonObj.getAsJsonObject("point_card") != null) {
        PointCard.validateJsonObject(jsonObj.getAsJsonObject("point_card"));
      }
      // validate the optional field `send_rule`
      if (jsonObj.getAsJsonObject("send_rule") != null) {
        SendRule.validateJsonObject(jsonObj.getAsJsonObject("send_rule"));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `voucher`
      if (jsonObj.getAsJsonObject("voucher") != null) {
        Voucher.validateJsonObject(jsonObj.getAsJsonObject("voucher"));
      }
      if (jsonObj.get("voucher_no") != null && !jsonObj.get("voucher_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromoTool.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromoTool' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromoTool> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromoTool.class));

       return (TypeAdapter<T>) new TypeAdapter<PromoTool>() {
           @Override
           public void write(JsonWriter out, PromoTool value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromoTool read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromoTool given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromoTool
  * @throws IOException if the JSON string is invalid with respect to PromoTool
  */
  public static PromoTool fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromoTool.class);
  }

 /**
  * Convert an instance of PromoTool to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

