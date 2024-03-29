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
 * CurrencyNotSupportedForBankDescriptionEnum to be used.
 */
public enum CurrencyNotSupportedForBankDescriptionEnum {
    ENUM_THE_PAYMENT_SOURCE_DOES_NOT_SUPPORT_THE_CURRENCY_OF_THE_ORDER_FOR_ACH_DEBIT_ONLY_USD_IS_SUPPORTED_AND_FOR_SEPA_DEBIT_ONLY_EUR_IS_SUPPORTED;


    private static TreeMap<String, CurrencyNotSupportedForBankDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_PAYMENT_SOURCE_DOES_NOT_SUPPORT_THE_CURRENCY_OF_THE_ORDER_FOR_ACH_DEBIT_ONLY_USD_IS_SUPPORTED_AND_FOR_SEPA_DEBIT_ONLY_EUR_IS_SUPPORTED.value = "The payment_source does not support the currency of the Order. For ACH debit, only USD is supported and for SEPA debit, only EUR is supported.";

        valueMap.put("The payment_source does not support the currency of the Order. For ACH debit, only USD is supported and for SEPA debit, only EUR is supported.", ENUM_THE_PAYMENT_SOURCE_DOES_NOT_SUPPORT_THE_CURRENCY_OF_THE_ORDER_FOR_ACH_DEBIT_ONLY_USD_IS_SUPPORTED_AND_FOR_SEPA_DEBIT_ONLY_EUR_IS_SUPPORTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CurrencyNotSupportedForBankDescriptionEnum constructFromString(String toConvert) throws IOException {
        CurrencyNotSupportedForBankDescriptionEnum enumValue = fromString(toConvert);
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
    public static CurrencyNotSupportedForBankDescriptionEnum fromString(String toConvert) {
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
     * Convert list of CurrencyNotSupportedForBankDescriptionEnum values to list of string values.
     * @param toConvert The list of CurrencyNotSupportedForBankDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CurrencyNotSupportedForBankDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CurrencyNotSupportedForBankDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 