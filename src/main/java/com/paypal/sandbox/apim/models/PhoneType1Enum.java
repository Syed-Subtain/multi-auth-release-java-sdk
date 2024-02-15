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
 * PhoneType1Enum to be used.
 */
public enum PhoneType1Enum {
    FAX,

    HOME,

    MOBILE,

    OTHER,

    PAGER;


    private static TreeMap<String, PhoneType1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        FAX.value = "FAX";
        HOME.value = "HOME";
        MOBILE.value = "MOBILE";
        OTHER.value = "OTHER";
        PAGER.value = "PAGER";

        valueMap.put("FAX", FAX);
        valueMap.put("HOME", HOME);
        valueMap.put("MOBILE", MOBILE);
        valueMap.put("OTHER", OTHER);
        valueMap.put("PAGER", PAGER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PhoneType1Enum constructFromString(String toConvert) throws IOException {
        PhoneType1Enum enumValue = fromString(toConvert);
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
    public static PhoneType1Enum fromString(String toConvert) {
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
     * Convert list of PhoneType1Enum values to list of string values.
     * @param toConvert The list of PhoneType1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PhoneType1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PhoneType1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 