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
 * NotEnabledForBankProcessingIssueEnum to be used.
 */
public enum NotEnabledForBankProcessingIssueEnum {
    NOT_ENABLED_FOR_BANK_PROCESSING;


    private static TreeMap<String, NotEnabledForBankProcessingIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        NOT_ENABLED_FOR_BANK_PROCESSING.value = "NOT_ENABLED_FOR_BANK_PROCESSING";

        valueMap.put("NOT_ENABLED_FOR_BANK_PROCESSING", NOT_ENABLED_FOR_BANK_PROCESSING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static NotEnabledForBankProcessingIssueEnum constructFromString(String toConvert) throws IOException {
        NotEnabledForBankProcessingIssueEnum enumValue = fromString(toConvert);
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
    public static NotEnabledForBankProcessingIssueEnum fromString(String toConvert) {
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
     * Convert list of NotEnabledForBankProcessingIssueEnum values to list of string values.
     * @param toConvert The list of NotEnabledForBankProcessingIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<NotEnabledForBankProcessingIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (NotEnabledForBankProcessingIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 