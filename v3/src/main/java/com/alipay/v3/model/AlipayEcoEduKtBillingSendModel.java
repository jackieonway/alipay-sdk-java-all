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
import com.alipay.v3.model.BillSendExtInfo;
import com.alipay.v3.model.ChargeItems;
import com.alipay.v3.model.UserDetails;
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
 * AlipayEcoEduKtBillingSendModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoEduKtBillingSendModel {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CHARGE_BILL_TITLE = "charge_bill_title";
  @SerializedName(SERIALIZED_NAME_CHARGE_BILL_TITLE)
  private String chargeBillTitle;

  public static final String SERIALIZED_NAME_CHARGE_ITEM = "charge_item";
  @SerializedName(SERIALIZED_NAME_CHARGE_ITEM)
  private List<ChargeItems> chargeItem = null;

  public static final String SERIALIZED_NAME_CHARGE_TYPE = "charge_type";
  @SerializedName(SERIALIZED_NAME_CHARGE_TYPE)
  private String chargeType;

  public static final String SERIALIZED_NAME_CHILD_NAME = "child_name";
  @SerializedName(SERIALIZED_NAME_CHILD_NAME)
  private String childName;

  public static final String SERIALIZED_NAME_CLASS_IN = "class_in";
  @SerializedName(SERIALIZED_NAME_CLASS_IN)
  private String classIn;

  public static final String SERIALIZED_NAME_END_ENABLE = "end_enable";
  @SerializedName(SERIALIZED_NAME_END_ENABLE)
  private String endEnable;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private BillSendExtInfo extInfo;

  public static final String SERIALIZED_NAME_GMT_END = "gmt_end";
  @SerializedName(SERIALIZED_NAME_GMT_END)
  private String gmtEnd;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private String grade;

  public static final String SERIALIZED_NAME_OUT_TRADE_NO = "out_trade_no";
  @SerializedName(SERIALIZED_NAME_OUT_TRADE_NO)
  private String outTradeNo;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_SCHOOL_NO = "school_no";
  @SerializedName(SERIALIZED_NAME_SCHOOL_NO)
  private String schoolNo;

  public static final String SERIALIZED_NAME_SCHOOL_PID = "school_pid";
  @SerializedName(SERIALIZED_NAME_SCHOOL_PID)
  private String schoolPid;

  public static final String SERIALIZED_NAME_STUDENT_CODE = "student_code";
  @SerializedName(SERIALIZED_NAME_STUDENT_CODE)
  private String studentCode;

  public static final String SERIALIZED_NAME_STUDENT_IDENTIFY = "student_identify";
  @SerializedName(SERIALIZED_NAME_STUDENT_IDENTIFY)
  private String studentIdentify;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<UserDetails> users = null;

  public AlipayEcoEduKtBillingSendModel() { 
  }

  public AlipayEcoEduKtBillingSendModel amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]，  如果是非多选项，是要和缴费项的总和相同，多选模式不做验证
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "88.88", value = "总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]，  如果是非多选项，是要和缴费项的总和相同，多选模式不做验证")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AlipayEcoEduKtBillingSendModel chargeBillTitle(String chargeBillTitle) {
    
    this.chargeBillTitle = chargeBillTitle;
    return this;
  }

   /**
   * 缴费账单名称
   * @return chargeBillTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "学生开学收费项", value = "缴费账单名称")

  public String getChargeBillTitle() {
    return chargeBillTitle;
  }


  public void setChargeBillTitle(String chargeBillTitle) {
    this.chargeBillTitle = chargeBillTitle;
  }


  public AlipayEcoEduKtBillingSendModel chargeItem(List<ChargeItems> chargeItem) {
    
    this.chargeItem = chargeItem;
    return this;
  }

  public AlipayEcoEduKtBillingSendModel addChargeItemItem(ChargeItems chargeItemItem) {
    if (this.chargeItem == null) {
      this.chargeItem = new ArrayList<>();
    }
    this.chargeItem.add(chargeItemItem);
    return this;
  }

   /**
   * 缴费详情：输入json格式字符串。Json定义：key填写缴费项名称，value填写缴费项金额，金额保留2位小数（单位：元）
   * @return chargeItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "缴费详情：输入json格式字符串。Json定义：key填写缴费项名称，value填写缴费项金额，金额保留2位小数（单位：元）")

  public List<ChargeItems> getChargeItem() {
    return chargeItem;
  }


  public void setChargeItem(List<ChargeItems> chargeItem) {
    this.chargeItem = chargeItem;
  }


  public AlipayEcoEduKtBillingSendModel chargeType(String chargeType) {
    
    this.chargeType = chargeType;
    return this;
  }

   /**
   * 缴费项模式：空或\&quot;N\&quot;，表示缴费项不可选，  \&quot;M\&quot;表示缴费项为可选 ，支持单选和多选。
   * @return chargeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "M", value = "缴费项模式：空或\"N\"，表示缴费项不可选，  \"M\"表示缴费项为可选 ，支持单选和多选。")

  public String getChargeType() {
    return chargeType;
  }


  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }


  public AlipayEcoEduKtBillingSendModel childName(String childName) {
    
    this.childName = childName;
    return this;
  }

   /**
   * 孩子名字
   * @return childName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张晓晓", value = "孩子名字")

  public String getChildName() {
    return childName;
  }


  public void setChildName(String childName) {
    this.childName = childName;
  }


  public AlipayEcoEduKtBillingSendModel classIn(String classIn) {
    
    this.classIn = classIn;
    return this;
  }

   /**
   * 孩子所在班级
   * @return classIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3班", value = "孩子所在班级")

  public String getClassIn() {
    return classIn;
  }


  public void setClassIn(String classIn) {
    this.classIn = classIn;
  }


  public AlipayEcoEduKtBillingSendModel endEnable(String endEnable) {
    
    this.endEnable = endEnable;
    return this;
  }

   /**
   * 截止日期是否生效，与gmt_end发布配合使用,N为gmt_end不生效，用户过期后仍可以缴费；Y为gmt_end生效，用户过期后，不能再缴费。
   * @return endEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "截止日期是否生效，与gmt_end发布配合使用,N为gmt_end不生效，用户过期后仍可以缴费；Y为gmt_end生效，用户过期后，不能再缴费。")

  public String getEndEnable() {
    return endEnable;
  }


  public void setEndEnable(String endEnable) {
    this.endEnable = endEnable;
  }


  public AlipayEcoEduKtBillingSendModel extInfo(BillSendExtInfo extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * Get extInfo
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BillSendExtInfo getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(BillSendExtInfo extInfo) {
    this.extInfo = extInfo;
  }


  public AlipayEcoEduKtBillingSendModel gmtEnd(String gmtEnd) {
    
    this.gmtEnd = gmtEnd;
    return this;
  }

   /**
   * 缴费截止时间，格式\&quot;yyyy-MM-dd HH:mm:ss\&quot;，日期要大于当前时间。请注意，过期时间不宜设置过短。
   * @return gmtEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-01-01 13:13:13", value = "缴费截止时间，格式\"yyyy-MM-dd HH:mm:ss\"，日期要大于当前时间。请注意，过期时间不宜设置过短。")

  public String getGmtEnd() {
    return gmtEnd;
  }


  public void setGmtEnd(String gmtEnd) {
    this.gmtEnd = gmtEnd;
  }


  public AlipayEcoEduKtBillingSendModel grade(String grade) {
    
    this.grade = grade;
    return this;
  }

   /**
   * 孩子所在年级
   * @return grade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "高一", value = "孩子所在年级")

  public String getGrade() {
    return grade;
  }


  public void setGrade(String grade) {
    this.grade = grade;
  }


  public AlipayEcoEduKtBillingSendModel outTradeNo(String outTradeNo) {
    
    this.outTradeNo = outTradeNo;
    return this;
  }

   /**
   * ISV端的缴费账单编号
   * @return outTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160232343253253453", value = "ISV端的缴费账单编号")

  public String getOutTradeNo() {
    return outTradeNo;
  }


  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public AlipayEcoEduKtBillingSendModel partnerId(String partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Isv支付宝pid, 支付宝签约后，返回给ISV编号
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201600129391238873", value = "Isv支付宝pid, 支付宝签约后，返回给ISV编号")

  public String getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public AlipayEcoEduKtBillingSendModel schoolNo(String schoolNo) {
    
    this.schoolNo = schoolNo;
    return this;
  }

   /**
   * 学校编码，录入学校接口返回的参数
   * @return schoolNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11010100000002", value = "学校编码，录入学校接口返回的参数")

  public String getSchoolNo() {
    return schoolNo;
  }


  public void setSchoolNo(String schoolNo) {
    this.schoolNo = schoolNo;
  }


  public AlipayEcoEduKtBillingSendModel schoolPid(String schoolPid) {
    
    this.schoolPid = schoolPid;
    return this;
  }

   /**
   * 学校支付宝pid,直付通填写smid
   * @return schoolPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20880012939123234423", value = "学校支付宝pid,直付通填写smid")

  public String getSchoolPid() {
    return schoolPid;
  }


  public void setSchoolPid(String schoolPid) {
    this.schoolPid = schoolPid;
  }


  public AlipayEcoEduKtBillingSendModel studentCode(String studentCode) {
    
    this.studentCode = studentCode;
    return this;
  }

   /**
   * 学生的学号，只支持字母和数字类型，一般以教育局学号为准，作为学生的唯一标识。此字段与student_identify、家长user_mobile至少选一个
   * @return studentCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2098453900091", value = "学生的学号，只支持字母和数字类型，一般以教育局学号为准，作为学生的唯一标识。此字段与student_identify、家长user_mobile至少选一个")

  public String getStudentCode() {
    return studentCode;
  }


  public void setStudentCode(String studentCode) {
    this.studentCode = studentCode;
  }


  public AlipayEcoEduKtBillingSendModel studentIdentify(String studentIdentify) {
    
    this.studentIdentify = studentIdentify;
    return this;
  }

   /**
   * 学生的身份证号，如果ISV有学生身份证号，则同步身份证号作为学生唯一标识。此字段与student_code、家长user_mobile至少选一个。  大陆身份证必须是18位 ， 其它地区或国家的身份证开头需要加\&quot;IC\&quot;开头区分并且不超过18位，但查询账单的时候不要带\&quot;IC\&quot;
   * @return studentIdentify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "310193199905289483", value = "学生的身份证号，如果ISV有学生身份证号，则同步身份证号作为学生唯一标识。此字段与student_code、家长user_mobile至少选一个。  大陆身份证必须是18位 ， 其它地区或国家的身份证开头需要加\"IC\"开头区分并且不超过18位，但查询账单的时候不要带\"IC\"")

  public String getStudentIdentify() {
    return studentIdentify;
  }


  public void setStudentIdentify(String studentIdentify) {
    this.studentIdentify = studentIdentify;
  }


  public AlipayEcoEduKtBillingSendModel users(List<UserDetails> users) {
    
    this.users = users;
    return this;
  }

  public AlipayEcoEduKtBillingSendModel addUsersItem(UserDetails usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * 孩子的家长信息，最多一次输入10个家长，此字段做为识别家长的孩子用，与student_identify、student_code至少选一个
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "孩子的家长信息，最多一次输入10个家长，此字段做为识别家长的孩子用，与student_identify、student_code至少选一个")

  public List<UserDetails> getUsers() {
    return users;
  }


  public void setUsers(List<UserDetails> users) {
    this.users = users;
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
   * @return the AlipayEcoEduKtBillingSendModel instance itself
   */
  public AlipayEcoEduKtBillingSendModel putAdditionalProperty(String key, Object value) {
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
    AlipayEcoEduKtBillingSendModel alipayEcoEduKtBillingSendModel = (AlipayEcoEduKtBillingSendModel) o;
    return Objects.equals(this.amount, alipayEcoEduKtBillingSendModel.amount) &&
        Objects.equals(this.chargeBillTitle, alipayEcoEduKtBillingSendModel.chargeBillTitle) &&
        Objects.equals(this.chargeItem, alipayEcoEduKtBillingSendModel.chargeItem) &&
        Objects.equals(this.chargeType, alipayEcoEduKtBillingSendModel.chargeType) &&
        Objects.equals(this.childName, alipayEcoEduKtBillingSendModel.childName) &&
        Objects.equals(this.classIn, alipayEcoEduKtBillingSendModel.classIn) &&
        Objects.equals(this.endEnable, alipayEcoEduKtBillingSendModel.endEnable) &&
        Objects.equals(this.extInfo, alipayEcoEduKtBillingSendModel.extInfo) &&
        Objects.equals(this.gmtEnd, alipayEcoEduKtBillingSendModel.gmtEnd) &&
        Objects.equals(this.grade, alipayEcoEduKtBillingSendModel.grade) &&
        Objects.equals(this.outTradeNo, alipayEcoEduKtBillingSendModel.outTradeNo) &&
        Objects.equals(this.partnerId, alipayEcoEduKtBillingSendModel.partnerId) &&
        Objects.equals(this.schoolNo, alipayEcoEduKtBillingSendModel.schoolNo) &&
        Objects.equals(this.schoolPid, alipayEcoEduKtBillingSendModel.schoolPid) &&
        Objects.equals(this.studentCode, alipayEcoEduKtBillingSendModel.studentCode) &&
        Objects.equals(this.studentIdentify, alipayEcoEduKtBillingSendModel.studentIdentify) &&
        Objects.equals(this.users, alipayEcoEduKtBillingSendModel.users)&&
        Objects.equals(this.additionalProperties, alipayEcoEduKtBillingSendModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, chargeBillTitle, chargeItem, chargeType, childName, classIn, endEnable, extInfo, gmtEnd, grade, outTradeNo, partnerId, schoolNo, schoolPid, studentCode, studentIdentify, users, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoEduKtBillingSendModel {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeBillTitle: ").append(toIndentedString(chargeBillTitle)).append("\n");
    sb.append("    chargeItem: ").append(toIndentedString(chargeItem)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    childName: ").append(toIndentedString(childName)).append("\n");
    sb.append("    classIn: ").append(toIndentedString(classIn)).append("\n");
    sb.append("    endEnable: ").append(toIndentedString(endEnable)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    gmtEnd: ").append(toIndentedString(gmtEnd)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    outTradeNo: ").append(toIndentedString(outTradeNo)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    schoolNo: ").append(toIndentedString(schoolNo)).append("\n");
    sb.append("    schoolPid: ").append(toIndentedString(schoolPid)).append("\n");
    sb.append("    studentCode: ").append(toIndentedString(studentCode)).append("\n");
    sb.append("    studentIdentify: ").append(toIndentedString(studentIdentify)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("charge_bill_title");
    openapiFields.add("charge_item");
    openapiFields.add("charge_type");
    openapiFields.add("child_name");
    openapiFields.add("class_in");
    openapiFields.add("end_enable");
    openapiFields.add("ext_info");
    openapiFields.add("gmt_end");
    openapiFields.add("grade");
    openapiFields.add("out_trade_no");
    openapiFields.add("partner_id");
    openapiFields.add("school_no");
    openapiFields.add("school_pid");
    openapiFields.add("student_code");
    openapiFields.add("student_identify");
    openapiFields.add("users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoEduKtBillingSendModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoEduKtBillingSendModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoEduKtBillingSendModel is not found in the empty JSON string", AlipayEcoEduKtBillingSendModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("charge_bill_title") != null && !jsonObj.get("charge_bill_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_bill_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_bill_title").toString()));
      }
      JsonArray jsonArraychargeItem = jsonObj.getAsJsonArray("charge_item");
      if (jsonArraychargeItem != null) {
        // ensure the json data is an array
        if (!jsonObj.get("charge_item").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `charge_item` to be an array in the JSON string but got `%s`", jsonObj.get("charge_item").toString()));
        }

        // validate the optional field `charge_item` (array)
        for (int i = 0; i < jsonArraychargeItem.size(); i++) {
          ChargeItems.validateJsonObject(jsonArraychargeItem.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("charge_type") != null && !jsonObj.get("charge_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_type").toString()));
      }
      if (jsonObj.get("child_name") != null && !jsonObj.get("child_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("child_name").toString()));
      }
      if (jsonObj.get("class_in") != null && !jsonObj.get("class_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_in").toString()));
      }
      if (jsonObj.get("end_enable") != null && !jsonObj.get("end_enable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_enable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_enable").toString()));
      }
      // validate the optional field `ext_info`
      if (jsonObj.getAsJsonObject("ext_info") != null) {
        BillSendExtInfo.validateJsonObject(jsonObj.getAsJsonObject("ext_info"));
      }
      if (jsonObj.get("gmt_end") != null && !jsonObj.get("gmt_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_end").toString()));
      }
      if (jsonObj.get("grade") != null && !jsonObj.get("grade").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grade` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grade").toString()));
      }
      if (jsonObj.get("out_trade_no") != null && !jsonObj.get("out_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_trade_no").toString()));
      }
      if (jsonObj.get("partner_id") != null && !jsonObj.get("partner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_id").toString()));
      }
      if (jsonObj.get("school_no") != null && !jsonObj.get("school_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_no").toString()));
      }
      if (jsonObj.get("school_pid") != null && !jsonObj.get("school_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school_pid").toString()));
      }
      if (jsonObj.get("student_code") != null && !jsonObj.get("student_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `student_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("student_code").toString()));
      }
      if (jsonObj.get("student_identify") != null && !jsonObj.get("student_identify").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `student_identify` to be a primitive type in the JSON string but got `%s`", jsonObj.get("student_identify").toString()));
      }
      JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
      if (jsonArrayusers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("users").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
        }

        // validate the optional field `users` (array)
        for (int i = 0; i < jsonArrayusers.size(); i++) {
          UserDetails.validateJsonObject(jsonArrayusers.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoEduKtBillingSendModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoEduKtBillingSendModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoEduKtBillingSendModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoEduKtBillingSendModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoEduKtBillingSendModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoEduKtBillingSendModel value) throws IOException {
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
           public AlipayEcoEduKtBillingSendModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AlipayEcoEduKtBillingSendModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AlipayEcoEduKtBillingSendModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoEduKtBillingSendModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoEduKtBillingSendModel
  */
  public static AlipayEcoEduKtBillingSendModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoEduKtBillingSendModel.class);
  }

 /**
  * Convert an instance of AlipayEcoEduKtBillingSendModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

