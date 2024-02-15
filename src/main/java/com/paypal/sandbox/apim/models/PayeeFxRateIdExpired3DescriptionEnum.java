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
 * PayeeFxRateIdExpired3DescriptionEnum to be used.
 */
public enum PayeeFxRateIdExpired3DescriptionEnum {
    ENUM_THE_SPECIFIED_FX_RATE_ID_HAS_EXPIRED_PLEASE_SPECIFY_A_DIFFERENT_FX_RATE_ID_AND_TRY_THE_REQUEST_AGAIN_ALTERNATELY_REMOVE_THE_FX_RATE_ID_TO_PROCESS_THE_REQUEST_USING_THE_DEFAULT_EXCHANGE_RATE;


    private static TreeMap<String, PayeeFxRateIdExpired3DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_SPECIFIED_FX_RATE_ID_HAS_EXPIRED_PLEASE_SPECIFY_A_DIFFERENT_FX_RATE_ID_AND_TRY_THE_REQUEST_AGAIN_ALTERNATELY_REMOVE_THE_FX_RATE_ID_TO_PROCESS_THE_REQUEST_USING_THE_DEFAULT_EXCHANGE_RATE.value = "The specified FX Rate ID has expired. Please specify a different FX Rate Id and try the request again. Alternately, remove the FX Rate ID to process the request using the default exchange rate.";

        valueMap.put("The specified FX Rate ID has expired. Please specify a different FX Rate Id and try the request again. Alternately, remove the FX Rate ID to process the request using the default exchange rate.", ENUM_THE_SPECIFIED_FX_RATE_ID_HAS_EXPIRED_PLEASE_SPECIFY_A_DIFFERENT_FX_RATE_ID_AND_TRY_THE_REQUEST_AGAIN_ALTERNATELY_REMOVE_THE_FX_RATE_ID_TO_PROCESS_THE_REQUEST_USING_THE_DEFAULT_EXCHANGE_RATE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayeeFxRateIdExpired3DescriptionEnum constructFromString(String toConvert) throws IOException {
        PayeeFxRateIdExpired3DescriptionEnum enumValue = fromString(toConvert);
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
    public static PayeeFxRateIdExpired3DescriptionEnum fromString(String toConvert) {
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
     * Convert list of PayeeFxRateIdExpired3DescriptionEnum values to list of string values.
     * @param toConvert The list of PayeeFxRateIdExpired3DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayeeFxRateIdExpired3DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayeeFxRateIdExpired3DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 