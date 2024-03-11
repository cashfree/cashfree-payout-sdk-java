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
 * It displays the contact details of the beneficiary.
 */
@Schema(description = "It displays the contact details of the beneficiary.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T11:10:12.476745Z[Etc/UTC]")
public class BeneficiaryBeneficiaryContactDetails {
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

  public BeneficiaryBeneficiaryContactDetails() {
  }

  public BeneficiaryBeneficiaryContactDetails beneficiaryEmail(String beneficiaryEmail) {
    
    this.beneficiaryEmail = beneficiaryEmail;
    return this;
  }

   /**
   * It displays the email address of the beneficiary.
   * @return beneficiaryEmail
  **/
  @javax.annotation.Nullable
  @Schema(example = "johndoe_1@cashfree.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the email address of the beneficiary.")
  public String getBeneficiaryEmail() {
    return beneficiaryEmail;
  }


  public void setBeneficiaryEmail(String beneficiaryEmail) {
    this.beneficiaryEmail = beneficiaryEmail;
  }


  public BeneficiaryBeneficiaryContactDetails beneficiaryPhone(String beneficiaryPhone) {
    
    this.beneficiaryPhone = beneficiaryPhone;
    return this;
  }

   /**
   * It displays the phone number of the beneficiary without the country code.
   * @return beneficiaryPhone
  **/
  @javax.annotation.Nullable
  @Schema(example = "9876543210", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the phone number of the beneficiary without the country code.")
  public String getBeneficiaryPhone() {
    return beneficiaryPhone;
  }


  public void setBeneficiaryPhone(String beneficiaryPhone) {
    this.beneficiaryPhone = beneficiaryPhone;
  }


  public BeneficiaryBeneficiaryContactDetails beneficiaryCountryCode(String beneficiaryCountryCode) {
    
    this.beneficiaryCountryCode = beneficiaryCountryCode;
    return this;
  }

   /**
   * It displays the country code of the beneficiary&#39;s phone number.
   * @return beneficiaryCountryCode
  **/
  @javax.annotation.Nullable
  @Schema(example = "+91", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the country code of the beneficiary's phone number.")
  public String getBeneficiaryCountryCode() {
    return beneficiaryCountryCode;
  }


  public void setBeneficiaryCountryCode(String beneficiaryCountryCode) {
    this.beneficiaryCountryCode = beneficiaryCountryCode;
  }


  public BeneficiaryBeneficiaryContactDetails beneficiaryAddress(String beneficiaryAddress) {
    
    this.beneficiaryAddress = beneficiaryAddress;
    return this;
  }

   /**
   * It displays the address of the beneficiary.
   * @return beneficiaryAddress
  **/
  @javax.annotation.Nullable
  @Schema(example = "177A Bleecker Street", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the address of the beneficiary.")
  public String getBeneficiaryAddress() {
    return beneficiaryAddress;
  }


  public void setBeneficiaryAddress(String beneficiaryAddress) {
    this.beneficiaryAddress = beneficiaryAddress;
  }


  public BeneficiaryBeneficiaryContactDetails beneficiaryCity(String beneficiaryCity) {
    
    this.beneficiaryCity = beneficiaryCity;
    return this;
  }

   /**
   * It displays the name of the city as present in the beneficiary&#39;s address.
   * @return beneficiaryCity
  **/
  @javax.annotation.Nullable
  @Schema(example = "New York City", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the city as present in the beneficiary's address.")
  public String getBeneficiaryCity() {
    return beneficiaryCity;
  }


  public void setBeneficiaryCity(String beneficiaryCity) {
    this.beneficiaryCity = beneficiaryCity;
  }


  public BeneficiaryBeneficiaryContactDetails beneficiaryState(String beneficiaryState) {
    
    this.beneficiaryState = beneficiaryState;
    return this;
  }

   /**
   * It displays the name of the state as present in the beneficiary&#39;s address.
   * @return beneficiaryState
  **/
  @javax.annotation.Nullable
  @Schema(example = "New York", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the state as present in the beneficiary's address.")
  public String getBeneficiaryState() {
    return beneficiaryState;
  }


  public void setBeneficiaryState(String beneficiaryState) {
    this.beneficiaryState = beneficiaryState;
  }


  public BeneficiaryBeneficiaryContactDetails beneficiaryPostalCode(String beneficiaryPostalCode) {
    
    this.beneficiaryPostalCode = beneficiaryPostalCode;
    return this;
  }

   /**
   * It displays the PIN code as present in the beneficiary&#39;s address.
   * @return beneficiaryPostalCode
  **/
  @javax.annotation.Nullable
  @Schema(example = "560001", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the PIN code as present in the beneficiary's address.")
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
    BeneficiaryBeneficiaryContactDetails beneficiaryBeneficiaryContactDetails = (BeneficiaryBeneficiaryContactDetails) o;
    return Objects.equals(this.beneficiaryEmail, beneficiaryBeneficiaryContactDetails.beneficiaryEmail) &&
        Objects.equals(this.beneficiaryPhone, beneficiaryBeneficiaryContactDetails.beneficiaryPhone) &&
        Objects.equals(this.beneficiaryCountryCode, beneficiaryBeneficiaryContactDetails.beneficiaryCountryCode) &&
        Objects.equals(this.beneficiaryAddress, beneficiaryBeneficiaryContactDetails.beneficiaryAddress) &&
        Objects.equals(this.beneficiaryCity, beneficiaryBeneficiaryContactDetails.beneficiaryCity) &&
        Objects.equals(this.beneficiaryState, beneficiaryBeneficiaryContactDetails.beneficiaryState) &&
        Objects.equals(this.beneficiaryPostalCode, beneficiaryBeneficiaryContactDetails.beneficiaryPostalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryEmail, beneficiaryPhone, beneficiaryCountryCode, beneficiaryAddress, beneficiaryCity, beneficiaryState, beneficiaryPostalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficiaryBeneficiaryContactDetails {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to BeneficiaryBeneficiaryContactDetails
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
  * @throws IOException if the JSON Element is invalid with respect to BeneficiaryBeneficiaryContactDetails
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
       if (!BeneficiaryBeneficiaryContactDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BeneficiaryBeneficiaryContactDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BeneficiaryBeneficiaryContactDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BeneficiaryBeneficiaryContactDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<BeneficiaryBeneficiaryContactDetails>() {
           @Override
           public void write(JsonWriter out, BeneficiaryBeneficiaryContactDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BeneficiaryBeneficiaryContactDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BeneficiaryBeneficiaryContactDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BeneficiaryBeneficiaryContactDetails
  * @throws IOException if the JSON string is invalid with respect to BeneficiaryBeneficiaryContactDetails
  */
  public static BeneficiaryBeneficiaryContactDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BeneficiaryBeneficiaryContactDetails.class);
  }

 /**
  * Convert an instance of BeneficiaryBeneficiaryContactDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

