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
 * PaymentSourceDeclinedByProcessorDescriptionEnum to be used.
 */
public enum PaymentSourceDeclinedByProcessorDescriptionEnum {
    ENUM_THE_PROVIDED_PAYMENT_SOURCE_IS_DECLINED_BY_THE_PROCESSOR_PLEASE_TRY_AGAIN_WITH_A_DIFFERENT_PAYMENT_SOURCE_BY_CREATING_A_NEW_ORDER;


    private static TreeMap<String, PaymentSourceDeclinedByProcessorDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_PROVIDED_PAYMENT_SOURCE_IS_DECLINED_BY_THE_PROCESSOR_PLEASE_TRY_AGAIN_WITH_A_DIFFERENT_PAYMENT_SOURCE_BY_CREATING_A_NEW_ORDER.value = "The provided payment source is declined by the processor. Please try again with a different payment source by creating a new order.";

        valueMap.put("The provided payment source is declined by the processor. Please try again with a different payment source by creating a new order.", ENUM_THE_PROVIDED_PAYMENT_SOURCE_IS_DECLINED_BY_THE_PROCESSOR_PLEASE_TRY_AGAIN_WITH_A_DIFFERENT_PAYMENT_SOURCE_BY_CREATING_A_NEW_ORDER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PaymentSourceDeclinedByProcessorDescriptionEnum constructFromString(String toConvert) throws IOException {
        PaymentSourceDeclinedByProcessorDescriptionEnum enumValue = fromString(toConvert);
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
    public static PaymentSourceDeclinedByProcessorDescriptionEnum fromString(String toConvert) {
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
     * Convert list of PaymentSourceDeclinedByProcessorDescriptionEnum values to list of string values.
     * @param toConvert The list of PaymentSourceDeclinedByProcessorDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PaymentSourceDeclinedByProcessorDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PaymentSourceDeclinedByProcessorDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 