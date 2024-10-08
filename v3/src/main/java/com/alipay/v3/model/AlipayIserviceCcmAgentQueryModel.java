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
 * AlipayIserviceCcmAgentQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmAgentQueryModel {
  public static final String SERIALIZED_NAME_ANSWERING_MODE = "answering_mode";
  @SerializedName(SERIALIZED_NAME_ANSWERING_MODE)
  private String answeringMode;

  public static final String SERIALIZED_NAME_CCS_INSTANCE_ID = "ccs_instance_id";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_ID)
  private String ccsInstanceId;

  public static final String SERIALIZED_NAME_CHAT_EXT_GROUP_IDS = "chat_ext_group_ids";
  @SerializedName(SERIALIZED_NAME_CHAT_EXT_GROUP_IDS)
  private List<String> chatExtGroupIds = null;

  public static final String SERIALIZED_NAME_CHAT_GROUP_IDS = "chat_group_ids";
  @SerializedName(SERIALIZED_NAME_CHAT_GROUP_IDS)
  private List<String> chatGroupIds = null;

  public static final String SERIALIZED_NAME_CHAT_LEVEL_IDS = "chat_level_ids";
  @SerializedName(SERIALIZED_NAME_CHAT_LEVEL_IDS)
  private List<String> chatLevelIds = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_HOTLINE_GROUP_IDS = "hotline_group_ids";
  @SerializedName(SERIALIZED_NAME_HOTLINE_GROUP_IDS)
  private List<String> hotlineGroupIds = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_REAL_NAME = "real_name";
  @SerializedName(SERIALIZED_NAME_REAL_NAME)
  private String realName;

  public static final String SERIALIZED_NAME_ROLE_IDS = "role_ids";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private List<String> roleIds = null;

  public AlipayIserviceCcmAgentQueryModel() { 
  }

  public AlipayIserviceCcmAgentQueryModel answeringMode(String answeringMode) {
    
    this.answeringMode = answeringMode;
    return this;
  }

   /**
   * 热线接入方式
   * @return answeringMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "热线接入方式")

  public String getAnsweringMode() {
    return answeringMode;
  }


  public void setAnsweringMode(String answeringMode) {
    this.answeringMode = answeringMode;
  }


  public AlipayIserviceCcmAgentQueryModel ccsInstanceId(String ccsInstanceId) {
    
    this.ccsInstanceId = ccsInstanceId;
    return this;
  }

   /**
   * 部门id
   * @return ccsInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XAHSNRBS", value = "部门id")

  public String getCcsInstanceId() {
    return ccsInstanceId;
  }


  public void setCcsInstanceId(String ccsInstanceId) {
    this.ccsInstanceId = ccsInstanceId;
  }


  public AlipayIserviceCcmAgentQueryModel chatExtGroupIds(List<String> chatExtGroupIds) {
    
    this.chatExtGroupIds = chatExtGroupIds;
    return this;
  }

  public AlipayIserviceCcmAgentQueryModel addChatExtGroupIdsItem(String chatExtGroupIdsItem) {
    if (this.chatExtGroupIds == null) {
      this.chatExtGroupIds = new ArrayList<>();
    }
    this.chatExtGroupIds.add(chatExtGroupIdsItem);
    return this;
  }

   /**
   * 在线扩展技能组id
   * @return chatExtGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"123\"]", value = "在线扩展技能组id")

  public List<String> getChatExtGroupIds() {
    return chatExtGroupIds;
  }


  public void setChatExtGroupIds(List<String> chatExtGroupIds) {
    this.chatExtGroupIds = chatExtGroupIds;
  }


  public AlipayIserviceCcmAgentQueryModel chatGroupIds(List<String> chatGroupIds) {
    
    this.chatGroupIds = chatGroupIds;
    return this;
  }

  public AlipayIserviceCcmAgentQueryModel addChatGroupIdsItem(String chatGroupIdsItem) {
    if (this.chatGroupIds == null) {
      this.chatGroupIds = new ArrayList<>();
    }
    this.chatGroupIds.add(chatGroupIdsItem);
    return this;
  }

   /**
   * 在线技能组id
   * @return chatGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"123\"]", value = "在线技能组id")

  public List<String> getChatGroupIds() {
    return chatGroupIds;
  }


  public void setChatGroupIds(List<String> chatGroupIds) {
    this.chatGroupIds = chatGroupIds;
  }


  public AlipayIserviceCcmAgentQueryModel chatLevelIds(List<String> chatLevelIds) {
    
    this.chatLevelIds = chatLevelIds;
    return this;
  }

  public AlipayIserviceCcmAgentQueryModel addChatLevelIdsItem(String chatLevelIdsItem) {
    if (this.chatLevelIds == null) {
      this.chatLevelIds = new ArrayList<>();
    }
    this.chatLevelIds.add(chatLevelIdsItem);
    return this;
  }

   /**
   * 在线服务等级
   * @return chatLevelIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"123\"]", value = "在线服务等级")

  public List<String> getChatLevelIds() {
    return chatLevelIds;
  }


  public void setChatLevelIds(List<String> chatLevelIds) {
    this.chatLevelIds = chatLevelIds;
  }


  public AlipayIserviceCcmAgentQueryModel email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 客服邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test@163.com", value = "客服邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AlipayIserviceCcmAgentQueryModel hotlineGroupIds(List<String> hotlineGroupIds) {
    
    this.hotlineGroupIds = hotlineGroupIds;
    return this;
  }

  public AlipayIserviceCcmAgentQueryModel addHotlineGroupIdsItem(String hotlineGroupIdsItem) {
    if (this.hotlineGroupIds == null) {
      this.hotlineGroupIds = new ArrayList<>();
    }
    this.hotlineGroupIds.add(hotlineGroupIdsItem);
    return this;
  }

   /**
   * 热线扩展技能组id
   * @return hotlineGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"123\"]", value = "热线扩展技能组id")

  public List<String> getHotlineGroupIds() {
    return hotlineGroupIds;
  }


  public void setHotlineGroupIds(List<String> hotlineGroupIds) {
    this.hotlineGroupIds = hotlineGroupIds;
  }


  public AlipayIserviceCcmAgentQueryModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 查询结果的页码，起始值为 1，默认值为 1
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "查询结果的页码，起始值为 1，默认值为 1")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayIserviceCcmAgentQueryModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页查询时设置的每页记录数，最大值 100 行，默认为 10
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "分页查询时设置的每页记录数，最大值 100 行，默认为 10")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayIserviceCcmAgentQueryModel realName(String realName) {
    
    this.realName = realName;
    return this;
  }

   /**
   * 客服姓名
   * @return realName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "客服姓名")

  public String getRealName() {
    return realName;
  }


  public void setRealName(String realName) {
    this.realName = realName;
  }


  public AlipayIserviceCcmAgentQueryModel roleIds(List<String> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public AlipayIserviceCcmAgentQueryModel addRoleIdsItem(String roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * 客服角色id
   * @return roleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"123\"]", value = "客服角色id")

  public List<String> getRoleIds() {
    return roleIds;
  }


  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
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
   * @return the AlipayIserviceCcmAgentQueryModel instance itself
   */
  public AlipayIserviceCcmAgentQueryModel putAdditionalProperty(String key, Object value) {
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
    AlipayIserviceCcmAgentQueryModel alipayIserviceCcmAgentQueryModel = (AlipayIserviceCcmAgentQueryModel) o;
    return Objects.equals(this.answeringMode, alipayIserviceCcmAgentQueryModel.answeringMode) &&
        Objects.equals(this.ccsInstanceId, alipayIserviceCcmAgentQueryModel.ccsInstanceId) &&
        Objects.equals(this.chatExtGroupIds, alipayIserviceCcmAgentQueryModel.chatExtGroupIds) &&
        Objects.equals(this.chatGroupIds, alipayIserviceCcmAgentQueryModel.chatGroupIds) &&
        Objects.equals(this.chatLevelIds, alipayIserviceCcmAgentQueryModel.chatLevelIds) &&
        Objects.equals(this.email, alipayIserviceCcmAgentQueryModel.email) &&
        Objects.equals(this.hotlineGroupIds, alipayIserviceCcmAgentQueryModel.hotlineGroupIds) &&
        Objects.equals(this.pageNum, alipayIserviceCcmAgentQueryModel.pageNum) &&
        Objects.equals(this.pageSize, alipayIserviceCcmAgentQueryModel.pageSize) &&
        Objects.equals(this.realName, alipayIserviceCcmAgentQueryModel.realName) &&
        Objects.equals(this.roleIds, alipayIserviceCcmAgentQueryModel.roleIds)&&
        Objects.equals(this.additionalProperties, alipayIserviceCcmAgentQueryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answeringMode, ccsInstanceId, chatExtGroupIds, chatGroupIds, chatLevelIds, email, hotlineGroupIds, pageNum, pageSize, realName, roleIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmAgentQueryModel {\n");
    sb.append("    answeringMode: ").append(toIndentedString(answeringMode)).append("\n");
    sb.append("    ccsInstanceId: ").append(toIndentedString(ccsInstanceId)).append("\n");
    sb.append("    chatExtGroupIds: ").append(toIndentedString(chatExtGroupIds)).append("\n");
    sb.append("    chatGroupIds: ").append(toIndentedString(chatGroupIds)).append("\n");
    sb.append("    chatLevelIds: ").append(toIndentedString(chatLevelIds)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    hotlineGroupIds: ").append(toIndentedString(hotlineGroupIds)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
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
    openapiFields.add("answering_mode");
    openapiFields.add("ccs_instance_id");
    openapiFields.add("chat_ext_group_ids");
    openapiFields.add("chat_group_ids");
    openapiFields.add("chat_level_ids");
    openapiFields.add("email");
    openapiFields.add("hotline_group_ids");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("real_name");
    openapiFields.add("role_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmAgentQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmAgentQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmAgentQueryModel is not found in the empty JSON string", AlipayIserviceCcmAgentQueryModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("answering_mode") != null && !jsonObj.get("answering_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answering_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answering_mode").toString()));
      }
      if (jsonObj.get("ccs_instance_id") != null && !jsonObj.get("ccs_instance_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ccs_instance_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("chat_ext_group_ids") != null && !jsonObj.get("chat_ext_group_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `chat_ext_group_ids` to be an array in the JSON string but got `%s`", jsonObj.get("chat_ext_group_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("chat_group_ids") != null && !jsonObj.get("chat_group_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `chat_group_ids` to be an array in the JSON string but got `%s`", jsonObj.get("chat_group_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("chat_level_ids") != null && !jsonObj.get("chat_level_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `chat_level_ids` to be an array in the JSON string but got `%s`", jsonObj.get("chat_level_ids").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("hotline_group_ids") != null && !jsonObj.get("hotline_group_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hotline_group_ids` to be an array in the JSON string but got `%s`", jsonObj.get("hotline_group_ids").toString()));
      }
      if (jsonObj.get("real_name") != null && !jsonObj.get("real_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_name").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("role_ids") != null && !jsonObj.get("role_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `role_ids` to be an array in the JSON string but got `%s`", jsonObj.get("role_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmAgentQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmAgentQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmAgentQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmAgentQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmAgentQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmAgentQueryModel value) throws IOException {
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
           public AlipayIserviceCcmAgentQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayIserviceCcmAgentQueryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayIserviceCcmAgentQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmAgentQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmAgentQueryModel
  */
  public static AlipayIserviceCcmAgentQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmAgentQueryModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmAgentQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

