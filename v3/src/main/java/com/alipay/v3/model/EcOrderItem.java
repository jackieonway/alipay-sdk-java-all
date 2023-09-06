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
 * EcOrderItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EcOrderItem {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_BIZ_OUT_NO = "biz_out_no";
  @SerializedName(SERIALIZED_NAME_BIZ_OUT_NO)
  private String bizOutNo;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_ORDER_CONTENT = "order_content";
  @SerializedName(SERIALIZED_NAME_ORDER_CONTENT)
  private String orderContent;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "order_type";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private String orderType;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_PAY_NO = "pay_no";
  @SerializedName(SERIALIZED_NAME_PAY_NO)
  private String payNo;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public EcOrderItem() { 
  }

  public EcOrderItem accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "共同账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public EcOrderItem bizOutNo(String bizOutNo) {
    
    this.bizOutNo = bizOutNo;
    return this;
  }

   /**
   * 外部业务号
   * @return bizOutNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外部业务号")

  public String getBizOutNo() {
    return bizOutNo;
  }


  public void setBizOutNo(String bizOutNo) {
    this.bizOutNo = bizOutNo;
  }


  public EcOrderItem employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 员工ID
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "员工ID")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public EcOrderItem enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "企业ID")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public EcOrderItem gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public EcOrderItem gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 修改时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "修改时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public EcOrderItem openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户支付宝UID
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户支付宝UID")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public EcOrderItem orderContent(String orderContent) {
    
    this.orderContent = orderContent;
    return this;
  }

   /**
   * 订单内容，JSON格式。
   * @return orderContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "订单内容，JSON格式。")

  public String getOrderContent() {
    return orderContent;
  }


  public void setOrderContent(String orderContent) {
    this.orderContent = orderContent;
  }


  public EcOrderItem orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "订单ID")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public EcOrderItem orderType(String orderType) {
    
    this.orderType = orderType;
    return this;
  }

   /**
   * 订单类型 METRO：地铁 TAKEAWAY：外卖 OTHER：其他
   * @return orderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "订单类型 METRO：地铁 TAKEAWAY：外卖 OTHER：其他")

  public String getOrderType() {
    return orderType;
  }


  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }


  public EcOrderItem partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 合作伙伴ID
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "合作伙伴ID")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public EcOrderItem payNo(String payNo) {
    
    this.payNo = payNo;
    return this;
  }

   /**
   * 关联支付宝交易号
   * @return payNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关联支付宝交易号")

  public String getPayNo() {
    return payNo;
  }


  public void setPayNo(String payNo) {
    this.payNo = payNo;
  }


  public EcOrderItem userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户支付宝UID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户支付宝UID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcOrderItem ecOrderItem = (EcOrderItem) o;
    return Objects.equals(this.accountId, ecOrderItem.accountId) &&
        Objects.equals(this.bizOutNo, ecOrderItem.bizOutNo) &&
        Objects.equals(this.employeeId, ecOrderItem.employeeId) &&
        Objects.equals(this.enterpriseId, ecOrderItem.enterpriseId) &&
        Objects.equals(this.gmtCreate, ecOrderItem.gmtCreate) &&
        Objects.equals(this.gmtModified, ecOrderItem.gmtModified) &&
        Objects.equals(this.openId, ecOrderItem.openId) &&
        Objects.equals(this.orderContent, ecOrderItem.orderContent) &&
        Objects.equals(this.orderId, ecOrderItem.orderId) &&
        Objects.equals(this.orderType, ecOrderItem.orderType) &&
        Objects.equals(this.partnerId, ecOrderItem.partnerId) &&
        Objects.equals(this.payNo, ecOrderItem.payNo) &&
        Objects.equals(this.userId, ecOrderItem.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bizOutNo, employeeId, enterpriseId, gmtCreate, gmtModified, openId, orderContent, orderId, orderType, partnerId, payNo, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcOrderItem {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bizOutNo: ").append(toIndentedString(bizOutNo)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    orderContent: ").append(toIndentedString(orderContent)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    payNo: ").append(toIndentedString(payNo)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("biz_out_no");
    openapiFields.add("employee_id");
    openapiFields.add("enterprise_id");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("open_id");
    openapiFields.add("order_content");
    openapiFields.add("order_id");
    openapiFields.add("order_type");
    openapiFields.add("partner_id");
    openapiFields.add("pay_no");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EcOrderItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EcOrderItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EcOrderItem is not found in the empty JSON string", EcOrderItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EcOrderItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EcOrderItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("biz_out_no") != null && !jsonObj.get("biz_out_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_out_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_out_no").toString()));
      }
      if (jsonObj.get("employee_id") != null && !jsonObj.get("employee_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employee_id").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("order_content") != null && !jsonObj.get("order_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_content").toString()));
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("order_type") != null && !jsonObj.get("order_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_type").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("pay_no") != null && !jsonObj.get("pay_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_no").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EcOrderItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EcOrderItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EcOrderItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EcOrderItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EcOrderItem>() {
           @Override
           public void write(JsonWriter out, EcOrderItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EcOrderItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EcOrderItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EcOrderItem
  * @throws IOException if the JSON string is invalid with respect to EcOrderItem
  */
  public static EcOrderItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EcOrderItem.class);
  }

 /**
  * Convert an instance of EcOrderItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

