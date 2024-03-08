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
 * It displays the details of where the beneficiary will receive the money.
 */
@Schema(description = "It displays the details of where the beneficiary will receive the money.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-08T12:01:17.874167Z[Etc/UTC]")
public class CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails {
  public static final String SERIALIZED_NAME_BANK_ACCOUNT_NUMBER = "bank_account_number";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_NUMBER)
  private String bankAccountNumber;

  public static final String SERIALIZED_NAME_IFSC = "ifsc";
  @SerializedName(SERIALIZED_NAME_IFSC)
  private String ifsc;

  public static final String SERIALIZED_NAME_VPA = "vpa";
  @SerializedName(SERIALIZED_NAME_VPA)
  private String vpa;

  public CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails() {
  }

  public CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails bankAccountNumber(String bankAccountNumber) {
    
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * It displays the bank account number of the beneficiary.
   * @return bankAccountNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the bank account number of the beneficiary.")
  public String getBankAccountNumber() {
    return bankAccountNumber;
  }


  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }


  public CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails ifsc(String ifsc) {
    
    this.ifsc = ifsc;
    return this;
  }

   /**
   * It displays the IFSC information of the beneficiary&#39;s bank account.
   * @return ifsc
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the IFSC information of the beneficiary's bank account.")
  public String getIfsc() {
    return ifsc;
  }


  public void setIfsc(String ifsc) {
    this.ifsc = ifsc;
  }


  public CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails vpa(String vpa) {
    
    this.vpa = vpa;
    return this;
  }

   /**
   * It displays the UPI VPA information of the beneficiary.
   * @return vpa
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the UPI VPA information of the beneficiary.")
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
    CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails createTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails = (CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails) o;
    return Objects.equals(this.bankAccountNumber, createTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails.bankAccountNumber) &&
        Objects.equals(this.ifsc, createTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails.ifsc) &&
        Objects.equals(this.vpa, createTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails.vpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountNumber, ifsc, vpa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails {\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    ifsc: ").append(toIndentedString(ifsc)).append("\n");
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
    openapiFields.add("ifsc");
    openapiFields.add("vpa");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bank_account_number") != null && !jsonObj.get("bank_account_number").isJsonNull()) && !jsonObj.get("bank_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account_number").toString()));
      }
      if ((jsonObj.get("ifsc") != null && !jsonObj.get("ifsc").isJsonNull()) && !jsonObj.get("ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ifsc").toString()));
      }
      if ((jsonObj.get("vpa") != null && !jsonObj.get("vpa").isJsonNull()) && !jsonObj.get("vpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpa").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bank_account_number") != null && !jsonObj.get("bank_account_number").isJsonNull()) && !jsonObj.get("bank_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account_number").toString()));
      }
      if ((jsonObj.get("ifsc") != null && !jsonObj.get("ifsc").isJsonNull()) && !jsonObj.get("ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ifsc").toString()));
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
       if (!CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails>() {
           @Override
           public void write(JsonWriter out, CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails
  * @throws IOException if the JSON string is invalid with respect to CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails
  */
  public static CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails.class);
  }

 /**
  * Convert an instance of CreateTransferResponseBeneficiaryDetailsBeneficiaryInstrumentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

