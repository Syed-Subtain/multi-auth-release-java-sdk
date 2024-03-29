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
 * UnsupportedPatchParameterValueIssueEnum to be used.
 */
public enum UnsupportedPatchParameterValueIssueEnum {
    UNSUPPORTED_PATCH_PARAMETER_VALUE;


    private static TreeMap<String, UnsupportedPatchParameterValueIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        UNSUPPORTED_PATCH_PARAMETER_VALUE.value = "UNSUPPORTED_PATCH_PARAMETER_VALUE";

        valueMap.put("UNSUPPORTED_PATCH_PARAMETER_VALUE", UNSUPPORTED_PATCH_PARAMETER_VALUE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static UnsupportedPatchParameterValueIssueEnum constructFromString(String toConvert) throws IOException {
        UnsupportedPatchParameterValueIssueEnum enumValue = fromString(toConvert);
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
    public static UnsupportedPatchParameterValueIssueEnum fromString(String toConvert) {
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
     * Convert list of UnsupportedPatchParameterValueIssueEnum values to list of string values.
     * @param toConvert The list of UnsupportedPatchParameterValueIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<UnsupportedPatchParameterValueIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (UnsupportedPatchParameterValueIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 