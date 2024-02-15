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
 * MissingRequiredParameter2IssueEnum to be used.
 */
public enum MissingRequiredParameter2IssueEnum {
    MISSING_REQUIRED_PARAMETER;


    private static TreeMap<String, MissingRequiredParameter2IssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        MISSING_REQUIRED_PARAMETER.value = "MISSING_REQUIRED_PARAMETER";

        valueMap.put("MISSING_REQUIRED_PARAMETER", MISSING_REQUIRED_PARAMETER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static MissingRequiredParameter2IssueEnum constructFromString(String toConvert) throws IOException {
        MissingRequiredParameter2IssueEnum enumValue = fromString(toConvert);
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
    public static MissingRequiredParameter2IssueEnum fromString(String toConvert) {
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
     * Convert list of MissingRequiredParameter2IssueEnum values to list of string values.
     * @param toConvert The list of MissingRequiredParameter2IssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<MissingRequiredParameter2IssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (MissingRequiredParameter2IssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 