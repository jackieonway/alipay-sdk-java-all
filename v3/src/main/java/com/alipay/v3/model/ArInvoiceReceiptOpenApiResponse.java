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
import com.alipay.v3.model.MultiCurrencyMoneyOpenApi;
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
 * ArInvoiceReceiptOpenApiResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArInvoiceReceiptOpenApiResponse {
  public static final String SERIALIZED_NAME_ARRANGEMENT_NO = "arrangement_no";
  @SerializedName(SERIALIZED_NAME_ARRANGEMENT_NO)
  private String arrangementNo;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INST_ID = "inst_id";
  @SerializedName(SERIALIZED_NAME_INST_ID)
  private String instId;

  public static final String SERIALIZED_NAME_INV_DT = "inv_dt";
  @SerializedName(SERIALIZED_NAME_INV_DT)
  private String invDt;

  public static final String SERIALIZED_NAME_INV_MODE = "inv_mode";
  @SerializedName(SERIALIZED_NAME_INV_MODE)
  private String invMode;

  public static final String SERIALIZED_NAME_INVOICE_AMT = "invoice_amt";
  @SerializedName(SERIALIZED_NAME_INVOICE_AMT)
  private MultiCurrencyMoneyOpenApi invoiceAmt;

  public static final String SERIALIZED_NAME_INVOICED_AMT = "invoiced_amt";
  @SerializedName(SERIALIZED_NAME_INVOICED_AMT)
  private MultiCurrencyMoneyOpenApi invoicedAmt;

  public static final String SERIALIZED_NAME_IP_ID = "ip_id";
  @SerializedName(SERIALIZED_NAME_IP_ID)
  private String ipId;

  public static final String SERIALIZED_NAME_IP_ROLE_ID = "ip_role_id";
  @SerializedName(SERIALIZED_NAME_IP_ROLE_ID)
  private String ipRoleId;

  public static final String SERIALIZED_NAME_LAST_MODER = "last_moder";
  @SerializedName(SERIALIZED_NAME_LAST_MODER)
  private String lastModer;

  public static final String SERIALIZED_NAME_LINK_INVOICE_AMT = "link_invoice_amt";
  @SerializedName(SERIALIZED_NAME_LINK_INVOICE_AMT)
  private MultiCurrencyMoneyOpenApi linkInvoiceAmt;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_OUT_BIZ_TYPE = "out_biz_type";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_TYPE)
  private String outBizType;

  public static final String SERIALIZED_NAME_PAY_WAY = "pay_way";
  @SerializedName(SERIALIZED_NAME_PAY_WAY)
  private String payWay;

  public static final String SERIALIZED_NAME_PROD_CODE = "prod_code";
  @SerializedName(SERIALIZED_NAME_PROD_CODE)
  private String prodCode;

  public static final String SERIALIZED_NAME_SETTLE_TYPE = "settle_type";
  @SerializedName(SERIALIZED_NAME_SETTLE_TYPE)
  private String settleType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TAX_RATE = "tax_rate";
  @SerializedName(SERIALIZED_NAME_TAX_RATE)
  private Integer taxRate;

  public static final String SERIALIZED_NAME_TAX_TYPE = "tax_type";
  @SerializedName(SERIALIZED_NAME_TAX_TYPE)
  private String taxType;

  public static final String SERIALIZED_NAME_TNT_INST_ID = "tnt_inst_id";
  @SerializedName(SERIALIZED_NAME_TNT_INST_ID)
  private String tntInstId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ArInvoiceReceiptOpenApiResponse() { 
  }

  public ArInvoiceReceiptOpenApiResponse arrangementNo(String arrangementNo) {
    
    this.arrangementNo = arrangementNo;
    return this;
  }

   /**
   * 合约号
   * @return arrangementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20180410I1019001100551917674", value = "合约号")

  public String getArrangementNo() {
    return arrangementNo;
  }


  public void setArrangementNo(String arrangementNo) {
    this.arrangementNo = arrangementNo;
  }


  public ArInvoiceReceiptOpenApiResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 可开票单据主键ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016090310122000040400210000000001", value = "可开票单据主键ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ArInvoiceReceiptOpenApiResponse instId(String instId) {
    
    this.instId = instId;
    return this;
  }

   /**
   * 机构ID
   * @return instId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Z50", value = "机构ID")

  public String getInstId() {
    return instId;
  }


  public void setInstId(String instId) {
    this.instId = instId;
  }


  public ArInvoiceReceiptOpenApiResponse invDt(String invDt) {
    
    this.invDt = invDt;
    return this;
  }

   /**
   * 开票时间 格式：yyyymm
   * @return invDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201807", value = "开票时间 格式：yyyymm")

  public String getInvDt() {
    return invDt;
  }


  public void setInvDt(String invDt) {
    this.invDt = invDt;
  }


  public ArInvoiceReceiptOpenApiResponse invMode(String invMode) {
    
    this.invMode = invMode;
    return this;
  }

   /**
   * 开票模式  01：实收开票， 02：应收开票， 03：累计实收开票
   * @return invMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02", value = "开票模式  01：实收开票， 02：应收开票， 03：累计实收开票")

  public String getInvMode() {
    return invMode;
  }


  public void setInvMode(String invMode) {
    this.invMode = invMode;
  }


  public ArInvoiceReceiptOpenApiResponse invoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
    
    this.invoiceAmt = invoiceAmt;
    return this;
  }

   /**
   * Get invoiceAmt
   * @return invoiceAmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
    return invoiceAmt;
  }


  public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
    this.invoiceAmt = invoiceAmt;
  }


  public ArInvoiceReceiptOpenApiResponse invoicedAmt(MultiCurrencyMoneyOpenApi invoicedAmt) {
    
    this.invoicedAmt = invoicedAmt;
    return this;
  }

   /**
   * Get invoicedAmt
   * @return invoicedAmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiCurrencyMoneyOpenApi getInvoicedAmt() {
    return invoicedAmt;
  }


  public void setInvoicedAmt(MultiCurrencyMoneyOpenApi invoicedAmt) {
    this.invoicedAmt = invoicedAmt;
  }


  public ArInvoiceReceiptOpenApiResponse ipId(String ipId) {
    
    this.ipId = ipId;
    return this;
  }

   /**
   * 结算ip_id
   * @return ipId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "727407", value = "结算ip_id")

  public String getIpId() {
    return ipId;
  }


  public void setIpId(String ipId) {
    this.ipId = ipId;
  }


  public ArInvoiceReceiptOpenApiResponse ipRoleId(String ipRoleId) {
    
    this.ipRoleId = ipRoleId;
    return this;
  }

   /**
   * 结算对象ip_role_id
   * @return ipRoleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301208226048", value = "结算对象ip_role_id")

  public String getIpRoleId() {
    return ipRoleId;
  }


  public void setIpRoleId(String ipRoleId) {
    this.ipRoleId = ipRoleId;
  }


  public ArInvoiceReceiptOpenApiResponse lastModer(String lastModer) {
    
    this.lastModer = lastModer;
    return this;
  }

   /**
   * 最后修改人
   * @return lastModer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "李某某", value = "最后修改人")

  public String getLastModer() {
    return lastModer;
  }


  public void setLastModer(String lastModer) {
    this.lastModer = lastModer;
  }


  public ArInvoiceReceiptOpenApiResponse linkInvoiceAmt(MultiCurrencyMoneyOpenApi linkInvoiceAmt) {
    
    this.linkInvoiceAmt = linkInvoiceAmt;
    return this;
  }

   /**
   * Get linkInvoiceAmt
   * @return linkInvoiceAmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiCurrencyMoneyOpenApi getLinkInvoiceAmt() {
    return linkInvoiceAmt;
  }


  public void setLinkInvoiceAmt(MultiCurrencyMoneyOpenApi linkInvoiceAmt) {
    this.linkInvoiceAmt = linkInvoiceAmt;
  }


  public ArInvoiceReceiptOpenApiResponse outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部单据号，对应开票记录的月账单号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017090611122000040400450000091196", value = "外部单据号，对应开票记录的月账单号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public ArInvoiceReceiptOpenApiResponse outBizType(String outBizType) {
    
    this.outBizType = outBizType;
    return this;
  }

   /**
   * 可开票单据来源，01：主站，02：芝麻，03：金融云，04：微贷
   * @return outBizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03", value = "可开票单据来源，01：主站，02：芝麻，03：金融云，04：微贷")

  public String getOutBizType() {
    return outBizType;
  }


  public void setOutBizType(String outBizType) {
    this.outBizType = outBizType;
  }


  public ArInvoiceReceiptOpenApiResponse payWay(String payWay) {
    
    this.payWay = payWay;
    return this;
  }

   /**
   * 付款方式，1：资金，5：走量
   * @return payWay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "付款方式，1：资金，5：走量")

  public String getPayWay() {
    return payWay;
  }


  public void setPayWay(String payWay) {
    this.payWay = payWay;
  }


  public ArInvoiceReceiptOpenApiResponse prodCode(String prodCode) {
    
    this.prodCode = prodCode;
    return this;
  }

   /**
   * 产品码
   * @return prodCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "w1010100100000000018", value = "产品码")

  public String getProdCode() {
    return prodCode;
  }


  public void setProdCode(String prodCode) {
    this.prodCode = prodCode;
  }


  public ArInvoiceReceiptOpenApiResponse settleType(String settleType) {
    
    this.settleType = settleType;
    return this;
  }

   /**
   * 结算类型 ，01：实时，02：预收，03：后收，04：周期性，05：按日汇总，09：延期结算
   * @return settleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02", value = "结算类型 ，01：实时，02：预收，03：后收，04：周期性，05：按日汇总，09：延期结算")

  public String getSettleType() {
    return settleType;
  }


  public void setSettleType(String settleType) {
    this.settleType = settleType;
  }


  public ArInvoiceReceiptOpenApiResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 开票金额消耗状态：01未开票，02部分开票，03：已开票
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "开票金额消耗状态：01未开票，02部分开票，03：已开票")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ArInvoiceReceiptOpenApiResponse taxRate(Integer taxRate) {
    
    this.taxRate = taxRate;
    return this;
  }

   /**
   * 税率
   * @return taxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "税率")

  public Integer getTaxRate() {
    return taxRate;
  }


  public void setTaxRate(Integer taxRate) {
    this.taxRate = taxRate;
  }


  public ArInvoiceReceiptOpenApiResponse taxType(String taxType) {
    
    this.taxType = taxType;
    return this;
  }

   /**
   * 税收类型01：增值税，02：营业税
   * @return taxType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "税收类型01：增值税，02：营业税")

  public String getTaxType() {
    return taxType;
  }


  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }


  public ArInvoiceReceiptOpenApiResponse tntInstId(String tntInstId) {
    
    this.tntInstId = tntInstId;
    return this;
  }

   /**
   * 租户ID
   * @return tntInstId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ANTGW2CN", value = "租户ID")

  public String getTntInstId() {
    return tntInstId;
  }


  public void setTntInstId(String tntInstId) {
    this.tntInstId = tntInstId;
  }


  public ArInvoiceReceiptOpenApiResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 类型，1：应收，2：返点
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "类型，1：应收，2：返点")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArInvoiceReceiptOpenApiResponse arInvoiceReceiptOpenApiResponse = (ArInvoiceReceiptOpenApiResponse) o;
    return Objects.equals(this.arrangementNo, arInvoiceReceiptOpenApiResponse.arrangementNo) &&
        Objects.equals(this.id, arInvoiceReceiptOpenApiResponse.id) &&
        Objects.equals(this.instId, arInvoiceReceiptOpenApiResponse.instId) &&
        Objects.equals(this.invDt, arInvoiceReceiptOpenApiResponse.invDt) &&
        Objects.equals(this.invMode, arInvoiceReceiptOpenApiResponse.invMode) &&
        Objects.equals(this.invoiceAmt, arInvoiceReceiptOpenApiResponse.invoiceAmt) &&
        Objects.equals(this.invoicedAmt, arInvoiceReceiptOpenApiResponse.invoicedAmt) &&
        Objects.equals(this.ipId, arInvoiceReceiptOpenApiResponse.ipId) &&
        Objects.equals(this.ipRoleId, arInvoiceReceiptOpenApiResponse.ipRoleId) &&
        Objects.equals(this.lastModer, arInvoiceReceiptOpenApiResponse.lastModer) &&
        Objects.equals(this.linkInvoiceAmt, arInvoiceReceiptOpenApiResponse.linkInvoiceAmt) &&
        Objects.equals(this.outBizNo, arInvoiceReceiptOpenApiResponse.outBizNo) &&
        Objects.equals(this.outBizType, arInvoiceReceiptOpenApiResponse.outBizType) &&
        Objects.equals(this.payWay, arInvoiceReceiptOpenApiResponse.payWay) &&
        Objects.equals(this.prodCode, arInvoiceReceiptOpenApiResponse.prodCode) &&
        Objects.equals(this.settleType, arInvoiceReceiptOpenApiResponse.settleType) &&
        Objects.equals(this.status, arInvoiceReceiptOpenApiResponse.status) &&
        Objects.equals(this.taxRate, arInvoiceReceiptOpenApiResponse.taxRate) &&
        Objects.equals(this.taxType, arInvoiceReceiptOpenApiResponse.taxType) &&
        Objects.equals(this.tntInstId, arInvoiceReceiptOpenApiResponse.tntInstId) &&
        Objects.equals(this.type, arInvoiceReceiptOpenApiResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrangementNo, id, instId, invDt, invMode, invoiceAmt, invoicedAmt, ipId, ipRoleId, lastModer, linkInvoiceAmt, outBizNo, outBizType, payWay, prodCode, settleType, status, taxRate, taxType, tntInstId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArInvoiceReceiptOpenApiResponse {\n");
    sb.append("    arrangementNo: ").append(toIndentedString(arrangementNo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instId: ").append(toIndentedString(instId)).append("\n");
    sb.append("    invDt: ").append(toIndentedString(invDt)).append("\n");
    sb.append("    invMode: ").append(toIndentedString(invMode)).append("\n");
    sb.append("    invoiceAmt: ").append(toIndentedString(invoiceAmt)).append("\n");
    sb.append("    invoicedAmt: ").append(toIndentedString(invoicedAmt)).append("\n");
    sb.append("    ipId: ").append(toIndentedString(ipId)).append("\n");
    sb.append("    ipRoleId: ").append(toIndentedString(ipRoleId)).append("\n");
    sb.append("    lastModer: ").append(toIndentedString(lastModer)).append("\n");
    sb.append("    linkInvoiceAmt: ").append(toIndentedString(linkInvoiceAmt)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    outBizType: ").append(toIndentedString(outBizType)).append("\n");
    sb.append("    payWay: ").append(toIndentedString(payWay)).append("\n");
    sb.append("    prodCode: ").append(toIndentedString(prodCode)).append("\n");
    sb.append("    settleType: ").append(toIndentedString(settleType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    tntInstId: ").append(toIndentedString(tntInstId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("arrangement_no");
    openapiFields.add("id");
    openapiFields.add("inst_id");
    openapiFields.add("inv_dt");
    openapiFields.add("inv_mode");
    openapiFields.add("invoice_amt");
    openapiFields.add("invoiced_amt");
    openapiFields.add("ip_id");
    openapiFields.add("ip_role_id");
    openapiFields.add("last_moder");
    openapiFields.add("link_invoice_amt");
    openapiFields.add("out_biz_no");
    openapiFields.add("out_biz_type");
    openapiFields.add("pay_way");
    openapiFields.add("prod_code");
    openapiFields.add("settle_type");
    openapiFields.add("status");
    openapiFields.add("tax_rate");
    openapiFields.add("tax_type");
    openapiFields.add("tnt_inst_id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArInvoiceReceiptOpenApiResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArInvoiceReceiptOpenApiResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArInvoiceReceiptOpenApiResponse is not found in the empty JSON string", ArInvoiceReceiptOpenApiResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ArInvoiceReceiptOpenApiResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ArInvoiceReceiptOpenApiResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("arrangement_no") != null && !jsonObj.get("arrangement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arrangement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arrangement_no").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("inst_id") != null && !jsonObj.get("inst_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inst_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inst_id").toString()));
      }
      if (jsonObj.get("inv_dt") != null && !jsonObj.get("inv_dt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inv_dt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inv_dt").toString()));
      }
      if (jsonObj.get("inv_mode") != null && !jsonObj.get("inv_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inv_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inv_mode").toString()));
      }
      // validate the optional field `invoice_amt`
      if (jsonObj.getAsJsonObject("invoice_amt") != null) {
        MultiCurrencyMoneyOpenApi.validateJsonObject(jsonObj.getAsJsonObject("invoice_amt"));
      }
      // validate the optional field `invoiced_amt`
      if (jsonObj.getAsJsonObject("invoiced_amt") != null) {
        MultiCurrencyMoneyOpenApi.validateJsonObject(jsonObj.getAsJsonObject("invoiced_amt"));
      }
      if (jsonObj.get("ip_id") != null && !jsonObj.get("ip_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_id").toString()));
      }
      if (jsonObj.get("ip_role_id") != null && !jsonObj.get("ip_role_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_role_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_role_id").toString()));
      }
      if (jsonObj.get("last_moder") != null && !jsonObj.get("last_moder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_moder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_moder").toString()));
      }
      // validate the optional field `link_invoice_amt`
      if (jsonObj.getAsJsonObject("link_invoice_amt") != null) {
        MultiCurrencyMoneyOpenApi.validateJsonObject(jsonObj.getAsJsonObject("link_invoice_amt"));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("out_biz_type") != null && !jsonObj.get("out_biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_type").toString()));
      }
      if (jsonObj.get("pay_way") != null && !jsonObj.get("pay_way").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_way` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_way").toString()));
      }
      if (jsonObj.get("prod_code") != null && !jsonObj.get("prod_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prod_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prod_code").toString()));
      }
      if (jsonObj.get("settle_type") != null && !jsonObj.get("settle_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_type").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("tax_type") != null && !jsonObj.get("tax_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_type").toString()));
      }
      if (jsonObj.get("tnt_inst_id") != null && !jsonObj.get("tnt_inst_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tnt_inst_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tnt_inst_id").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArInvoiceReceiptOpenApiResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArInvoiceReceiptOpenApiResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArInvoiceReceiptOpenApiResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArInvoiceReceiptOpenApiResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ArInvoiceReceiptOpenApiResponse>() {
           @Override
           public void write(JsonWriter out, ArInvoiceReceiptOpenApiResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ArInvoiceReceiptOpenApiResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ArInvoiceReceiptOpenApiResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArInvoiceReceiptOpenApiResponse
  * @throws IOException if the JSON string is invalid with respect to ArInvoiceReceiptOpenApiResponse
  */
  public static ArInvoiceReceiptOpenApiResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArInvoiceReceiptOpenApiResponse.class);
  }

 /**
  * Convert an instance of ArInvoiceReceiptOpenApiResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

