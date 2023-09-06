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
import com.alipay.v3.model.BackgroundWordInfo;
import com.alipay.v3.model.DeliveryTargetRegion;
import com.alipay.v3.model.SearchBoxActivityVideoInfo;
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
 * AlipayOpenSearchBoxactivityQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchBoxactivityQueryResponseModel {
  public static final String SERIALIZED_NAME_BACKGROUND_WORD = "background_word";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_WORD)
  private String backgroundWord;

  public static final String SERIALIZED_NAME_BACKGROUND_WORD_INFO = "background_word_info";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_WORD_INFO)
  private BackgroundWordInfo backgroundWordInfo;

  public static final String SERIALIZED_NAME_BOX_ACTIVITY_ID = "box_activity_id";
  @SerializedName(SERIALIZED_NAME_BOX_ACTIVITY_ID)
  private String boxActivityId;

  public static final String SERIALIZED_NAME_BOX_ID = "box_id";
  @SerializedName(SERIALIZED_NAME_BOX_ID)
  private String boxId;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private String materialType;

  public static final String SERIALIZED_NAME_MATERIAL_URL = "material_url";
  @SerializedName(SERIALIZED_NAME_MATERIAL_URL)
  private String materialUrl;

  public static final String SERIALIZED_NAME_RUN_STATUS = "run_status";
  @SerializedName(SERIALIZED_NAME_RUN_STATUS)
  private String runStatus;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TARGET_APPID = "target_appid";
  @SerializedName(SERIALIZED_NAME_TARGET_APPID)
  private String targetAppid;

  public static final String SERIALIZED_NAME_TARGET_APPNAME = "target_appname";
  @SerializedName(SERIALIZED_NAME_TARGET_APPNAME)
  private String targetAppname;

  public static final String SERIALIZED_NAME_TARGET_REGIONS = "target_regions";
  @SerializedName(SERIALIZED_NAME_TARGET_REGIONS)
  private List<DeliveryTargetRegion> targetRegions = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private SearchBoxActivityVideoInfo videoInfo;

  public AlipayOpenSearchBoxactivityQueryResponseModel() { 
  }

  public AlipayOpenSearchBoxactivityQueryResponseModel backgroundWord(String backgroundWord) {
    
    this.backgroundWord = backgroundWord;
    return this;
  }

   /**
   * 底纹词
   * @return backgroundWord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "底纹词", value = "底纹词")

  public String getBackgroundWord() {
    return backgroundWord;
  }


  public void setBackgroundWord(String backgroundWord) {
    this.backgroundWord = backgroundWord;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel backgroundWordInfo(BackgroundWordInfo backgroundWordInfo) {
    
    this.backgroundWordInfo = backgroundWordInfo;
    return this;
  }

   /**
   * Get backgroundWordInfo
   * @return backgroundWordInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackgroundWordInfo getBackgroundWordInfo() {
    return backgroundWordInfo;
  }


  public void setBackgroundWordInfo(BackgroundWordInfo backgroundWordInfo) {
    this.backgroundWordInfo = backgroundWordInfo;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel boxActivityId(String boxActivityId) {
    
    this.boxActivityId = boxActivityId;
    return this;
  }

   /**
   * 搜索直达活动id
   * @return boxActivityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211223000000100000", value = "搜索直达活动id")

  public String getBoxActivityId() {
    return boxActivityId;
  }


  public void setBoxActivityId(String boxActivityId) {
    this.boxActivityId = boxActivityId;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel boxId(String boxId) {
    
    this.boxId = boxId;
    return this;
  }

   /**
   * 搜索直达id
   * @return boxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20211130000000100415", value = "搜索直达id")

  public String getBoxId() {
    return boxId;
  }


  public void setBoxId(String boxId) {
    this.boxId = boxId;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 活动结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-09-30 23:59:59", value = "活动结束时间")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 审核失败原因
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "审核失败原因", value = "审核失败原因")

  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 更新时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-10 08:00:00", value = "更新时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel materialType(String materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * IMAGE-图片/VIDEO-视频
   * @return materialType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IMAGE", value = "IMAGE-图片/VIDEO-视频")

  public String getMaterialType() {
    return materialType;
  }


  public void setMaterialType(String materialType) {
    this.materialType = materialType;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel materialUrl(String materialUrl) {
    
    this.materialUrl = materialUrl;
    return this;
  }

   /**
   * 当material_type&#x3D;\&quot;IMAGE\&quot;时，为图片url；当material_type&#x3D;\&quot;VIDEO\&quot;时，为视频url
   * @return materialUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://mdn.alipayobjects.com/mrch_spc/afts/img/A*0XA2Qo_omj4AAAAAAAAAAAAADsF1AQ/original", value = "当material_type=\"IMAGE\"时，为图片url；当material_type=\"VIDEO\"时，为视频url")

  public String getMaterialUrl() {
    return materialUrl;
  }


  public void setMaterialUrl(String materialUrl) {
    this.materialUrl = materialUrl;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel runStatus(String runStatus) {
    
    this.runStatus = runStatus;
    return this;
  }

   /**
   * 运行状态，INITIAL-初始/ONLINE-已上架/EXPIRE-已失效/OFFLINE-已下架
   * @return runStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ONLINE", value = "运行状态，INITIAL-初始/ONLINE-已上架/EXPIRE-已失效/OFFLINE-已下架")

  public String getRunStatus() {
    return runStatus;
  }


  public void setRunStatus(String runStatus) {
    this.runStatus = runStatus;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 活动开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-10 08:00:00", value = "活动开始时间")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 配置状态，INITIAL-初始/AUDIT-审核中/CANCEL-已取消/ONLINE-已上架/REJECT-驳回/OFFLINE-已下架/EXPIRE-已失效
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDIT", value = "配置状态，INITIAL-初始/AUDIT-审核中/CANCEL-已取消/ONLINE-已上架/REJECT-驳回/OFFLINE-已下架/EXPIRE-已失效")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel targetAppid(String targetAppid) {
    
    this.targetAppid = targetAppid;
    return this;
  }

   /**
   * 跳转应用ID
   * @return targetAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001191699651", value = "跳转应用ID")

  public String getTargetAppid() {
    return targetAppid;
  }


  public void setTargetAppid(String targetAppid) {
    this.targetAppid = targetAppid;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel targetAppname(String targetAppname) {
    
    this.targetAppname = targetAppname;
    return this;
  }

   /**
   * 目标小程序名
   * @return targetAppname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "目标小程序名", value = "目标小程序名")

  public String getTargetAppname() {
    return targetAppname;
  }


  public void setTargetAppname(String targetAppname) {
    this.targetAppname = targetAppname;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel targetRegions(List<DeliveryTargetRegion> targetRegions) {
    
    this.targetRegions = targetRegions;
    return this;
  }

  public AlipayOpenSearchBoxactivityQueryResponseModel addTargetRegionsItem(DeliveryTargetRegion targetRegionsItem) {
    if (this.targetRegions == null) {
      this.targetRegions = new ArrayList<>();
    }
    this.targetRegions.add(targetRegionsItem);
    return this;
  }

   /**
   * 投放目标区域
   * @return targetRegions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放目标区域")

  public List<DeliveryTargetRegion> getTargetRegions() {
    return targetRegions;
  }


  public void setTargetRegions(List<DeliveryTargetRegion> targetRegions) {
    this.targetRegions = targetRegions;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 活动标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "活动标题", value = "活动标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AlipayOpenSearchBoxactivityQueryResponseModel videoInfo(SearchBoxActivityVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchBoxActivityVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(SearchBoxActivityVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSearchBoxactivityQueryResponseModel alipayOpenSearchBoxactivityQueryResponseModel = (AlipayOpenSearchBoxactivityQueryResponseModel) o;
    return Objects.equals(this.backgroundWord, alipayOpenSearchBoxactivityQueryResponseModel.backgroundWord) &&
        Objects.equals(this.backgroundWordInfo, alipayOpenSearchBoxactivityQueryResponseModel.backgroundWordInfo) &&
        Objects.equals(this.boxActivityId, alipayOpenSearchBoxactivityQueryResponseModel.boxActivityId) &&
        Objects.equals(this.boxId, alipayOpenSearchBoxactivityQueryResponseModel.boxId) &&
        Objects.equals(this.endTime, alipayOpenSearchBoxactivityQueryResponseModel.endTime) &&
        Objects.equals(this.failReason, alipayOpenSearchBoxactivityQueryResponseModel.failReason) &&
        Objects.equals(this.gmtModified, alipayOpenSearchBoxactivityQueryResponseModel.gmtModified) &&
        Objects.equals(this.materialType, alipayOpenSearchBoxactivityQueryResponseModel.materialType) &&
        Objects.equals(this.materialUrl, alipayOpenSearchBoxactivityQueryResponseModel.materialUrl) &&
        Objects.equals(this.runStatus, alipayOpenSearchBoxactivityQueryResponseModel.runStatus) &&
        Objects.equals(this.startTime, alipayOpenSearchBoxactivityQueryResponseModel.startTime) &&
        Objects.equals(this.status, alipayOpenSearchBoxactivityQueryResponseModel.status) &&
        Objects.equals(this.targetAppid, alipayOpenSearchBoxactivityQueryResponseModel.targetAppid) &&
        Objects.equals(this.targetAppname, alipayOpenSearchBoxactivityQueryResponseModel.targetAppname) &&
        Objects.equals(this.targetRegions, alipayOpenSearchBoxactivityQueryResponseModel.targetRegions) &&
        Objects.equals(this.title, alipayOpenSearchBoxactivityQueryResponseModel.title) &&
        Objects.equals(this.videoInfo, alipayOpenSearchBoxactivityQueryResponseModel.videoInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundWord, backgroundWordInfo, boxActivityId, boxId, endTime, failReason, gmtModified, materialType, materialUrl, runStatus, startTime, status, targetAppid, targetAppname, targetRegions, title, videoInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchBoxactivityQueryResponseModel {\n");
    sb.append("    backgroundWord: ").append(toIndentedString(backgroundWord)).append("\n");
    sb.append("    backgroundWordInfo: ").append(toIndentedString(backgroundWordInfo)).append("\n");
    sb.append("    boxActivityId: ").append(toIndentedString(boxActivityId)).append("\n");
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    materialUrl: ").append(toIndentedString(materialUrl)).append("\n");
    sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetAppid: ").append(toIndentedString(targetAppid)).append("\n");
    sb.append("    targetAppname: ").append(toIndentedString(targetAppname)).append("\n");
    sb.append("    targetRegions: ").append(toIndentedString(targetRegions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("background_word");
    openapiFields.add("background_word_info");
    openapiFields.add("box_activity_id");
    openapiFields.add("box_id");
    openapiFields.add("end_time");
    openapiFields.add("fail_reason");
    openapiFields.add("gmt_modified");
    openapiFields.add("material_type");
    openapiFields.add("material_url");
    openapiFields.add("run_status");
    openapiFields.add("start_time");
    openapiFields.add("status");
    openapiFields.add("target_appid");
    openapiFields.add("target_appname");
    openapiFields.add("target_regions");
    openapiFields.add("title");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchBoxactivityQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchBoxactivityQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchBoxactivityQueryResponseModel is not found in the empty JSON string", AlipayOpenSearchBoxactivityQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSearchBoxactivityQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSearchBoxactivityQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("background_word") != null && !jsonObj.get("background_word").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `background_word` to be a primitive type in the JSON string but got `%s`", jsonObj.get("background_word").toString()));
      }
      // validate the optional field `background_word_info`
      if (jsonObj.getAsJsonObject("background_word_info") != null) {
        BackgroundWordInfo.validateJsonObject(jsonObj.getAsJsonObject("background_word_info"));
      }
      if (jsonObj.get("box_activity_id") != null && !jsonObj.get("box_activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_activity_id").toString()));
      }
      if (jsonObj.get("box_id") != null && !jsonObj.get("box_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_id").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("fail_reason") != null && !jsonObj.get("fail_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_reason").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("material_type") != null && !jsonObj.get("material_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_type").toString()));
      }
      if (jsonObj.get("material_url") != null && !jsonObj.get("material_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `material_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("material_url").toString()));
      }
      if (jsonObj.get("run_status") != null && !jsonObj.get("run_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `run_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("run_status").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("target_appid") != null && !jsonObj.get("target_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appid").toString()));
      }
      if (jsonObj.get("target_appname") != null && !jsonObj.get("target_appname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_appname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_appname").toString()));
      }
      JsonArray jsonArraytargetRegions = jsonObj.getAsJsonArray("target_regions");
      if (jsonArraytargetRegions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("target_regions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `target_regions` to be an array in the JSON string but got `%s`", jsonObj.get("target_regions").toString()));
        }

        // validate the optional field `target_regions` (array)
        for (int i = 0; i < jsonArraytargetRegions.size(); i++) {
          DeliveryTargetRegion.validateJsonObject(jsonArraytargetRegions.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the optional field `video_info`
      if (jsonObj.getAsJsonObject("video_info") != null) {
        SearchBoxActivityVideoInfo.validateJsonObject(jsonObj.getAsJsonObject("video_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchBoxactivityQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchBoxactivityQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchBoxactivityQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchBoxactivityQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchBoxactivityQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchBoxactivityQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSearchBoxactivityQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSearchBoxactivityQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchBoxactivityQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchBoxactivityQueryResponseModel
  */
  public static AlipayOpenSearchBoxactivityQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchBoxactivityQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchBoxactivityQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

