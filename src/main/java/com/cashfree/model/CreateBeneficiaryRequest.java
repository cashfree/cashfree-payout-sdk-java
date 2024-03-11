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
import com.cashfree.model.CreateBeneficiaryRequestBeneficiaryContactDetails;
import com.cashfree.model.CreateBeneficiaryRequestBeneficiaryInstrumentDetails;
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
 * Find the request parameters to create a beneficiary
 */
@Schema(description = "Find the request parameters to create a beneficiary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T10:35:59.070604Z[Etc/UTC]")
public class CreateBeneficiaryRequest {
  public static final String SERIALIZED_NAME_BENEFICIARY_ID = "beneficiary_id";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_ID)
  private String beneficiaryId;

  public static final String SERIALIZED_NAME_BENEFICIARY_NAME = "beneficiary_name";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_NAME)
  private String beneficiaryName;

  public static final String SERIALIZED_NAME_BENEFICIARY_INSTRUMENT_DETAILS = "beneficiary_instrument_details";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_INSTRUMENT_DETAILS)
  private CreateBeneficiaryRequestBeneficiaryInstrumentDetails beneficiaryInstrumentDetails;

  public static final String SERIALIZED_NAME_BENEFICIARY_CONTACT_DETAILS = "beneficiary_contact_details";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_CONTACT_DETAILS)
  private CreateBeneficiaryRequestBeneficiaryContactDetails beneficiaryContactDetails;

  public CreateBeneficiaryRequest() {
  }

  public CreateBeneficiaryRequest beneficiaryId(String beneficiaryId) {
    
    this.beneficiaryId = beneficiaryId;
    return this;
  }

   /**
   * It is the unique ID you create to identify the beneficiary. Alphanumeric, underscore ( _ ), pipe ( | ), and dot ( . ) are allowed.
   * @return beneficiaryId
  **/
  @javax.annotation.Nonnull
  @Schema(example = "JOHN18011343", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique ID you create to identify the beneficiary. Alphanumeric, underscore ( _ ), pipe ( | ), and dot ( . ) are allowed.")
  public String getBeneficiaryId() {
    return beneficiaryId;
  }


  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }


  public CreateBeneficiaryRequest beneficiaryName(String beneficiaryName) {
    
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * It is the name of the beneficiary. The maximum character limit is 100. Only alphabets and whitespaces are allowed.
   * @return beneficiaryName
  **/
  @javax.annotation.Nonnull
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the name of the beneficiary. The maximum character limit is 100. Only alphabets and whitespaces are allowed.")
  public String getBeneficiaryName() {
    return beneficiaryName;
  }


  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }


  public CreateBeneficiaryRequest beneficiaryInstrumentDetails(CreateBeneficiaryRequestBeneficiaryInstrumentDetails beneficiaryInstrumentDetails) {
    
    this.beneficiaryInstrumentDetails = beneficiaryInstrumentDetails;
    return this;
  }

   /**
   * Get beneficiaryInstrumentDetails
   * @return beneficiaryInstrumentDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateBeneficiaryRequestBeneficiaryInstrumentDetails getBeneficiaryInstrumentDetails() {
    return beneficiaryInstrumentDetails;
  }


  public void setBeneficiaryInstrumentDetails(CreateBeneficiaryRequestBeneficiaryInstrumentDetails beneficiaryInstrumentDetails) {
    this.beneficiaryInstrumentDetails = beneficiaryInstrumentDetails;
  }


  public CreateBeneficiaryRequest beneficiaryContactDetails(CreateBeneficiaryRequestBeneficiaryContactDetails beneficiaryContactDetails) {
    
    this.beneficiaryContactDetails = beneficiaryContactDetails;
    return this;
  }

   /**
   * Get beneficiaryContactDetails
   * @return beneficiaryContactDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateBeneficiaryRequestBeneficiaryContactDetails getBeneficiaryContactDetails() {
    return beneficiaryContactDetails;
  }


  public void setBeneficiaryContactDetails(CreateBeneficiaryRequestBeneficiaryContactDetails beneficiaryContactDetails) {
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
    CreateBeneficiaryRequest createBeneficiaryRequest = (CreateBeneficiaryRequest) o;
    return Objects.equals(this.beneficiaryId, createBeneficiaryRequest.beneficiaryId) &&
        Objects.equals(this.beneficiaryName, createBeneficiaryRequest.beneficiaryName) &&
        Objects.equals(this.beneficiaryInstrumentDetails, createBeneficiaryRequest.beneficiaryInstrumentDetails) &&
        Objects.equals(this.beneficiaryContactDetails, createBeneficiaryRequest.beneficiaryContactDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryId, beneficiaryName, beneficiaryInstrumentDetails, beneficiaryContactDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBeneficiaryRequest {\n");
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
    openapiRequiredFields.add("beneficiary_id");
    openapiRequiredFields.add("beneficiary_name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBeneficiaryRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBeneficiaryRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("beneficiary_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_id").toString()));
      }
      if (!jsonObj.get("beneficiary_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_name").toString()));
      }
      // validate the optional field `beneficiary_instrument_details`
      if (jsonObj.get("beneficiary_instrument_details") != null && !jsonObj.get("beneficiary_instrument_details").isJsonNull()) {
        CreateBeneficiaryRequestBeneficiaryInstrumentDetails.validateJsonElement(jsonObj.get("beneficiary_instrument_details"));
      }
      // validate the optional field `beneficiary_contact_details`
      if (jsonObj.get("beneficiary_contact_details") != null && !jsonObj.get("beneficiary_contact_details").isJsonNull()) {
        CreateBeneficiaryRequestBeneficiaryContactDetails.validateJsonElement(jsonObj.get("beneficiary_contact_details"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBeneficiaryRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBeneficiaryRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("beneficiary_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_id").toString()));
      }
      if (!jsonObj.get("beneficiary_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_name").toString()));
      }
      // validate the optional field `beneficiary_instrument_details`
      if (jsonObj.get("beneficiary_instrument_details") != null && !jsonObj.get("beneficiary_instrument_details").isJsonNull()) {
        CreateBeneficiaryRequestBeneficiaryInstrumentDetails.validateJsonElement(jsonObj.get("beneficiary_instrument_details"));
        return true;
      }
      // validate the optional field `beneficiary_contact_details`
      if (jsonObj.get("beneficiary_contact_details") != null && !jsonObj.get("beneficiary_contact_details").isJsonNull()) {
        CreateBeneficiaryRequestBeneficiaryContactDetails.validateJsonElement(jsonObj.get("beneficiary_contact_details"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBeneficiaryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBeneficiaryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBeneficiaryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBeneficiaryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBeneficiaryRequest>() {
           @Override
           public void write(JsonWriter out, CreateBeneficiaryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBeneficiaryRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBeneficiaryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBeneficiaryRequest
  * @throws IOException if the JSON string is invalid with respect to CreateBeneficiaryRequest
  */
  public static CreateBeneficiaryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBeneficiaryRequest.class);
  }

 /**
  * Convert an instance of CreateBeneficiaryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

