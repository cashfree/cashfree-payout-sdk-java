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
import com.cashfree.model.CreateTransferRequestBeneficiaryDetails;
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
 * Standard Transfer V2
 */
@Schema(description = "Standard Transfer V2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T10:35:59.070604Z[Etc/UTC]")
public class CreateTransferRequest {
  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Double transferAmount;

  public static final String SERIALIZED_NAME_TRANSFER_CURRENCY = "transfer_currency";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CURRENCY)
  private String transferCurrency;

  /**
   * It is the mode of transfer. Allowed values are banktransfer, imps, neft, rtgs, upi, paytm, amazonpay, card. The default transfer_mode is banktransfer.
   */
  @JsonAdapter(TransferModeEnum.Adapter.class)
  public enum TransferModeEnum {
    BANKTRANSFER("banktransfer"),
    
    IMPS("imps"),
    
    NEFT("neft"),
    
    RTGS("rtgs"),
    
    UPI("upi"),
    
    PAYTM("paytm"),
    
    AMAZONPAY("amazonpay"),
    
    CARD("card"),
    
    CARDUPI("cardupi"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    TransferModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransferModeEnum fromValue(String value) {
      for (TransferModeEnum b : TransferModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<TransferModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransferModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransferModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransferModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSFER_MODE = "transfer_mode";
  @SerializedName(SERIALIZED_NAME_TRANSFER_MODE)
  private TransferModeEnum transferMode;

  public static final String SERIALIZED_NAME_BENEFICIARY_DETAILS = "beneficiary_details";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_DETAILS)
  private CreateTransferRequestBeneficiaryDetails beneficiaryDetails;

  public static final String SERIALIZED_NAME_TRANSFER_REMARKS = "transfer_remarks";
  @SerializedName(SERIALIZED_NAME_TRANSFER_REMARKS)
  private String transferRemarks;

  public static final String SERIALIZED_NAME_FUNDSOURCE_ID = "fundsource_id";
  @SerializedName(SERIALIZED_NAME_FUNDSOURCE_ID)
  private String fundsourceId;

  public CreateTransferRequest() {
  }

  public CreateTransferRequest transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * It is the unique ID you create to identify the transfer. You can use a maximum of 40 characters to create a transfer_id.  Alphanumeric and underscore ( _ ) are allowed.
   * @return transferId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique ID you create to identify the transfer. You can use a maximum of 40 characters to create a transfer_id.  Alphanumeric and underscore ( _ ) are allowed.")
  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public CreateTransferRequest transferAmount(Double transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * It is the transfer amount. Decimal values are allowed. The minimum value should be equal to or greater than 1.00. (&gt;&#x3D; 1.00)
   * @return transferAmount
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the transfer amount. Decimal values are allowed. The minimum value should be equal to or greater than 1.00. (>= 1.00)")
  public Double getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(Double transferAmount) {
    this.transferAmount = transferAmount;
  }


  public CreateTransferRequest transferCurrency(String transferCurrency) {
    
    this.transferCurrency = transferCurrency;
    return this;
  }

   /**
   * It is the currency of the transfer amount. The default value is INR.
   * @return transferCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the currency of the transfer amount. The default value is INR.")
  public String getTransferCurrency() {
    return transferCurrency;
  }


  public void setTransferCurrency(String transferCurrency) {
    this.transferCurrency = transferCurrency;
  }


  public CreateTransferRequest transferMode(TransferModeEnum transferMode) {
    
    this.transferMode = transferMode;
    return this;
  }

   /**
   * It is the mode of transfer. Allowed values are banktransfer, imps, neft, rtgs, upi, paytm, amazonpay, card. The default transfer_mode is banktransfer.
   * @return transferMode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the mode of transfer. Allowed values are banktransfer, imps, neft, rtgs, upi, paytm, amazonpay, card. The default transfer_mode is banktransfer.")
  public TransferModeEnum getTransferMode() {
    return transferMode;
  }


  public void setTransferMode(TransferModeEnum transferMode) {
    this.transferMode = transferMode;
  }


  public CreateTransferRequest beneficiaryDetails(CreateTransferRequestBeneficiaryDetails beneficiaryDetails) {
    
    this.beneficiaryDetails = beneficiaryDetails;
    return this;
  }

   /**
   * Get beneficiaryDetails
   * @return beneficiaryDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateTransferRequestBeneficiaryDetails getBeneficiaryDetails() {
    return beneficiaryDetails;
  }


  public void setBeneficiaryDetails(CreateTransferRequestBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
  }


  public CreateTransferRequest transferRemarks(String transferRemarks) {
    
    this.transferRemarks = transferRemarks;
    return this;
  }

   /**
   * It can contain any additional remarks for the transfer. Alphanumeric and whitespaces are allowed. The maximum character limit is 70.
   * @return transferRemarks
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It can contain any additional remarks for the transfer. Alphanumeric and whitespaces are allowed. The maximum character limit is 70.")
  public String getTransferRemarks() {
    return transferRemarks;
  }


  public void setTransferRemarks(String transferRemarks) {
    this.transferRemarks = transferRemarks;
  }


  public CreateTransferRequest fundsourceId(String fundsourceId) {
    
    this.fundsourceId = fundsourceId;
    return this;
  }

   /**
   * It is the ID of the fund source from which the transfer amount will be debited.
   * @return fundsourceId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the ID of the fund source from which the transfer amount will be debited.")
  public String getFundsourceId() {
    return fundsourceId;
  }


  public void setFundsourceId(String fundsourceId) {
    this.fundsourceId = fundsourceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransferRequest createTransferRequest = (CreateTransferRequest) o;
    return Objects.equals(this.transferId, createTransferRequest.transferId) &&
        Objects.equals(this.transferAmount, createTransferRequest.transferAmount) &&
        Objects.equals(this.transferCurrency, createTransferRequest.transferCurrency) &&
        Objects.equals(this.transferMode, createTransferRequest.transferMode) &&
        Objects.equals(this.beneficiaryDetails, createTransferRequest.beneficiaryDetails) &&
        Objects.equals(this.transferRemarks, createTransferRequest.transferRemarks) &&
        Objects.equals(this.fundsourceId, createTransferRequest.fundsourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferId, transferAmount, transferCurrency, transferMode, beneficiaryDetails, transferRemarks, fundsourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransferRequest {\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferCurrency: ").append(toIndentedString(transferCurrency)).append("\n");
    sb.append("    transferMode: ").append(toIndentedString(transferMode)).append("\n");
    sb.append("    beneficiaryDetails: ").append(toIndentedString(beneficiaryDetails)).append("\n");
    sb.append("    transferRemarks: ").append(toIndentedString(transferRemarks)).append("\n");
    sb.append("    fundsourceId: ").append(toIndentedString(fundsourceId)).append("\n");
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
    openapiFields.add("transfer_amount");
    openapiFields.add("transfer_currency");
    openapiFields.add("transfer_mode");
    openapiFields.add("beneficiary_details");
    openapiFields.add("transfer_remarks");
    openapiFields.add("fundsource_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transfer_id");
    openapiRequiredFields.add("transfer_amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTransferRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTransferRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_id").toString()));
      }
      if ((jsonObj.get("transfer_currency") != null && !jsonObj.get("transfer_currency").isJsonNull()) && !jsonObj.get("transfer_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_currency").toString()));
      }
      if ((jsonObj.get("transfer_mode") != null && !jsonObj.get("transfer_mode").isJsonNull()) && !jsonObj.get("transfer_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_mode").toString()));
      }
      // validate the optional field `beneficiary_details`
      if (jsonObj.get("beneficiary_details") != null && !jsonObj.get("beneficiary_details").isJsonNull()) {
        CreateTransferRequestBeneficiaryDetails.validateJsonElement(jsonObj.get("beneficiary_details"));
      }
      if ((jsonObj.get("transfer_remarks") != null && !jsonObj.get("transfer_remarks").isJsonNull()) && !jsonObj.get("transfer_remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_remarks").toString()));
      }
      if ((jsonObj.get("fundsource_id") != null && !jsonObj.get("fundsource_id").isJsonNull()) && !jsonObj.get("fundsource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fundsource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fundsource_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTransferRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTransferRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_id").toString()));
      }
      if ((jsonObj.get("transfer_currency") != null && !jsonObj.get("transfer_currency").isJsonNull()) && !jsonObj.get("transfer_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_currency").toString()));
      }
      if ((jsonObj.get("transfer_mode") != null && !jsonObj.get("transfer_mode").isJsonNull()) && !jsonObj.get("transfer_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_mode").toString()));
      }
      // validate the optional field `beneficiary_details`
      if (jsonObj.get("beneficiary_details") != null && !jsonObj.get("beneficiary_details").isJsonNull()) {
        CreateTransferRequestBeneficiaryDetails.validateJsonElement(jsonObj.get("beneficiary_details"));
        return true;
      }
      if ((jsonObj.get("transfer_remarks") != null && !jsonObj.get("transfer_remarks").isJsonNull()) && !jsonObj.get("transfer_remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_remarks").toString()));
      }
      if ((jsonObj.get("fundsource_id") != null && !jsonObj.get("fundsource_id").isJsonNull()) && !jsonObj.get("fundsource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fundsource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fundsource_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTransferRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTransferRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTransferRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTransferRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTransferRequest>() {
           @Override
           public void write(JsonWriter out, CreateTransferRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTransferRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTransferRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTransferRequest
  * @throws IOException if the JSON string is invalid with respect to CreateTransferRequest
  */
  public static CreateTransferRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTransferRequest.class);
  }

 /**
  * Convert an instance of CreateTransferRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

