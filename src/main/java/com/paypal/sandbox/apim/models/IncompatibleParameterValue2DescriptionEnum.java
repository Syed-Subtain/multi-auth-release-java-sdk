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
 * IncompatibleParameterValue2DescriptionEnum to be used.
 */
public enum IncompatibleParameterValue2DescriptionEnum {
    ENUM_THE_VALUE_OF_THE_FIELD_IS_INCOMPATIBLEREDUNDANT_WITH_OTHER_FIELDS_IN_THE_ORDER;


    private static TreeMap<String, IncompatibleParameterValue2DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_VALUE_OF_THE_FIELD_IS_INCOMPATIBLEREDUNDANT_WITH_OTHER_FIELDS_IN_THE_ORDER.value = "The value of the field is incompatible/redundant with other fields in the order.";

        valueMap.put("The value of the field is incompatible/redundant with other fields in the order.", ENUM_THE_VALUE_OF_THE_FIELD_IS_INCOMPATIBLEREDUNDANT_WITH_OTHER_FIELDS_IN_THE_ORDER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static IncompatibleParameterValue2DescriptionEnum constructFromString(String toConvert) throws IOException {
        IncompatibleParameterValue2DescriptionEnum enumValue = fromString(toConvert);
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
    public static IncompatibleParameterValue2DescriptionEnum fromString(String toConvert) {
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
     * Convert list of IncompatibleParameterValue2DescriptionEnum values to list of string values.
     * @param toConvert The list of IncompatibleParameterValue2DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<IncompatibleParameterValue2DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (IncompatibleParameterValue2DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 