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
import com.alipay.v3.model.Article;
import com.alipay.v3.model.Text;
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
 * AlipayOpenPublicMessageCustomSendModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicMessageCustomSendModel {
  public static final String SERIALIZED_NAME_ARTICLES = "articles";
  @SerializedName(SERIALIZED_NAME_ARTICLES)
  private List<Article> articles = null;

  public static final String SERIALIZED_NAME_CHAT = "chat";
  @SerializedName(SERIALIZED_NAME_CHAT)
  private String chat;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_MSG_TYPE = "msg_type";
  @SerializedName(SERIALIZED_NAME_MSG_TYPE)
  private String msgType;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private Text text;

  public static final String SERIALIZED_NAME_TO_USER_ID = "to_user_id";
  @SerializedName(SERIALIZED_NAME_TO_USER_ID)
  private String toUserId;

  public AlipayOpenPublicMessageCustomSendModel() { 
  }

  public AlipayOpenPublicMessageCustomSendModel articles(List<Article> articles) {
    
    this.articles = articles;
    return this;
  }

  public AlipayOpenPublicMessageCustomSendModel addArticlesItem(Article articlesItem) {
    if (this.articles == null) {
      this.articles = new ArrayList<>();
    }
    this.articles.add(articlesItem);
    return this;
  }

   /**
   * msg_type为image-text，本参数必填。 
   * @return articles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "msg_type为image-text，本参数必填。 ")

  public List<Article> getArticles() {
    return articles;
  }


  public void setArticles(List<Article> articles) {
    this.articles = articles;
  }


  public AlipayOpenPublicMessageCustomSendModel chat(String chat) {
    
    this.chat = chat;
    return this;
  }

   /**
   * 是否为聊天消息。枚举支持： *0：代表非聊天消息，消息显示在生活号主页，默认为 0。 *1：代表是聊天消息，消息显示在咨询反馈列表页。
   * @return chat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "是否为聊天消息。枚举支持： *0：代表非聊天消息，消息显示在生活号主页，默认为 0。 *1：代表是聊天消息，消息显示在咨询反馈列表页。")

  public String getChat() {
    return chat;
  }


  public void setChat(String chat) {
    this.chat = chat;
  }


  public AlipayOpenPublicMessageCustomSendModel eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * 触发消息的事件类型，默认为空。代表商户未改造。如果是follow，代表关注消息。click代表菜单点击，enter_ppchat代表进入事件；请注意事件类型的大小写
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "follow", value = "触发消息的事件类型，默认为空。代表商户未改造。如果是follow，代表关注消息。click代表菜单点击，enter_ppchat代表进入事件；请注意事件类型的大小写")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public AlipayOpenPublicMessageCustomSendModel msgType(String msgType) {
    
    this.msgType = msgType;
    return this;
  }

   /**
   * 消息类型。枚举支持： * text：表示文本消息； * image-text：表示图文消息。
   * @return msgType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "text", value = "消息类型。枚举支持： * text：表示文本消息； * image-text：表示图文消息。")

  public String getMsgType() {
    return msgType;
  }


  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }


  public AlipayOpenPublicMessageCustomSendModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户的唯一标识
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户的唯一标识")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayOpenPublicMessageCustomSendModel text(Text text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Text getText() {
    return text;
  }


  public void setText(Text text) {
    this.text = text;
  }


  public AlipayOpenPublicMessageCustomSendModel toUserId(String toUserId) {
    
    this.toUserId = toUserId;
    return this;
  }

   /**
   * 消息接收用户的userid
   * @return toUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088283746283746", value = "消息接收用户的userid")

  public String getToUserId() {
    return toUserId;
  }


  public void setToUserId(String toUserId) {
    this.toUserId = toUserId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicMessageCustomSendModel alipayOpenPublicMessageCustomSendModel = (AlipayOpenPublicMessageCustomSendModel) o;
    return Objects.equals(this.articles, alipayOpenPublicMessageCustomSendModel.articles) &&
        Objects.equals(this.chat, alipayOpenPublicMessageCustomSendModel.chat) &&
        Objects.equals(this.eventType, alipayOpenPublicMessageCustomSendModel.eventType) &&
        Objects.equals(this.msgType, alipayOpenPublicMessageCustomSendModel.msgType) &&
        Objects.equals(this.openId, alipayOpenPublicMessageCustomSendModel.openId) &&
        Objects.equals(this.text, alipayOpenPublicMessageCustomSendModel.text) &&
        Objects.equals(this.toUserId, alipayOpenPublicMessageCustomSendModel.toUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articles, chat, eventType, msgType, openId, text, toUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicMessageCustomSendModel {\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
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
    openapiFields.add("articles");
    openapiFields.add("chat");
    openapiFields.add("event_type");
    openapiFields.add("msg_type");
    openapiFields.add("open_id");
    openapiFields.add("text");
    openapiFields.add("to_user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicMessageCustomSendModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicMessageCustomSendModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicMessageCustomSendModel is not found in the empty JSON string", AlipayOpenPublicMessageCustomSendModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicMessageCustomSendModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicMessageCustomSendModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayarticles = jsonObj.getAsJsonArray("articles");
      if (jsonArrayarticles != null) {
        // ensure the json data is an array
        if (!jsonObj.get("articles").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `articles` to be an array in the JSON string but got `%s`", jsonObj.get("articles").toString()));
        }

        // validate the optional field `articles` (array)
        for (int i = 0; i < jsonArrayarticles.size(); i++) {
          Article.validateJsonObject(jsonArrayarticles.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("chat") != null && !jsonObj.get("chat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chat").toString()));
      }
      if (jsonObj.get("event_type") != null && !jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
      if (jsonObj.get("msg_type") != null && !jsonObj.get("msg_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg_type").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      // validate the optional field `text`
      if (jsonObj.getAsJsonObject("text") != null) {
        Text.validateJsonObject(jsonObj.getAsJsonObject("text"));
      }
      if (jsonObj.get("to_user_id") != null && !jsonObj.get("to_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to_user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicMessageCustomSendModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicMessageCustomSendModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicMessageCustomSendModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicMessageCustomSendModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicMessageCustomSendModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicMessageCustomSendModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicMessageCustomSendModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicMessageCustomSendModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicMessageCustomSendModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicMessageCustomSendModel
  */
  public static AlipayOpenPublicMessageCustomSendModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicMessageCustomSendModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicMessageCustomSendModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

