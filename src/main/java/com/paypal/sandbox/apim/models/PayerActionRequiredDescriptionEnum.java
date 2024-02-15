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
 * PayerActionRequiredDescriptionEnum to be used.
 */
public enum PayerActionRequiredDescriptionEnum {
    ENUM_TRANSACTION_CANNOT_COMPLETE_SUCCESSFULLY_INSTRUCT_THE_BUYER_TO_RETURN_TO_PAYPAL;


    private static TreeMap<String, PayerActionRequiredDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_TRANSACTION_CANNOT_COMPLETE_SUCCESSFULLY_INSTRUCT_THE_BUYER_TO_RETURN_TO_PAYPAL.value = "Transaction cannot complete successfully, instruct the buyer to return to PayPal.";

        valueMap.put("Transaction cannot complete successfully, instruct the buyer to return to PayPal.", ENUM_TRANSACTION_CANNOT_COMPLETE_SUCCESSFULLY_INSTRUCT_THE_BUYER_TO_RETURN_TO_PAYPAL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayerActionRequiredDescriptionEnum constructFromString(String toConvert) throws IOException {
        PayerActionRequiredDescriptionEnum enumValue = fromString(toConvert);
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
    public static PayerActionRequiredDescriptionEnum fromString(String toConvert) {
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
     * Convert list of PayerActionRequiredDescriptionEnum values to list of string values.
     * @param toConvert The list of PayerActionRequiredDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayerActionRequiredDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayerActionRequiredDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 