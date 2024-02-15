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
 * NotEnabledForGooglePayIssueEnum to be used.
 */
public enum NotEnabledForGooglePayIssueEnum {
    NOT_ENABLED_FOR_GOOGLE_PAY;


    private static TreeMap<String, NotEnabledForGooglePayIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        NOT_ENABLED_FOR_GOOGLE_PAY.value = "NOT_ENABLED_FOR_GOOGLE_PAY";

        valueMap.put("NOT_ENABLED_FOR_GOOGLE_PAY", NOT_ENABLED_FOR_GOOGLE_PAY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static NotEnabledForGooglePayIssueEnum constructFromString(String toConvert) throws IOException {
        NotEnabledForGooglePayIssueEnum enumValue = fromString(toConvert);
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
    public static NotEnabledForGooglePayIssueEnum fromString(String toConvert) {
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
     * Convert list of NotEnabledForGooglePayIssueEnum values to list of string values.
     * @param toConvert The list of NotEnabledForGooglePayIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<NotEnabledForGooglePayIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (NotEnabledForGooglePayIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 