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
import com.alipay.v3.model.FunctionalService;
import com.alipay.v3.model.JourneyLocation;
import com.alipay.v3.model.JourneyMerchantInfo;
import com.alipay.v3.model.JourneyServiceChangeInfo;
import com.alipay.v3.model.OrderExtInfo;
import com.alipay.v3.model.UserInfomation;
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
 * OrderJourneyElement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderJourneyElement {
  public static final String SERIALIZED_NAME_ARRIVAL = "arrival";
  @SerializedName(SERIALIZED_NAME_ARRIVAL)
  private JourneyLocation arrival;

  public static final String SERIALIZED_NAME_DEPARTURE = "departure";
  @SerializedName(SERIALIZED_NAME_DEPARTURE)
  private JourneyLocation departure;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_END_TIME_DESC = "end_time_desc";
  @SerializedName(SERIALIZED_NAME_END_TIME_DESC)
  private String endTimeDesc;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private List<OrderExtInfo> extInfo = null;

  public static final String SERIALIZED_NAME_FUNCTIONAL_SERVICES = "functional_services";
  @SerializedName(SERIALIZED_NAME_FUNCTIONAL_SERVICES)
  private List<FunctionalService> functionalServices = null;

  public static final String SERIALIZED_NAME_PASSAGERS = "passagers";
  @SerializedName(SERIALIZED_NAME_PASSAGERS)
  private List<UserInfomation> passagers = null;

  public static final String SERIALIZED_NAME_SERVICE_CHANGE_INFO = "service_change_info";
  @SerializedName(SERIALIZED_NAME_SERVICE_CHANGE_INFO)
  private JourneyServiceChangeInfo serviceChangeInfo;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER = "service_provider";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER)
  private JourneyMerchantInfo serviceProvider;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_START_TIME_DESC = "start_time_desc";
  @SerializedName(SERIALIZED_NAME_START_TIME_DESC)
  private String startTimeDesc;

  public OrderJourneyElement() { 
  }

  public OrderJourneyElement arrival(JourneyLocation arrival) {
    
    this.arrival = arrival;
    return this;
  }

   /**
   * Get arrival
   * @return arrival
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JourneyLocation getArrival() {
    return arrival;
  }


  public void setArrival(JourneyLocation arrival) {
    this.arrival = arrival;
  }


  public OrderJourneyElement departure(JourneyLocation departure) {
    
    this.departure = departure;
    return this;
  }

   /**
   * Get departure
   * @return departure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JourneyLocation getDeparture() {
    return departure;
  }


  public void setDeparture(JourneyLocation departure) {
    this.departure = departure;
  }


  public OrderJourneyElement duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 行程时长
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3600", value = "行程时长")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public OrderJourneyElement endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-02 12:21:22", value = "结束时间")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public OrderJourneyElement endTimeDesc(String endTimeDesc) {
    
    this.endTimeDesc = endTimeDesc;
    return this;
  }

   /**
   * 结束时间描述（非结构化）
   * @return endTimeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1月2号", value = "结束时间描述（非结构化）")

  public String getEndTimeDesc() {
    return endTimeDesc;
  }


  public void setEndTimeDesc(String endTimeDesc) {
    this.endTimeDesc = endTimeDesc;
  }


  public OrderJourneyElement extInfo(List<OrderExtInfo> extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

  public OrderJourneyElement addExtInfoItem(OrderExtInfo extInfoItem) {
    if (this.extInfo == null) {
      this.extInfo = new ArrayList<>();
    }
    this.extInfo.add(extInfoItem);
    return this;
  }

   /**
   * 扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展信息")

  public List<OrderExtInfo> getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(List<OrderExtInfo> extInfo) {
    this.extInfo = extInfo;
  }


  public OrderJourneyElement functionalServices(List<FunctionalService> functionalServices) {
    
    this.functionalServices = functionalServices;
    return this;
  }

  public OrderJourneyElement addFunctionalServicesItem(FunctionalService functionalServicesItem) {
    if (this.functionalServices == null) {
      this.functionalServices = new ArrayList<>();
    }
    this.functionalServices.add(functionalServicesItem);
    return this;
  }

   /**
   * 功能服务列表
   * @return functionalServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "功能服务列表")

  public List<FunctionalService> getFunctionalServices() {
    return functionalServices;
  }


  public void setFunctionalServices(List<FunctionalService> functionalServices) {
    this.functionalServices = functionalServices;
  }


  public OrderJourneyElement passagers(List<UserInfomation> passagers) {
    
    this.passagers = passagers;
    return this;
  }

  public OrderJourneyElement addPassagersItem(UserInfomation passagersItem) {
    if (this.passagers == null) {
      this.passagers = new ArrayList<>();
    }
    this.passagers.add(passagersItem);
    return this;
  }

   /**
   * 出行人
   * @return passagers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "出行人")

  public List<UserInfomation> getPassagers() {
    return passagers;
  }


  public void setPassagers(List<UserInfomation> passagers) {
    this.passagers = passagers;
  }


  public OrderJourneyElement serviceChangeInfo(JourneyServiceChangeInfo serviceChangeInfo) {
    
    this.serviceChangeInfo = serviceChangeInfo;
    return this;
  }

   /**
   * Get serviceChangeInfo
   * @return serviceChangeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JourneyServiceChangeInfo getServiceChangeInfo() {
    return serviceChangeInfo;
  }


  public void setServiceChangeInfo(JourneyServiceChangeInfo serviceChangeInfo) {
    this.serviceChangeInfo = serviceChangeInfo;
  }


  public OrderJourneyElement serviceProvider(JourneyMerchantInfo serviceProvider) {
    
    this.serviceProvider = serviceProvider;
    return this;
  }

   /**
   * Get serviceProvider
   * @return serviceProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JourneyMerchantInfo getServiceProvider() {
    return serviceProvider;
  }


  public void setServiceProvider(JourneyMerchantInfo serviceProvider) {
    this.serviceProvider = serviceProvider;
  }


  public OrderJourneyElement startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 12:21:22", value = "开始时间")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public OrderJourneyElement startTimeDesc(String startTimeDesc) {
    
    this.startTimeDesc = startTimeDesc;
    return this;
  }

   /**
   * 开始时间描述（非结构化）
   * @return startTimeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1月1号", value = "开始时间描述（非结构化）")

  public String getStartTimeDesc() {
    return startTimeDesc;
  }


  public void setStartTimeDesc(String startTimeDesc) {
    this.startTimeDesc = startTimeDesc;
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
   * @return the OrderJourneyElement instance itself
   */
  public OrderJourneyElement putAdditionalProperty(String key, Object value) {
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
    OrderJourneyElement orderJourneyElement = (OrderJourneyElement) o;
    return Objects.equals(this.arrival, orderJourneyElement.arrival) &&
        Objects.equals(this.departure, orderJourneyElement.departure) &&
        Objects.equals(this.duration, orderJourneyElement.duration) &&
        Objects.equals(this.endTime, orderJourneyElement.endTime) &&
        Objects.equals(this.endTimeDesc, orderJourneyElement.endTimeDesc) &&
        Objects.equals(this.extInfo, orderJourneyElement.extInfo) &&
        Objects.equals(this.functionalServices, orderJourneyElement.functionalServices) &&
        Objects.equals(this.passagers, orderJourneyElement.passagers) &&
        Objects.equals(this.serviceChangeInfo, orderJourneyElement.serviceChangeInfo) &&
        Objects.equals(this.serviceProvider, orderJourneyElement.serviceProvider) &&
        Objects.equals(this.startTime, orderJourneyElement.startTime) &&
        Objects.equals(this.startTimeDesc, orderJourneyElement.startTimeDesc)&&
        Objects.equals(this.additionalProperties, orderJourneyElement.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrival, departure, duration, endTime, endTimeDesc, extInfo, functionalServices, passagers, serviceChangeInfo, serviceProvider, startTime, startTimeDesc, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderJourneyElement {\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    endTimeDesc: ").append(toIndentedString(endTimeDesc)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    functionalServices: ").append(toIndentedString(functionalServices)).append("\n");
    sb.append("    passagers: ").append(toIndentedString(passagers)).append("\n");
    sb.append("    serviceChangeInfo: ").append(toIndentedString(serviceChangeInfo)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startTimeDesc: ").append(toIndentedString(startTimeDesc)).append("\n");
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
    openapiFields.add("arrival");
    openapiFields.add("departure");
    openapiFields.add("duration");
    openapiFields.add("end_time");
    openapiFields.add("end_time_desc");
    openapiFields.add("ext_info");
    openapiFields.add("functional_services");
    openapiFields.add("passagers");
    openapiFields.add("service_change_info");
    openapiFields.add("service_provider");
    openapiFields.add("start_time");
    openapiFields.add("start_time_desc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderJourneyElement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderJourneyElement.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderJourneyElement is not found in the empty JSON string", OrderJourneyElement.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `arrival`
      if (jsonObj.getAsJsonObject("arrival") != null) {
        JourneyLocation.validateJsonObject(jsonObj.getAsJsonObject("arrival"));
      }
      // validate the optional field `departure`
      if (jsonObj.getAsJsonObject("departure") != null) {
        JourneyLocation.validateJsonObject(jsonObj.getAsJsonObject("departure"));
      }
      if (jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("end_time_desc") != null && !jsonObj.get("end_time_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time_desc").toString()));
      }
      JsonArray jsonArrayextInfo = jsonObj.getAsJsonArray("ext_info");
      if (jsonArrayextInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ext_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be an array in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
        }

        // validate the optional field `ext_info` (array)
        for (int i = 0; i < jsonArrayextInfo.size(); i++) {
          OrderExtInfo.validateJsonObject(jsonArrayextInfo.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayfunctionalServices = jsonObj.getAsJsonArray("functional_services");
      if (jsonArrayfunctionalServices != null) {
        // ensure the json data is an array
        if (!jsonObj.get("functional_services").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `functional_services` to be an array in the JSON string but got `%s`", jsonObj.get("functional_services").toString()));
        }

        // validate the optional field `functional_services` (array)
        for (int i = 0; i < jsonArrayfunctionalServices.size(); i++) {
          FunctionalService.validateJsonObject(jsonArrayfunctionalServices.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraypassagers = jsonObj.getAsJsonArray("passagers");
      if (jsonArraypassagers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("passagers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `passagers` to be an array in the JSON string but got `%s`", jsonObj.get("passagers").toString()));
        }

        // validate the optional field `passagers` (array)
        for (int i = 0; i < jsonArraypassagers.size(); i++) {
          UserInfomation.validateJsonObject(jsonArraypassagers.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `service_change_info`
      if (jsonObj.getAsJsonObject("service_change_info") != null) {
        JourneyServiceChangeInfo.validateJsonObject(jsonObj.getAsJsonObject("service_change_info"));
      }
      // validate the optional field `service_provider`
      if (jsonObj.getAsJsonObject("service_provider") != null) {
        JourneyMerchantInfo.validateJsonObject(jsonObj.getAsJsonObject("service_provider"));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("start_time_desc") != null && !jsonObj.get("start_time_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderJourneyElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderJourneyElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderJourneyElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderJourneyElement.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderJourneyElement>() {
           @Override
           public void write(JsonWriter out, OrderJourneyElement value) throws IOException {
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
           public OrderJourneyElement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrderJourneyElement instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrderJourneyElement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderJourneyElement
  * @throws IOException if the JSON string is invalid with respect to OrderJourneyElement
  */
  public static OrderJourneyElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderJourneyElement.class);
  }

 /**
  * Convert an instance of OrderJourneyElement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

