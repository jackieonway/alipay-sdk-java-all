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
 * AlipayOpenMiniInnerappPluginsyncmodeModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerappPluginsyncmodeModifyModel {
  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private String appOrigin;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_PLUGIN_ID = "plugin_id";
  @SerializedName(SERIALIZED_NAME_PLUGIN_ID)
  private String pluginId;

  public static final String SERIALIZED_NAME_SYNC_MODE = "sync_mode";
  @SerializedName(SERIALIZED_NAME_SYNC_MODE)
  private String syncMode;

  public AlipayOpenMiniInnerappPluginsyncmodeModifyModel() { 
  }

  public AlipayOpenMiniInnerappPluginsyncmodeModifyModel appOrigin(String appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * 来源
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-", value = "来源")

  public String getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(String appOrigin) {
    this.appOrigin = appOrigin;
  }


  public AlipayOpenMiniInnerappPluginsyncmodeModifyModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序应用 ID，
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001177654214", value = "小程序应用 ID，")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniInnerappPluginsyncmodeModifyModel pluginId(String pluginId) {
    
    this.pluginId = pluginId;
    return this;
  }

   /**
   * 插件id
   * @return pluginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021002146679702", value = "插件id")

  public String getPluginId() {
    return pluginId;
  }


  public void setPluginId(String pluginId) {
    this.pluginId = pluginId;
  }


  public AlipayOpenMiniInnerappPluginsyncmodeModifyModel syncMode(String syncMode) {
    
    this.syncMode = syncMode;
    return this;
  }

   /**
   * 模式，SYNC/NONE
   * @return syncMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SYNC", value = "模式，SYNC/NONE")

  public String getSyncMode() {
    return syncMode;
  }


  public void setSyncMode(String syncMode) {
    this.syncMode = syncMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerappPluginsyncmodeModifyModel alipayOpenMiniInnerappPluginsyncmodeModifyModel = (AlipayOpenMiniInnerappPluginsyncmodeModifyModel) o;
    return Objects.equals(this.appOrigin, alipayOpenMiniInnerappPluginsyncmodeModifyModel.appOrigin) &&
        Objects.equals(this.miniAppId, alipayOpenMiniInnerappPluginsyncmodeModifyModel.miniAppId) &&
        Objects.equals(this.pluginId, alipayOpenMiniInnerappPluginsyncmodeModifyModel.pluginId) &&
        Objects.equals(this.syncMode, alipayOpenMiniInnerappPluginsyncmodeModifyModel.syncMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appOrigin, miniAppId, pluginId, syncMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerappPluginsyncmodeModifyModel {\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
    sb.append("    syncMode: ").append(toIndentedString(syncMode)).append("\n");
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
    openapiFields.add("app_origin");
    openapiFields.add("mini_app_id");
    openapiFields.add("plugin_id");
    openapiFields.add("sync_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerappPluginsyncmodeModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerappPluginsyncmodeModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerappPluginsyncmodeModifyModel is not found in the empty JSON string", AlipayOpenMiniInnerappPluginsyncmodeModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerappPluginsyncmodeModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerappPluginsyncmodeModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_origin") != null && !jsonObj.get("app_origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_origin").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("plugin_id") != null && !jsonObj.get("plugin_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_id").toString()));
      }
      if (jsonObj.get("sync_mode") != null && !jsonObj.get("sync_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sync_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sync_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerappPluginsyncmodeModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerappPluginsyncmodeModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerappPluginsyncmodeModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerappPluginsyncmodeModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerappPluginsyncmodeModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerappPluginsyncmodeModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerappPluginsyncmodeModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerappPluginsyncmodeModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerappPluginsyncmodeModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerappPluginsyncmodeModifyModel
  */
  public static AlipayOpenMiniInnerappPluginsyncmodeModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerappPluginsyncmodeModifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerappPluginsyncmodeModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

