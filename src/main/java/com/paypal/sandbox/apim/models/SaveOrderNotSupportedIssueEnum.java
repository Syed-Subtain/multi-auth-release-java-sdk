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
 * SaveOrderNotSupportedIssueEnum to be used.
 */
public enum SaveOrderNotSupportedIssueEnum {
    SAVE_ORDER_NOT_SUPPORTED;


    private static TreeMap<String, SaveOrderNotSupportedIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        SAVE_ORDER_NOT_SUPPORTED.value = "SAVE_ORDER_NOT_SUPPORTED";

        valueMap.put("SAVE_ORDER_NOT_SUPPORTED", SAVE_ORDER_NOT_SUPPORTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SaveOrderNotSupportedIssueEnum constructFromString(String toConvert) throws IOException {
        SaveOrderNotSupportedIssueEnum enumValue = fromString(toConvert);
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
    public static SaveOrderNotSupportedIssueEnum fromString(String toConvert) {
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
     * Convert list of SaveOrderNotSupportedIssueEnum values to list of string values.
     * @param toConvert The list of SaveOrderNotSupportedIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SaveOrderNotSupportedIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SaveOrderNotSupportedIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 