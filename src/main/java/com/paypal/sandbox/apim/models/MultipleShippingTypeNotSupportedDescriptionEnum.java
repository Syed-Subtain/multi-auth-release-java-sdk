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
 * MultipleShippingTypeNotSupportedDescriptionEnum to be used.
 */
public enum MultipleShippingTypeNotSupportedDescriptionEnum {
    ENUM_DIFFERENT_SHIPPINGTYPE_ARE_NOT_SUPPORTED_ACROSS_PURCHASE_UNITS;


    private static TreeMap<String, MultipleShippingTypeNotSupportedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_DIFFERENT_SHIPPINGTYPE_ARE_NOT_SUPPORTED_ACROSS_PURCHASE_UNITS.value = "Different `shipping.type` are not supported across purchase units.";

        valueMap.put("Different `shipping.type` are not supported across purchase units.", ENUM_DIFFERENT_SHIPPINGTYPE_ARE_NOT_SUPPORTED_ACROSS_PURCHASE_UNITS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static MultipleShippingTypeNotSupportedDescriptionEnum constructFromString(String toConvert) throws IOException {
        MultipleShippingTypeNotSupportedDescriptionEnum enumValue = fromString(toConvert);
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
    public static MultipleShippingTypeNotSupportedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of MultipleShippingTypeNotSupportedDescriptionEnum values to list of string values.
     * @param toConvert The list of MultipleShippingTypeNotSupportedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<MultipleShippingTypeNotSupportedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (MultipleShippingTypeNotSupportedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 