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
 * Batch Transfer V2 Response
 */
@Schema(description = "Batch Transfer V2 Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T12:02:16.890239Z[Etc/UTC]")
public class CreateBatchTransferResponse {
  public static final String SERIALIZED_NAME_BATCH_TRANSFER_ID = "batch_transfer_id";
  @SerializedName(SERIALIZED_NAME_BATCH_TRANSFER_ID)
  private String batchTransferId;

  public static final String SERIALIZED_NAME_CF_BATCH_TRANSFER_ID = "cf_batch_transfer_id";
  @SerializedName(SERIALIZED_NAME_CF_BATCH_TRANSFER_ID)
  private String cfBatchTransferId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public CreateBatchTransferResponse() {
  }

  public CreateBatchTransferResponse batchTransferId(String batchTransferId) {
    
    this.batchTransferId = batchTransferId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify the batch transfer request.
   * @return batchTransferId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify the batch transfer request.")
  public String getBatchTransferId() {
    return batchTransferId;
  }


  public void setBatchTransferId(String batchTransferId) {
    this.batchTransferId = batchTransferId;
  }


  public CreateBatchTransferResponse cfBatchTransferId(String cfBatchTransferId) {
    
    this.cfBatchTransferId = cfBatchTransferId;
    return this;
  }

   /**
   * It displays the unique ID created by Cashfree Payments. You receive this ID in the response after initiating the batch transfer request.
   * @return cfBatchTransferId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID created by Cashfree Payments. You receive this ID in the response after initiating the batch transfer request.")
  public String getCfBatchTransferId() {
    return cfBatchTransferId;
  }


  public void setCfBatchTransferId(String cfBatchTransferId) {
    this.cfBatchTransferId = cfBatchTransferId;
  }


  public CreateBatchTransferResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * It displays the status of the API request.
   * @return status
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the status of the API request.")
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBatchTransferResponse createBatchTransferResponse = (CreateBatchTransferResponse) o;
    return Objects.equals(this.batchTransferId, createBatchTransferResponse.batchTransferId) &&
        Objects.equals(this.cfBatchTransferId, createBatchTransferResponse.cfBatchTransferId) &&
        Objects.equals(this.status, createBatchTransferResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchTransferId, cfBatchTransferId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBatchTransferResponse {\n");
    sb.append("    batchTransferId: ").append(toIndentedString(batchTransferId)).append("\n");
    sb.append("    cfBatchTransferId: ").append(toIndentedString(cfBatchTransferId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("cf_batch_transfer_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBatchTransferResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("batch_transfer_id") != null && !jsonObj.get("batch_transfer_id").isJsonNull()) && !jsonObj.get("batch_transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_transfer_id").toString()));
      }
      if ((jsonObj.get("cf_batch_transfer_id") != null && !jsonObj.get("cf_batch_transfer_id").isJsonNull()) && !jsonObj.get("cf_batch_transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_batch_transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_batch_transfer_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBatchTransferResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("batch_transfer_id") != null && !jsonObj.get("batch_transfer_id").isJsonNull()) && !jsonObj.get("batch_transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batch_transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batch_transfer_id").toString()));
      }
      if ((jsonObj.get("cf_batch_transfer_id") != null && !jsonObj.get("cf_batch_transfer_id").isJsonNull()) && !jsonObj.get("cf_batch_transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_batch_transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_batch_transfer_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBatchTransferResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBatchTransferResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBatchTransferResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBatchTransferResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBatchTransferResponse>() {
           @Override
           public void write(JsonWriter out, CreateBatchTransferResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBatchTransferResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBatchTransferResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBatchTransferResponse
  * @throws IOException if the JSON string is invalid with respect to CreateBatchTransferResponse
  */
  public static CreateBatchTransferResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBatchTransferResponse.class);
  }

 /**
  * Convert an instance of CreateBatchTransferResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

