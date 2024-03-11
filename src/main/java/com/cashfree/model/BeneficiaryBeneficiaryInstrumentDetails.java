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
 * It displays the payment instrument details of the beneficiary.
 */
@Schema(description = "It displays the payment instrument details of the beneficiary.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T11:10:12.476745Z[Etc/UTC]")
public class BeneficiaryBeneficiaryInstrumentDetails {
  public static final String SERIALIZED_NAME_BANK_ACCOUNT_NUMBER = "bank_account_number";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_NUMBER)
  private String bankAccountNumber;

  public static final String SERIALIZED_NAME_BANK_IFSC = "bank_ifsc";
  @SerializedName(SERIALIZED_NAME_BANK_IFSC)
  private String bankIfsc;

  public static final String SERIALIZED_NAME_VPA = "vpa";
  @SerializedName(SERIALIZED_NAME_VPA)
  private String vpa;

  public BeneficiaryBeneficiaryInstrumentDetails() {
  }

  public BeneficiaryBeneficiaryInstrumentDetails bankAccountNumber(String bankAccountNumber) {
    
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * It displays the bank account of the beneficiary.]
   * @return bankAccountNumber
  **/
  @javax.annotation.Nullable
  @Schema(example = "00111122233", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the bank account of the beneficiary.]")
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }


  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }


  public BeneficiaryBeneficiaryInstrumentDetails bankIfsc(String bankIfsc) {
    
    this.bankIfsc = bankIfsc;
    return this;
  }

   /**
   * It displays the IFSC information of the beneficiary&#39;s bank account.
   * @return bankIfsc
  **/
  @javax.annotation.Nullable
  @Schema(example = "HDFC0000001", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the IFSC information of the beneficiary's bank account.")
  public String getBankIfsc() {
    return bankIfsc;
  }


  public void setBankIfsc(String bankIfsc) {
    this.bankIfsc = bankIfsc;
  }


  public BeneficiaryBeneficiaryInstrumentDetails vpa(String vpa) {
    
    this.vpa = vpa;
    return this;
  }

   /**
   * It displays the UPI VPA information of the beneficiary.
   * @return vpa
  **/
  @javax.annotation.Nullable
  @Schema(example = "test@upi", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the UPI VPA information of the beneficiary.")
  public String getVpa() {
    return vpa;
  }


  public void setVpa(String vpa) {
    this.vpa = vpa;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeneficiaryBeneficiaryInstrumentDetails beneficiaryBeneficiaryInstrumentDetails = (BeneficiaryBeneficiaryInstrumentDetails) o;
    return Objects.equals(this.bankAccountNumber, beneficiaryBeneficiaryInstrumentDetails.bankAccountNumber) &&
        Objects.equals(this.bankIfsc, beneficiaryBeneficiaryInstrumentDetails.bankIfsc) &&
        Objects.equals(this.vpa, beneficiaryBeneficiaryInstrumentDetails.vpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountNumber, bankIfsc, vpa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficiaryBeneficiaryInstrumentDetails {\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankIfsc: ").append(toIndentedString(bankIfsc)).append("\n");
    sb.append("    vpa: ").append(toIndentedString(vpa)).append("\n");
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
    openapiFields.add("bank_account_number");
    openapiFields.add("bank_ifsc");
    openapiFields.add("vpa");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BeneficiaryBeneficiaryInstrumentDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bank_account_number") != null && !jsonObj.get("bank_account_number").isJsonNull()) && !jsonObj.get("bank_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account_number").toString()));
      }
      if ((jsonObj.get("bank_ifsc") != null && !jsonObj.get("bank_ifsc").isJsonNull()) && !jsonObj.get("bank_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_ifsc").toString()));
      }
      if ((jsonObj.get("vpa") != null && !jsonObj.get("vpa").isJsonNull()) && !jsonObj.get("vpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpa").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BeneficiaryBeneficiaryInstrumentDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bank_account_number") != null && !jsonObj.get("bank_account_number").isJsonNull()) && !jsonObj.get("bank_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account_number").toString()));
      }
      if ((jsonObj.get("bank_ifsc") != null && !jsonObj.get("bank_ifsc").isJsonNull()) && !jsonObj.get("bank_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_ifsc").toString()));
      }
      if ((jsonObj.get("vpa") != null && !jsonObj.get("vpa").isJsonNull()) && !jsonObj.get("vpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpa").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BeneficiaryBeneficiaryInstrumentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BeneficiaryBeneficiaryInstrumentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BeneficiaryBeneficiaryInstrumentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BeneficiaryBeneficiaryInstrumentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<BeneficiaryBeneficiaryInstrumentDetails>() {
           @Override
           public void write(JsonWriter out, BeneficiaryBeneficiaryInstrumentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BeneficiaryBeneficiaryInstrumentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BeneficiaryBeneficiaryInstrumentDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BeneficiaryBeneficiaryInstrumentDetails
  * @throws IOException if the JSON string is invalid with respect to BeneficiaryBeneficiaryInstrumentDetails
  */
  public static BeneficiaryBeneficiaryInstrumentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BeneficiaryBeneficiaryInstrumentDetails.class);
  }

 /**
  * Convert an instance of BeneficiaryBeneficiaryInstrumentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

