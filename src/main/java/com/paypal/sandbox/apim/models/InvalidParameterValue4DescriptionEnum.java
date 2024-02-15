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
 * InvalidParameterValue4DescriptionEnum to be used.
 */
public enum InvalidParameterValue4DescriptionEnum {
    ENUM_A_PARAMETER_VALUE_IS_NOT_VALID;


    private static TreeMap<String, InvalidParameterValue4DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_A_PARAMETER_VALUE_IS_NOT_VALID.value = "A parameter value is not valid.";

        valueMap.put("A parameter value is not valid.", ENUM_A_PARAMETER_VALUE_IS_NOT_VALID);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvalidParameterValue4DescriptionEnum constructFromString(String toConvert) throws IOException {
        InvalidParameterValue4DescriptionEnum enumValue = fromString(toConvert);
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
    public static InvalidParameterValue4DescriptionEnum fromString(String toConvert) {
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
     * Convert list of InvalidParameterValue4DescriptionEnum values to list of string values.
     * @param toConvert The list of InvalidParameterValue4DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvalidParameterValue4DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvalidParameterValue4DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 