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
 * It should contain the card details of the beneficiary.
 */
@Schema(description = "It should contain the card details of the beneficiary.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T11:08:07.400960Z[Etc/UTC]")
public class CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails {
  public static final String SERIALIZED_NAME_CARD_TOKEN = "card_token";
  @SerializedName(SERIALIZED_NAME_CARD_TOKEN)
  private String cardToken;

  /**
   * It is the network type of the card - VISA/MASTERCARD.
   */
  @JsonAdapter(CardNetworkTypeEnum.Adapter.class)
  public enum CardNetworkTypeEnum {
    VISA("VISA"),
    
    MASTERCARD("MASTERCARD"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    CardNetworkTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardNetworkTypeEnum fromValue(String value) {
      for (CardNetworkTypeEnum b : CardNetworkTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<CardNetworkTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardNetworkTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardNetworkTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CardNetworkTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CARD_NETWORK_TYPE = "card_network_type";
  @SerializedName(SERIALIZED_NAME_CARD_NETWORK_TYPE)
  private CardNetworkTypeEnum cardNetworkType;

  public static final String SERIALIZED_NAME_CARD_CRYPTOGRAM = "card_cryptogram";
  @SerializedName(SERIALIZED_NAME_CARD_CRYPTOGRAM)
  private String cardCryptogram;

  public static final String SERIALIZED_NAME_CARD_TOKEN_EXPIRY = "card_token_expiry";
  @SerializedName(SERIALIZED_NAME_CARD_TOKEN_EXPIRY)
  private String cardTokenExpiry;

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_CARD_TOKEN_P_A_N_SEQUENCE_NUMBER = "card_token_PAN_sequence_number";
  @SerializedName(SERIALIZED_NAME_CARD_TOKEN_P_A_N_SEQUENCE_NUMBER)
  private String cardTokenPANSequenceNumber;

  public CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails() {
  }

  public CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails cardToken(String cardToken) {
    
    this.cardToken = cardToken;
    return this;
  }

   /**
   * It is the tokenised card number or card token for this transfer.
   * @return cardToken
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the tokenised card number or card token for this transfer.")
  public String getCardToken() {
    return cardToken;
  }


  public void setCardToken(String cardToken) {
    this.cardToken = cardToken;
  }


  public CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails cardNetworkType(CardNetworkTypeEnum cardNetworkType) {
    
    this.cardNetworkType = cardNetworkType;
    return this;
  }

   /**
   * It is the network type of the card - VISA/MASTERCARD.
   * @return cardNetworkType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the network type of the card - VISA/MASTERCARD.")
  public CardNetworkTypeEnum getCardNetworkType() {
    return cardNetworkType;
  }


  public void setCardNetworkType(CardNetworkTypeEnum cardNetworkType) {
    this.cardNetworkType = cardNetworkType;
  }


  public CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails cardCryptogram(String cardCryptogram) {
    
    this.cardCryptogram = cardCryptogram;
    return this;
  }

   /**
   * It is the formatted chip/cryptogram data relating to the token cryptogram. The maximum character limit is 600. It is optional for MASTERCARD and not required for VISA.
   * @return cardCryptogram
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the formatted chip/cryptogram data relating to the token cryptogram. The maximum character limit is 600. It is optional for MASTERCARD and not required for VISA.")
  public String getCardCryptogram() {
    return cardCryptogram;
  }


  public void setCardCryptogram(String cardCryptogram) {
    this.cardCryptogram = cardCryptogram;
  }


  public CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails cardTokenExpiry(String cardTokenExpiry) {
    
    this.cardTokenExpiry = cardTokenExpiry;
    return this;
  }

   /**
   * It is applicable only for MASTERCARD. The format for the valid token expiry date should be YYYY-MM. It cannot be null. Provide a valid tokenExpiry if collected from the customers. If unavailable, populate a static value with a forward year and month in the correct format (YYYY-MM). The maximum character limit is 10.
   * @return cardTokenExpiry
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is applicable only for MASTERCARD. The format for the valid token expiry date should be YYYY-MM. It cannot be null. Provide a valid tokenExpiry if collected from the customers. If unavailable, populate a static value with a forward year and month in the correct format (YYYY-MM). The maximum character limit is 10.")
  public String getCardTokenExpiry() {
    return cardTokenExpiry;
  }


  public void setCardTokenExpiry(String cardTokenExpiry) {
    this.cardTokenExpiry = cardTokenExpiry;
  }


  public CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * It is the type of the card. DEBIT and CREDIT are the only values allowed. The default value is CREDIT if the parameter does not exist or not specified.
   * @return cardType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "It is the type of the card. DEBIT and CREDIT are the only values allowed. The default value is CREDIT if the parameter does not exist or not specified.")
  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails cardTokenPANSequenceNumber(String cardTokenPANSequenceNumber) {
    
    this.cardTokenPANSequenceNumber = cardTokenPANSequenceNumber;
    return this;
  }

   /**
   * A maximum of 3 alphanumeric characters are allowed. It is an optional parameter for MASTERCARD.
   * @return cardTokenPANSequenceNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "A maximum of 3 alphanumeric characters are allowed. It is an optional parameter for MASTERCARD.")
  public String getCardTokenPANSequenceNumber() {
    return cardTokenPANSequenceNumber;
  }


  public void setCardTokenPANSequenceNumber(String cardTokenPANSequenceNumber) {
    this.cardTokenPANSequenceNumber = cardTokenPANSequenceNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails createTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails = (CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails) o;
    return Objects.equals(this.cardToken, createTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails.cardToken) &&
        Objects.equals(this.cardNetworkType, createTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails.cardNetworkType) &&
        Objects.equals(this.cardCryptogram, createTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails.cardCryptogram) &&
        Objects.equals(this.cardTokenExpiry, createTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails.cardTokenExpiry) &&
        Objects.equals(this.cardType, createTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails.cardType) &&
        Objects.equals(this.cardTokenPANSequenceNumber, createTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails.cardTokenPANSequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardToken, cardNetworkType, cardCryptogram, cardTokenExpiry, cardType, cardTokenPANSequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails {\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    cardNetworkType: ").append(toIndentedString(cardNetworkType)).append("\n");
    sb.append("    cardCryptogram: ").append(toIndentedString(cardCryptogram)).append("\n");
    sb.append("    cardTokenExpiry: ").append(toIndentedString(cardTokenExpiry)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardTokenPANSequenceNumber: ").append(toIndentedString(cardTokenPANSequenceNumber)).append("\n");
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
    openapiFields.add("card_token");
    openapiFields.add("card_network_type");
    openapiFields.add("card_cryptogram");
    openapiFields.add("card_token_expiry");
    openapiFields.add("card_type");
    openapiFields.add("card_token_PAN_sequence_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("card_token") != null && !jsonObj.get("card_token").isJsonNull()) && !jsonObj.get("card_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_token").toString()));
      }
      if ((jsonObj.get("card_network_type") != null && !jsonObj.get("card_network_type").isJsonNull()) && !jsonObj.get("card_network_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_network_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_network_type").toString()));
      }
      if ((jsonObj.get("card_cryptogram") != null && !jsonObj.get("card_cryptogram").isJsonNull()) && !jsonObj.get("card_cryptogram").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_cryptogram` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_cryptogram").toString()));
      }
      if ((jsonObj.get("card_token_expiry") != null && !jsonObj.get("card_token_expiry").isJsonNull()) && !jsonObj.get("card_token_expiry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_token_expiry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_token_expiry").toString()));
      }
      if ((jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonNull()) && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      if ((jsonObj.get("card_token_PAN_sequence_number") != null && !jsonObj.get("card_token_PAN_sequence_number").isJsonNull()) && !jsonObj.get("card_token_PAN_sequence_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_token_PAN_sequence_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_token_PAN_sequence_number").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("card_token") != null && !jsonObj.get("card_token").isJsonNull()) && !jsonObj.get("card_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_token").toString()));
      }
      if ((jsonObj.get("card_network_type") != null && !jsonObj.get("card_network_type").isJsonNull()) && !jsonObj.get("card_network_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_network_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_network_type").toString()));
      }
      if ((jsonObj.get("card_cryptogram") != null && !jsonObj.get("card_cryptogram").isJsonNull()) && !jsonObj.get("card_cryptogram").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_cryptogram` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_cryptogram").toString()));
      }
      if ((jsonObj.get("card_token_expiry") != null && !jsonObj.get("card_token_expiry").isJsonNull()) && !jsonObj.get("card_token_expiry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_token_expiry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_token_expiry").toString()));
      }
      if ((jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonNull()) && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      if ((jsonObj.get("card_token_PAN_sequence_number") != null && !jsonObj.get("card_token_PAN_sequence_number").isJsonNull()) && !jsonObj.get("card_token_PAN_sequence_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_token_PAN_sequence_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_token_PAN_sequence_number").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails>() {
           @Override
           public void write(JsonWriter out, CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails
  * @throws IOException if the JSON string is invalid with respect to CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails
  */
  public static CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails.class);
  }

 /**
  * Convert an instance of CreateTransferRequestBeneficiaryDetailsBeneficiaryInstrumentDetailsCardDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

