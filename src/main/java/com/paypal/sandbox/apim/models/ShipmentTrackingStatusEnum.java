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
 * ShipmentTrackingStatusEnum to be used.
 */
public enum ShipmentTrackingStatusEnum {
    CANCELLED,

    DELIVERED,

    LOCAL_PICKUP,

    ON_HOLD,

    SHIPPED,

    SHIPMENT_CREATED,

    DROPPED_OFF,

    IN_TRANSIT,

    RETURNED,

    LABEL_PRINTED,

    ERROR,

    UNCONFIRMED,

    PICKUP_FAILED,

    DELIVERY_DELAYED,

    DELIVERY_SCHEDULED,

    DELIVERY_FAILED,

    INRETURN,

    IN_PROCESS,

    NEW,

    VOID,

    PROCESSED,

    NOT_SHIPPED,

    COMPLETED;


    private static TreeMap<String, ShipmentTrackingStatusEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        CANCELLED.value = "CANCELLED";
        DELIVERED.value = "DELIVERED";
        LOCAL_PICKUP.value = "LOCAL_PICKUP";
        ON_HOLD.value = "ON_HOLD";
        SHIPPED.value = "SHIPPED";
        SHIPMENT_CREATED.value = "SHIPMENT_CREATED";
        DROPPED_OFF.value = "DROPPED_OFF";
        IN_TRANSIT.value = "IN_TRANSIT";
        RETURNED.value = "RETURNED";
        LABEL_PRINTED.value = "LABEL_PRINTED";
        ERROR.value = "ERROR";
        UNCONFIRMED.value = "UNCONFIRMED";
        PICKUP_FAILED.value = "PICKUP_FAILED";
        DELIVERY_DELAYED.value = "DELIVERY_DELAYED";
        DELIVERY_SCHEDULED.value = "DELIVERY_SCHEDULED";
        DELIVERY_FAILED.value = "DELIVERY_FAILED";
        INRETURN.value = "INRETURN";
        IN_PROCESS.value = "IN_PROCESS";
        NEW.value = "NEW";
        VOID.value = "VOID";
        PROCESSED.value = "PROCESSED";
        NOT_SHIPPED.value = "NOT_SHIPPED";
        COMPLETED.value = "COMPLETED";

        valueMap.put("CANCELLED", CANCELLED);
        valueMap.put("DELIVERED", DELIVERED);
        valueMap.put("LOCAL_PICKUP", LOCAL_PICKUP);
        valueMap.put("ON_HOLD", ON_HOLD);
        valueMap.put("SHIPPED", SHIPPED);
        valueMap.put("SHIPMENT_CREATED", SHIPMENT_CREATED);
        valueMap.put("DROPPED_OFF", DROPPED_OFF);
        valueMap.put("IN_TRANSIT", IN_TRANSIT);
        valueMap.put("RETURNED", RETURNED);
        valueMap.put("LABEL_PRINTED", LABEL_PRINTED);
        valueMap.put("ERROR", ERROR);
        valueMap.put("UNCONFIRMED", UNCONFIRMED);
        valueMap.put("PICKUP_FAILED", PICKUP_FAILED);
        valueMap.put("DELIVERY_DELAYED", DELIVERY_DELAYED);
        valueMap.put("DELIVERY_SCHEDULED", DELIVERY_SCHEDULED);
        valueMap.put("DELIVERY_FAILED", DELIVERY_FAILED);
        valueMap.put("INRETURN", INRETURN);
        valueMap.put("IN_PROCESS", IN_PROCESS);
        valueMap.put("NEW", NEW);
        valueMap.put("VOID", VOID);
        valueMap.put("PROCESSED", PROCESSED);
        valueMap.put("NOT_SHIPPED", NOT_SHIPPED);
        valueMap.put("COMPLETED", COMPLETED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ShipmentTrackingStatusEnum constructFromString(String toConvert) throws IOException {
        ShipmentTrackingStatusEnum enumValue = fromString(toConvert);
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
    public static ShipmentTrackingStatusEnum fromString(String toConvert) {
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
     * Convert list of ShipmentTrackingStatusEnum values to list of string values.
     * @param toConvert The list of ShipmentTrackingStatusEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ShipmentTrackingStatusEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ShipmentTrackingStatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 