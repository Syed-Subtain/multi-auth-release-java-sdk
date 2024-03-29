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
 * Error422MessageEnum to be used.
 */
public enum Error422MessageEnum {
    ENUM_THE_REQUESTED_ACTION_COULD_NOT_BE_PERFORMED_SEMANTICALLY_INCORRECT_OR_FAILED_BUSINESS_VALIDATION;


    private static TreeMap<String, Error422MessageEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_REQUESTED_ACTION_COULD_NOT_BE_PERFORMED_SEMANTICALLY_INCORRECT_OR_FAILED_BUSINESS_VALIDATION.value = "The requested action could not be performed, semantically incorrect, or failed business validation.";

        valueMap.put("The requested action could not be performed, semantically incorrect, or failed business validation.", ENUM_THE_REQUESTED_ACTION_COULD_NOT_BE_PERFORMED_SEMANTICALLY_INCORRECT_OR_FAILED_BUSINESS_VALIDATION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Error422MessageEnum constructFromString(String toConvert) throws IOException {
        Error422MessageEnum enumValue = fromString(toConvert);
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
    public static Error422MessageEnum fromString(String toConvert) {
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
     * Convert list of Error422MessageEnum values to list of string values.
     * @param toConvert The list of Error422MessageEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Error422MessageEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Error422MessageEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 