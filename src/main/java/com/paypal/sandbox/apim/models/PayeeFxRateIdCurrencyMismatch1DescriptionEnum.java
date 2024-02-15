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
 * PayeeFxRateIdCurrencyMismatch1DescriptionEnum to be used.
 */
public enum PayeeFxRateIdCurrencyMismatch1DescriptionEnum {
    ENUM_THE_SPECIFIED_FX_RATE_ID_IS_FOR_A_CURRENCY_THAT_DOES_NOT_MATCH_WITH_THE_CURRENCY_OF_THIS_REQUEST_PLEASE_SPECIFY_A_DIFFERENT_FX_RATE_ID_AND_TRY_THE_REQUEST_AGAIN_ALTERNATELY_REMOVE_THE_FX_RATE_ID_TO_PROCESS_THE_REQUEST_USING_THE_DEFAULT_EXCHANGE_RATE;


    private static TreeMap<String, PayeeFxRateIdCurrencyMismatch1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_SPECIFIED_FX_RATE_ID_IS_FOR_A_CURRENCY_THAT_DOES_NOT_MATCH_WITH_THE_CURRENCY_OF_THIS_REQUEST_PLEASE_SPECIFY_A_DIFFERENT_FX_RATE_ID_AND_TRY_THE_REQUEST_AGAIN_ALTERNATELY_REMOVE_THE_FX_RATE_ID_TO_PROCESS_THE_REQUEST_USING_THE_DEFAULT_EXCHANGE_RATE.value = "The specified FX Rate ID is for a currency that does not match with the currency of this request. Please specify a different FX Rate ID and try the request again. Alternately, remove the FX Rate ID to process the request using the default exchange rate.";

        valueMap.put("The specified FX Rate ID is for a currency that does not match with the currency of this request. Please specify a different FX Rate ID and try the request again. Alternately, remove the FX Rate ID to process the request using the default exchange rate.", ENUM_THE_SPECIFIED_FX_RATE_ID_IS_FOR_A_CURRENCY_THAT_DOES_NOT_MATCH_WITH_THE_CURRENCY_OF_THIS_REQUEST_PLEASE_SPECIFY_A_DIFFERENT_FX_RATE_ID_AND_TRY_THE_REQUEST_AGAIN_ALTERNATELY_REMOVE_THE_FX_RATE_ID_TO_PROCESS_THE_REQUEST_USING_THE_DEFAULT_EXCHANGE_RATE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayeeFxRateIdCurrencyMismatch1DescriptionEnum constructFromString(String toConvert) throws IOException {
        PayeeFxRateIdCurrencyMismatch1DescriptionEnum enumValue = fromString(toConvert);
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
    public static PayeeFxRateIdCurrencyMismatch1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of PayeeFxRateIdCurrencyMismatch1DescriptionEnum values to list of string values.
     * @param toConvert The list of PayeeFxRateIdCurrencyMismatch1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayeeFxRateIdCurrencyMismatch1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayeeFxRateIdCurrencyMismatch1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 