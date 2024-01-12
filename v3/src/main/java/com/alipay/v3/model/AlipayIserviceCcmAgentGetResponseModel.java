/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2024-01-12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.AgentChatInfo;
import com.alipay.v3.model.AgentHotlineInfo;
import com.alipay.v3.model.RoleId;
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
 * AlipayIserviceCcmAgentGetResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmAgentGetResponseModel {
  public static final String SERIALIZED_NAME_ANSWERING_MODE = "answering_mode";
  @SerializedName(SERIALIZED_NAME_ANSWERING_MODE)
  private String answeringMode;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private String avatar;

  public static final String SERIALIZED_NAME_CCS_INSTANCE_IDS = "ccs_instance_ids";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_IDS)
  private List<String> ccsInstanceIds = null;

  public static final String SERIALIZED_NAME_CHAT_CONFIG = "chat_config";
  @SerializedName(SERIALIZED_NAME_CHAT_CONFIG)
  private List<AgentChatInfo> chatConfig = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private String creatorId;

  public static final String SERIALIZED_NAME_DINGTALK_USER_ID = "dingtalk_user_id";
  @SerializedName(SERIALIZED_NAME_DINGTALK_USER_ID)
  private String dingtalkUserId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_HOTLINE_CONFIG = "hotline_config";
  @SerializedName(SERIALIZED_NAME_HOTLINE_CONFIG)
  private List<AgentHotlineInfo> hotlineConfig = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_JOB_NUMBER = "job_number";
  @SerializedName(SERIALIZED_NAME_JOB_NUMBER)
  private String jobNumber;

  public static final String SERIALIZED_NAME_LAST_LOGIN_TIME = "last_login_time";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN_TIME)
  private String lastLoginTime;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_NICK_NAME = "nick_name";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private String profile;

  public static final String SERIALIZED_NAME_REAL_NAME = "real_name";
  @SerializedName(SERIALIZED_NAME_REAL_NAME)
  private String realName;

  public static final String SERIALIZED_NAME_ROLE_IDS = "role_ids";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private List<RoleId> roleIds = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_UPDATER_ID = "updater_id";
  @SerializedName(SERIALIZED_NAME_UPDATER_ID)
  private String updaterId;

  public AlipayIserviceCcmAgentGetResponseModel() { 
  }

  public AlipayIserviceCcmAgentGetResponseModel answeringMode(String answeringMode) {
    
    this.answeringMode = answeringMode;
    return this;
  }

   /**
   * 热线接入方式： 0：话机 1：电脑耳机；2：webrtc
   * @return answeringMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "热线接入方式： 0：话机 1：电脑耳机；2：webrtc")

  public String getAnsweringMode() {
    return answeringMode;
  }


  public void setAnsweringMode(String answeringMode) {
    this.answeringMode = answeringMode;
  }


  public AlipayIserviceCcmAgentGetResponseModel avatar(String avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * 头像的oss file key
   * @return avatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345", value = "头像的oss file key")

  public String getAvatar() {
    return avatar;
  }


  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public AlipayIserviceCcmAgentGetResponseModel ccsInstanceIds(List<String> ccsInstanceIds) {
    
    this.ccsInstanceIds = ccsInstanceIds;
    return this;
  }

  public AlipayIserviceCcmAgentGetResponseModel addCcsInstanceIdsItem(String ccsInstanceIdsItem) {
    if (this.ccsInstanceIds == null) {
      this.ccsInstanceIds = new ArrayList<>();
    }
    this.ccsInstanceIds.add(ccsInstanceIdsItem);
    return this;
  }

   /**
   * 客服关联的数据权限id列表
   * @return ccsInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZPASFSCN,QWT_SADLD", value = "客服关联的数据权限id列表")

  public List<String> getCcsInstanceIds() {
    return ccsInstanceIds;
  }


  public void setCcsInstanceIds(List<String> ccsInstanceIds) {
    this.ccsInstanceIds = ccsInstanceIds;
  }


  public AlipayIserviceCcmAgentGetResponseModel chatConfig(List<AgentChatInfo> chatConfig) {
    
    this.chatConfig = chatConfig;
    return this;
  }

  public AlipayIserviceCcmAgentGetResponseModel addChatConfigItem(AgentChatInfo chatConfigItem) {
    if (this.chatConfig == null) {
      this.chatConfig = new ArrayList<>();
    }
    this.chatConfig.add(chatConfigItem);
    return this;
  }

   /**
   * 客服在线信息
   * @return chatConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "客服在线信息")

  public List<AgentChatInfo> getChatConfig() {
    return chatConfig;
  }


  public void setChatConfig(List<AgentChatInfo> chatConfig) {
    this.chatConfig = chatConfig;
  }


  public AlipayIserviceCcmAgentGetResponseModel createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间，采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-15 17:58:27", value = "创建时间，采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AlipayIserviceCcmAgentGetResponseModel creatorId(String creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * 创建人id
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "246534573", value = "创建人id")

  public String getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public AlipayIserviceCcmAgentGetResponseModel dingtalkUserId(String dingtalkUserId) {
    
    this.dingtalkUserId = dingtalkUserId;
    return this;
  }

   /**
   * 钉钉user_id
   * @return dingtalkUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1293894912", value = "钉钉user_id")

  public String getDingtalkUserId() {
    return dingtalkUserId;
  }


  public void setDingtalkUserId(String dingtalkUserId) {
    this.dingtalkUserId = dingtalkUserId;
  }


  public AlipayIserviceCcmAgentGetResponseModel email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc@alipay.com", value = "邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AlipayIserviceCcmAgentGetResponseModel externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * 外部系统用户id,比如：金融云的用户id
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "112133", value = "外部系统用户id,比如：金融云的用户id")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public AlipayIserviceCcmAgentGetResponseModel hotlineConfig(List<AgentHotlineInfo> hotlineConfig) {
    
    this.hotlineConfig = hotlineConfig;
    return this;
  }

  public AlipayIserviceCcmAgentGetResponseModel addHotlineConfigItem(AgentHotlineInfo hotlineConfigItem) {
    if (this.hotlineConfig == null) {
      this.hotlineConfig = new ArrayList<>();
    }
    this.hotlineConfig.add(hotlineConfigItem);
    return this;
  }

   /**
   * 客服热线信息
   * @return hotlineConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "客服热线信息")

  public List<AgentHotlineInfo> getHotlineConfig() {
    return hotlineConfig;
  }


  public void setHotlineConfig(List<AgentHotlineInfo> hotlineConfig) {
    this.hotlineConfig = hotlineConfig;
  }


  public AlipayIserviceCcmAgentGetResponseModel id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 客服id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018101801902073", value = "客服id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AlipayIserviceCcmAgentGetResponseModel jobNumber(String jobNumber) {
    
    this.jobNumber = jobNumber;
    return this;
  }

   /**
   * 工号
   * @return jobNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0001", value = "工号")

  public String getJobNumber() {
    return jobNumber;
  }


  public void setJobNumber(String jobNumber) {
    this.jobNumber = jobNumber;
  }


  public AlipayIserviceCcmAgentGetResponseModel lastLoginTime(String lastLoginTime) {
    
    this.lastLoginTime = lastLoginTime;
    return this;
  }

   /**
   * 客服上次登录时间 采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
   * @return lastLoginTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-15 17:58:27", value = "客服上次登录时间 采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'")

  public String getLastLoginTime() {
    return lastLoginTime;
  }


  public void setLastLoginTime(String lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }


  public AlipayIserviceCcmAgentGetResponseModel mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * 手机号
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "17712341234", value = "手机号")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public AlipayIserviceCcmAgentGetResponseModel nickName(String nickName) {
    
    this.nickName = nickName;
    return this;
  }

   /**
   * 客服昵称
   * @return nickName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "风清扬", value = "客服昵称")

  public String getNickName() {
    return nickName;
  }


  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public AlipayIserviceCcmAgentGetResponseModel profile(String profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * 个人简介
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "我是玉树临风一表人才的张三", value = "个人简介")

  public String getProfile() {
    return profile;
  }


  public void setProfile(String profile) {
    this.profile = profile;
  }


  public AlipayIserviceCcmAgentGetResponseModel realName(String realName) {
    
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


  public AlipayIserviceCcmAgentGetResponseModel roleIds(List<RoleId> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public AlipayIserviceCcmAgentGetResponseModel addRoleIdsItem(RoleId roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * 角色id列表
   * @return roleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "角色id列表")

  public List<RoleId> getRoleIds() {
    return roleIds;
  }


  public void setRoleIds(List<RoleId> roleIds) {
    this.roleIds = roleIds;
  }


  public AlipayIserviceCcmAgentGetResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 客服状态：NORMAL，DELETE
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL", value = "客服状态：NORMAL，DELETE")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayIserviceCcmAgentGetResponseModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 用户类型：NORMAL（普通客服），ADMIN（超级管理员，不能被删除）
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL", value = "用户类型：NORMAL（普通客服），ADMIN（超级管理员，不能被删除）")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public AlipayIserviceCcmAgentGetResponseModel updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 最后修改时间，采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-15 17:58:27", value = "最后修改时间，采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'")

  public String getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public AlipayIserviceCcmAgentGetResponseModel updaterId(String updaterId) {
    
    this.updaterId = updaterId;
    return this;
  }

   /**
   * 最后修改人id
   * @return updaterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "246534573", value = "最后修改人id")

  public String getUpdaterId() {
    return updaterId;
  }


  public void setUpdaterId(String updaterId) {
    this.updaterId = updaterId;
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
   * @return the AlipayIserviceCcmAgentGetResponseModel instance itself
   */
  public AlipayIserviceCcmAgentGetResponseModel putAdditionalProperty(String key, Object value) {
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
    AlipayIserviceCcmAgentGetResponseModel alipayIserviceCcmAgentGetResponseModel = (AlipayIserviceCcmAgentGetResponseModel) o;
    return Objects.equals(this.answeringMode, alipayIserviceCcmAgentGetResponseModel.answeringMode) &&
        Objects.equals(this.avatar, alipayIserviceCcmAgentGetResponseModel.avatar) &&
        Objects.equals(this.ccsInstanceIds, alipayIserviceCcmAgentGetResponseModel.ccsInstanceIds) &&
        Objects.equals(this.chatConfig, alipayIserviceCcmAgentGetResponseModel.chatConfig) &&
        Objects.equals(this.createTime, alipayIserviceCcmAgentGetResponseModel.createTime) &&
        Objects.equals(this.creatorId, alipayIserviceCcmAgentGetResponseModel.creatorId) &&
        Objects.equals(this.dingtalkUserId, alipayIserviceCcmAgentGetResponseModel.dingtalkUserId) &&
        Objects.equals(this.email, alipayIserviceCcmAgentGetResponseModel.email) &&
        Objects.equals(this.externalId, alipayIserviceCcmAgentGetResponseModel.externalId) &&
        Objects.equals(this.hotlineConfig, alipayIserviceCcmAgentGetResponseModel.hotlineConfig) &&
        Objects.equals(this.id, alipayIserviceCcmAgentGetResponseModel.id) &&
        Objects.equals(this.jobNumber, alipayIserviceCcmAgentGetResponseModel.jobNumber) &&
        Objects.equals(this.lastLoginTime, alipayIserviceCcmAgentGetResponseModel.lastLoginTime) &&
        Objects.equals(this.mobile, alipayIserviceCcmAgentGetResponseModel.mobile) &&
        Objects.equals(this.nickName, alipayIserviceCcmAgentGetResponseModel.nickName) &&
        Objects.equals(this.profile, alipayIserviceCcmAgentGetResponseModel.profile) &&
        Objects.equals(this.realName, alipayIserviceCcmAgentGetResponseModel.realName) &&
        Objects.equals(this.roleIds, alipayIserviceCcmAgentGetResponseModel.roleIds) &&
        Objects.equals(this.status, alipayIserviceCcmAgentGetResponseModel.status) &&
        Objects.equals(this.type, alipayIserviceCcmAgentGetResponseModel.type) &&
        Objects.equals(this.updateTime, alipayIserviceCcmAgentGetResponseModel.updateTime) &&
        Objects.equals(this.updaterId, alipayIserviceCcmAgentGetResponseModel.updaterId)&&
        Objects.equals(this.additionalProperties, alipayIserviceCcmAgentGetResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answeringMode, avatar, ccsInstanceIds, chatConfig, createTime, creatorId, dingtalkUserId, email, externalId, hotlineConfig, id, jobNumber, lastLoginTime, mobile, nickName, profile, realName, roleIds, status, type, updateTime, updaterId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmAgentGetResponseModel {\n");
    sb.append("    answeringMode: ").append(toIndentedString(answeringMode)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    ccsInstanceIds: ").append(toIndentedString(ccsInstanceIds)).append("\n");
    sb.append("    chatConfig: ").append(toIndentedString(chatConfig)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    dingtalkUserId: ").append(toIndentedString(dingtalkUserId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    hotlineConfig: ").append(toIndentedString(hotlineConfig)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobNumber: ").append(toIndentedString(jobNumber)).append("\n");
    sb.append("    lastLoginTime: ").append(toIndentedString(lastLoginTime)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
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
    openapiFields.add("avatar");
    openapiFields.add("ccs_instance_ids");
    openapiFields.add("chat_config");
    openapiFields.add("create_time");
    openapiFields.add("creator_id");
    openapiFields.add("dingtalk_user_id");
    openapiFields.add("email");
    openapiFields.add("external_id");
    openapiFields.add("hotline_config");
    openapiFields.add("id");
    openapiFields.add("job_number");
    openapiFields.add("last_login_time");
    openapiFields.add("mobile");
    openapiFields.add("nick_name");
    openapiFields.add("profile");
    openapiFields.add("real_name");
    openapiFields.add("role_ids");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("update_time");
    openapiFields.add("updater_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmAgentGetResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmAgentGetResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmAgentGetResponseModel is not found in the empty JSON string", AlipayIserviceCcmAgentGetResponseModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("answering_mode") != null && !jsonObj.get("answering_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answering_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answering_mode").toString()));
      }
      if (jsonObj.get("avatar") != null && !jsonObj.get("avatar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("ccs_instance_ids") != null && !jsonObj.get("ccs_instance_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_ids` to be an array in the JSON string but got `%s`", jsonObj.get("ccs_instance_ids").toString()));
      }
      JsonArray jsonArraychatConfig = jsonObj.getAsJsonArray("chat_config");
      if (jsonArraychatConfig != null) {
        // ensure the json data is an array
        if (!jsonObj.get("chat_config").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `chat_config` to be an array in the JSON string but got `%s`", jsonObj.get("chat_config").toString()));
        }

        // validate the optional field `chat_config` (array)
        for (int i = 0; i < jsonArraychatConfig.size(); i++) {
          AgentChatInfo.validateJsonObject(jsonArraychatConfig.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("creator_id") != null && !jsonObj.get("creator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_id").toString()));
      }
      if (jsonObj.get("dingtalk_user_id") != null && !jsonObj.get("dingtalk_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dingtalk_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dingtalk_user_id").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      JsonArray jsonArrayhotlineConfig = jsonObj.getAsJsonArray("hotline_config");
      if (jsonArrayhotlineConfig != null) {
        // ensure the json data is an array
        if (!jsonObj.get("hotline_config").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `hotline_config` to be an array in the JSON string but got `%s`", jsonObj.get("hotline_config").toString()));
        }

        // validate the optional field `hotline_config` (array)
        for (int i = 0; i < jsonArrayhotlineConfig.size(); i++) {
          AgentHotlineInfo.validateJsonObject(jsonArrayhotlineConfig.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("job_number") != null && !jsonObj.get("job_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_number").toString()));
      }
      if (jsonObj.get("last_login_time") != null && !jsonObj.get("last_login_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_login_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_login_time").toString()));
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (jsonObj.get("nick_name") != null && !jsonObj.get("nick_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nick_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nick_name").toString()));
      }
      if (jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile").toString()));
      }
      if (jsonObj.get("real_name") != null && !jsonObj.get("real_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_name").toString()));
      }
      JsonArray jsonArrayroleIds = jsonObj.getAsJsonArray("role_ids");
      if (jsonArrayroleIds != null) {
        // ensure the json data is an array
        if (!jsonObj.get("role_ids").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `role_ids` to be an array in the JSON string but got `%s`", jsonObj.get("role_ids").toString()));
        }

        // validate the optional field `role_ids` (array)
        for (int i = 0; i < jsonArrayroleIds.size(); i++) {
          RoleId.validateJsonObject(jsonArrayroleIds.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("update_time") != null && !jsonObj.get("update_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `update_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("update_time").toString()));
      }
      if (jsonObj.get("updater_id") != null && !jsonObj.get("updater_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updater_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updater_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmAgentGetResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmAgentGetResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmAgentGetResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmAgentGetResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmAgentGetResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmAgentGetResponseModel value) throws IOException {
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
           public AlipayIserviceCcmAgentGetResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayIserviceCcmAgentGetResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayIserviceCcmAgentGetResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmAgentGetResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmAgentGetResponseModel
  */
  public static AlipayIserviceCcmAgentGetResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmAgentGetResponseModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmAgentGetResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

