/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * ReqParamCustPresentInitiatorMerchDescEnum to be used.
 */
public enum ReqParamCustPresentInitiatorMerchDescEnum {
    ENUM_THIS_PARAMETER_IS_REQUIRED_WHEN_THE_CUSTOMER_IS_PRESENT_IF_THE_CUSTOMER_IS_NOT_PRESENT_INDICATE_SO_BY_SENDING_PAYMENT_INITIATORMERCHANT_FOR_DETAILS_SEE_A_HREFHTTPSDEVELOPERPAYPALCOMDOCSAPIORDERSV2DEFINITIONCARD_STORED_CREDENTIALSTORED_CREDENTIALA;


    private static TreeMap<String, ReqParamCustPresentInitiatorMerchDescEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THIS_PARAMETER_IS_REQUIRED_WHEN_THE_CUSTOMER_IS_PRESENT_IF_THE_CUSTOMER_IS_NOT_PRESENT_INDICATE_SO_BY_SENDING_PAYMENT_INITIATORMERCHANT_FOR_DETAILS_SEE_A_HREFHTTPSDEVELOPERPAYPALCOMDOCSAPIORDERSV2DEFINITIONCARD_STORED_CREDENTIALSTORED_CREDENTIALA.value = "This parameter is required when the customer is present. If the customer is not present, indicate so by sending payment_initiator=`MERCHANT`. For details, see <a href=\"https://developer.paypal.com/docs/api/orders/v2/#definition-card_stored_credential\">Stored Credential</a>.";

        valueMap.put("This parameter is required when the customer is present. If the customer is not present, indicate so by sending payment_initiator=`MERCHANT`. For details, see <a href=\"https://developer.paypal.com/docs/api/orders/v2/#definition-card_stored_credential\">Stored Credential</a>.", ENUM_THIS_PARAMETER_IS_REQUIRED_WHEN_THE_CUSTOMER_IS_PRESENT_IF_THE_CUSTOMER_IS_NOT_PRESENT_INDICATE_SO_BY_SENDING_PAYMENT_INITIATORMERCHANT_FOR_DETAILS_SEE_A_HREFHTTPSDEVELOPERPAYPALCOMDOCSAPIORDERSV2DEFINITIONCARD_STORED_CREDENTIALSTORED_CREDENTIALA);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ReqParamCustPresentInitiatorMerchDescEnum constructFromString(String toConvert) throws IOException {
        ReqParamCustPresentInitiatorMerchDescEnum enumValue = fromString(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static ReqParamCustPresentInitiatorMerchDescEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of ReqParamCustPresentInitiatorMerchDescEnum values to list of string values.
     * @param toConvert The list of ReqParamCustPresentInitiatorMerchDescEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ReqParamCustPresentInitiatorMerchDescEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ReqParamCustPresentInitiatorMerchDescEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 