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
 * PaypalTransactionIdExpiredDescriptionEnum to be used.
 */
public enum PaypalTransactionIdExpiredDescriptionEnum {
    ENUM_SPECIFIED_PAYPAL_TRANSACTION_ID_HAS_EXPIRED_PAYPAL_TRANSACTION_ID_EXPIRES_4_YEARS_AFTER_THE_DATE_OF_THE_INITIAL_TRANSACTION;


    private static TreeMap<String, PaypalTransactionIdExpiredDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_SPECIFIED_PAYPAL_TRANSACTION_ID_HAS_EXPIRED_PAYPAL_TRANSACTION_ID_EXPIRES_4_YEARS_AFTER_THE_DATE_OF_THE_INITIAL_TRANSACTION.value = "Specified `paypal_transaction_id` has expired. PayPal transaction ID expires 4 years after the date of the initial transaction.";

        valueMap.put("Specified `paypal_transaction_id` has expired. PayPal transaction ID expires 4 years after the date of the initial transaction.", ENUM_SPECIFIED_PAYPAL_TRANSACTION_ID_HAS_EXPIRED_PAYPAL_TRANSACTION_ID_EXPIRES_4_YEARS_AFTER_THE_DATE_OF_THE_INITIAL_TRANSACTION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PaypalTransactionIdExpiredDescriptionEnum constructFromString(String toConvert) throws IOException {
        PaypalTransactionIdExpiredDescriptionEnum enumValue = fromString(toConvert);
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
    public static PaypalTransactionIdExpiredDescriptionEnum fromString(String toConvert) {
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
     * Convert list of PaypalTransactionIdExpiredDescriptionEnum values to list of string values.
     * @param toConvert The list of PaypalTransactionIdExpiredDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PaypalTransactionIdExpiredDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PaypalTransactionIdExpiredDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 