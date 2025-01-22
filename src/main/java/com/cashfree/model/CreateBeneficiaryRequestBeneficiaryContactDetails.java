/*
 * Cashfree Payout APIs
 * Cashfree's Payout APIs provide developers with a streamlined pathway to integrate advanced payout capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2024-01-01
 * Contact: developers@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cashfree.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cashfree.JSON;

/**
 * It should contain the contact details of the beneficiary.
 */
@Schema(description = "It should contain the contact details of the beneficiary.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-22T05:02:47.591666Z[Etc/UTC]")
public class CreateBeneficiaryRequestBeneficiaryContactDetails {
  public static final String SERIALIZED_NAME_BENEFICIARY_EMAIL = "beneficiary_email";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_EMAIL)
  private String beneficiaryEmail;

  public static final String SERIALIZED_NAME_BENEFICIARY_PHONE = "beneficiary_phone";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_PHONE)
  private String beneficiaryPhone;

  public static final String SERIALIZED_NAME_BENEFICIARY_COUNTRY_CODE = "beneficiary_country_code";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_COUNTRY_CODE)
  private String beneficiaryCountryCode;

  public static final String SERIALIZED_NAME_BENEFICIARY_ADDRESS = "beneficiary_address";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_ADDRESS)
  private String beneficiaryAddress;

  public static final String SERIALIZED_NAME_BENEFICIARY_CITY = "beneficiary_city";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_CITY)
  private String beneficiaryCity;

  public static final String SERIALIZED_NAME_BENEFICIARY_STATE = "beneficiary_state";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_STATE)
  private String beneficiaryState;

  public static final String SERIALIZED_NAME_BENEFICIARY_POSTAL_CODE = "beneficiary_postal_code";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_POSTAL_CODE)
  private String beneficiaryPostalCode;

  public CreateBeneficiaryRequestBeneficiaryContactDetails() {
  }

  public CreateBeneficiaryRequestBeneficiaryContactDetails beneficiaryEmail(String beneficiaryEmail) {
    
    this.beneficiaryEmail = beneficiaryEmail;
    return this;
  }

   /**
   * It is the email address of the beneficiary. The maximum character limit is 200. It should contain dot (.) and at the rate of (@).
   * @return beneficiaryEmail
  **/
  @javax.annotation.Nullable
  @Schema(example = "johndoe_1@cashfree.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the email address of the beneficiary. The maximum character limit is 200. It should contain dot (.) and at the rate of (@).")
  public String getBeneficiaryEmail() {
    return beneficiaryEmail;
  }


  public void setBeneficiaryEmail(String beneficiaryEmail) {
    this.beneficiaryEmail = beneficiaryEmail;
  }


  public CreateBeneficiaryRequestBeneficiaryContactDetails beneficiaryPhone(String beneficiaryPhone) {
    
    this.beneficiaryPhone = beneficiaryPhone;
    return this;
  }

   /**
   * It is the phone number of the beneficiary. Only reigstered Indian phone numbers are allowed. The value should be between 8 and 12 characters after stripping +91.
   * @return beneficiaryPhone
  **/
  @javax.annotation.Nullable
  @Schema(example = "9876543210", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the phone number of the beneficiary. Only reigstered Indian phone numbers are allowed. The value should be between 8 and 12 characters after stripping +91.")
  public String getBeneficiaryPhone() {
    return beneficiaryPhone;
  }


  public void setBeneficiaryPhone(String beneficiaryPhone) {
    this.beneficiaryPhone = beneficiaryPhone;
  }


  public CreateBeneficiaryRequestBeneficiaryContactDetails beneficiaryCountryCode(String beneficiaryCountryCode) {
    
    this.beneficiaryCountryCode = beneficiaryCountryCode;
    return this;
  }

   /**
   * It is the country code (+91) of the beneficiary&#39;s phone number
   * @return beneficiaryCountryCode
  **/
  @javax.annotation.Nullable
  @Schema(example = "+91", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the country code (+91) of the beneficiary's phone number")
  public String getBeneficiaryCountryCode() {
    return beneficiaryCountryCode;
  }


  public void setBeneficiaryCountryCode(String beneficiaryCountryCode) {
    this.beneficiaryCountryCode = beneficiaryCountryCode;
  }


  public CreateBeneficiaryRequestBeneficiaryContactDetails beneficiaryAddress(String beneficiaryAddress) {
    
    this.beneficiaryAddress = beneficiaryAddress;
    return this;
  }

   /**
   * It is the address information of the beneficiary.
   * @return beneficiaryAddress
  **/
  @javax.annotation.Nullable
  @Schema(example = "177A Bleecker Street", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the address information of the beneficiary.")
  public String getBeneficiaryAddress() {
    return beneficiaryAddress;
  }


  public void setBeneficiaryAddress(String beneficiaryAddress) {
    this.beneficiaryAddress = beneficiaryAddress;
  }


  public CreateBeneficiaryRequestBeneficiaryContactDetails beneficiaryCity(String beneficiaryCity) {
    
    this.beneficiaryCity = beneficiaryCity;
    return this;
  }

   /**
   * It is the name of the city as present in the beneficiary&#39;s address.
   * @return beneficiaryCity
  **/
  @javax.annotation.Nullable
  @Schema(example = "New York City", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the name of the city as present in the beneficiary's address.")
  public String getBeneficiaryCity() {
    return beneficiaryCity;
  }


  public void setBeneficiaryCity(String beneficiaryCity) {
    this.beneficiaryCity = beneficiaryCity;
  }


  public CreateBeneficiaryRequestBeneficiaryContactDetails beneficiaryState(String beneficiaryState) {
    
    this.beneficiaryState = beneficiaryState;
    return this;
  }

   /**
   * It is the name of the state as present in the beneficiary&#39;s address.
   * @return beneficiaryState
  **/
  @javax.annotation.Nullable
  @Schema(example = "New York", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the name of the state as present in the beneficiary's address.")
  public String getBeneficiaryState() {
    return beneficiaryState;
  }


  public void setBeneficiaryState(String beneficiaryState) {
    this.beneficiaryState = beneficiaryState;
  }


  public CreateBeneficiaryRequestBeneficiaryContactDetails beneficiaryPostalCode(String beneficiaryPostalCode) {
    
    this.beneficiaryPostalCode = beneficiaryPostalCode;
    return this;
  }

   /**
   * It is the PIN code information as present in the beneficiary&#39;s address. The maximum character limit is 6. Only numbers are allowed.
   * @return beneficiaryPostalCode
  **/
  @javax.annotation.Nullable
  @Schema(example = "560001", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the PIN code information as present in the beneficiary's address. The maximum character limit is 6. Only numbers are allowed.")
  public String getBeneficiaryPostalCode() {
    return beneficiaryPostalCode;
  }


  public void setBeneficiaryPostalCode(String beneficiaryPostalCode) {
    this.beneficiaryPostalCode = beneficiaryPostalCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBeneficiaryRequestBeneficiaryContactDetails createBeneficiaryRequestBeneficiaryContactDetails = (CreateBeneficiaryRequestBeneficiaryContactDetails) o;
    return Objects.equals(this.beneficiaryEmail, createBeneficiaryRequestBeneficiaryContactDetails.beneficiaryEmail) &&
        Objects.equals(this.beneficiaryPhone, createBeneficiaryRequestBeneficiaryContactDetails.beneficiaryPhone) &&
        Objects.equals(this.beneficiaryCountryCode, createBeneficiaryRequestBeneficiaryContactDetails.beneficiaryCountryCode) &&
        Objects.equals(this.beneficiaryAddress, createBeneficiaryRequestBeneficiaryContactDetails.beneficiaryAddress) &&
        Objects.equals(this.beneficiaryCity, createBeneficiaryRequestBeneficiaryContactDetails.beneficiaryCity) &&
        Objects.equals(this.beneficiaryState, createBeneficiaryRequestBeneficiaryContactDetails.beneficiaryState) &&
        Objects.equals(this.beneficiaryPostalCode, createBeneficiaryRequestBeneficiaryContactDetails.beneficiaryPostalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryEmail, beneficiaryPhone, beneficiaryCountryCode, beneficiaryAddress, beneficiaryCity, beneficiaryState, beneficiaryPostalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBeneficiaryRequestBeneficiaryContactDetails {\n");
    sb.append("    beneficiaryEmail: ").append(toIndentedString(beneficiaryEmail)).append("\n");
    sb.append("    beneficiaryPhone: ").append(toIndentedString(beneficiaryPhone)).append("\n");
    sb.append("    beneficiaryCountryCode: ").append(toIndentedString(beneficiaryCountryCode)).append("\n");
    sb.append("    beneficiaryAddress: ").append(toIndentedString(beneficiaryAddress)).append("\n");
    sb.append("    beneficiaryCity: ").append(toIndentedString(beneficiaryCity)).append("\n");
    sb.append("    beneficiaryState: ").append(toIndentedString(beneficiaryState)).append("\n");
    sb.append("    beneficiaryPostalCode: ").append(toIndentedString(beneficiaryPostalCode)).append("\n");
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
    openapiFields.add("beneficiary_email");
    openapiFields.add("beneficiary_phone");
    openapiFields.add("beneficiary_country_code");
    openapiFields.add("beneficiary_address");
    openapiFields.add("beneficiary_city");
    openapiFields.add("beneficiary_state");
    openapiFields.add("beneficiary_postal_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBeneficiaryRequestBeneficiaryContactDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("beneficiary_email") != null && !jsonObj.get("beneficiary_email").isJsonNull()) && !jsonObj.get("beneficiary_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_email").toString()));
      }
      if ((jsonObj.get("beneficiary_phone") != null && !jsonObj.get("beneficiary_phone").isJsonNull()) && !jsonObj.get("beneficiary_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_phone").toString()));
      }
      if ((jsonObj.get("beneficiary_country_code") != null && !jsonObj.get("beneficiary_country_code").isJsonNull()) && !jsonObj.get("beneficiary_country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_country_code").toString()));
      }
      if ((jsonObj.get("beneficiary_address") != null && !jsonObj.get("beneficiary_address").isJsonNull()) && !jsonObj.get("beneficiary_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_address").toString()));
      }
      if ((jsonObj.get("beneficiary_city") != null && !jsonObj.get("beneficiary_city").isJsonNull()) && !jsonObj.get("beneficiary_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_city").toString()));
      }
      if ((jsonObj.get("beneficiary_state") != null && !jsonObj.get("beneficiary_state").isJsonNull()) && !jsonObj.get("beneficiary_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_state").toString()));
      }
      if ((jsonObj.get("beneficiary_postal_code") != null && !jsonObj.get("beneficiary_postal_code").isJsonNull()) && !jsonObj.get("beneficiary_postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_postal_code").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBeneficiaryRequestBeneficiaryContactDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("beneficiary_email") != null && !jsonObj.get("beneficiary_email").isJsonNull()) && !jsonObj.get("beneficiary_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_email").toString()));
      }
      if ((jsonObj.get("beneficiary_phone") != null && !jsonObj.get("beneficiary_phone").isJsonNull()) && !jsonObj.get("beneficiary_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_phone").toString()));
      }
      if ((jsonObj.get("beneficiary_country_code") != null && !jsonObj.get("beneficiary_country_code").isJsonNull()) && !jsonObj.get("beneficiary_country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_country_code").toString()));
      }
      if ((jsonObj.get("beneficiary_address") != null && !jsonObj.get("beneficiary_address").isJsonNull()) && !jsonObj.get("beneficiary_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_address").toString()));
      }
      if ((jsonObj.get("beneficiary_city") != null && !jsonObj.get("beneficiary_city").isJsonNull()) && !jsonObj.get("beneficiary_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_city").toString()));
      }
      if ((jsonObj.get("beneficiary_state") != null && !jsonObj.get("beneficiary_state").isJsonNull()) && !jsonObj.get("beneficiary_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_state").toString()));
      }
      if ((jsonObj.get("beneficiary_postal_code") != null && !jsonObj.get("beneficiary_postal_code").isJsonNull()) && !jsonObj.get("beneficiary_postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_postal_code").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBeneficiaryRequestBeneficiaryContactDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBeneficiaryRequestBeneficiaryContactDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBeneficiaryRequestBeneficiaryContactDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBeneficiaryRequestBeneficiaryContactDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBeneficiaryRequestBeneficiaryContactDetails>() {
           @Override
           public void write(JsonWriter out, CreateBeneficiaryRequestBeneficiaryContactDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBeneficiaryRequestBeneficiaryContactDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBeneficiaryRequestBeneficiaryContactDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBeneficiaryRequestBeneficiaryContactDetails
  * @throws IOException if the JSON string is invalid with respect to CreateBeneficiaryRequestBeneficiaryContactDetails
  */
  public static CreateBeneficiaryRequestBeneficiaryContactDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBeneficiaryRequestBeneficiaryContactDetails.class);
  }

 /**
  * Convert an instance of CreateBeneficiaryRequestBeneficiaryContactDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

