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
 * InvoiceItemOpenModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvoiceItemOpenModel {
  public static final String SERIALIZED_NAME_ITEM_EX_TAX_AMOUNT = "item_ex_tax_amount";
  @SerializedName(SERIALIZED_NAME_ITEM_EX_TAX_AMOUNT)
  private String itemExTaxAmount;

  public static final String SERIALIZED_NAME_ITEM_NAME = "item_name";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public static final String SERIALIZED_NAME_ITEM_NO = "item_no";
  @SerializedName(SERIALIZED_NAME_ITEM_NO)
  private String itemNo;

  public static final String SERIALIZED_NAME_ITEM_QUANTITY = "item_quantity";
  @SerializedName(SERIALIZED_NAME_ITEM_QUANTITY)
  private Integer itemQuantity;

  public static final String SERIALIZED_NAME_ITEM_SPEC = "item_spec";
  @SerializedName(SERIALIZED_NAME_ITEM_SPEC)
  private String itemSpec;

  public static final String SERIALIZED_NAME_ITEM_SUM_AMOUNT = "item_sum_amount";
  @SerializedName(SERIALIZED_NAME_ITEM_SUM_AMOUNT)
  private String itemSumAmount;

  public static final String SERIALIZED_NAME_ITEM_TAX_AMOUNT = "item_tax_amount";
  @SerializedName(SERIALIZED_NAME_ITEM_TAX_AMOUNT)
  private String itemTaxAmount;

  public static final String SERIALIZED_NAME_ITEM_TAX_RATE = "item_tax_rate";
  @SerializedName(SERIALIZED_NAME_ITEM_TAX_RATE)
  private String itemTaxRate;

  public static final String SERIALIZED_NAME_ITEM_UNIT = "item_unit";
  @SerializedName(SERIALIZED_NAME_ITEM_UNIT)
  private String itemUnit;

  public static final String SERIALIZED_NAME_ITEM_UNIT_PRICE = "item_unit_price";
  @SerializedName(SERIALIZED_NAME_ITEM_UNIT_PRICE)
  private String itemUnitPrice;

  public static final String SERIALIZED_NAME_ROW_TYPE = "row_type";
  @SerializedName(SERIALIZED_NAME_ROW_TYPE)
  private String rowType;

  public InvoiceItemOpenModel() { 
  }

  public InvoiceItemOpenModel itemExTaxAmount(String itemExTaxAmount) {
    
    this.itemExTaxAmount = itemExTaxAmount;
    return this;
  }

   /**
   * 明细行不含税金额，单位元，保留两位小数
   * @return itemExTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "明细行不含税金额，单位元，保留两位小数")

  public String getItemExTaxAmount() {
    return itemExTaxAmount;
  }


  public void setItemExTaxAmount(String itemExTaxAmount) {
    this.itemExTaxAmount = itemExTaxAmount;
  }


  public InvoiceItemOpenModel itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * 开票项目：货物或应税劳务、服务名称
   * @return itemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开票项目：货物或应税劳务、服务名称")

  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public InvoiceItemOpenModel itemNo(String itemNo) {
    
    this.itemNo = itemNo;
    return this;
  }

   /**
   * 国税局制定的商品税收编码，必须是最末级
   * @return itemNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "国税局制定的商品税收编码，必须是最末级")

  public String getItemNo() {
    return itemNo;
  }


  public void setItemNo(String itemNo) {
    this.itemNo = itemNo;
  }


  public InvoiceItemOpenModel itemQuantity(Integer itemQuantity) {
    
    this.itemQuantity = itemQuantity;
    return this;
  }

   /**
   * 数量； 1.当row_type&#x3D;0或2且item_unit_price为空，可空； 2.可精确到小数点后6位
   * @return itemQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "数量； 1.当row_type=0或2且item_unit_price为空，可空； 2.可精确到小数点后6位")

  public Integer getItemQuantity() {
    return itemQuantity;
  }


  public void setItemQuantity(Integer itemQuantity) {
    this.itemQuantity = itemQuantity;
  }


  public InvoiceItemOpenModel itemSpec(String itemSpec) {
    
    this.itemSpec = itemSpec;
    return this;
  }

   /**
   * 规格型号
   * @return itemSpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "规格型号")

  public String getItemSpec() {
    return itemSpec;
  }


  public void setItemSpec(String itemSpec) {
    this.itemSpec = itemSpec;
  }


  public InvoiceItemOpenModel itemSumAmount(String itemSumAmount) {
    
    this.itemSumAmount = itemSumAmount;
    return this;
  }

   /**
   * 明细行价税合计，单位元，必须保证item_sum_amount&#x3D;item_ex_tax_amount+item_tax_amount。
   * @return itemSumAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "明细行价税合计，单位元，必须保证item_sum_amount=item_ex_tax_amount+item_tax_amount。")

  public String getItemSumAmount() {
    return itemSumAmount;
  }


  public void setItemSumAmount(String itemSumAmount) {
    this.itemSumAmount = itemSumAmount;
  }


  public InvoiceItemOpenModel itemTaxAmount(String itemTaxAmount) {
    
    this.itemTaxAmount = itemTaxAmount;
    return this;
  }

   /**
   * 明细行税额，单位元，保留两位小数，无税或者免税情况下输入：0.00。
   * @return itemTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "明细行税额，单位元，保留两位小数，无税或者免税情况下输入：0.00。")

  public String getItemTaxAmount() {
    return itemTaxAmount;
  }


  public void setItemTaxAmount(String itemTaxAmount) {
    this.itemTaxAmount = itemTaxAmount;
  }


  public InvoiceItemOpenModel itemTaxRate(String itemTaxRate) {
    
    this.itemTaxRate = itemTaxRate;
    return this;
  }

   /**
   * 明细行税率，无税或者免税情况下输入：0.00。
   * @return itemTaxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "明细行税率，无税或者免税情况下输入：0.00。")

  public String getItemTaxRate() {
    return itemTaxRate;
  }


  public void setItemTaxRate(String itemTaxRate) {
    this.itemTaxRate = itemTaxRate;
  }


  public InvoiceItemOpenModel itemUnit(String itemUnit) {
    
    this.itemUnit = itemUnit;
    return this;
  }

   /**
   * 单位
   * @return itemUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单位")

  public String getItemUnit() {
    return itemUnit;
  }


  public void setItemUnit(String itemUnit) {
    this.itemUnit = itemUnit;
  }


  public InvoiceItemOpenModel itemUnitPrice(String itemUnitPrice) {
    
    this.itemUnitPrice = itemUnitPrice;
    return this;
  }

   /**
   * 不含税单价（元）; 1.当row_type&#x3D;0或2且item_quantity为空，可空 2.可精确到小数点后8位；
   * @return itemUnitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "不含税单价（元）; 1.当row_type=0或2且item_quantity为空，可空 2.可精确到小数点后8位；")

  public String getItemUnitPrice() {
    return itemUnitPrice;
  }


  public void setItemUnitPrice(String itemUnitPrice) {
    this.itemUnitPrice = itemUnitPrice;
  }


  public InvoiceItemOpenModel rowType(String rowType) {
    
    this.rowType = rowType;
    return this;
  }

   /**
   * 发票行性质：0表示正常行，1表示折扣行，2表示被折扣行。
   * @return rowType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票行性质：0表示正常行，1表示折扣行，2表示被折扣行。")

  public String getRowType() {
    return rowType;
  }


  public void setRowType(String rowType) {
    this.rowType = rowType;
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
   * @return the InvoiceItemOpenModel instance itself
   */
  public InvoiceItemOpenModel putAdditionalProperty(String key, Object value) {
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
    InvoiceItemOpenModel invoiceItemOpenModel = (InvoiceItemOpenModel) o;
    return Objects.equals(this.itemExTaxAmount, invoiceItemOpenModel.itemExTaxAmount) &&
        Objects.equals(this.itemName, invoiceItemOpenModel.itemName) &&
        Objects.equals(this.itemNo, invoiceItemOpenModel.itemNo) &&
        Objects.equals(this.itemQuantity, invoiceItemOpenModel.itemQuantity) &&
        Objects.equals(this.itemSpec, invoiceItemOpenModel.itemSpec) &&
        Objects.equals(this.itemSumAmount, invoiceItemOpenModel.itemSumAmount) &&
        Objects.equals(this.itemTaxAmount, invoiceItemOpenModel.itemTaxAmount) &&
        Objects.equals(this.itemTaxRate, invoiceItemOpenModel.itemTaxRate) &&
        Objects.equals(this.itemUnit, invoiceItemOpenModel.itemUnit) &&
        Objects.equals(this.itemUnitPrice, invoiceItemOpenModel.itemUnitPrice) &&
        Objects.equals(this.rowType, invoiceItemOpenModel.rowType)&&
        Objects.equals(this.additionalProperties, invoiceItemOpenModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemExTaxAmount, itemName, itemNo, itemQuantity, itemSpec, itemSumAmount, itemTaxAmount, itemTaxRate, itemUnit, itemUnitPrice, rowType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceItemOpenModel {\n");
    sb.append("    itemExTaxAmount: ").append(toIndentedString(itemExTaxAmount)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemNo: ").append(toIndentedString(itemNo)).append("\n");
    sb.append("    itemQuantity: ").append(toIndentedString(itemQuantity)).append("\n");
    sb.append("    itemSpec: ").append(toIndentedString(itemSpec)).append("\n");
    sb.append("    itemSumAmount: ").append(toIndentedString(itemSumAmount)).append("\n");
    sb.append("    itemTaxAmount: ").append(toIndentedString(itemTaxAmount)).append("\n");
    sb.append("    itemTaxRate: ").append(toIndentedString(itemTaxRate)).append("\n");
    sb.append("    itemUnit: ").append(toIndentedString(itemUnit)).append("\n");
    sb.append("    itemUnitPrice: ").append(toIndentedString(itemUnitPrice)).append("\n");
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
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
    openapiFields.add("item_ex_tax_amount");
    openapiFields.add("item_name");
    openapiFields.add("item_no");
    openapiFields.add("item_quantity");
    openapiFields.add("item_spec");
    openapiFields.add("item_sum_amount");
    openapiFields.add("item_tax_amount");
    openapiFields.add("item_tax_rate");
    openapiFields.add("item_unit");
    openapiFields.add("item_unit_price");
    openapiFields.add("row_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceItemOpenModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvoiceItemOpenModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceItemOpenModel is not found in the empty JSON string", InvoiceItemOpenModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("item_ex_tax_amount") != null && !jsonObj.get("item_ex_tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_ex_tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_ex_tax_amount").toString()));
      }
      if (jsonObj.get("item_name") != null && !jsonObj.get("item_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_name").toString()));
      }
      if (jsonObj.get("item_no") != null && !jsonObj.get("item_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_no").toString()));
      }
      if (jsonObj.get("item_spec") != null && !jsonObj.get("item_spec").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_spec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_spec").toString()));
      }
      if (jsonObj.get("item_sum_amount") != null && !jsonObj.get("item_sum_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_sum_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_sum_amount").toString()));
      }
      if (jsonObj.get("item_tax_amount") != null && !jsonObj.get("item_tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_tax_amount").toString()));
      }
      if (jsonObj.get("item_tax_rate") != null && !jsonObj.get("item_tax_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_tax_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_tax_rate").toString()));
      }
      if (jsonObj.get("item_unit") != null && !jsonObj.get("item_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_unit").toString()));
      }
      if (jsonObj.get("item_unit_price") != null && !jsonObj.get("item_unit_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_unit_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_unit_price").toString()));
      }
      if (jsonObj.get("row_type") != null && !jsonObj.get("row_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `row_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("row_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceItemOpenModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceItemOpenModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceItemOpenModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceItemOpenModel.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceItemOpenModel>() {
           @Override
           public void write(JsonWriter out, InvoiceItemOpenModel value) throws IOException {
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
           public InvoiceItemOpenModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoiceItemOpenModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvoiceItemOpenModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceItemOpenModel
  * @throws IOException if the JSON string is invalid with respect to InvoiceItemOpenModel
  */
  public static InvoiceItemOpenModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceItemOpenModel.class);
  }

 /**
  * Convert an instance of InvoiceItemOpenModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

