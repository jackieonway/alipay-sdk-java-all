/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-11-12
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
 * AlipayEbppInvoiceTaxnoBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceTaxnoBatchqueryModel {
  public static final String SERIALIZED_NAME_ENABLE_TRADE_OUT = "enable_trade_out";
  @SerializedName(SERIALIZED_NAME_ENABLE_TRADE_OUT)
  private String enableTradeOut;

  public static final String SERIALIZED_NAME_END_INVOICE_DATE = "end_invoice_date";
  @SerializedName(SERIALIZED_NAME_END_INVOICE_DATE)
  private String endInvoiceDate;

  public static final String SERIALIZED_NAME_INVOICE_KIND_LIST = "invoice_kind_list";
  @SerializedName(SERIALIZED_NAME_INVOICE_KIND_LIST)
  private List<String> invoiceKindList = null;

  public static final String SERIALIZED_NAME_LIMIT_SIZE = "limit_size";
  @SerializedName(SERIALIZED_NAME_LIMIT_SIZE)
  private Integer limitSize;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_SCENE = "scene";
  @SerializedName(SERIALIZED_NAME_SCENE)
  private String scene;

  public static final String SERIALIZED_NAME_START_INVOICE_DATE = "start_invoice_date";
  @SerializedName(SERIALIZED_NAME_START_INVOICE_DATE)
  private String startInvoiceDate;

  public static final String SERIALIZED_NAME_TAX_NO = "tax_no";
  @SerializedName(SERIALIZED_NAME_TAX_NO)
  private String taxNo;

  public AlipayEbppInvoiceTaxnoBatchqueryModel() { 
  }

  public AlipayEbppInvoiceTaxnoBatchqueryModel enableTradeOut(String enableTradeOut) {
    
    this.enableTradeOut = enableTradeOut;
    return this;
  }

   /**
   * 默认值为false。true为输出交易信息，false为不输出交易信息。
   * @return enableTradeOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "默认值为false。true为输出交易信息，false为不输出交易信息。")

  public String getEnableTradeOut() {
    return enableTradeOut;
  }


  public void setEnableTradeOut(String enableTradeOut) {
    this.enableTradeOut = enableTradeOut;
  }


  public AlipayEbppInvoiceTaxnoBatchqueryModel endInvoiceDate(String endInvoiceDate) {
    
    this.endInvoiceDate = endInvoiceDate;
    return this;
  }

   /**
   * 查询结束时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月
   * @return endInvoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-07-11", value = "查询结束时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月")

  public String getEndInvoiceDate() {
    return endInvoiceDate;
  }


  public void setEndInvoiceDate(String endInvoiceDate) {
    this.endInvoiceDate = endInvoiceDate;
  }


  public AlipayEbppInvoiceTaxnoBatchqueryModel invoiceKindList(List<String> invoiceKindList) {
    
    this.invoiceKindList = invoiceKindList;
    return this;
  }

  public AlipayEbppInvoiceTaxnoBatchqueryModel addInvoiceKindListItem(String invoiceKindListItem) {
    if (this.invoiceKindList == null) {
      this.invoiceKindList = new ArrayList<>();
    }
    this.invoiceKindList.add(invoiceKindListItem);
    return this;
  }

   /**
   * 查询票种列表
   * @return invoiceKindList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"PLAIN\",\"SPECIAL\",\"ALL_ELECTRONIC_GENERAL\",\"ALL_ELECTRONIC_SPECIAL\"]", value = "查询票种列表")

  public List<String> getInvoiceKindList() {
    return invoiceKindList;
  }


  public void setInvoiceKindList(List<String> invoiceKindList) {
    this.invoiceKindList = invoiceKindList;
  }


  public AlipayEbppInvoiceTaxnoBatchqueryModel limitSize(Integer limitSize) {
    
    this.limitSize = limitSize;
    return this;
  }

   /**
   * 查询结果上限笔数，最大值20
   * @return limitSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "查询结果上限笔数，最大值20")

  public Integer getLimitSize() {
    return limitSize;
  }


  public void setLimitSize(Integer limitSize) {
    this.limitSize = limitSize;
  }


  public AlipayEbppInvoiceTaxnoBatchqueryModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当前页码，为空时默认第一页
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页码，为空时默认第一页")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayEbppInvoiceTaxnoBatchqueryModel scene(String scene) {
    
    this.scene = scene;
    return this;
  }

   /**
   * 发票要素获取应用场景。&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/10691/bv8s88\&quot;&gt;\&quot;拉\&quot;模式报销&lt;/a&gt; 固定为 INVOICE_EXPENSE 表示发票报销。
   * @return scene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INVOICE_EXPENSE", value = "发票要素获取应用场景。<a href=\"https://opendocs.alipay.com/open/10691/bv8s88\">\"拉\"模式报销</a> 固定为 INVOICE_EXPENSE 表示发票报销。")

  public String getScene() {
    return scene;
  }


  public void setScene(String scene) {
    this.scene = scene;
  }


  public AlipayEbppInvoiceTaxnoBatchqueryModel startInvoiceDate(String startInvoiceDate) {
    
    this.startInvoiceDate = startInvoiceDate;
    return this;
  }

   /**
   * 查询起始时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月
   * @return startInvoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-11", value = "查询起始时间，精确到天（按开票日期查询） start_invoice_date和end_invoice_date传值要求 1.同时为空时，返回最近半年200条数据 2.必须同时为空 或 同时不为空 3.结束日期不能大于当前日期 4.开始时间和结束时间跨度不能超过6个月")

  public String getStartInvoiceDate() {
    return startInvoiceDate;
  }


  public void setStartInvoiceDate(String startInvoiceDate) {
    this.startInvoiceDate = startInvoiceDate;
  }


  public AlipayEbppInvoiceTaxnoBatchqueryModel taxNo(String taxNo) {
    
    this.taxNo = taxNo;
    return this;
  }

   /**
   * 企业税号
   * @return taxNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "企业税号")

  public String getTaxNo() {
    return taxNo;
  }


  public void setTaxNo(String taxNo) {
    this.taxNo = taxNo;
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
   * @return the AlipayEbppInvoiceTaxnoBatchqueryModel instance itself
   */
  public AlipayEbppInvoiceTaxnoBatchqueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceTaxnoBatchqueryModel alipayEbppInvoiceTaxnoBatchqueryModel = (AlipayEbppInvoiceTaxnoBatchqueryModel) o;
    return Objects.equals(this.enableTradeOut, alipayEbppInvoiceTaxnoBatchqueryModel.enableTradeOut) &&
        Objects.equals(this.endInvoiceDate, alipayEbppInvoiceTaxnoBatchqueryModel.endInvoiceDate) &&
        Objects.equals(this.invoiceKindList, alipayEbppInvoiceTaxnoBatchqueryModel.invoiceKindList) &&
        Objects.equals(this.limitSize, alipayEbppInvoiceTaxnoBatchqueryModel.limitSize) &&
        Objects.equals(this.pageNum, alipayEbppInvoiceTaxnoBatchqueryModel.pageNum) &&
        Objects.equals(this.scene, alipayEbppInvoiceTaxnoBatchqueryModel.scene) &&
        Objects.equals(this.startInvoiceDate, alipayEbppInvoiceTaxnoBatchqueryModel.startInvoiceDate) &&
        Objects.equals(this.taxNo, alipayEbppInvoiceTaxnoBatchqueryModel.taxNo)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceTaxnoBatchqueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableTradeOut, endInvoiceDate, invoiceKindList, limitSize, pageNum, scene, startInvoiceDate, taxNo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceTaxnoBatchqueryModel {\n");
    sb.append("    enableTradeOut: ").append(toIndentedString(enableTradeOut)).append("\n");
    sb.append("    endInvoiceDate: ").append(toIndentedString(endInvoiceDate)).append("\n");
    sb.append("    invoiceKindList: ").append(toIndentedString(invoiceKindList)).append("\n");
    sb.append("    limitSize: ").append(toIndentedString(limitSize)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
    sb.append("    startInvoiceDate: ").append(toIndentedString(startInvoiceDate)).append("\n");
    sb.append("    taxNo: ").append(toIndentedString(taxNo)).append("\n");
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
    openapiFields.add("enable_trade_out");
    openapiFields.add("end_invoice_date");
    openapiFields.add("invoice_kind_list");
    openapiFields.add("limit_size");
    openapiFields.add("page_num");
    openapiFields.add("scene");
    openapiFields.add("start_invoice_date");
    openapiFields.add("tax_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceTaxnoBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceTaxnoBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceTaxnoBatchqueryModel is not found in the empty JSON string", AlipayEbppInvoiceTaxnoBatchqueryModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("enable_trade_out") != null && !jsonObj.get("enable_trade_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enable_trade_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enable_trade_out").toString()));
      }
      if (jsonObj.get("end_invoice_date") != null && !jsonObj.get("end_invoice_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_invoice_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_invoice_date").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("invoice_kind_list") != null && !jsonObj.get("invoice_kind_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_kind_list` to be an array in the JSON string but got `%s`", jsonObj.get("invoice_kind_list").toString()));
      }
      if (jsonObj.get("scene") != null && !jsonObj.get("scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene").toString()));
      }
      if (jsonObj.get("start_invoice_date") != null && !jsonObj.get("start_invoice_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_invoice_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_invoice_date").toString()));
      }
      if (jsonObj.get("tax_no") != null && !jsonObj.get("tax_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceTaxnoBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceTaxnoBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceTaxnoBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceTaxnoBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceTaxnoBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceTaxnoBatchqueryModel value) throws IOException {
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
           public AlipayEbppInvoiceTaxnoBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceTaxnoBatchqueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceTaxnoBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceTaxnoBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceTaxnoBatchqueryModel
  */
  public static AlipayEbppInvoiceTaxnoBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceTaxnoBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceTaxnoBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

