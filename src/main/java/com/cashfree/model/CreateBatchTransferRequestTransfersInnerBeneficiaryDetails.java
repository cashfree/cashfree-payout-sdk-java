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
import com.cashfree.model.CreateBatchTransferRequestTransfersInnerBeneficiaryDetailsBeneficiaryInstrumentDetails;
import com.cashfree.model.CreateTransferRequestBeneficiaryDetailsBeneficiaryContactDetails;
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
 * It should contain the details of the beneficiary who receives the transfer amount.
 */
@Schema(description = "It should contain the details of the beneficiary who receives the transfer amount.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-08T12:01:17.874167Z[Etc/UTC]")
public class CreateBatchTransferRequestTransfersInnerBeneficiaryDetails {
  public static final String SERIALIZED_NAME_BENEFICIARY_ID = "beneficiary_id";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_ID)
  private String beneficiaryId;

  public static final String SERIALIZED_NAME_BENEFICIARY_NAME = "beneficiary_name";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_NAME)
  private String beneficiaryName;

  public static final String SERIALIZED_NAME_BENEFICIARY_INSTRUMENT_DETAILS = "beneficiary_instrument_details";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_INSTRUMENT_DETAILS)
  private CreateBatchTransferRequestTransfersInnerBeneficiaryDetailsBeneficiaryInstrumentDetails beneficiaryInstrumentDetails;

  public static final String SERIALIZED_NAME_BENEFICIARY_CONTACT_DETAILS = "beneficiary_contact_details";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_CONTACT_DETAILS)
  private CreateTransferRequestBeneficiaryDetailsBeneficiaryContactDetails beneficiaryContactDetails;

  public CreateBatchTransferRequestTransfersInnerBeneficiaryDetails() {
  }

  public CreateBatchTransferRequestTransfersInnerBeneficiaryDetails beneficiaryId(String beneficiaryId) {
    
    this.beneficiaryId = beneficiaryId;
    return this;
  }

   /**
   * It is the unique ID you created to identify the beneficiary. Alphanumeric characters are allowed.
   * @return beneficiaryId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the unique ID you created to identify the beneficiary. Alphanumeric characters are allowed.")
  public String getBeneficiaryId() {
    return beneficiaryId;
  }


  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }


  public CreateBatchTransferRequestTransfersInnerBeneficiaryDetails beneficiaryName(String beneficiaryName) {
    
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * It is the name of the beneficiary. The maximum character limit is 100.
   * @return beneficiaryName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the name of the beneficiary. The maximum character limit is 100.")
  public String getBeneficiaryName() {
    return beneficiaryName;
  }


  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }


  public CreateBatchTransferRequestTransfersInnerBeneficiaryDetails beneficiaryInstrumentDetails(CreateBatchTransferRequestTransfersInnerBeneficiaryDetailsBeneficiaryInstrumentDetails beneficiaryInstrumentDetails) {
    
    this.beneficiaryInstrumentDetails = beneficiaryInstrumentDetails;
    return this;
  }

   /**
   * Get beneficiaryInstrumentDetails
   * @return beneficiaryInstrumentDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateBatchTransferRequestTransfersInnerBeneficiaryDetailsBeneficiaryInstrumentDetails getBeneficiaryInstrumentDetails() {
    return beneficiaryInstrumentDetails;
  }


  public void setBeneficiaryInstrumentDetails(CreateBatchTransferRequestTransfersInnerBeneficiaryDetailsBeneficiaryInstrumentDetails beneficiaryInstrumentDetails) {
    this.beneficiaryInstrumentDetails = beneficiaryInstrumentDetails;
  }


  public CreateBatchTransferRequestTransfersInnerBeneficiaryDetails beneficiaryContactDetails(CreateTransferRequestBeneficiaryDetailsBeneficiaryContactDetails beneficiaryContactDetails) {
    
    this.beneficiaryContactDetails = beneficiaryContactDetails;
    return this;
  }

   /**
   * Get beneficiaryContactDetails
   * @return beneficiaryContactDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateTransferRequestBeneficiaryDetailsBeneficiaryContactDetails getBeneficiaryContactDetails() {
    return beneficiaryContactDetails;
  }


  public void setBeneficiaryContactDetails(CreateTransferRequestBeneficiaryDetailsBeneficiaryContactDetails beneficiaryContactDetails) {
    this.beneficiaryContactDetails = beneficiaryContactDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBatchTransferRequestTransfersInnerBeneficiaryDetails createBatchTransferRequestTransfersInnerBeneficiaryDetails = (CreateBatchTransferRequestTransfersInnerBeneficiaryDetails) o;
    return Objects.equals(this.beneficiaryId, createBatchTransferRequestTransfersInnerBeneficiaryDetails.beneficiaryId) &&
        Objects.equals(this.beneficiaryName, createBatchTransferRequestTransfersInnerBeneficiaryDetails.beneficiaryName) &&
        Objects.equals(this.beneficiaryInstrumentDetails, createBatchTransferRequestTransfersInnerBeneficiaryDetails.beneficiaryInstrumentDetails) &&
        Objects.equals(this.beneficiaryContactDetails, createBatchTransferRequestTransfersInnerBeneficiaryDetails.beneficiaryContactDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryId, beneficiaryName, beneficiaryInstrumentDetails, beneficiaryContactDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBatchTransferRequestTransfersInnerBeneficiaryDetails {\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    beneficiaryInstrumentDetails: ").append(toIndentedString(beneficiaryInstrumentDetails)).append("\n");
    sb.append("    beneficiaryContactDetails: ").append(toIndentedString(beneficiaryContactDetails)).append("\n");
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
    openapiFields.add("beneficiary_id");
    openapiFields.add("beneficiary_name");
    openapiFields.add("beneficiary_instrument_details");
    openapiFields.add("beneficiary_contact_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBatchTransferRequestTransfersInnerBeneficiaryDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("beneficiary_id") != null && !jsonObj.get("beneficiary_id").isJsonNull()) && !jsonObj.get("beneficiary_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_id").toString()));
      }
      if ((jsonObj.get("beneficiary_name") != null && !jsonObj.get("beneficiary_name").isJsonNull()) && !jsonObj.get("beneficiary_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_name").toString()));
      }
      // validate the optional field `beneficiary_instrument_details`
      if (jsonObj.get("beneficiary_instrument_details") != null && !jsonObj.get("beneficiary_instrument_details").isJsonNull()) {
        CreateBatchTransferRequestTransfersInnerBeneficiaryDetailsBeneficiaryInstrumentDetails.validateJsonElement(jsonObj.get("beneficiary_instrument_details"));
      }
      // validate the optional field `beneficiary_contact_details`
      if (jsonObj.get("beneficiary_contact_details") != null && !jsonObj.get("beneficiary_contact_details").isJsonNull()) {
        CreateTransferRequestBeneficiaryDetailsBeneficiaryContactDetails.validateJsonElement(jsonObj.get("beneficiary_contact_details"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBatchTransferRequestTransfersInnerBeneficiaryDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("beneficiary_id") != null && !jsonObj.get("beneficiary_id").isJsonNull()) && !jsonObj.get("beneficiary_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_id").toString()));
      }
      if ((jsonObj.get("beneficiary_name") != null && !jsonObj.get("beneficiary_name").isJsonNull()) && !jsonObj.get("beneficiary_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_name").toString()));
      }
      // validate the optional field `beneficiary_instrument_details`
      if (jsonObj.get("beneficiary_instrument_details") != null && !jsonObj.get("beneficiary_instrument_details").isJsonNull()) {
        CreateBatchTransferRequestTransfersInnerBeneficiaryDetailsBeneficiaryInstrumentDetails.validateJsonElement(jsonObj.get("beneficiary_instrument_details"));
        return true;
      }
      // validate the optional field `beneficiary_contact_details`
      if (jsonObj.get("beneficiary_contact_details") != null && !jsonObj.get("beneficiary_contact_details").isJsonNull()) {
        CreateTransferRequestBeneficiaryDetailsBeneficiaryContactDetails.validateJsonElement(jsonObj.get("beneficiary_contact_details"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBatchTransferRequestTransfersInnerBeneficiaryDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBatchTransferRequestTransfersInnerBeneficiaryDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBatchTransferRequestTransfersInnerBeneficiaryDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBatchTransferRequestTransfersInnerBeneficiaryDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBatchTransferRequestTransfersInnerBeneficiaryDetails>() {
           @Override
           public void write(JsonWriter out, CreateBatchTransferRequestTransfersInnerBeneficiaryDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBatchTransferRequestTransfersInnerBeneficiaryDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBatchTransferRequestTransfersInnerBeneficiaryDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBatchTransferRequestTransfersInnerBeneficiaryDetails
  * @throws IOException if the JSON string is invalid with respect to CreateBatchTransferRequestTransfersInnerBeneficiaryDetails
  */
  public static CreateBatchTransferRequestTransfersInnerBeneficiaryDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBatchTransferRequestTransfersInnerBeneficiaryDetails.class);
  }

 /**
  * Convert an instance of CreateBatchTransferRequestTransfersInnerBeneficiaryDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

