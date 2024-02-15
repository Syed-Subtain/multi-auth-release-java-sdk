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
 * InvalidSecurityCodeLength1DescriptionEnum to be used.
 */
public enum InvalidSecurityCodeLength1DescriptionEnum {
    ENUM_THE_SECURITY_CODE_LENGTH_IS_INVALID_FOR_THE_SPECIFIED_CARD_BRAND;


    private static TreeMap<String, InvalidSecurityCodeLength1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_SECURITY_CODE_LENGTH_IS_INVALID_FOR_THE_SPECIFIED_CARD_BRAND.value = "The security_code length is invalid for the specified card brand.";

        valueMap.put("The security_code length is invalid for the specified card brand.", ENUM_THE_SECURITY_CODE_LENGTH_IS_INVALID_FOR_THE_SPECIFIED_CARD_BRAND);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvalidSecurityCodeLength1DescriptionEnum constructFromString(String toConvert) throws IOException {
        InvalidSecurityCodeLength1DescriptionEnum enumValue = fromString(toConvert);
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
    public static InvalidSecurityCodeLength1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of InvalidSecurityCodeLength1DescriptionEnum values to list of string values.
     * @param toConvert The list of InvalidSecurityCodeLength1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvalidSecurityCodeLength1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvalidSecurityCodeLength1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 