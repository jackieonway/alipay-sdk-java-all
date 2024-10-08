/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-10-08
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.UserAssetInfoVO;
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
 * JointAccountBillDetailDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JointAccountBillDetailDTO {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BILL_NO = "bill_no";
  @SerializedName(SERIALIZED_NAME_BILL_NO)
  private String billNo;

  public static final String SERIALIZED_NAME_BIZ_DATE = "biz_date";
  @SerializedName(SERIALIZED_NAME_BIZ_DATE)
  private String bizDate;

  public static final String SERIALIZED_NAME_BIZ_NO = "biz_no";
  @SerializedName(SERIALIZED_NAME_BIZ_NO)
  private String bizNo;

  public static final String SERIALIZED_NAME_IN_OUT = "in_out";
  @SerializedName(SERIALIZED_NAME_IN_OUT)
  private String inOut;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_PAYER_ASSET_INFO = "payer_asset_info";
  @SerializedName(SERIALIZED_NAME_PAYER_ASSET_INFO)
  private UserAssetInfoVO payerAssetInfo;

  public static final String SERIALIZED_NAME_SELLER_FULL_NAME = "seller_full_name";
  @SerializedName(SERIALIZED_NAME_SELLER_FULL_NAME)
  private String sellerFullName;

  public static final String SERIALIZED_NAME_SELLER_LOGON_ID = "seller_logon_id";
  @SerializedName(SERIALIZED_NAME_SELLER_LOGON_ID)
  private String sellerLogonId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public JointAccountBillDetailDTO() { 
  }

  public JointAccountBillDetailDTO accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088900976746215", value = "共同账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public JointAccountBillDetailDTO amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 消费金额
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "消费金额")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public JointAccountBillDetailDTO billNo(String billNo) {
    
    this.billNo = billNo;
    return this;
  }

   /**
   * 账单业务号
   * @return billNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022051204200202001000473989_2022051230000200020601732777", value = "账单业务号")

  public String getBillNo() {
    return billNo;
  }


  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }


  public JointAccountBillDetailDTO bizDate(String bizDate) {
    
    this.bizDate = bizDate;
    return this;
  }

   /**
   * 业务时间
   * @return bizDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01 00:00", value = "业务时间")

  public String getBizDate() {
    return bizDate;
  }


  public void setBizDate(String bizDate) {
    this.bizDate = bizDate;
  }


  public JointAccountBillDetailDTO bizNo(String bizNo) {
    
    this.bizNo = bizNo;
    return this;
  }

   /**
   * 订单号
   * @return bizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020102604200204001063507418", value = "订单号")

  public String getBizNo() {
    return bizNo;
  }


  public void setBizNo(String bizNo) {
    this.bizNo = bizNo;
  }


  public JointAccountBillDetailDTO inOut(String inOut) {
    
    this.inOut = inOut;
    return this;
  }

   /**
   * 1-退款，2-支付
   * @return inOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "1-退款，2-支付")

  public String getInOut() {
    return inOut;
  }


  public void setInOut(String inOut) {
    this.inOut = inOut;
  }


  public JointAccountBillDetailDTO openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 共同账户消费的成员openid
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "共同账户消费的成员openid")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public JointAccountBillDetailDTO outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * 外部交易单号，正向支付为外部交易单号，逆向退款是为外部退款单号
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Q1312312312313", value = "外部交易单号，正向支付为外部交易单号，逆向退款是为外部退款单号")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public JointAccountBillDetailDTO payerAssetInfo(UserAssetInfoVO payerAssetInfo) {
    
    this.payerAssetInfo = payerAssetInfo;
    return this;
  }

   /**
   * Get payerAssetInfo
   * @return payerAssetInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserAssetInfoVO getPayerAssetInfo() {
    return payerAssetInfo;
  }


  public void setPayerAssetInfo(UserAssetInfoVO payerAssetInfo) {
    this.payerAssetInfo = payerAssetInfo;
  }


  public JointAccountBillDetailDTO sellerFullName(String sellerFullName) {
    
    this.sellerFullName = sellerFullName;
    return this;
  }

   /**
   * 间连商户显示二级商户全名，直连、直付通则显示一级商户全名。企业商户该字段不脱敏，非企业商户该字段会脱敏
   * @return sellerFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "信息有限公司", value = "间连商户显示二级商户全名，直连、直付通则显示一级商户全名。企业商户该字段不脱敏，非企业商户该字段会脱敏")

  public String getSellerFullName() {
    return sellerFullName;
  }


  public void setSellerFullName(String sellerFullName) {
    this.sellerFullName = sellerFullName;
  }


  public JointAccountBillDetailDTO sellerLogonId(String sellerLogonId) {
    
    this.sellerLogonId = sellerLogonId;
    return this;
  }

   /**
   * 收款方登录号信息。间连商户显示二级商户的登录号信息；直连、直付通显示一级商户的登录号信息；该字段脱敏
   * @return sellerLogonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19927441769", value = "收款方登录号信息。间连商户显示二级商户的登录号信息；直连、直付通显示一级商户的登录号信息；该字段脱敏")

  public String getSellerLogonId() {
    return sellerLogonId;
  }


  public void setSellerLogonId(String sellerLogonId) {
    this.sellerLogonId = sellerLogonId;
  }


  public JointAccountBillDetailDTO title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 账单标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "新电途(银通新能源:325616137201026100441546497", value = "账单标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public JointAccountBillDetailDTO userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 共同账户消费的成员ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088900970000001", value = "共同账户消费的成员ID")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the JointAccountBillDetailDTO instance itself
   */
  public JointAccountBillDetailDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JointAccountBillDetailDTO jointAccountBillDetailDTO = (JointAccountBillDetailDTO) o;
    return Objects.equals(this.accountId, jointAccountBillDetailDTO.accountId) &&
        Objects.equals(this.amount, jointAccountBillDetailDTO.amount) &&
        Objects.equals(this.billNo, jointAccountBillDetailDTO.billNo) &&
        Objects.equals(this.bizDate, jointAccountBillDetailDTO.bizDate) &&
        Objects.equals(this.bizNo, jointAccountBillDetailDTO.bizNo) &&
        Objects.equals(this.inOut, jointAccountBillDetailDTO.inOut) &&
        Objects.equals(this.openId, jointAccountBillDetailDTO.openId) &&
        Objects.equals(this.outTradeNo, jointAccountBillDetailDTO.outTradeNo) &&
        Objects.equals(this.payerAssetInfo, jointAccountBillDetailDTO.payerAssetInfo) &&
        Objects.equals(this.sellerFullName, jointAccountBillDetailDTO.sellerFullName) &&
        Objects.equals(this.sellerLogonId, jointAccountBillDetailDTO.sellerLogonId) &&
        Objects.equals(this.title, jointAccountBillDetailDTO.title) &&
        Objects.equals(this.userId, jointAccountBillDetailDTO.userId)&&
        Objects.equals(this.additionalProperties, jointAccountBillDetailDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, amount, billNo, bizDate, bizNo, inOut, openId, outTradeNo, payerAssetInfo, sellerFullName, sellerLogonId, title, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JointAccountBillDetailDTO {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    bizDate: ").append(toIndentedString(bizDate)).append("\n");
    sb.append("    bizNo: ").append(toIndentedString(bizNo)).append("\n");
    sb.append("    inOut: ").append(toIndentedString(inOut)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    payerAssetInfo: ").append(toIndentedString(payerAssetInfo)).append("\n");
    sb.append("    sellerFullName: ").append(toIndentedString(sellerFullName)).append("\n");
    sb.append("    sellerLogonId: ").append(toIndentedString(sellerLogonId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("bill_no");
    openapiFields.add("biz_date");
    openapiFields.add("biz_no");
    openapiFields.add("in_out");
    openapiFields.add("open_id");
    openapiFields.add("out_trade_no");
    openapiFields.add("payer_asset_info");
    openapiFields.add("seller_full_name");
    openapiFields.add("seller_logon_id");
    openapiFields.add("title");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JointAccountBillDetailDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JointAccountBillDetailDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JointAccountBillDetailDTO is not found in the empty JSON string", JointAccountBillDetailDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("bill_no") != null && !jsonObj.get("bill_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_no").toString()));
      }
      if (jsonObj.get("biz_date") != null && !jsonObj.get("biz_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_date").toString()));
      }
      if (jsonObj.get("biz_no") != null && !jsonObj.get("biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_no").toString()));
      }
      if (jsonObj.get("in_out") != null && !jsonObj.get("in_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in_out").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      // validate the optional field `payer_asset_info`
      if (jsonObj.getAsJsonObject("payer_asset_info") != null) {
        UserAssetInfoVO.validateJsonObject(jsonObj.getAsJsonObject("payer_asset_info"));
      }
      if (jsonObj.get("seller_full_name") != null && !jsonObj.get("seller_full_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_full_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_full_name").toString()));
      }
      if (jsonObj.get("seller_logon_id") != null && !jsonObj.get("seller_logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_logon_id").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JointAccountBillDetailDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JointAccountBillDetailDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JointAccountBillDetailDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JointAccountBillDetailDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<JointAccountBillDetailDTO>() {
           @Override
           public void write(JsonWriter out, JointAccountBillDetailDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public JointAccountBillDetailDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JointAccountBillDetailDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JointAccountBillDetailDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JointAccountBillDetailDTO
  * @throws IOException if the JSON string is invalid with respect to JointAccountBillDetailDTO
  */
  public static JointAccountBillDetailDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JointAccountBillDetailDTO.class);
  }

 /**
  * Convert an instance of JointAccountBillDetailDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

