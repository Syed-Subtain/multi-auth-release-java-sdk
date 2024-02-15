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
 * MismatchedVaultIdToPaymentSource2IssueEnum to be used.
 */
public enum MismatchedVaultIdToPaymentSource2IssueEnum {
    MISMATCHED_VAULT_ID_TO_PAYMENT_SOURCE;


    private static TreeMap<String, MismatchedVaultIdToPaymentSource2IssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        MISMATCHED_VAULT_ID_TO_PAYMENT_SOURCE.value = "MISMATCHED_VAULT_ID_TO_PAYMENT_SOURCE";

        valueMap.put("MISMATCHED_VAULT_ID_TO_PAYMENT_SOURCE", MISMATCHED_VAULT_ID_TO_PAYMENT_SOURCE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static MismatchedVaultIdToPaymentSource2IssueEnum constructFromString(String toConvert) throws IOException {
        MismatchedVaultIdToPaymentSource2IssueEnum enumValue = fromString(toConvert);
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
    public static MismatchedVaultIdToPaymentSource2IssueEnum fromString(String toConvert) {
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
     * Convert list of MismatchedVaultIdToPaymentSource2IssueEnum values to list of string values.
     * @param toConvert The list of MismatchedVaultIdToPaymentSource2IssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<MismatchedVaultIdToPaymentSource2IssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (MismatchedVaultIdToPaymentSource2IssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 