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
import com.alipay.v3.model.ButtonObject;
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
 * AlipayOpenPublicMenuModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicMenuModifyModel {
  public static final String SERIALIZED_NAME_BUTTON = "button";
  @SerializedName(SERIALIZED_NAME_BUTTON)
  private List<ButtonObject> button = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AlipayOpenPublicMenuModifyModel() { 
  }

  public AlipayOpenPublicMenuModifyModel button(List<ButtonObject> button) {
    
    this.button = button;
    return this;
  }

  public AlipayOpenPublicMenuModifyModel addButtonItem(ButtonObject buttonItem) {
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


  public AlipayOpenPublicMenuModifyModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 菜单类型，不填时默认为 text（文本型菜单）。枚举值如下： * text：文本型菜单。 * icon：表示 icon 型菜单，当传值为\&quot;icon\&quot;时，菜单节点的icon字段必传。
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "icon", value = "菜单类型，不填时默认为 text（文本型菜单）。枚举值如下： * text：文本型菜单。 * icon：表示 icon 型菜单，当传值为\"icon\"时，菜单节点的icon字段必传。")

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
    AlipayOpenPublicMenuModifyModel alipayOpenPublicMenuModifyModel = (AlipayOpenPublicMenuModifyModel) o;
    return Objects.equals(this.button, alipayOpenPublicMenuModifyModel.button) &&
        Objects.equals(this.type, alipayOpenPublicMenuModifyModel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(button, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicMenuModifyModel {\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
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
    openapiFields.add("button");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicMenuModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicMenuModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicMenuModifyModel is not found in the empty JSON string", AlipayOpenPublicMenuModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicMenuModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicMenuModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicMenuModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicMenuModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicMenuModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicMenuModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicMenuModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicMenuModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicMenuModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicMenuModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicMenuModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicMenuModifyModel
  */
  public static AlipayOpenPublicMenuModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicMenuModifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicMenuModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

