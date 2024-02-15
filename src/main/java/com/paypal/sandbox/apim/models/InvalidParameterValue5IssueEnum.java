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
 * InvalidParameterValue5IssueEnum to be used.
 */
public enum InvalidParameterValue5IssueEnum {
    INVALID_PARAMETER_VALUE;


    private static TreeMap<String, InvalidParameterValue5IssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        INVALID_PARAMETER_VALUE.value = "INVALID_PARAMETER_VALUE";

        valueMap.put("INVALID_PARAMETER_VALUE", INVALID_PARAMETER_VALUE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvalidParameterValue5IssueEnum constructFromString(String toConvert) throws IOException {
        InvalidParameterValue5IssueEnum enumValue = fromString(toConvert);
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
    public static InvalidParameterValue5IssueEnum fromString(String toConvert) {
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
     * Convert list of InvalidParameterValue5IssueEnum values to list of string values.
     * @param toConvert The list of InvalidParameterValue5IssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvalidParameterValue5IssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvalidParameterValue5IssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 