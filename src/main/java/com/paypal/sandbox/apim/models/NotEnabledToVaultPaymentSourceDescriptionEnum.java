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
 * NotEnabledToVaultPaymentSourceDescriptionEnum to be used.
 */
public enum NotEnabledToVaultPaymentSourceDescriptionEnum {
    ENUM_THE_API_CALLER_OR_THE_MERCHANT_ON_WHOSE_BEHALF_THE_API_CALL_IS_INITIATED_IS_NOT_ALLOWED_TO_VAULT_THE_GIVEN_SOURCE_PLEASE_CONTACT_PAYPAL_CUSTOMER_SUPPORT_FOR_ASSISTANCE;


    private static TreeMap<String, NotEnabledToVaultPaymentSourceDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_API_CALLER_OR_THE_MERCHANT_ON_WHOSE_BEHALF_THE_API_CALL_IS_INITIATED_IS_NOT_ALLOWED_TO_VAULT_THE_GIVEN_SOURCE_PLEASE_CONTACT_PAYPAL_CUSTOMER_SUPPORT_FOR_ASSISTANCE.value = "The API caller or the merchant on whose behalf the API call is initiated is not allowed to vault the given source. Please contact PayPal customer support for assistance.";

        valueMap.put("The API caller or the merchant on whose behalf the API call is initiated is not allowed to vault the given source. Please contact PayPal customer support for assistance.", ENUM_THE_API_CALLER_OR_THE_MERCHANT_ON_WHOSE_BEHALF_THE_API_CALL_IS_INITIATED_IS_NOT_ALLOWED_TO_VAULT_THE_GIVEN_SOURCE_PLEASE_CONTACT_PAYPAL_CUSTOMER_SUPPORT_FOR_ASSISTANCE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static NotEnabledToVaultPaymentSourceDescriptionEnum constructFromString(String toConvert) throws IOException {
        NotEnabledToVaultPaymentSourceDescriptionEnum enumValue = fromString(toConvert);
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
    public static NotEnabledToVaultPaymentSourceDescriptionEnum fromString(String toConvert) {
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
     * Convert list of NotEnabledToVaultPaymentSourceDescriptionEnum values to list of string values.
     * @param toConvert The list of NotEnabledToVaultPaymentSourceDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<NotEnabledToVaultPaymentSourceDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (NotEnabledToVaultPaymentSourceDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 