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
 * MissingRequiredParameter4DescriptionEnum to be used.
 */
public enum MissingRequiredParameter4DescriptionEnum {
    ENUM_A_REQUIRED_FIELD_PARAMETER_IS_MISSING;


    private static TreeMap<String, MissingRequiredParameter4DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_A_REQUIRED_FIELD_PARAMETER_IS_MISSING.value = "A required field / parameter is missing";

        valueMap.put("A required field / parameter is missing", ENUM_A_REQUIRED_FIELD_PARAMETER_IS_MISSING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static MissingRequiredParameter4DescriptionEnum constructFromString(String toConvert) throws IOException {
        MissingRequiredParameter4DescriptionEnum enumValue = fromString(toConvert);
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
    public static MissingRequiredParameter4DescriptionEnum fromString(String toConvert) {
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
     * Convert list of MissingRequiredParameter4DescriptionEnum values to list of string values.
     * @param toConvert The list of MissingRequiredParameter4DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<MissingRequiredParameter4DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (MissingRequiredParameter4DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 