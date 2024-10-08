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
import com.alipay.v3.model.ButtonObject;
import com.alipay.v3.model.LabelRule;
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
 * AlipayOpenPublicPersonalizedMenuCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicPersonalizedMenuCreateModel {
  public static final String SERIALIZED_NAME_BUTTON = "button";
  @SerializedName(SERIALIZED_NAME_BUTTON)
  private List<ButtonObject> button = null;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_LABEL_RULE = "label_rule";
  @SerializedName(SERIALIZED_NAME_LABEL_RULE)
  private List<LabelRule> labelRule = null;

  public static final String SERIALIZED_NAME_MOBILE_CLIENT_TYPE = "mobile_client_type";
  @SerializedName(SERIALIZED_NAME_MOBILE_CLIENT_TYPE)
  private String mobileClientType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AlipayOpenPublicPersonalizedMenuCreateModel() { 
  }

  public AlipayOpenPublicPersonalizedMenuCreateModel button(List<ButtonObject> button) {
    
    this.button = button;
    return this;
  }

  public AlipayOpenPublicPersonalizedMenuCreateModel addButtonItem(ButtonObject buttonItem) {
    if (this.button == null) {
      this.button = new ArrayList<>();
    }
    this.button.add(buttonItem);
    return this;
  }

   /**
   * 一级菜单列表。说明： * 如果是文本菜单，最多有4个一级菜单，若开发者在后台打开了\&quot;咨询反馈\&quot;的开关，则只能有3个一级菜单。 * 如果是 ICON 菜单信息，最多有80个一级菜单(忽略二级菜单)。
   * @return button
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "一级菜单列表。说明： * 如果是文本菜单，最多有4个一级菜单，若开发者在后台打开了\"咨询反馈\"的开关，则只能有3个一级菜单。 * 如果是 ICON 菜单信息，最多有80个一级菜单(忽略二级菜单)。")

  public List<ButtonObject> getButton() {
    return button;
  }


  public void setButton(List<ButtonObject> button) {
    this.button = button;
  }


  public AlipayOpenPublicPersonalizedMenuCreateModel groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 人群分组id。分组创建及管理接入详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/fw/api/106931\&quot;&gt;分组管理&lt;/a&gt;。 注意：group_id 与 label_rule（标签规则）不能同时为空。
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RQ20190917100100000001", value = "人群分组id。分组创建及管理接入详情参见 <a href=\"https://opendocs.alipay.com/fw/api/106931\">分组管理</a>。 注意：group_id 与 label_rule（标签规则）不能同时为空。")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public AlipayOpenPublicPersonalizedMenuCreateModel labelRule(List<LabelRule> labelRule) {
    
    this.labelRule = labelRule;
    return this;
  }

  public AlipayOpenPublicPersonalizedMenuCreateModel addLabelRuleItem(LabelRule labelRuleItem) {
    if (this.labelRule == null) {
      this.labelRule = new ArrayList<>();
    }
    this.labelRule.add(labelRuleItem);
    return this;
  }

   /**
   * 标签规则，目前限定只能传入1条，在个性化菜单创建成功后，满足该标签规则的用户进入生活号首页，将看到该套菜单。生成标签及打标详情参见&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/fw/api/106877\&quot;&gt;标签管理&lt;/a&gt;。 注意：group_id（人群分组id） 与 label_rule 不能同时为空。
   * @return labelRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签规则，目前限定只能传入1条，在个性化菜单创建成功后，满足该标签规则的用户进入生活号首页，将看到该套菜单。生成标签及打标详情参见<a href=\"https://opendocs.alipay.com/fw/api/106877\">标签管理</a>。 注意：group_id（人群分组id） 与 label_rule 不能同时为空。")

  public List<LabelRule> getLabelRule() {
    return labelRule;
  }


  public void setLabelRule(List<LabelRule> labelRule) {
    this.labelRule = labelRule;
  }


  public AlipayOpenPublicPersonalizedMenuCreateModel mobileClientType(String mobileClientType) {
    
    this.mobileClientType = mobileClientType;
    return this;
  }

   /**
   * 手机客户端类型，枚举支持： *iphone； *android； *wp； 说明：不填为不区分机型。
   * @return mobileClientType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "android", value = "手机客户端类型，枚举支持： *iphone； *android； *wp； 说明：不填为不区分机型。")

  public String getMobileClientType() {
    return mobileClientType;
  }


  public void setMobileClientType(String mobileClientType) {
    this.mobileClientType = mobileClientType;
  }


  public AlipayOpenPublicPersonalizedMenuCreateModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 菜单类型，不填时默认为 text（文本型菜单）。枚举值如下： * text：文本型菜单。 * icon：表示 icon 型菜单，当传值为\&quot;icon\&quot;时，菜单节点的icon字段必传。
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "text", value = "菜单类型，不填时默认为 text（文本型菜单）。枚举值如下： * text：文本型菜单。 * icon：表示 icon 型菜单，当传值为\"icon\"时，菜单节点的icon字段必传。")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
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
   * @return the AlipayOpenPublicPersonalizedMenuCreateModel instance itself
   */
  public AlipayOpenPublicPersonalizedMenuCreateModel putAdditionalProperty(String key, Object value) {
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
    AlipayOpenPublicPersonalizedMenuCreateModel alipayOpenPublicPersonalizedMenuCreateModel = (AlipayOpenPublicPersonalizedMenuCreateModel) o;
    return Objects.equals(this.button, alipayOpenPublicPersonalizedMenuCreateModel.button) &&
        Objects.equals(this.groupId, alipayOpenPublicPersonalizedMenuCreateModel.groupId) &&
        Objects.equals(this.labelRule, alipayOpenPublicPersonalizedMenuCreateModel.labelRule) &&
        Objects.equals(this.mobileClientType, alipayOpenPublicPersonalizedMenuCreateModel.mobileClientType) &&
        Objects.equals(this.type, alipayOpenPublicPersonalizedMenuCreateModel.type)&&
        Objects.equals(this.additionalProperties, alipayOpenPublicPersonalizedMenuCreateModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(button, groupId, labelRule, mobileClientType, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicPersonalizedMenuCreateModel {\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    labelRule: ").append(toIndentedString(labelRule)).append("\n");
    sb.append("    mobileClientType: ").append(toIndentedString(mobileClientType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("button");
    openapiFields.add("group_id");
    openapiFields.add("label_rule");
    openapiFields.add("mobile_client_type");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicPersonalizedMenuCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicPersonalizedMenuCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicPersonalizedMenuCreateModel is not found in the empty JSON string", AlipayOpenPublicPersonalizedMenuCreateModel.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArraybutton = jsonObj.getAsJsonArray("button");
      if (jsonArraybutton != null) {
        // ensure the json data is an array
        if (!jsonObj.get("button").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `button` to be an array in the JSON string but got `%s`", jsonObj.get("button").toString()));
        }

        // validate the optional field `button` (array)
        for (int i = 0; i < jsonArraybutton.size(); i++) {
          ButtonObject.validateJsonObject(jsonArraybutton.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("group_id") != null && !jsonObj.get("group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_id").toString()));
      }
      JsonArray jsonArraylabelRule = jsonObj.getAsJsonArray("label_rule");
      if (jsonArraylabelRule != null) {
        // ensure the json data is an array
        if (!jsonObj.get("label_rule").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `label_rule` to be an array in the JSON string but got `%s`", jsonObj.get("label_rule").toString()));
        }

        // validate the optional field `label_rule` (array)
        for (int i = 0; i < jsonArraylabelRule.size(); i++) {
          LabelRule.validateJsonObject(jsonArraylabelRule.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("mobile_client_type") != null && !jsonObj.get("mobile_client_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_client_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_client_type").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicPersonalizedMenuCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicPersonalizedMenuCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicPersonalizedMenuCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicPersonalizedMenuCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicPersonalizedMenuCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicPersonalizedMenuCreateModel value) throws IOException {
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
           public AlipayOpenPublicPersonalizedMenuCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayOpenPublicPersonalizedMenuCreateModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayOpenPublicPersonalizedMenuCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicPersonalizedMenuCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicPersonalizedMenuCreateModel
  */
  public static AlipayOpenPublicPersonalizedMenuCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicPersonalizedMenuCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicPersonalizedMenuCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

