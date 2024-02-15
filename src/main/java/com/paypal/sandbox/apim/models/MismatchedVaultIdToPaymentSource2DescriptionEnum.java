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
 * MismatchedVaultIdToPaymentSource2DescriptionEnum to be used.
 */
public enum MismatchedVaultIdToPaymentSource2DescriptionEnum {
    ENUM_THE_VAULT_ID_DOES_NOT_MATCH_THE_PAYMENT_SOURCE_PROVIDED_PLEASE_VERIFY_THAT_THE_VAULT_ID_TOKEN_USED_REFERS_TO_THE_MATCHING_PAYMENT_SOURCE_AND_TRY_AGAIN_FOR_EXAMPLE_A_PAYPAL_TOKEN_CANNOT_BE_PASSED_IN_THE_VAULT_ID_FIELD_IN_THE_PAYMENT_SOURCECARD_OBJECT;


    private static TreeMap<String, MismatchedVaultIdToPaymentSource2DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_VAULT_ID_DOES_NOT_MATCH_THE_PAYMENT_SOURCE_PROVIDED_PLEASE_VERIFY_THAT_THE_VAULT_ID_TOKEN_USED_REFERS_TO_THE_MATCHING_PAYMENT_SOURCE_AND_TRY_AGAIN_FOR_EXAMPLE_A_PAYPAL_TOKEN_CANNOT_BE_PASSED_IN_THE_VAULT_ID_FIELD_IN_THE_PAYMENT_SOURCECARD_OBJECT.value = "The vault_id does not match the payment_source provided. Please verify that the vault_id token used refers to the matching payment_source and try again. For example, a PayPal token cannot be passed in the vault_id field in the payment_source.card object.";

        valueMap.put("The vault_id does not match the payment_source provided. Please verify that the vault_id token used refers to the matching payment_source and try again. For example, a PayPal token cannot be passed in the vault_id field in the payment_source.card object.", ENUM_THE_VAULT_ID_DOES_NOT_MATCH_THE_PAYMENT_SOURCE_PROVIDED_PLEASE_VERIFY_THAT_THE_VAULT_ID_TOKEN_USED_REFERS_TO_THE_MATCHING_PAYMENT_SOURCE_AND_TRY_AGAIN_FOR_EXAMPLE_A_PAYPAL_TOKEN_CANNOT_BE_PASSED_IN_THE_VAULT_ID_FIELD_IN_THE_PAYMENT_SOURCECARD_OBJECT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static MismatchedVaultIdToPaymentSource2DescriptionEnum constructFromString(String toConvert) throws IOException {
        MismatchedVaultIdToPaymentSource2DescriptionEnum enumValue = fromString(toConvert);
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
    public static MismatchedVaultIdToPaymentSource2DescriptionEnum fromString(String toConvert) {
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
     * Convert list of MismatchedVaultIdToPaymentSource2DescriptionEnum values to list of string values.
     * @param toConvert The list of MismatchedVaultIdToPaymentSource2DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<MismatchedVaultIdToPaymentSource2DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (MismatchedVaultIdToPaymentSource2DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 