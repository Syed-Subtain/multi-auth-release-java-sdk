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
 * PaypalTransactionIdNotFound2IssueEnum to be used.
 */
public enum PaypalTransactionIdNotFound2IssueEnum {
    PAYPAL_TRANSACTION_ID_NOT_FOUND;


    private static TreeMap<String, PaypalTransactionIdNotFound2IssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        PAYPAL_TRANSACTION_ID_NOT_FOUND.value = "PAYPAL_TRANSACTION_ID_NOT_FOUND";

        valueMap.put("PAYPAL_TRANSACTION_ID_NOT_FOUND", PAYPAL_TRANSACTION_ID_NOT_FOUND);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PaypalTransactionIdNotFound2IssueEnum constructFromString(String toConvert) throws IOException {
        PaypalTransactionIdNotFound2IssueEnum enumValue = fromString(toConvert);
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
    public static PaypalTransactionIdNotFound2IssueEnum fromString(String toConvert) {
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
     * Convert list of PaypalTransactionIdNotFound2IssueEnum values to list of string values.
     * @param toConvert The list of PaypalTransactionIdNotFound2IssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PaypalTransactionIdNotFound2IssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PaypalTransactionIdNotFound2IssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 