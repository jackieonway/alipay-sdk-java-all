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
import com.alipay.v3.model.Matcher;
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
 * AlipayOpenPublicMatchuserLabelDeleteModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicMatchuserLabelDeleteModel {
  public static final String SERIALIZED_NAME_LABEL_ID = "label_id";
  @SerializedName(SERIALIZED_NAME_LABEL_ID)
  private String labelId;

  public static final String SERIALIZED_NAME_MATCHERS = "matchers";
  @SerializedName(SERIALIZED_NAME_MATCHERS)
  private List<Matcher> matchers = null;

  public AlipayOpenPublicMatchuserLabelDeleteModel() { 
  }

  public AlipayOpenPublicMatchuserLabelDeleteModel labelId(String labelId) {
    
    this.labelId = labelId;
    return this;
  }

   /**
   * 标签 id，只支持生活号自定义标签。通过 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/api_6/alipay.open.public.life.label.create\&quot;&gt;alipay.open.public.life.label.create&lt;/a&gt;(创建标签接口)创建自定义标签后获取。
   * @return labelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "标签 id，只支持生活号自定义标签。通过 <a href=\"https://opendocs.alipay.com/apis/api_6/alipay.open.public.life.label.create\">alipay.open.public.life.label.create</a>(创建标签接口)创建自定义标签后获取。")

  public String getLabelId() {
    return labelId;
  }


  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }


  public AlipayOpenPublicMatchuserLabelDeleteModel matchers(List<Matcher> matchers) {
    
    this.matchers = matchers;
    return this;
  }

  public AlipayOpenPublicMatchuserLabelDeleteModel addMatchersItem(Matcher matchersItem) {
    if (this.matchers == null) {
      this.matchers = new ArrayList<>();
    }
    this.matchers.add(matchersItem);
    return this;
  }

   /**
   * 支付宝用户匹配器列表，最多传入10条
   * @return matchers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付宝用户匹配器列表，最多传入10条")

  public List<Matcher> getMatchers() {
    return matchers;
  }


  public void setMatchers(List<Matcher> matchers) {
    this.matchers = matchers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicMatchuserLabelDeleteModel alipayOpenPublicMatchuserLabelDeleteModel = (AlipayOpenPublicMatchuserLabelDeleteModel) o;
    return Objects.equals(this.labelId, alipayOpenPublicMatchuserLabelDeleteModel.labelId) &&
        Objects.equals(this.matchers, alipayOpenPublicMatchuserLabelDeleteModel.matchers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelId, matchers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicMatchuserLabelDeleteModel {\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    matchers: ").append(toIndentedString(matchers)).append("\n");
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
    openapiFields.add("label_id");
    openapiFields.add("matchers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicMatchuserLabelDeleteModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicMatchuserLabelDeleteModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicMatchuserLabelDeleteModel is not found in the empty JSON string", AlipayOpenPublicMatchuserLabelDeleteModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicMatchuserLabelDeleteModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicMatchuserLabelDeleteModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("label_id") != null && !jsonObj.get("label_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_id").toString()));
      }
      JsonArray jsonArraymatchers = jsonObj.getAsJsonArray("matchers");
      if (jsonArraymatchers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("matchers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `matchers` to be an array in the JSON string but got `%s`", jsonObj.get("matchers").toString()));
        }

        // validate the optional field `matchers` (array)
        for (int i = 0; i < jsonArraymatchers.size(); i++) {
          Matcher.validateJsonObject(jsonArraymatchers.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicMatchuserLabelDeleteModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicMatchuserLabelDeleteModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicMatchuserLabelDeleteModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicMatchuserLabelDeleteModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicMatchuserLabelDeleteModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicMatchuserLabelDeleteModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicMatchuserLabelDeleteModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicMatchuserLabelDeleteModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicMatchuserLabelDeleteModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicMatchuserLabelDeleteModel
  */
  public static AlipayOpenPublicMatchuserLabelDeleteModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicMatchuserLabelDeleteModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicMatchuserLabelDeleteModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

