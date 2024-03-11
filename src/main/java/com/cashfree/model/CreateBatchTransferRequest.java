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
import com.cashfree.model.CreateBatchTransferRequestTransfersInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
 * Batch Transfer V2
 */
@Schema(description = "Batch Transfer V2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T11:08:07.400960Z[Etc/UTC]")
public class CreateBatchTransferRequest {
  public static final String SERIALIZED_NAME_BATCH_TRANSFER_ID = "batch_transfer_id";
  @SerializedName(SERIALIZED_NAME_BATCH_TRANSFER_ID)
  private String batchTransferId;

  public static final String SERIALIZED_NAME_TRANSFERS = "transfers";
  @SerializedName(SERIALIZED_NAME_TRANSFERS)
  private List<CreateBatchTransferRequestTransfersInner> transfers;

  public CreateBatchTransferRequest() {
  }

  public CreateBatchTransferRequest batchTransferId(String batchTransferId) {
    
    this.batchTransferId = batchTransferId;
    return this;
  }

   /**
   * It is the unique ID you create to identify the batch transfer request. The maximum character limit is 60. Alphanumeric and underscore ( _ ) characters are allowed.
   * @return batchTransferId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "It is the unique ID you create to identify the batch transfer request. The maximum character limit is 60. Alphanumeric and underscore ( _ ) characters are allowed.")
  public String getBatchTransferId() {
    return batchTransferId;
  }


  public void setBatchTransferId(String batchTransferId) {
    this.batchTransferId = batchTransferId;
  }


  public CreateBatchTransferRequest transfers(List<CreateBatchTransferRequestTransfersInner> transfers) {
    
    this.transfers = transfers;
    return this;
  }

  public CreateBatchTransferRequest addTransfersItem(CreateBatchTransferRequestTransfersInner transfersItem) {
    if (this.transfers == null) {
      this.transfers = new ArrayList<>();
    }
    this.transfers.add(transfersItem);
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<CreateBatchTransferRequestTransfersInner> getTransfers() {
    return transfers;
  }


  public void setTransfers(List<CreateBatchTransferRequestTransfersInner> transfers) {
    this.transfers = transfers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBatchTransferRequest createBatchTransferRequest = (CreateBatchTransferRequest) o;
    return Objects.equals(this.batchTransferId, createBatchTransferRequest.batchTransferId) &&
        Objects.equals(this.transfers, createBatchTransferRequest.transfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchTransferId, transfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBatchTransferRequest {\n");
    sb.append("    batchTransferId: ").append(toIndentedString(batchTransferId)).append("\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
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
    openapiFields.add("batch_transfer_id");
    openapiFields.add("transfers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("batch_transfer_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBatchTransferRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBatchTransferRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("batch_transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_transfer_id").toString()));
      }
      if (jsonObj.get("transfers") != null && !jsonObj.get("transfers").isJsonNull()) {
        JsonArray jsonArraytransfers = jsonObj.getAsJsonArray("transfers");
        if (jsonArraytransfers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transfers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transfers` to be an array in the JSON string but got `%s`", jsonObj.get("transfers").toString()));
          }

          // validate the optional field `transfers` (array)
          for (int i = 0; i < jsonArraytransfers.size(); i++) {
            CreateBatchTransferRequestTransfersInner.validateJsonElement(jsonArraytransfers.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBatchTransferRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBatchTransferRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("batch_transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_transfer_id").toString()));
      }
      if (jsonObj.get("transfers") != null && !jsonObj.get("transfers").isJsonNull()) {
        JsonArray jsonArraytransfers = jsonObj.getAsJsonArray("transfers");
        if (jsonArraytransfers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transfers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transfers` to be an array in the JSON string but got `%s`", jsonObj.get("transfers").toString()));
          }

          // validate the optional field `transfers` (array)
          for (int i = 0; i < jsonArraytransfers.size(); i++) {
            CreateBatchTransferRequestTransfersInner.validateJsonElement(jsonArraytransfers.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBatchTransferRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBatchTransferRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBatchTransferRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBatchTransferRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBatchTransferRequest>() {
           @Override
           public void write(JsonWriter out, CreateBatchTransferRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBatchTransferRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBatchTransferRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBatchTransferRequest
  * @throws IOException if the JSON string is invalid with respect to CreateBatchTransferRequest
  */
  public static CreateBatchTransferRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBatchTransferRequest.class);
  }

 /**
  * Convert an instance of CreateBatchTransferRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

