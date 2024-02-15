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
 * CityRequired1DescriptionEnum to be used.
 */
public enum CityRequired1DescriptionEnum {
    ENUM_THE_SPECIFIED_COUNTRY_REQUIRES_A_CITY_ADDRESSADMIN_AREA_2;


    private static TreeMap<String, CityRequired1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_SPECIFIED_COUNTRY_REQUIRES_A_CITY_ADDRESSADMIN_AREA_2.value = "The specified country requires a city (address.admin_area_2).";

        valueMap.put("The specified country requires a city (address.admin_area_2).", ENUM_THE_SPECIFIED_COUNTRY_REQUIRES_A_CITY_ADDRESSADMIN_AREA_2);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CityRequired1DescriptionEnum constructFromString(String toConvert) throws IOException {
        CityRequired1DescriptionEnum enumValue = fromString(toConvert);
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
    public static CityRequired1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of CityRequired1DescriptionEnum values to list of string values.
     * @param toConvert The list of CityRequired1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CityRequired1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CityRequired1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 