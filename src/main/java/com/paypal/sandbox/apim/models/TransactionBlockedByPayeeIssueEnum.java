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
 * TransactionBlockedByPayeeIssueEnum to be used.
 */
public enum TransactionBlockedByPayeeIssueEnum {
    TRANSACTION_BLOCKED_BY_PAYEE;


    private static TreeMap<String, TransactionBlockedByPayeeIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        TRANSACTION_BLOCKED_BY_PAYEE.value = "TRANSACTION_BLOCKED_BY_PAYEE";

        valueMap.put("TRANSACTION_BLOCKED_BY_PAYEE", TRANSACTION_BLOCKED_BY_PAYEE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionBlockedByPayeeIssueEnum constructFromString(String toConvert) throws IOException {
        TransactionBlockedByPayeeIssueEnum enumValue = fromString(toConvert);
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
    public static TransactionBlockedByPayeeIssueEnum fromString(String toConvert) {
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
     * Convert list of TransactionBlockedByPayeeIssueEnum values to list of string values.
     * @param toConvert The list of TransactionBlockedByPayeeIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionBlockedByPayeeIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionBlockedByPayeeIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 