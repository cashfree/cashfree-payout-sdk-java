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
import com.cashfree.model.BeneficiaryBeneficiaryContactDetails;
import com.cashfree.model.BeneficiaryBeneficiaryInstrumentDetails;
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
 * Contains the information of the created beneficiary
 */
@Schema(description = "Contains the information of the created beneficiary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-08T11:40:44.940416Z[Etc/UTC]")
public class Beneficiary {
  public static final String SERIALIZED_NAME_BENEFICIARY_ID = "beneficiary_id";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_ID)
  private String beneficiaryId;

  public static final String SERIALIZED_NAME_BENEFICIARY_NAME = "beneficiary_name";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_NAME)
  private String beneficiaryName;

  public static final String SERIALIZED_NAME_BENEFICIARY_INSTRUMENT_DETAILS = "beneficiary_instrument_details";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_INSTRUMENT_DETAILS)
  private BeneficiaryBeneficiaryInstrumentDetails beneficiaryInstrumentDetails;

  public static final String SERIALIZED_NAME_BENEFICIARY_CONTACT_DETAILS = "beneficiary_contact_details";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_CONTACT_DETAILS)
  private BeneficiaryBeneficiaryContactDetails beneficiaryContactDetails;

  /**
   * It displays the current status of the beneficiary. Possible values are as follows - &#x60;VERIFIED&#x60;: Beneficiary is verified and is available for payouts - &#x60;INVALID&#x60;: Beneficiary is invalid - &#x60;INITIATED&#x60;: Beneficiary verification initiated - &#x60;CANCELLED&#x60;: Beneficiary verification cancelled - &#x60;FAILED&#x60;: Failed to verify beneficiary - &#x60;DELETED&#x60;: Beneficiary is deleted
   */
  @JsonAdapter(BeneficiaryStatusEnum.Adapter.class)
  public enum BeneficiaryStatusEnum {
    VERIFIED("VERIFIED"),
    
    INVALID("INVALID"),
    
    INITIATED("INITIATED"),
    
    CANCELLED("CANCELLED"),
    
    FAILED("FAILED"),
    
    DELETED("DELETED"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    BeneficiaryStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BeneficiaryStatusEnum fromValue(String value) {
      for (BeneficiaryStatusEnum b : BeneficiaryStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<BeneficiaryStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BeneficiaryStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BeneficiaryStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BeneficiaryStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BENEFICIARY_STATUS = "beneficiary_status";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_STATUS)
  private BeneficiaryStatusEnum beneficiaryStatus;

  public static final String SERIALIZED_NAME_ADDED_ON = "added_on";
  @SerializedName(SERIALIZED_NAME_ADDED_ON)
  private String addedOn;

  public Beneficiary() {
  }

  public Beneficiary beneficiaryId(String beneficiaryId) {
    
    this.beneficiaryId = beneficiaryId;
    return this;
  }

   /**
   * It displays the unique ID you created to identify the beneficiary.
   * @return beneficiaryId
  **/
  @javax.annotation.Nullable
  @Schema(example = "JOHN18011343", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the unique ID you created to identify the beneficiary.")
  public String getBeneficiaryId() {
    return beneficiaryId;
  }


  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }


  public Beneficiary beneficiaryName(String beneficiaryName) {
    
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * It displays the name of the beneficiary.
   * @return beneficiaryName
  **/
  @javax.annotation.Nullable
  @Schema(example = "John Doe", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the name of the beneficiary.")
  public String getBeneficiaryName() {
    return beneficiaryName;
  }


  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }


  public Beneficiary beneficiaryInstrumentDetails(BeneficiaryBeneficiaryInstrumentDetails beneficiaryInstrumentDetails) {
    
    this.beneficiaryInstrumentDetails = beneficiaryInstrumentDetails;
    return this;
  }

   /**
   * Get beneficiaryInstrumentDetails
   * @return beneficiaryInstrumentDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BeneficiaryBeneficiaryInstrumentDetails getBeneficiaryInstrumentDetails() {
    return beneficiaryInstrumentDetails;
  }


  public void setBeneficiaryInstrumentDetails(BeneficiaryBeneficiaryInstrumentDetails beneficiaryInstrumentDetails) {
    this.beneficiaryInstrumentDetails = beneficiaryInstrumentDetails;
  }


  public Beneficiary beneficiaryContactDetails(BeneficiaryBeneficiaryContactDetails beneficiaryContactDetails) {
    
    this.beneficiaryContactDetails = beneficiaryContactDetails;
    return this;
  }

   /**
   * Get beneficiaryContactDetails
   * @return beneficiaryContactDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BeneficiaryBeneficiaryContactDetails getBeneficiaryContactDetails() {
    return beneficiaryContactDetails;
  }


  public void setBeneficiaryContactDetails(BeneficiaryBeneficiaryContactDetails beneficiaryContactDetails) {
    this.beneficiaryContactDetails = beneficiaryContactDetails;
  }


  public Beneficiary beneficiaryStatus(BeneficiaryStatusEnum beneficiaryStatus) {
    
    this.beneficiaryStatus = beneficiaryStatus;
    return this;
  }

   /**
   * It displays the current status of the beneficiary. Possible values are as follows - &#x60;VERIFIED&#x60;: Beneficiary is verified and is available for payouts - &#x60;INVALID&#x60;: Beneficiary is invalid - &#x60;INITIATED&#x60;: Beneficiary verification initiated - &#x60;CANCELLED&#x60;: Beneficiary verification cancelled - &#x60;FAILED&#x60;: Failed to verify beneficiary - &#x60;DELETED&#x60;: Beneficiary is deleted
   * @return beneficiaryStatus
  **/
  @javax.annotation.Nullable
  @Schema(example = "VERIFIED", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the current status of the beneficiary. Possible values are as follows - `VERIFIED`: Beneficiary is verified and is available for payouts - `INVALID`: Beneficiary is invalid - `INITIATED`: Beneficiary verification initiated - `CANCELLED`: Beneficiary verification cancelled - `FAILED`: Failed to verify beneficiary - `DELETED`: Beneficiary is deleted")
  public BeneficiaryStatusEnum getBeneficiaryStatus() {
    return beneficiaryStatus;
  }


  public void setBeneficiaryStatus(BeneficiaryStatusEnum beneficiaryStatus) {
    this.beneficiaryStatus = beneficiaryStatus;
  }


  public Beneficiary addedOn(String addedOn) {
    
    this.addedOn = addedOn;
    return this;
  }

   /**
   * It displays the time of the addition of the beneficiary in UTC.
   * @return addedOn
  **/
  @javax.annotation.Nullable
  @Schema(example = "2023-11-22T12:38:22Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It displays the time of the addition of the beneficiary in UTC.")
  public String getAddedOn() {
    return addedOn;
  }


  public void setAddedOn(String addedOn) {
    this.addedOn = addedOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beneficiary beneficiary = (Beneficiary) o;
    return Objects.equals(this.beneficiaryId, beneficiary.beneficiaryId) &&
        Objects.equals(this.beneficiaryName, beneficiary.beneficiaryName) &&
        Objects.equals(this.beneficiaryInstrumentDetails, beneficiary.beneficiaryInstrumentDetails) &&
        Objects.equals(this.beneficiaryContactDetails, beneficiary.beneficiaryContactDetails) &&
        Objects.equals(this.beneficiaryStatus, beneficiary.beneficiaryStatus) &&
        Objects.equals(this.addedOn, beneficiary.addedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryId, beneficiaryName, beneficiaryInstrumentDetails, beneficiaryContactDetails, beneficiaryStatus, addedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beneficiary {\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    beneficiaryInstrumentDetails: ").append(toIndentedString(beneficiaryInstrumentDetails)).append("\n");
    sb.append("    beneficiaryContactDetails: ").append(toIndentedString(beneficiaryContactDetails)).append("\n");
    sb.append("    beneficiaryStatus: ").append(toIndentedString(beneficiaryStatus)).append("\n");
    sb.append("    addedOn: ").append(toIndentedString(addedOn)).append("\n");
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
    openapiFields.add("beneficiary_status");
    openapiFields.add("added_on");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Beneficiary
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
        BeneficiaryBeneficiaryInstrumentDetails.validateJsonElement(jsonObj.get("beneficiary_instrument_details"));
      }
      // validate the optional field `beneficiary_contact_details`
      if (jsonObj.get("beneficiary_contact_details") != null && !jsonObj.get("beneficiary_contact_details").isJsonNull()) {
        BeneficiaryBeneficiaryContactDetails.validateJsonElement(jsonObj.get("beneficiary_contact_details"));
      }
      if ((jsonObj.get("beneficiary_status") != null && !jsonObj.get("beneficiary_status").isJsonNull()) && !jsonObj.get("beneficiary_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_status").toString()));
      }
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Beneficiary
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
        BeneficiaryBeneficiaryInstrumentDetails.validateJsonElement(jsonObj.get("beneficiary_instrument_details"));
        return true;
      }
      // validate the optional field `beneficiary_contact_details`
      if (jsonObj.get("beneficiary_contact_details") != null && !jsonObj.get("beneficiary_contact_details").isJsonNull()) {
        BeneficiaryBeneficiaryContactDetails.validateJsonElement(jsonObj.get("beneficiary_contact_details"));
        return true;
      }
      if ((jsonObj.get("beneficiary_status") != null && !jsonObj.get("beneficiary_status").isJsonNull()) && !jsonObj.get("beneficiary_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_status").toString()));
      }
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Beneficiary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Beneficiary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Beneficiary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Beneficiary.class));

       return (TypeAdapter<T>) new TypeAdapter<Beneficiary>() {
           @Override
           public void write(JsonWriter out, Beneficiary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Beneficiary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Beneficiary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Beneficiary
  * @throws IOException if the JSON string is invalid with respect to Beneficiary
  */
  public static Beneficiary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Beneficiary.class);
  }

 /**
  * Convert an instance of Beneficiary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
