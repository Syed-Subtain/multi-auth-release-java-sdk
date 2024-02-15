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
 * RedirectPayerForAlternateFundingDescriptionEnum to be used.
 */
public enum RedirectPayerForAlternateFundingDescriptionEnum {
    ENUM_TRANSACTION_FAILED_REDIRECT_THE_PAYER_TO_SELECT_ANOTHER_FUNDING_SOURCE;


    private static TreeMap<String, RedirectPayerForAlternateFundingDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_TRANSACTION_FAILED_REDIRECT_THE_PAYER_TO_SELECT_ANOTHER_FUNDING_SOURCE.value = "Transaction failed. Redirect the payer to select another funding source.";

        valueMap.put("Transaction failed. Redirect the payer to select another funding source.", ENUM_TRANSACTION_FAILED_REDIRECT_THE_PAYER_TO_SELECT_ANOTHER_FUNDING_SOURCE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static RedirectPayerForAlternateFundingDescriptionEnum constructFromString(String toConvert) throws IOException {
        RedirectPayerForAlternateFundingDescriptionEnum enumValue = fromString(toConvert);
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
    public static RedirectPayerForAlternateFundingDescriptionEnum fromString(String toConvert) {
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
     * Convert list of RedirectPayerForAlternateFundingDescriptionEnum values to list of string values.
     * @param toConvert The list of RedirectPayerForAlternateFundingDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RedirectPayerForAlternateFundingDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RedirectPayerForAlternateFundingDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 