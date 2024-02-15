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
 * PreviousTransactionReferenceVoidedDescriptionEnum to be used.
 */
public enum PreviousTransactionReferenceVoidedDescriptionEnum {
    ENUM_THE_STATUS_OF_AUTHORIZATION_REFERENCED_BY_PREVIOUS_TRANSACTION_REFERENCE_IS_VOIDED_AND_HENCE_CANNOT_BE_USED_FOR_THIS_ORDER_PLEASE_USE_A_PREVIOUS_TRANSACTION_REFERENCE_WHOSE_STATUS_IS_NOT_VOIDED;


    private static TreeMap<String, PreviousTransactionReferenceVoidedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_STATUS_OF_AUTHORIZATION_REFERENCED_BY_PREVIOUS_TRANSACTION_REFERENCE_IS_VOIDED_AND_HENCE_CANNOT_BE_USED_FOR_THIS_ORDER_PLEASE_USE_A_PREVIOUS_TRANSACTION_REFERENCE_WHOSE_STATUS_IS_NOT_VOIDED.value = "The status of authorization referenced by `previous_transaction_reference` is `VOIDED` and hence cannot be used for this order. Please use a `previous_transaction_reference` whose status is not `VOIDED`.";

        valueMap.put("The status of authorization referenced by `previous_transaction_reference` is `VOIDED` and hence cannot be used for this order. Please use a `previous_transaction_reference` whose status is not `VOIDED`.", ENUM_THE_STATUS_OF_AUTHORIZATION_REFERENCED_BY_PREVIOUS_TRANSACTION_REFERENCE_IS_VOIDED_AND_HENCE_CANNOT_BE_USED_FOR_THIS_ORDER_PLEASE_USE_A_PREVIOUS_TRANSACTION_REFERENCE_WHOSE_STATUS_IS_NOT_VOIDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PreviousTransactionReferenceVoidedDescriptionEnum constructFromString(String toConvert) throws IOException {
        PreviousTransactionReferenceVoidedDescriptionEnum enumValue = fromString(toConvert);
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
    public static PreviousTransactionReferenceVoidedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of PreviousTransactionReferenceVoidedDescriptionEnum values to list of string values.
     * @param toConvert The list of PreviousTransactionReferenceVoidedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PreviousTransactionReferenceVoidedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PreviousTransactionReferenceVoidedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 