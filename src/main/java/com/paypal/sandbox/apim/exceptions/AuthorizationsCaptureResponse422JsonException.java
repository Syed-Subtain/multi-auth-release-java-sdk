/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.Error422MessageEnum;
import com.paypal.sandbox.apim.models.Error422NameEnum;
import com.paypal.sandbox.apim.models.ErrorDetails61;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for AuthorizationsCaptureResponse422JsonException type.
 */
public class AuthorizationsCaptureResponse422JsonException extends ApiException {
    private static final long serialVersionUID = -5629632616529420930L;
    private Error422NameEnum name;
    private Error422MessageEnum message;
    private List<ErrorDetails61> issues;
    private String debugId;
    private String informationLink;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public AuthorizationsCaptureResponse422JsonException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Name.
     * @return Returns the Error422NameEnum
     */
    @JsonGetter("name")
    public Error422NameEnum getName() {
        return this.name;
    }

    /**
     * Setter for Name.
     * @param name Value for Error422NameEnum
     */
    @JsonSetter("name")
    private void setName(Error422NameEnum name) {
        this.name = name;
    }

    /**
     * Getter for Message.
     * @return Returns the Error422MessageEnum
     */
    @JsonGetter("message")
    public Error422MessageEnum getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * @param messageField Value for Error422MessageEnum
     */
    @JsonSetter("message")
    private void setMessageField(Error422MessageEnum messageField) {
        this.message = messageField;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of ErrorDetails61
     */
    @JsonGetter("issues")
    public List<ErrorDetails61> getIssues() {
        return this.issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of ErrorDetails61
     */
    @JsonSetter("issues")
    private void setIssues(List<ErrorDetails61> issues) {
        this.issues = issues;
    }

    /**
     * Getter for DebugId.
     * The PayPal internal ID. Used for correlation purposes.
     * @return Returns the String
     */
    @JsonGetter("debug_id")
    public String getDebugId() {
        return this.debugId;
    }

    /**
     * Setter for DebugId.
     * The PayPal internal ID. Used for correlation purposes.
     * @param debugId Value for String
     */
    @JsonSetter("debug_id")
    private void setDebugId(String debugId) {
        this.debugId = debugId;
    }

    /**
     * Getter for InformationLink.
     * The information link, or URI, that shows detailed information about this error for the
     * developer.
     * @return Returns the String
     */
    @JsonGetter("information_link")
    public String getInformationLink() {
        return this.informationLink;
    }

    /**
     * Setter for InformationLink.
     * The information link, or URI, that shows detailed information about this error for the
     * developer.
     * @param informationLink Value for String
     */
    @JsonSetter("information_link")
    private void setInformationLink(String informationLink) {
        this.informationLink = informationLink;
    }
}
