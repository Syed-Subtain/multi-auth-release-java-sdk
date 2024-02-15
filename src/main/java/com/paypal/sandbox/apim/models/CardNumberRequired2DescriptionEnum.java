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
 * CardNumberRequired2DescriptionEnum to be used.
 */
public enum CardNumberRequired2DescriptionEnum {
    ENUM_THE_CARD_NUMBER_IS_REQUIRED_WHEN_ATTEMPTING_TO_PROCESS_PAYMENT_WITH_CARD;


    private static TreeMap<String, CardNumberRequired2DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_CARD_NUMBER_IS_REQUIRED_WHEN_ATTEMPTING_TO_PROCESS_PAYMENT_WITH_CARD.value = "The card number is required when attempting to process payment with card.";

        valueMap.put("The card number is required when attempting to process payment with card.", ENUM_THE_CARD_NUMBER_IS_REQUIRED_WHEN_ATTEMPTING_TO_PROCESS_PAYMENT_WITH_CARD);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CardNumberRequired2DescriptionEnum constructFromString(String toConvert) throws IOException {
        CardNumberRequired2DescriptionEnum enumValue = fromString(toConvert);
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
    public static CardNumberRequired2DescriptionEnum fromString(String toConvert) {
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
     * Convert list of CardNumberRequired2DescriptionEnum values to list of string values.
     * @param toConvert The list of CardNumberRequired2DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CardNumberRequired2DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CardNumberRequired2DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 