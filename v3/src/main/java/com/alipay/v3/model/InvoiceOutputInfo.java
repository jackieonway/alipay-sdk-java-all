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
import com.alipay.v3.model.InvoiceItemOpenModel;
import com.alipay.v3.model.InvoiceTitleOpenModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * InvoiceOutputInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoiceOutputInfo {
  public static final String SERIALIZED_NAME_CHECK_CODE = "check_code";
  @SerializedName(SERIALIZED_NAME_CHECK_CODE)
  private String checkCode;

  public static final String SERIALIZED_NAME_CHECKER = "checker";
  @SerializedName(SERIALIZED_NAME_CHECKER)
  private String checker;

  public static final String SERIALIZED_NAME_CLERK = "clerk";
  @SerializedName(SERIALIZED_NAME_CLERK)
  private String clerk;

  public static final String SERIALIZED_NAME_EX_TAX_AMOUNT = "ex_tax_amount";
  @SerializedName(SERIALIZED_NAME_EX_TAX_AMOUNT)
  private String exTaxAmount;

  public static final String SERIALIZED_NAME_INVOICE_CODE = "invoice_code";
  @SerializedName(SERIALIZED_NAME_INVOICE_CODE)
  private String invoiceCode;

  public static final String SERIALIZED_NAME_INVOICE_CONTENT = "invoice_content";
  @SerializedName(SERIALIZED_NAME_INVOICE_CONTENT)
  private List<InvoiceItemOpenModel> invoiceContent = null;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoice_date";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private String invoiceDate;

  public static final String SERIALIZED_NAME_INVOICE_IMG_URL = "invoice_img_url";
  @SerializedName(SERIALIZED_NAME_INVOICE_IMG_URL)
  private String invoiceImgUrl;

  public static final String SERIALIZED_NAME_INVOICE_KIND = "invoice_kind";
  @SerializedName(SERIALIZED_NAME_INVOICE_KIND)
  private String invoiceKind;

  public static final String SERIALIZED_NAME_INVOICE_MEMO = "invoice_memo";
  @SerializedName(SERIALIZED_NAME_INVOICE_MEMO)
  private String invoiceMemo;

  public static final String SERIALIZED_NAME_INVOICE_NO = "invoice_no";
  @SerializedName(SERIALIZED_NAME_INVOICE_NO)
  private String invoiceNo;

  public static final String SERIALIZED_NAME_INVOICE_TITLE = "invoice_title";
  @SerializedName(SERIALIZED_NAME_INVOICE_TITLE)
  private InvoiceTitleOpenModel invoiceTitle;

  public static final String SERIALIZED_NAME_INVOICE_TYPE = "invoice_type";
  @SerializedName(SERIALIZED_NAME_INVOICE_TYPE)
  private String invoiceType;

  public static final String SERIALIZED_NAME_ORI_BLUE_INV_CODE = "ori_blue_inv_code";
  @SerializedName(SERIALIZED_NAME_ORI_BLUE_INV_CODE)
  private String oriBlueInvCode;

  public static final String SERIALIZED_NAME_ORI_BLUE_INV_NO = "ori_blue_inv_no";
  @SerializedName(SERIALIZED_NAME_ORI_BLUE_INV_NO)
  private String oriBlueInvNo;

  public static final String SERIALIZED_NAME_PAYEE = "payee";
  @SerializedName(SERIALIZED_NAME_PAYEE)
  private String payee;

  public static final String SERIALIZED_NAME_PAYEE_ADDRESS_TEL = "payee_address_tel";
  @SerializedName(SERIALIZED_NAME_PAYEE_ADDRESS_TEL)
  private String payeeAddressTel;

  public static final String SERIALIZED_NAME_PAYEE_BANK_NAME_ACCOUNT = "payee_bank_name_account";
  @SerializedName(SERIALIZED_NAME_PAYEE_BANK_NAME_ACCOUNT)
  private String payeeBankNameAccount;

  public static final String SERIALIZED_NAME_PAYEE_NAME = "payee_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_NAME)
  private String payeeName;

  public static final String SERIALIZED_NAME_PAYEE_REGISTER_NO = "payee_register_no";
  @SerializedName(SERIALIZED_NAME_PAYEE_REGISTER_NO)
  private String payeeRegisterNo;

  public static final String SERIALIZED_NAME_SUM_AMOUNT = "sum_amount";
  @SerializedName(SERIALIZED_NAME_SUM_AMOUNT)
  private String sumAmount;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "tax_amount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private String taxAmount;

  public InvoiceOutputInfo() { 
  }

  public InvoiceOutputInfo checkCode(String checkCode) {
    
    this.checkCode = checkCode;
    return this;
  }

   /**
   * 发票防伪码，验证码
   * @return checkCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票防伪码，验证码")

  public String getCheckCode() {
    return checkCode;
  }


  public void setCheckCode(String checkCode) {
    this.checkCode = checkCode;
  }


  public InvoiceOutputInfo checker(String checker) {
    
    this.checker = checker;
    return this;
  }

   /**
   * 票面上复核人信息。
   * @return checker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上复核人信息。")

  public String getChecker() {
    return checker;
  }


  public void setChecker(String checker) {
    this.checker = checker;
  }


  public InvoiceOutputInfo clerk(String clerk) {
    
    this.clerk = clerk;
    return this;
  }

   /**
   * 票面上开票员信息。
   * @return clerk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上开票员信息。")

  public String getClerk() {
    return clerk;
  }


  public void setClerk(String clerk) {
    this.clerk = clerk;
  }


  public InvoiceOutputInfo exTaxAmount(String exTaxAmount) {
    
    this.exTaxAmount = exTaxAmount;
    return this;
  }

   /**
   * 不含税金额，票面上的不含税金额，单位（元），保留两位小数。
   * @return exTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "不含税金额，票面上的不含税金额，单位（元），保留两位小数。")

  public String getExTaxAmount() {
    return exTaxAmount;
  }


  public void setExTaxAmount(String exTaxAmount) {
    this.exTaxAmount = exTaxAmount;
  }


  public InvoiceOutputInfo invoiceCode(String invoiceCode) {
    
    this.invoiceCode = invoiceCode;
    return this;
  }

   /**
   * 发票代码
   * @return invoiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票代码")

  public String getInvoiceCode() {
    return invoiceCode;
  }


  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }


  public InvoiceOutputInfo invoiceContent(List<InvoiceItemOpenModel> invoiceContent) {
    
    this.invoiceContent = invoiceContent;
    return this;
  }

  public InvoiceOutputInfo addInvoiceContentItem(InvoiceItemOpenModel invoiceContentItem) {
    if (this.invoiceContent == null) {
      this.invoiceContent = new ArrayList<>();
    }
    this.invoiceContent.add(invoiceContentItem);
    return this;
  }

   /**
   * 发票明细项。
   * @return invoiceContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票明细项。")

  public List<InvoiceItemOpenModel> getInvoiceContent() {
    return invoiceContent;
  }


  public void setInvoiceContent(List<InvoiceItemOpenModel> invoiceContent) {
    this.invoiceContent = invoiceContent;
  }


  public InvoiceOutputInfo invoiceDate(String invoiceDate) {
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * 开票日期，格式如：YYYY-MM-DD。
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开票日期，格式如：YYYY-MM-DD。")

  public String getInvoiceDate() {
    return invoiceDate;
  }


  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public InvoiceOutputInfo invoiceImgUrl(String invoiceImgUrl) {
    
    this.invoiceImgUrl = invoiceImgUrl;
    return this;
  }

   /**
   * 发票预览图片地址
   * @return invoiceImgUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票预览图片地址")

  public String getInvoiceImgUrl() {
    return invoiceImgUrl;
  }


  public void setInvoiceImgUrl(String invoiceImgUrl) {
    this.invoiceImgUrl = invoiceImgUrl;
  }


  public InvoiceOutputInfo invoiceKind(String invoiceKind) {
    
    this.invoiceKind = invoiceKind;
    return this;
  }

   /**
   * 标识发票的类型，PLAIN:增值税电子普通发票;SPECIAL:增值税专用发票;PLAIN_INVOICE:增值税普通发票;SALSE_INVOICE:机动车销售统一发票 ;PAPER_INVOICE:增值税普通发票(卷式)。
   * @return invoiceKind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标识发票的类型，PLAIN:增值税电子普通发票;SPECIAL:增值税专用发票;PLAIN_INVOICE:增值税普通发票;SALSE_INVOICE:机动车销售统一发票 ;PAPER_INVOICE:增值税普通发票(卷式)。")

  public String getInvoiceKind() {
    return invoiceKind;
  }


  public void setInvoiceKind(String invoiceKind) {
    this.invoiceKind = invoiceKind;
  }


  public InvoiceOutputInfo invoiceMemo(String invoiceMemo) {
    
    this.invoiceMemo = invoiceMemo;
    return this;
  }

   /**
   * 票面上备注信息。
   * @return invoiceMemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上备注信息。")

  public String getInvoiceMemo() {
    return invoiceMemo;
  }


  public void setInvoiceMemo(String invoiceMemo) {
    this.invoiceMemo = invoiceMemo;
  }


  public InvoiceOutputInfo invoiceNo(String invoiceNo) {
    
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * 发票号码
   * @return invoiceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票号码")

  public String getInvoiceNo() {
    return invoiceNo;
  }


  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }


  public InvoiceOutputInfo invoiceTitle(InvoiceTitleOpenModel invoiceTitle) {
    
    this.invoiceTitle = invoiceTitle;
    return this;
  }

   /**
   * Get invoiceTitle
   * @return invoiceTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvoiceTitleOpenModel getInvoiceTitle() {
    return invoiceTitle;
  }


  public void setInvoiceTitle(InvoiceTitleOpenModel invoiceTitle) {
    this.invoiceTitle = invoiceTitle;
  }


  public InvoiceOutputInfo invoiceType(String invoiceType) {
    
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * 标识是红票还是蓝票，RED:红票;BLUE:蓝票
   * @return invoiceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标识是红票还是蓝票，RED:红票;BLUE:蓝票")

  public String getInvoiceType() {
    return invoiceType;
  }


  public void setInvoiceType(String invoiceType) {
    this.invoiceType = invoiceType;
  }


  public InvoiceOutputInfo oriBlueInvCode(String oriBlueInvCode) {
    
    this.oriBlueInvCode = oriBlueInvCode;
    return this;
  }

   /**
   * 红票情况下，必须填入原始蓝票的发票代码。
   * @return oriBlueInvCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "红票情况下，必须填入原始蓝票的发票代码。")

  public String getOriBlueInvCode() {
    return oriBlueInvCode;
  }


  public void setOriBlueInvCode(String oriBlueInvCode) {
    this.oriBlueInvCode = oriBlueInvCode;
  }


  public InvoiceOutputInfo oriBlueInvNo(String oriBlueInvNo) {
    
    this.oriBlueInvNo = oriBlueInvNo;
    return this;
  }

   /**
   * 红票情况下，必须填入原始蓝票的发票号码。
   * @return oriBlueInvNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "红票情况下，必须填入原始蓝票的发票号码。")

  public String getOriBlueInvNo() {
    return oriBlueInvNo;
  }


  public void setOriBlueInvNo(String oriBlueInvNo) {
    this.oriBlueInvNo = oriBlueInvNo;
  }


  public InvoiceOutputInfo payee(String payee) {
    
    this.payee = payee;
    return this;
  }

   /**
   * 票面上收款人信息。
   * @return payee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上收款人信息。")

  public String getPayee() {
    return payee;
  }


  public void setPayee(String payee) {
    this.payee = payee;
  }


  public InvoiceOutputInfo payeeAddressTel(String payeeAddressTel) {
    
    this.payeeAddressTel = payeeAddressTel;
    return this;
  }

   /**
   * 票面上销售方地址、电话信息。
   * @return payeeAddressTel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上销售方地址、电话信息。")

  public String getPayeeAddressTel() {
    return payeeAddressTel;
  }


  public void setPayeeAddressTel(String payeeAddressTel) {
    this.payeeAddressTel = payeeAddressTel;
  }


  public InvoiceOutputInfo payeeBankNameAccount(String payeeBankNameAccount) {
    
    this.payeeBankNameAccount = payeeBankNameAccount;
    return this;
  }

   /**
   * 票面上销售方开户行及账号。
   * @return payeeBankNameAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上销售方开户行及账号。")

  public String getPayeeBankNameAccount() {
    return payeeBankNameAccount;
  }


  public void setPayeeBankNameAccount(String payeeBankNameAccount) {
    this.payeeBankNameAccount = payeeBankNameAccount;
  }


  public InvoiceOutputInfo payeeName(String payeeName) {
    
    this.payeeName = payeeName;
    return this;
  }

   /**
   * 票面上销售方企业名称。
   * @return payeeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上销售方企业名称。")

  public String getPayeeName() {
    return payeeName;
  }


  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }


  public InvoiceOutputInfo payeeRegisterNo(String payeeRegisterNo) {
    
    this.payeeRegisterNo = payeeRegisterNo;
    return this;
  }

   /**
   * 票面上销售方税号信息。
   * @return payeeRegisterNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "票面上销售方税号信息。")

  public String getPayeeRegisterNo() {
    return payeeRegisterNo;
  }


  public void setPayeeRegisterNo(String payeeRegisterNo) {
    this.payeeRegisterNo = payeeRegisterNo;
  }


  public InvoiceOutputInfo sumAmount(String sumAmount) {
    
    this.sumAmount = sumAmount;
    return this;
  }

   /**
   * 价税合计，票面上的总开票金额，单位（元），保留两位小数，sum_amount&#x3D;ex_tax_amount+tax_amount。
   * @return sumAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "价税合计，票面上的总开票金额，单位（元），保留两位小数，sum_amount=ex_tax_amount+tax_amount。")

  public String getSumAmount() {
    return sumAmount;
  }


  public void setSumAmount(String sumAmount) {
    this.sumAmount = sumAmount;
  }


  public InvoiceOutputInfo taxAmount(String taxAmount) {
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * 合计税额，票面上的合计税额，单位（元），保留两位小数。
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "合计税额，票面上的合计税额，单位（元），保留两位小数。")

  public String getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceOutputInfo invoiceOutputInfo = (InvoiceOutputInfo) o;
    return Objects.equals(this.checkCode, invoiceOutputInfo.checkCode) &&
        Objects.equals(this.checker, invoiceOutputInfo.checker) &&
        Objects.equals(this.clerk, invoiceOutputInfo.clerk) &&
        Objects.equals(this.exTaxAmount, invoiceOutputInfo.exTaxAmount) &&
        Objects.equals(this.invoiceCode, invoiceOutputInfo.invoiceCode) &&
        Objects.equals(this.invoiceContent, invoiceOutputInfo.invoiceContent) &&
        Objects.equals(this.invoiceDate, invoiceOutputInfo.invoiceDate) &&
        Objects.equals(this.invoiceImgUrl, invoiceOutputInfo.invoiceImgUrl) &&
        Objects.equals(this.invoiceKind, invoiceOutputInfo.invoiceKind) &&
        Objects.equals(this.invoiceMemo, invoiceOutputInfo.invoiceMemo) &&
        Objects.equals(this.invoiceNo, invoiceOutputInfo.invoiceNo) &&
        Objects.equals(this.invoiceTitle, invoiceOutputInfo.invoiceTitle) &&
        Objects.equals(this.invoiceType, invoiceOutputInfo.invoiceType) &&
        Objects.equals(this.oriBlueInvCode, invoiceOutputInfo.oriBlueInvCode) &&
        Objects.equals(this.oriBlueInvNo, invoiceOutputInfo.oriBlueInvNo) &&
        Objects.equals(this.payee, invoiceOutputInfo.payee) &&
        Objects.equals(this.payeeAddressTel, invoiceOutputInfo.payeeAddressTel) &&
        Objects.equals(this.payeeBankNameAccount, invoiceOutputInfo.payeeBankNameAccount) &&
        Objects.equals(this.payeeName, invoiceOutputInfo.payeeName) &&
        Objects.equals(this.payeeRegisterNo, invoiceOutputInfo.payeeRegisterNo) &&
        Objects.equals(this.sumAmount, invoiceOutputInfo.sumAmount) &&
        Objects.equals(this.taxAmount, invoiceOutputInfo.taxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkCode, checker, clerk, exTaxAmount, invoiceCode, invoiceContent, invoiceDate, invoiceImgUrl, invoiceKind, invoiceMemo, invoiceNo, invoiceTitle, invoiceType, oriBlueInvCode, oriBlueInvNo, payee, payeeAddressTel, payeeBankNameAccount, payeeName, payeeRegisterNo, sumAmount, taxAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceOutputInfo {\n");
    sb.append("    checkCode: ").append(toIndentedString(checkCode)).append("\n");
    sb.append("    checker: ").append(toIndentedString(checker)).append("\n");
    sb.append("    clerk: ").append(toIndentedString(clerk)).append("\n");
    sb.append("    exTaxAmount: ").append(toIndentedString(exTaxAmount)).append("\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    invoiceContent: ").append(toIndentedString(invoiceContent)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceImgUrl: ").append(toIndentedString(invoiceImgUrl)).append("\n");
    sb.append("    invoiceKind: ").append(toIndentedString(invoiceKind)).append("\n");
    sb.append("    invoiceMemo: ").append(toIndentedString(invoiceMemo)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    invoiceTitle: ").append(toIndentedString(invoiceTitle)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    oriBlueInvCode: ").append(toIndentedString(oriBlueInvCode)).append("\n");
    sb.append("    oriBlueInvNo: ").append(toIndentedString(oriBlueInvNo)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    payeeAddressTel: ").append(toIndentedString(payeeAddressTel)).append("\n");
    sb.append("    payeeBankNameAccount: ").append(toIndentedString(payeeBankNameAccount)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    payeeRegisterNo: ").append(toIndentedString(payeeRegisterNo)).append("\n");
    sb.append("    sumAmount: ").append(toIndentedString(sumAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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
    openapiFields.add("check_code");
    openapiFields.add("checker");
    openapiFields.add("clerk");
    openapiFields.add("ex_tax_amount");
    openapiFields.add("invoice_code");
    openapiFields.add("invoice_content");
    openapiFields.add("invoice_date");
    openapiFields.add("invoice_img_url");
    openapiFields.add("invoice_kind");
    openapiFields.add("invoice_memo");
    openapiFields.add("invoice_no");
    openapiFields.add("invoice_title");
    openapiFields.add("invoice_type");
    openapiFields.add("ori_blue_inv_code");
    openapiFields.add("ori_blue_inv_no");
    openapiFields.add("payee");
    openapiFields.add("payee_address_tel");
    openapiFields.add("payee_bank_name_account");
    openapiFields.add("payee_name");
    openapiFields.add("payee_register_no");
    openapiFields.add("sum_amount");
    openapiFields.add("tax_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceOutputInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoiceOutputInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceOutputInfo is not found in the empty JSON string", InvoiceOutputInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvoiceOutputInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceOutputInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("check_code") != null && !jsonObj.get("check_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_code").toString()));
      }
      if (jsonObj.get("checker") != null && !jsonObj.get("checker").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checker` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checker").toString()));
      }
      if (jsonObj.get("clerk") != null && !jsonObj.get("clerk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clerk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clerk").toString()));
      }
      if (jsonObj.get("ex_tax_amount") != null && !jsonObj.get("ex_tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ex_tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ex_tax_amount").toString()));
      }
      if (jsonObj.get("invoice_code") != null && !jsonObj.get("invoice_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_code").toString()));
      }
      JsonArray jsonArrayinvoiceContent = jsonObj.getAsJsonArray("invoice_content");
      if (jsonArrayinvoiceContent != null) {
        // ensure the json data is an array
        if (!jsonObj.get("invoice_content").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `invoice_content` to be an array in the JSON string but got `%s`", jsonObj.get("invoice_content").toString()));
        }

        // validate the optional field `invoice_content` (array)
        for (int i = 0; i < jsonArrayinvoiceContent.size(); i++) {
          InvoiceItemOpenModel.validateJsonObject(jsonArrayinvoiceContent.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("invoice_date") != null && !jsonObj.get("invoice_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_date").toString()));
      }
      if (jsonObj.get("invoice_img_url") != null && !jsonObj.get("invoice_img_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_img_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_img_url").toString()));
      }
      if (jsonObj.get("invoice_kind") != null && !jsonObj.get("invoice_kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_kind").toString()));
      }
      if (jsonObj.get("invoice_memo") != null && !jsonObj.get("invoice_memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_memo").toString()));
      }
      if (jsonObj.get("invoice_no") != null && !jsonObj.get("invoice_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_no").toString()));
      }
      // validate the optional field `invoice_title`
      if (jsonObj.getAsJsonObject("invoice_title") != null) {
        InvoiceTitleOpenModel.validateJsonObject(jsonObj.getAsJsonObject("invoice_title"));
      }
      if (jsonObj.get("invoice_type") != null && !jsonObj.get("invoice_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_type").toString()));
      }
      if (jsonObj.get("ori_blue_inv_code") != null && !jsonObj.get("ori_blue_inv_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ori_blue_inv_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ori_blue_inv_code").toString()));
      }
      if (jsonObj.get("ori_blue_inv_no") != null && !jsonObj.get("ori_blue_inv_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ori_blue_inv_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ori_blue_inv_no").toString()));
      }
      if (jsonObj.get("payee") != null && !jsonObj.get("payee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee").toString()));
      }
      if (jsonObj.get("payee_address_tel") != null && !jsonObj.get("payee_address_tel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_address_tel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_address_tel").toString()));
      }
      if (jsonObj.get("payee_bank_name_account") != null && !jsonObj.get("payee_bank_name_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_bank_name_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_bank_name_account").toString()));
      }
      if (jsonObj.get("payee_name") != null && !jsonObj.get("payee_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_name").toString()));
      }
      if (jsonObj.get("payee_register_no") != null && !jsonObj.get("payee_register_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_register_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_register_no").toString()));
      }
      if (jsonObj.get("sum_amount") != null && !jsonObj.get("sum_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sum_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sum_amount").toString()));
      }
      if (jsonObj.get("tax_amount") != null && !jsonObj.get("tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceOutputInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceOutputInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceOutputInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceOutputInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceOutputInfo>() {
           @Override
           public void write(JsonWriter out, InvoiceOutputInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceOutputInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceOutputInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceOutputInfo
  * @throws IOException if the JSON string is invalid with respect to InvoiceOutputInfo
  */
  public static InvoiceOutputInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceOutputInfo.class);
  }

 /**
  * Convert an instance of InvoiceOutputInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

