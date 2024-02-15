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
 * TransactionReceivingLimitExceededIssueEnum to be used.
 */
public enum TransactionReceivingLimitExceededIssueEnum {
    TRANSACTION_RECEIVING_LIMIT_EXCEEDED;


    private static TreeMap<String, TransactionReceivingLimitExceededIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        TRANSACTION_RECEIVING_LIMIT_EXCEEDED.value = "TRANSACTION_RECEIVING_LIMIT_EXCEEDED";

        valueMap.put("TRANSACTION_RECEIVING_LIMIT_EXCEEDED", TRANSACTION_RECEIVING_LIMIT_EXCEEDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionReceivingLimitExceededIssueEnum constructFromString(String toConvert) throws IOException {
        TransactionReceivingLimitExceededIssueEnum enumValue = fromString(toConvert);
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
    public static TransactionReceivingLimitExceededIssueEnum fromString(String toConvert) {
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
     * Convert list of TransactionReceivingLimitExceededIssueEnum values to list of string values.
     * @param toConvert The list of TransactionReceivingLimitExceededIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionReceivingLimitExceededIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionReceivingLimitExceededIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 