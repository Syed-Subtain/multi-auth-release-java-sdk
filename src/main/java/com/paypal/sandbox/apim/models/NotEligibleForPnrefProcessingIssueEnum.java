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
 * NotEligibleForPnrefProcessingIssueEnum to be used.
 */
public enum NotEligibleForPnrefProcessingIssueEnum {
    NOT_ELIGIBLE_FOR_PNREF_PROCESSING;


    private static TreeMap<String, NotEligibleForPnrefProcessingIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        NOT_ELIGIBLE_FOR_PNREF_PROCESSING.value = "NOT_ELIGIBLE_FOR_PNREF_PROCESSING";

        valueMap.put("NOT_ELIGIBLE_FOR_PNREF_PROCESSING", NOT_ELIGIBLE_FOR_PNREF_PROCESSING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static NotEligibleForPnrefProcessingIssueEnum constructFromString(String toConvert) throws IOException {
        NotEligibleForPnrefProcessingIssueEnum enumValue = fromString(toConvert);
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
    public static NotEligibleForPnrefProcessingIssueEnum fromString(String toConvert) {
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
     * Convert list of NotEligibleForPnrefProcessingIssueEnum values to list of string values.
     * @param toConvert The list of NotEligibleForPnrefProcessingIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<NotEligibleForPnrefProcessingIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (NotEligibleForPnrefProcessingIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 