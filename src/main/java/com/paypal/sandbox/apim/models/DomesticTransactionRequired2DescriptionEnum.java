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
 * DomesticTransactionRequired2DescriptionEnum to be used.
 */
public enum DomesticTransactionRequired2DescriptionEnum {
    ENUM_THIS_TRANSACTION_REQUIRES_THE_PAYEE_AND_PAYER_TO_BE_RESIDENT_IN_THE_SAME_COUNTRY_A_DOMESTIC_TRANSACTION_IS_REQUIRED_TO_CREATE_THIS_PAYMENT;


    private static TreeMap<String, DomesticTransactionRequired2DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THIS_TRANSACTION_REQUIRES_THE_PAYEE_AND_PAYER_TO_BE_RESIDENT_IN_THE_SAME_COUNTRY_A_DOMESTIC_TRANSACTION_IS_REQUIRED_TO_CREATE_THIS_PAYMENT.value = "This transaction requires the payee and payer to be resident in the same country, a domestic transaction is required to create this payment.";

        valueMap.put("This transaction requires the payee and payer to be resident in the same country, a domestic transaction is required to create this payment.", ENUM_THIS_TRANSACTION_REQUIRES_THE_PAYEE_AND_PAYER_TO_BE_RESIDENT_IN_THE_SAME_COUNTRY_A_DOMESTIC_TRANSACTION_IS_REQUIRED_TO_CREATE_THIS_PAYMENT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DomesticTransactionRequired2DescriptionEnum constructFromString(String toConvert) throws IOException {
        DomesticTransactionRequired2DescriptionEnum enumValue = fromString(toConvert);
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
    public static DomesticTransactionRequired2DescriptionEnum fromString(String toConvert) {
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
     * Convert list of DomesticTransactionRequired2DescriptionEnum values to list of string values.
     * @param toConvert The list of DomesticTransactionRequired2DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DomesticTransactionRequired2DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DomesticTransactionRequired2DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 