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
 * AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ADD_EMPLOYEE_LIST = "add_employee_list";
  @SerializedName(SERIALIZED_NAME_ADD_EMPLOYEE_LIST)
  private List<String> addEmployeeList = null;

  public static final String SERIALIZED_NAME_ADD_EMPLOYEE_OPEN_ID_LIST = "add_employee_open_id_list";
  @SerializedName(SERIALIZED_NAME_ADD_EMPLOYEE_OPEN_ID_LIST)
  private List<String> addEmployeeOpenIdList = null;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_REMOVE_EMPLOYEE_LIST = "remove_employee_list";
  @SerializedName(SERIALIZED_NAME_REMOVE_EMPLOYEE_LIST)
  private List<String> removeEmployeeList = null;

  public static final String SERIALIZED_NAME_REMOVE_EMPLOYEE_OPEN_ID_LIST = "remove_employee_open_id_list";
  @SerializedName(SERIALIZED_NAME_REMOVE_EMPLOYEE_OPEN_ID_LIST)
  private List<String> removeEmployeeOpenIdList = null;

  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel() { 
  }

  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "共同账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel addEmployeeList(List<String> addEmployeeList) {
    
    this.addEmployeeList = addEmployeeList;
    return this;
  }

  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel addAddEmployeeListItem(String addEmployeeListItem) {
    if (this.addEmployeeList == null) {
      this.addEmployeeList = new ArrayList<>();
    }
    this.addEmployeeList.add(addEmployeeListItem);
    return this;
  }

   /**
   * 切换open_id前使用此字段： 需要添加的员工UID列表 约束：一次最多50个
   * @return addEmployeeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088402266061144\",\"2088402266063146\"]", value = "切换open_id前使用此字段： 需要添加的员工UID列表 约束：一次最多50个")

  public List<String> getAddEmployeeList() {
    return addEmployeeList;
  }


  public void setAddEmployeeList(List<String> addEmployeeList) {
    this.addEmployeeList = addEmployeeList;
  }


  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel addEmployeeOpenIdList(List<String> addEmployeeOpenIdList) {
    
    this.addEmployeeOpenIdList = addEmployeeOpenIdList;
    return this;
  }

  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel addAddEmployeeOpenIdListItem(String addEmployeeOpenIdListItem) {
    if (this.addEmployeeOpenIdList == null) {
      this.addEmployeeOpenIdList = new ArrayList<>();
    }
    this.addEmployeeOpenIdList.add(addEmployeeOpenIdListItem);
    return this;
  }

   /**
   * 切换open_id后使用此字段： 需要添加的员工open_id列表 约束：一次最多50个
   * @return addEmployeeOpenIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abcdxxxx\"]", value = "切换open_id后使用此字段： 需要添加的员工open_id列表 约束：一次最多50个")

  public List<String> getAddEmployeeOpenIdList() {
    return addEmployeeOpenIdList;
  }


  public void setAddEmployeeOpenIdList(List<String> addEmployeeOpenIdList) {
    this.addEmployeeOpenIdList = addEmployeeOpenIdList;
  }


  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001112341234", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021040900152700950000000862", value = "项目ID")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel removeEmployeeList(List<String> removeEmployeeList) {
    
    this.removeEmployeeList = removeEmployeeList;
    return this;
  }

  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel addRemoveEmployeeListItem(String removeEmployeeListItem) {
    if (this.removeEmployeeList == null) {
      this.removeEmployeeList = new ArrayList<>();
    }
    this.removeEmployeeList.add(removeEmployeeListItem);
    return this;
  }

   /**
   * 切换open_id前使用此字段： 需要移除的员工UID列表 约束：一次最多50个
   * @return removeEmployeeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088402266062862\",\"2088402266060390\"]", value = "切换open_id前使用此字段： 需要移除的员工UID列表 约束：一次最多50个")

  public List<String> getRemoveEmployeeList() {
    return removeEmployeeList;
  }


  public void setRemoveEmployeeList(List<String> removeEmployeeList) {
    this.removeEmployeeList = removeEmployeeList;
  }


  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel removeEmployeeOpenIdList(List<String> removeEmployeeOpenIdList) {
    
    this.removeEmployeeOpenIdList = removeEmployeeOpenIdList;
    return this;
  }

  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel addRemoveEmployeeOpenIdListItem(String removeEmployeeOpenIdListItem) {
    if (this.removeEmployeeOpenIdList == null) {
      this.removeEmployeeOpenIdList = new ArrayList<>();
    }
    this.removeEmployeeOpenIdList.add(removeEmployeeOpenIdListItem);
    return this;
  }

   /**
   * 切换open_id后前使用此字段： 需要移除的员工open_id列表 约束：一次最多50个
   * @return removeEmployeeOpenIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abcdxxxx\"]", value = "切换open_id后前使用此字段： 需要移除的员工open_id列表 约束：一次最多50个")

  public List<String> getRemoveEmployeeOpenIdList() {
    return removeEmployeeOpenIdList;
  }


  public void setRemoveEmployeeOpenIdList(List<String> removeEmployeeOpenIdList) {
    this.removeEmployeeOpenIdList = removeEmployeeOpenIdList;
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
   * @return the AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel instance itself
   */
  public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel putAdditionalProperty(String key, Object value) {
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
    AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel alipayEbppInvoiceExpenserulesProjectemployeeModifyModel = (AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceExpenserulesProjectemployeeModifyModel.accountId) &&
        Objects.equals(this.addEmployeeList, alipayEbppInvoiceExpenserulesProjectemployeeModifyModel.addEmployeeList) &&
        Objects.equals(this.addEmployeeOpenIdList, alipayEbppInvoiceExpenserulesProjectemployeeModifyModel.addEmployeeOpenIdList) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceExpenserulesProjectemployeeModifyModel.agreementNo) &&
        Objects.equals(this.projectId, alipayEbppInvoiceExpenserulesProjectemployeeModifyModel.projectId) &&
        Objects.equals(this.removeEmployeeList, alipayEbppInvoiceExpenserulesProjectemployeeModifyModel.removeEmployeeList) &&
        Objects.equals(this.removeEmployeeOpenIdList, alipayEbppInvoiceExpenserulesProjectemployeeModifyModel.removeEmployeeOpenIdList)&&
        Objects.equals(this.additionalProperties, alipayEbppInvoiceExpenserulesProjectemployeeModifyModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, addEmployeeList, addEmployeeOpenIdList, agreementNo, projectId, removeEmployeeList, removeEmployeeOpenIdList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    addEmployeeList: ").append(toIndentedString(addEmployeeList)).append("\n");
    sb.append("    addEmployeeOpenIdList: ").append(toIndentedString(addEmployeeOpenIdList)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    removeEmployeeList: ").append(toIndentedString(removeEmployeeList)).append("\n");
    sb.append("    removeEmployeeOpenIdList: ").append(toIndentedString(removeEmployeeOpenIdList)).append("\n");
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
    openapiFields.add("add_employee_list");
    openapiFields.add("add_employee_open_id_list");
    openapiFields.add("agreement_no");
    openapiFields.add("project_id");
    openapiFields.add("remove_employee_list");
    openapiFields.add("remove_employee_open_id_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel is not found in the empty JSON string", AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("add_employee_list") != null && !jsonObj.get("add_employee_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add_employee_list` to be an array in the JSON string but got `%s`", jsonObj.get("add_employee_list").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("add_employee_open_id_list") != null && !jsonObj.get("add_employee_open_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add_employee_open_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("add_employee_open_id_list").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("remove_employee_list") != null && !jsonObj.get("remove_employee_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `remove_employee_list` to be an array in the JSON string but got `%s`", jsonObj.get("remove_employee_list").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("remove_employee_open_id_list") != null && !jsonObj.get("remove_employee_open_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `remove_employee_open_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("remove_employee_open_id_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel value) throws IOException {
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
           public AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel
  */
  public static AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

