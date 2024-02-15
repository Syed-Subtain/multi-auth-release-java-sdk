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
 * OrderCompletionInProgressIssueEnum to be used.
 */
public enum OrderCompletionInProgressIssueEnum {
    ORDER_COMPLETION_IN_PROGRESS;


    private static TreeMap<String, OrderCompletionInProgressIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ORDER_COMPLETION_IN_PROGRESS.value = "ORDER_COMPLETION_IN_PROGRESS";

        valueMap.put("ORDER_COMPLETION_IN_PROGRESS", ORDER_COMPLETION_IN_PROGRESS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OrderCompletionInProgressIssueEnum constructFromString(String toConvert) throws IOException {
        OrderCompletionInProgressIssueEnum enumValue = fromString(toConvert);
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
    public static OrderCompletionInProgressIssueEnum fromString(String toConvert) {
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
     * Convert list of OrderCompletionInProgressIssueEnum values to list of string values.
     * @param toConvert The list of OrderCompletionInProgressIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OrderCompletionInProgressIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OrderCompletionInProgressIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 