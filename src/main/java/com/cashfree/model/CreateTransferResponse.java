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
import com.cashfree.model.CreateTransferResponseBeneficiaryDetails;
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
 * Standard Transfer V2 Response
 */
@Schema(description = "Standard Transfer V2 Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T10:53:35.405429Z[Etc/UTC]")
public class CreateTransferResponse {
  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_CF_TRANSFER_ID = "cf_transfer_id";
  @SerializedName(SERIALIZED_NAME_CF_TRANSFER_ID)
  private String cfTransferId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_BENEFICIARY_DETAILS = "beneficiary_details";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_DETAILS)
  private CreateTransferResponseBeneficiaryDetails beneficiaryDetails;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Double transferAmount;

  public static final String SERIALIZED_NAME_TRANSFER_SERVICE_CHARGE = "transfer_service_charge";
  @SerializedName(SERIALIZED_NAME_TRANSFER_SERVICE_CHARGE)
  private Double transferServiceCharge;

  public static final String SERIALIZED_NAME_TRANSFER_SERVICE_TAX = "transfer_service_tax";
  @SerializedName(SERIALIZED_NAME_TRANSFER_SERVICE_TAX)
  private Double transferServiceTax;

  public static final String SERIALIZED_NAME_TRANSFER_MODE = "transfer_mode";
  @SerializedName(SERIALIZED_NAME_TRANSFER_MODE)
  private String transferMode;

  public static final String SERIALIZED_NAME_TRANSFER_UTR = "transfer_utr";
  @SerializedName(SERIALIZED_NAME_TRANSFER_UTR)
  private String transferUtr;

  public static final String SERIALIZED_NAME_FUNDSOURCE_ID = "fundsource_id";
  @SerializedName(SERIALIZED_NAME_FUNDSOURCE_ID)
  private String fundsourceId;

  public static final String SERIALIZED_NAME_ADDED_ON = "added_on";
  @SerializedName(SERIALIZED_NAME_ADDED_ON)
  private String addedOn;

  public static final String SERIALIZED_NAME_UPDATED_ON = "updated_on";
  @SerializedName(SERIALIZED_NAME_UPDATED_ON)
  private String updatedOn;

  public CreateTransferResponse() {
  }

  public CreateTransferResponse transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify the transfer.
   * @return transferId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify the transfer.")
  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public CreateTransferResponse cfTransferId(String cfTransferId) {
    
    this.cfTransferId = cfTransferId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments. You receive this ID in the response after initiating the standard transfer request.
   * @return cfTransferId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments. You receive this ID in the response after initiating the standard transfer request.")
  public String getCfTransferId() {
    return cfTransferId;
  }


  public void setCfTransferId(String cfTransferId) {
    this.cfTransferId = cfTransferId;
  }


  public CreateTransferResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the transfer.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the transfer.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CreateTransferResponse beneficiaryDetails(CreateTransferResponseBeneficiaryDetails beneficiaryDetails) {
    
    this.beneficiaryDetails = beneficiaryDetails;
    return this;
  }

   /**
   * Get beneficiaryDetails
   * @return beneficiaryDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateTransferResponseBeneficiaryDetails getBeneficiaryDetails() {
    return beneficiaryDetails;
  }


  public void setBeneficiaryDetails(CreateTransferResponseBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
  }


  public CreateTransferResponse transferAmount(Double transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * It displays the transfer amount initiated in the request.
   * @return transferAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the transfer amount initiated in the request.")
  public Double getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(Double transferAmount) {
    this.transferAmount = transferAmount;
  }


  public CreateTransferResponse transferServiceCharge(Double transferServiceCharge) {
    
    this.transferServiceCharge = transferServiceCharge;
    return this;
  }

   /**
   * It displays the service charge applicable for the successful transfer request.
   * @return transferServiceCharge
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the service charge applicable for the successful transfer request.")
  public Double getTransferServiceCharge() {
    return transferServiceCharge;
  }


  public void setTransferServiceCharge(Double transferServiceCharge) {
    this.transferServiceCharge = transferServiceCharge;
  }


  public CreateTransferResponse transferServiceTax(Double transferServiceTax) {
    
    this.transferServiceTax = transferServiceTax;
    return this;
  }

   /**
   * It displays the service tax applicable for the successful transfer request.
   * @return transferServiceTax
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the service tax applicable for the successful transfer request.")
  public Double getTransferServiceTax() {
    return transferServiceTax;
  }


  public void setTransferServiceTax(Double transferServiceTax) {
    this.transferServiceTax = transferServiceTax;
  }


  public CreateTransferResponse transferMode(String transferMode) {
    
    this.transferMode = transferMode;
    return this;
  }

   /**
   * It displays the mode of the transfer.
   * @return transferMode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the mode of the transfer.")
  public String getTransferMode() {
    return transferMode;
  }


  public void setTransferMode(String transferMode) {
    this.transferMode = transferMode;
  }


  public CreateTransferResponse transferUtr(String transferUtr) {
    
    this.transferUtr = transferUtr;
    return this;
  }

   /**
   * It displays the unique number that is generated to recognise any fund transfer that is created by the bank that facilitates the transfer.
   * @return transferUtr
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique number that is generated to recognise any fund transfer that is created by the bank that facilitates the transfer.")
  public String getTransferUtr() {
    return transferUtr;
  }


  public void setTransferUtr(String transferUtr) {
    this.transferUtr = transferUtr;
  }


  public CreateTransferResponse fundsourceId(String fundsourceId) {
    
    this.fundsourceId = fundsourceId;
    return this;
  }

   /**
   * It displays the ID of the fund source from where the money was debited for this transfer request.
   * @return fundsourceId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the ID of the fund source from where the money was debited for this transfer request.")
  public String getFundsourceId() {
    return fundsourceId;
  }


  public void setFundsourceId(String fundsourceId) {
    this.fundsourceId = fundsourceId;
  }


  public CreateTransferResponse addedOn(String addedOn) {
    
    this.addedOn = addedOn;
    return this;
  }

   /**
   * It displays the time of when the transfer request was added to the system.
   * @return addedOn
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the time of when the transfer request was added to the system.")
  public String getAddedOn() {
    return addedOn;
  }


  public void setAddedOn(String addedOn) {
    this.addedOn = addedOn;
  }


  public CreateTransferResponse updatedOn(String updatedOn) {
    
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * It displays the updated time for the transfer.
   * @return updatedOn
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the updated time for the transfer.")
  public String getUpdatedOn() {
    return updatedOn;
  }


  public void setUpdatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransferResponse createTransferResponse = (CreateTransferResponse) o;
    return Objects.equals(this.transferId, createTransferResponse.transferId) &&
        Objects.equals(this.cfTransferId, createTransferResponse.cfTransferId) &&
        Objects.equals(this.status, createTransferResponse.status) &&
        Objects.equals(this.beneficiaryDetails, createTransferResponse.beneficiaryDetails) &&
        Objects.equals(this.transferAmount, createTransferResponse.transferAmount) &&
        Objects.equals(this.transferServiceCharge, createTransferResponse.transferServiceCharge) &&
        Objects.equals(this.transferServiceTax, createTransferResponse.transferServiceTax) &&
        Objects.equals(this.transferMode, createTransferResponse.transferMode) &&
        Objects.equals(this.transferUtr, createTransferResponse.transferUtr) &&
        Objects.equals(this.fundsourceId, createTransferResponse.fundsourceId) &&
        Objects.equals(this.addedOn, createTransferResponse.addedOn) &&
        Objects.equals(this.updatedOn, createTransferResponse.updatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferId, cfTransferId, status, beneficiaryDetails, transferAmount, transferServiceCharge, transferServiceTax, transferMode, transferUtr, fundsourceId, addedOn, updatedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransferResponse {\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    cfTransferId: ").append(toIndentedString(cfTransferId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    beneficiaryDetails: ").append(toIndentedString(beneficiaryDetails)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferServiceCharge: ").append(toIndentedString(transferServiceCharge)).append("\n");
    sb.append("    transferServiceTax: ").append(toIndentedString(transferServiceTax)).append("\n");
    sb.append("    transferMode: ").append(toIndentedString(transferMode)).append("\n");
    sb.append("    transferUtr: ").append(toIndentedString(transferUtr)).append("\n");
    sb.append("    fundsourceId: ").append(toIndentedString(fundsourceId)).append("\n");
    sb.append("    addedOn: ").append(toIndentedString(addedOn)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
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
    openapiFields.add("transfer_id");
    openapiFields.add("cf_transfer_id");
    openapiFields.add("status");
    openapiFields.add("beneficiary_details");
    openapiFields.add("transfer_amount");
    openapiFields.add("transfer_service_charge");
    openapiFields.add("transfer_service_tax");
    openapiFields.add("transfer_mode");
    openapiFields.add("transfer_utr");
    openapiFields.add("fundsource_id");
    openapiFields.add("added_on");
    openapiFields.add("updated_on");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTransferResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("transfer_id") != null && !jsonObj.get("transfer_id").isJsonNull()) && !jsonObj.get("transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_id").toString()));
      }
      if ((jsonObj.get("cf_transfer_id") != null && !jsonObj.get("cf_transfer_id").isJsonNull()) && !jsonObj.get("cf_transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_transfer_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `beneficiary_details`
      if (jsonObj.get("beneficiary_details") != null && !jsonObj.get("beneficiary_details").isJsonNull()) {
        CreateTransferResponseBeneficiaryDetails.validateJsonElement(jsonObj.get("beneficiary_details"));
      }
      if ((jsonObj.get("transfer_mode") != null && !jsonObj.get("transfer_mode").isJsonNull()) && !jsonObj.get("transfer_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_mode").toString()));
      }
      if ((jsonObj.get("transfer_utr") != null && !jsonObj.get("transfer_utr").isJsonNull()) && !jsonObj.get("transfer_utr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_utr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_utr").toString()));
      }
      if ((jsonObj.get("fundsource_id") != null && !jsonObj.get("fundsource_id").isJsonNull()) && !jsonObj.get("fundsource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fundsource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fundsource_id").toString()));
      }
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
      if ((jsonObj.get("updated_on") != null && !jsonObj.get("updated_on").isJsonNull()) && !jsonObj.get("updated_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_on").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTransferResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("transfer_id") != null && !jsonObj.get("transfer_id").isJsonNull()) && !jsonObj.get("transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_id").toString()));
      }
      if ((jsonObj.get("cf_transfer_id") != null && !jsonObj.get("cf_transfer_id").isJsonNull()) && !jsonObj.get("cf_transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_transfer_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `beneficiary_details`
      if (jsonObj.get("beneficiary_details") != null && !jsonObj.get("beneficiary_details").isJsonNull()) {
        CreateTransferResponseBeneficiaryDetails.validateJsonElement(jsonObj.get("beneficiary_details"));
        return true;
      }
      if ((jsonObj.get("transfer_mode") != null && !jsonObj.get("transfer_mode").isJsonNull()) && !jsonObj.get("transfer_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_mode").toString()));
      }
      if ((jsonObj.get("transfer_utr") != null && !jsonObj.get("transfer_utr").isJsonNull()) && !jsonObj.get("transfer_utr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_utr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_utr").toString()));
      }
      if ((jsonObj.get("fundsource_id") != null && !jsonObj.get("fundsource_id").isJsonNull()) && !jsonObj.get("fundsource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fundsource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fundsource_id").toString()));
      }
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
      if ((jsonObj.get("updated_on") != null && !jsonObj.get("updated_on").isJsonNull()) && !jsonObj.get("updated_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_on").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTransferResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTransferResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTransferResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTransferResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTransferResponse>() {
           @Override
           public void write(JsonWriter out, CreateTransferResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTransferResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTransferResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTransferResponse
  * @throws IOException if the JSON string is invalid with respect to CreateTransferResponse
  */
  public static CreateTransferResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTransferResponse.class);
  }

 /**
  * Convert an instance of CreateTransferResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

