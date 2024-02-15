/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.paypal.sandbox.apim.ApiHelper;
import com.paypal.sandbox.apim.models.AUTHCAPTURECURRENCYMISMATCH;
import com.paypal.sandbox.apim.models.AUTHORIZATIONALREADYCAPTURED;
import com.paypal.sandbox.apim.models.AUTHORIZATIONDENIED;
import com.paypal.sandbox.apim.models.AUTHORIZATIONEXPIRED;
import com.paypal.sandbox.apim.models.AUTHORIZATIONVOIDED;
import com.paypal.sandbox.apim.models.CANNOTBEZEROORNEGATIVE;
import com.paypal.sandbox.apim.models.DECIMALPRECISION;
import com.paypal.sandbox.apim.models.DECIMALSNOTSUPPORTED;
import com.paypal.sandbox.apim.models.DUPLICATEINVOICEID1;
import com.paypal.sandbox.apim.models.INVALIDCURRENCYCODE2;
import com.paypal.sandbox.apim.models.MAXCAPTUREAMOUNTEXCEEDED;
import com.paypal.sandbox.apim.models.MAXCAPTURECOUNTEXCEEDED;
import com.paypal.sandbox.apim.models.PAYEEACCOUNTLOCKEDORCLOSED2;
import com.paypal.sandbox.apim.models.PAYEEACCOUNTRESTRICTED2;
import com.paypal.sandbox.apim.models.PAYERACCOUNTLOCKEDORCLOSED;
import com.paypal.sandbox.apim.models.PAYERCANNOTPAY1;
import com.paypal.sandbox.apim.models.TRANSACTIONREFUSED1;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = Unprocessableentityerror422responseissuesItems.Unprocessableentityerror422responseissuesItemsDeserializer.class)
public abstract class Unprocessableentityerror422responseissuesItems {
    
    /**
     * This is INVALID_CURRENCY_CODE2 case.
     * @param iNVALIDCURRENCYCODE2 INVALIDCURRENCYCODE2 value for iNVALIDCURRENCYCODE2.
     * @return The INVALIDCURRENCYCODE2Case object.
     */
    public static Unprocessableentityerror422responseissuesItems fromINVALIDCURRENCYCODE2(
            INVALIDCURRENCYCODE2 iNVALIDCURRENCYCODE2) {
        return iNVALIDCURRENCYCODE2 == null ? null : new INVALIDCURRENCYCODE2Case(iNVALIDCURRENCYCODE2);
    }

    /**
     * This is CANNOT_BE_ZERO_OR_NEGATIVE case.
     * @param cANNOTBEZEROORNEGATIVE CANNOTBEZEROORNEGATIVE value for cANNOTBEZEROORNEGATIVE.
     * @return The CANNOTBEZEROORNEGATIVECase object.
     */
    public static Unprocessableentityerror422responseissuesItems fromCANNOTBEZEROORNEGATIVE(
            CANNOTBEZEROORNEGATIVE cANNOTBEZEROORNEGATIVE) {
        return cANNOTBEZEROORNEGATIVE == null ? null : new CANNOTBEZEROORNEGATIVECase(cANNOTBEZEROORNEGATIVE);
    }

    /**
     * This is DECIMAL_PRECISION case.
     * @param dECIMALPRECISION DECIMALPRECISION value for dECIMALPRECISION.
     * @return The DECIMALPRECISIONCase object.
     */
    public static Unprocessableentityerror422responseissuesItems fromDECIMALPRECISION(
            DECIMALPRECISION dECIMALPRECISION) {
        return dECIMALPRECISION == null ? null : new DECIMALPRECISIONCase(dECIMALPRECISION);
    }

    /**
     * This is DECIMALS_NOT_SUPPORTED case.
     * @param dECIMALSNOTSUPPORTED DECIMALSNOTSUPPORTED value for dECIMALSNOTSUPPORTED.
     * @return The DECIMALSNOTSUPPORTEDCase object.
     */
    public static Unprocessableentityerror422responseissuesItems fromDECIMALSNOTSUPPORTED(
            DECIMALSNOTSUPPORTED dECIMALSNOTSUPPORTED) {
        return dECIMALSNOTSUPPORTED == null ? null : new DECIMALSNOTSUPPORTEDCase(dECIMALSNOTSUPPORTED);
    }

    /**
     * This is TRANSACTION_REFUSED1 case.
     * @param tRANSACTIONREFUSED1 TRANSACTIONREFUSED1 value for tRANSACTIONREFUSED1.
     * @return The TRANSACTIONREFUSED1Case object.
     */
    public static Unprocessableentityerror422responseissuesItems fromTRANSACTIONREFUSED1(
            TRANSACTIONREFUSED1 tRANSACTIONREFUSED1) {
        return tRANSACTIONREFUSED1 == null ? null : new TRANSACTIONREFUSED1Case(tRANSACTIONREFUSED1);
    }

    /**
     * This is AUTHORIZATION_VOIDED case.
     * @param aUTHORIZATIONVOIDED AUTHORIZATIONVOIDED value for aUTHORIZATIONVOIDED.
     * @return The AUTHORIZATIONVOIDEDCase object.
     */
    public static Unprocessableentityerror422responseissuesItems fromAUTHORIZATIONVOIDED(
            AUTHORIZATIONVOIDED aUTHORIZATIONVOIDED) {
        return aUTHORIZATIONVOIDED == null ? null : new AUTHORIZATIONVOIDEDCase(aUTHORIZATIONVOIDED);
    }

    /**
     * This is MAX_CAPTURE_COUNT_EXCEEDED case.
     * @param mAXCAPTURECOUNTEXCEEDED MAXCAPTURECOUNTEXCEEDED value for mAXCAPTURECOUNTEXCEEDED.
     * @return The MAXCAPTURECOUNTEXCEEDEDCase object.
     */
    public static Unprocessableentityerror422responseissuesItems fromMAXCAPTURECOUNTEXCEEDED(
            MAXCAPTURECOUNTEXCEEDED mAXCAPTURECOUNTEXCEEDED) {
        return mAXCAPTURECOUNTEXCEEDED == null ? null : new MAXCAPTURECOUNTEXCEEDEDCase(mAXCAPTURECOUNTEXCEEDED);
    }

    /**
     * This is DUPLICATE_INVOICE_ID1 case.
     * @param dUPLICATEINVOICEID1 DUPLICATEINVOICEID1 value for dUPLICATEINVOICEID1.
     * @return The DUPLICATEINVOICEID1Case object.
     */
    public static Unprocessableentityerror422responseissuesItems fromDUPLICATEINVOICEID1(
            DUPLICATEINVOICEID1 dUPLICATEINVOICEID1) {
        return dUPLICATEINVOICEID1 == null ? null : new DUPLICATEINVOICEID1Case(dUPLICATEINVOICEID1);
    }

    /**
     * This is AUTH_CAPTURE_CURRENCY_MISMATCH case.
     * @param aUTHCAPTURECURRENCYMISMATCH AUTHCAPTURECURRENCYMISMATCH value for aUTHCAPTURECURRENCYMISMATCH.
     * @return The AUTHCAPTURECURRENCYMISMATCHCase object.
     */
    public static Unprocessableentityerror422responseissuesItems fromAUTHCAPTURECURRENCYMISMATCH(
            AUTHCAPTURECURRENCYMISMATCH aUTHCAPTURECURRENCYMISMATCH) {
        return aUTHCAPTURECURRENCYMISMATCH == null ? null : new AUTHCAPTURECURRENCYMISMATCHCase(aUTHCAPTURECURRENCYMISMATCH);
    }

    /**
     * This is PAYER_CANNOT_PAY1 case.
     * @param pAYERCANNOTPAY1 PAYERCANNOTPAY1 value for pAYERCANNOTPAY1.
     * @return The PAYERCANNOTPAY1Case object.
     */
    public static Unprocessableentityerror422responseissuesItems fromPAYERCANNOTPAY1(
            PAYERCANNOTPAY1 pAYERCANNOTPAY1) {
        return pAYERCANNOTPAY1 == null ? null : new PAYERCANNOTPAY1Case(pAYERCANNOTPAY1);
    }

    /**
     * This is AUTHORIZATION_DENIED case.
     * @param aUTHORIZATIONDENIED AUTHORIZATIONDENIED value for aUTHORIZATIONDENIED.
     * @return The AUTHORIZATIONDENIEDCase object.
     */
    public static Unprocessableentityerror422responseissuesItems fromAUTHORIZATIONDENIED(
            AUTHORIZATIONDENIED aUTHORIZATIONDENIED) {
        return aUTHORIZATIONDENIED == null ? null : new AUTHORIZATIONDENIEDCase(aUTHORIZATIONDENIED);
    }

    /**
     * This is AUTHORIZATION_EXPIRED case.
     * @param aUTHORIZATIONEXPIRED AUTHORIZATIONEXPIRED value for aUTHORIZATIONEXPIRED.
     * @return The AUTHORIZATIONEXPIREDCase object.
     */
    public static Unprocessableentityerror422responseissuesItems fromAUTHORIZATIONEXPIRED(
            AUTHORIZATIONEXPIRED aUTHORIZATIONEXPIRED) {
        return aUTHORIZATIONEXPIRED == null ? null : new AUTHORIZATIONEXPIREDCase(aUTHORIZATIONEXPIRED);
    }

    /**
     * This is AUTHORIZATION_ALREADY_CAPTURED case.
     * @param aUTHORIZATIONALREADYCAPTURED AUTHORIZATIONALREADYCAPTURED value for aUTHORIZATIONALREADYCAPTURED.
     * @return The AUTHORIZATIONALREADYCAPTUREDCase object.
     */
    public static Unprocessableentityerror422responseissuesItems fromAUTHORIZATIONALREADYCAPTURED(
            AUTHORIZATIONALREADYCAPTURED aUTHORIZATIONALREADYCAPTURED) {
        return aUTHORIZATIONALREADYCAPTURED == null ? null : new AUTHORIZATIONALREADYCAPTUREDCase(aUTHORIZATIONALREADYCAPTURED);
    }

    /**
     * This is MAX_CAPTURE_AMOUNT_EXCEEDED case.
     * @param mAXCAPTUREAMOUNTEXCEEDED MAXCAPTUREAMOUNTEXCEEDED value for mAXCAPTUREAMOUNTEXCEEDED.
     * @return The MAXCAPTUREAMOUNTEXCEEDEDCase object.
     */
    public static Unprocessableentityerror422responseissuesItems fromMAXCAPTUREAMOUNTEXCEEDED(
            MAXCAPTUREAMOUNTEXCEEDED mAXCAPTUREAMOUNTEXCEEDED) {
        return mAXCAPTUREAMOUNTEXCEEDED == null ? null : new MAXCAPTUREAMOUNTEXCEEDEDCase(mAXCAPTUREAMOUNTEXCEEDED);
    }

    /**
     * This is PAYEE_ACCOUNT_LOCKED_OR_CLOSED2 case.
     * @param pAYEEACCOUNTLOCKEDORCLOSED2 PAYEEACCOUNTLOCKEDORCLOSED2 value for pAYEEACCOUNTLOCKEDORCLOSED2.
     * @return The PAYEEACCOUNTLOCKEDORCLOSED2Case object.
     */
    public static Unprocessableentityerror422responseissuesItems fromPAYEEACCOUNTLOCKEDORCLOSED2(
            PAYEEACCOUNTLOCKEDORCLOSED2 pAYEEACCOUNTLOCKEDORCLOSED2) {
        return pAYEEACCOUNTLOCKEDORCLOSED2 == null ? null : new PAYEEACCOUNTLOCKEDORCLOSED2Case(pAYEEACCOUNTLOCKEDORCLOSED2);
    }

    /**
     * This is PAYER_ACCOUNT_LOCKED_OR_CLOSED case.
     * @param pAYERACCOUNTLOCKEDORCLOSED PAYERACCOUNTLOCKEDORCLOSED value for pAYERACCOUNTLOCKEDORCLOSED.
     * @return The PAYERACCOUNTLOCKEDORCLOSEDCase object.
     */
    public static Unprocessableentityerror422responseissuesItems fromPAYERACCOUNTLOCKEDORCLOSED(
            PAYERACCOUNTLOCKEDORCLOSED pAYERACCOUNTLOCKEDORCLOSED) {
        return pAYERACCOUNTLOCKEDORCLOSED == null ? null : new PAYERACCOUNTLOCKEDORCLOSEDCase(pAYERACCOUNTLOCKEDORCLOSED);
    }

    /**
     * This is PAYEE_ACCOUNT_RESTRICTED2 case.
     * @param pAYEEACCOUNTRESTRICTED2 PAYEEACCOUNTRESTRICTED2 value for pAYEEACCOUNTRESTRICTED2.
     * @return The PAYEEACCOUNTRESTRICTED2Case object.
     */
    public static Unprocessableentityerror422responseissuesItems fromPAYEEACCOUNTRESTRICTED2(
            PAYEEACCOUNTRESTRICTED2 pAYEEACCOUNTRESTRICTED2) {
        return pAYEEACCOUNTRESTRICTED2 == null ? null : new PAYEEACCOUNTRESTRICTED2Case(pAYEEACCOUNTRESTRICTED2);
    }

    /**
     * Method to match from the provided any-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The any-of type cases callback.
     * @return The any-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for any-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R iNVALIDCURRENCYCODE2(INVALIDCURRENCYCODE2 iNVALIDCURRENCYCODE2);

        R cANNOTBEZEROORNEGATIVE(CANNOTBEZEROORNEGATIVE cANNOTBEZEROORNEGATIVE);

        R dECIMALPRECISION(DECIMALPRECISION dECIMALPRECISION);

        R dECIMALSNOTSUPPORTED(DECIMALSNOTSUPPORTED dECIMALSNOTSUPPORTED);

        R tRANSACTIONREFUSED1(TRANSACTIONREFUSED1 tRANSACTIONREFUSED1);

        R aUTHORIZATIONVOIDED(AUTHORIZATIONVOIDED aUTHORIZATIONVOIDED);

        R mAXCAPTURECOUNTEXCEEDED(MAXCAPTURECOUNTEXCEEDED mAXCAPTURECOUNTEXCEEDED);

        R dUPLICATEINVOICEID1(DUPLICATEINVOICEID1 dUPLICATEINVOICEID1);

        R aUTHCAPTURECURRENCYMISMATCH(AUTHCAPTURECURRENCYMISMATCH aUTHCAPTURECURRENCYMISMATCH);

        R pAYERCANNOTPAY1(PAYERCANNOTPAY1 pAYERCANNOTPAY1);

        R aUTHORIZATIONDENIED(AUTHORIZATIONDENIED aUTHORIZATIONDENIED);

        R aUTHORIZATIONEXPIRED(AUTHORIZATIONEXPIRED aUTHORIZATIONEXPIRED);

        R aUTHORIZATIONALREADYCAPTURED(AUTHORIZATIONALREADYCAPTURED aUTHORIZATIONALREADYCAPTURED);

        R mAXCAPTUREAMOUNTEXCEEDED(MAXCAPTUREAMOUNTEXCEEDED mAXCAPTUREAMOUNTEXCEEDED);

        R pAYEEACCOUNTLOCKEDORCLOSED2(PAYEEACCOUNTLOCKEDORCLOSED2 pAYEEACCOUNTLOCKEDORCLOSED2);

        R pAYERACCOUNTLOCKEDORCLOSED(PAYERACCOUNTLOCKEDORCLOSED pAYERACCOUNTLOCKEDORCLOSED);

        R pAYEEACCOUNTRESTRICTED2(PAYEEACCOUNTRESTRICTED2 pAYEEACCOUNTRESTRICTED2);
    }

    /**
     * This is a implementation class for INVALIDCURRENCYCODE2Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "INVALIDCURRENCYCODE2")
    private static class INVALIDCURRENCYCODE2Case extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private INVALIDCURRENCYCODE2 iNVALIDCURRENCYCODE2;

        INVALIDCURRENCYCODE2Case(INVALIDCURRENCYCODE2 iNVALIDCURRENCYCODE2) {
            this.iNVALIDCURRENCYCODE2 = iNVALIDCURRENCYCODE2;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.iNVALIDCURRENCYCODE2(this.iNVALIDCURRENCYCODE2);
        }

        @JsonCreator
        private INVALIDCURRENCYCODE2Case(JsonNode jsonNode) throws IOException {
            this.iNVALIDCURRENCYCODE2 = ApiHelper.deserialize(jsonNode,
                INVALIDCURRENCYCODE2.class);
        }

        @Override
        public String toString() {
            return iNVALIDCURRENCYCODE2.toString();
        }
    }

    /**
     * This is a implementation class for CANNOTBEZEROORNEGATIVECase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CANNOTBEZEROORNEGATIVE")
    private static class CANNOTBEZEROORNEGATIVECase extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private CANNOTBEZEROORNEGATIVE cANNOTBEZEROORNEGATIVE;

        CANNOTBEZEROORNEGATIVECase(CANNOTBEZEROORNEGATIVE cANNOTBEZEROORNEGATIVE) {
            this.cANNOTBEZEROORNEGATIVE = cANNOTBEZEROORNEGATIVE;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.cANNOTBEZEROORNEGATIVE(this.cANNOTBEZEROORNEGATIVE);
        }

        @JsonCreator
        private CANNOTBEZEROORNEGATIVECase(JsonNode jsonNode) throws IOException {
            this.cANNOTBEZEROORNEGATIVE = ApiHelper.deserialize(jsonNode,
                CANNOTBEZEROORNEGATIVE.class);
        }

        @Override
        public String toString() {
            return cANNOTBEZEROORNEGATIVE.toString();
        }
    }

    /**
     * This is a implementation class for DECIMALPRECISIONCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "DECIMALPRECISION")
    private static class DECIMALPRECISIONCase extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private DECIMALPRECISION dECIMALPRECISION;

        DECIMALPRECISIONCase(DECIMALPRECISION dECIMALPRECISION) {
            this.dECIMALPRECISION = dECIMALPRECISION;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.dECIMALPRECISION(this.dECIMALPRECISION);
        }

        @JsonCreator
        private DECIMALPRECISIONCase(JsonNode jsonNode) throws IOException {
            this.dECIMALPRECISION = ApiHelper.deserialize(jsonNode,
                DECIMALPRECISION.class);
        }

        @Override
        public String toString() {
            return dECIMALPRECISION.toString();
        }
    }

    /**
     * This is a implementation class for DECIMALSNOTSUPPORTEDCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "DECIMALSNOTSUPPORTED")
    private static class DECIMALSNOTSUPPORTEDCase extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private DECIMALSNOTSUPPORTED dECIMALSNOTSUPPORTED;

        DECIMALSNOTSUPPORTEDCase(DECIMALSNOTSUPPORTED dECIMALSNOTSUPPORTED) {
            this.dECIMALSNOTSUPPORTED = dECIMALSNOTSUPPORTED;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.dECIMALSNOTSUPPORTED(this.dECIMALSNOTSUPPORTED);
        }

        @JsonCreator
        private DECIMALSNOTSUPPORTEDCase(JsonNode jsonNode) throws IOException {
            this.dECIMALSNOTSUPPORTED = ApiHelper.deserialize(jsonNode,
                DECIMALSNOTSUPPORTED.class);
        }

        @Override
        public String toString() {
            return dECIMALSNOTSUPPORTED.toString();
        }
    }

    /**
     * This is a implementation class for TRANSACTIONREFUSED1Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TRANSACTIONREFUSED1")
    private static class TRANSACTIONREFUSED1Case extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private TRANSACTIONREFUSED1 tRANSACTIONREFUSED1;

        TRANSACTIONREFUSED1Case(TRANSACTIONREFUSED1 tRANSACTIONREFUSED1) {
            this.tRANSACTIONREFUSED1 = tRANSACTIONREFUSED1;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tRANSACTIONREFUSED1(this.tRANSACTIONREFUSED1);
        }

        @JsonCreator
        private TRANSACTIONREFUSED1Case(JsonNode jsonNode) throws IOException {
            this.tRANSACTIONREFUSED1 = ApiHelper.deserialize(jsonNode,
                TRANSACTIONREFUSED1.class);
        }

        @Override
        public String toString() {
            return tRANSACTIONREFUSED1.toString();
        }
    }

    /**
     * This is a implementation class for AUTHORIZATIONVOIDEDCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AUTHORIZATIONVOIDED")
    private static class AUTHORIZATIONVOIDEDCase extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private AUTHORIZATIONVOIDED aUTHORIZATIONVOIDED;

        AUTHORIZATIONVOIDEDCase(AUTHORIZATIONVOIDED aUTHORIZATIONVOIDED) {
            this.aUTHORIZATIONVOIDED = aUTHORIZATIONVOIDED;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.aUTHORIZATIONVOIDED(this.aUTHORIZATIONVOIDED);
        }

        @JsonCreator
        private AUTHORIZATIONVOIDEDCase(JsonNode jsonNode) throws IOException {
            this.aUTHORIZATIONVOIDED = ApiHelper.deserialize(jsonNode,
                AUTHORIZATIONVOIDED.class);
        }

        @Override
        public String toString() {
            return aUTHORIZATIONVOIDED.toString();
        }
    }

    /**
     * This is a implementation class for MAXCAPTURECOUNTEXCEEDEDCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "MAXCAPTURECOUNTEXCEEDED")
    private static class MAXCAPTURECOUNTEXCEEDEDCase extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private MAXCAPTURECOUNTEXCEEDED mAXCAPTURECOUNTEXCEEDED;

        MAXCAPTURECOUNTEXCEEDEDCase(MAXCAPTURECOUNTEXCEEDED mAXCAPTURECOUNTEXCEEDED) {
            this.mAXCAPTURECOUNTEXCEEDED = mAXCAPTURECOUNTEXCEEDED;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mAXCAPTURECOUNTEXCEEDED(this.mAXCAPTURECOUNTEXCEEDED);
        }

        @JsonCreator
        private MAXCAPTURECOUNTEXCEEDEDCase(JsonNode jsonNode) throws IOException {
            this.mAXCAPTURECOUNTEXCEEDED = ApiHelper.deserialize(jsonNode,
                MAXCAPTURECOUNTEXCEEDED.class);
        }

        @Override
        public String toString() {
            return mAXCAPTURECOUNTEXCEEDED.toString();
        }
    }

    /**
     * This is a implementation class for DUPLICATEINVOICEID1Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "DUPLICATEINVOICEID1")
    private static class DUPLICATEINVOICEID1Case extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private DUPLICATEINVOICEID1 dUPLICATEINVOICEID1;

        DUPLICATEINVOICEID1Case(DUPLICATEINVOICEID1 dUPLICATEINVOICEID1) {
            this.dUPLICATEINVOICEID1 = dUPLICATEINVOICEID1;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.dUPLICATEINVOICEID1(this.dUPLICATEINVOICEID1);
        }

        @JsonCreator
        private DUPLICATEINVOICEID1Case(JsonNode jsonNode) throws IOException {
            this.dUPLICATEINVOICEID1 = ApiHelper.deserialize(jsonNode,
                DUPLICATEINVOICEID1.class);
        }

        @Override
        public String toString() {
            return dUPLICATEINVOICEID1.toString();
        }
    }

    /**
     * This is a implementation class for AUTHCAPTURECURRENCYMISMATCHCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AUTHCAPTURECURRENCYMISMATCH")
    private static class AUTHCAPTURECURRENCYMISMATCHCase extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private AUTHCAPTURECURRENCYMISMATCH aUTHCAPTURECURRENCYMISMATCH;

        AUTHCAPTURECURRENCYMISMATCHCase(AUTHCAPTURECURRENCYMISMATCH aUTHCAPTURECURRENCYMISMATCH) {
            this.aUTHCAPTURECURRENCYMISMATCH = aUTHCAPTURECURRENCYMISMATCH;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.aUTHCAPTURECURRENCYMISMATCH(this.aUTHCAPTURECURRENCYMISMATCH);
        }

        @JsonCreator
        private AUTHCAPTURECURRENCYMISMATCHCase(JsonNode jsonNode) throws IOException {
            this.aUTHCAPTURECURRENCYMISMATCH = ApiHelper.deserialize(jsonNode,
                AUTHCAPTURECURRENCYMISMATCH.class);
        }

        @Override
        public String toString() {
            return aUTHCAPTURECURRENCYMISMATCH.toString();
        }
    }

    /**
     * This is a implementation class for PAYERCANNOTPAY1Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PAYERCANNOTPAY1")
    private static class PAYERCANNOTPAY1Case extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private PAYERCANNOTPAY1 pAYERCANNOTPAY1;

        PAYERCANNOTPAY1Case(PAYERCANNOTPAY1 pAYERCANNOTPAY1) {
            this.pAYERCANNOTPAY1 = pAYERCANNOTPAY1;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.pAYERCANNOTPAY1(this.pAYERCANNOTPAY1);
        }

        @JsonCreator
        private PAYERCANNOTPAY1Case(JsonNode jsonNode) throws IOException {
            this.pAYERCANNOTPAY1 = ApiHelper.deserialize(jsonNode,
                PAYERCANNOTPAY1.class);
        }

        @Override
        public String toString() {
            return pAYERCANNOTPAY1.toString();
        }
    }

    /**
     * This is a implementation class for AUTHORIZATIONDENIEDCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AUTHORIZATIONDENIED")
    private static class AUTHORIZATIONDENIEDCase extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private AUTHORIZATIONDENIED aUTHORIZATIONDENIED;

        AUTHORIZATIONDENIEDCase(AUTHORIZATIONDENIED aUTHORIZATIONDENIED) {
            this.aUTHORIZATIONDENIED = aUTHORIZATIONDENIED;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.aUTHORIZATIONDENIED(this.aUTHORIZATIONDENIED);
        }

        @JsonCreator
        private AUTHORIZATIONDENIEDCase(JsonNode jsonNode) throws IOException {
            this.aUTHORIZATIONDENIED = ApiHelper.deserialize(jsonNode,
                AUTHORIZATIONDENIED.class);
        }

        @Override
        public String toString() {
            return aUTHORIZATIONDENIED.toString();
        }
    }

    /**
     * This is a implementation class for AUTHORIZATIONEXPIREDCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AUTHORIZATIONEXPIRED")
    private static class AUTHORIZATIONEXPIREDCase extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private AUTHORIZATIONEXPIRED aUTHORIZATIONEXPIRED;

        AUTHORIZATIONEXPIREDCase(AUTHORIZATIONEXPIRED aUTHORIZATIONEXPIRED) {
            this.aUTHORIZATIONEXPIRED = aUTHORIZATIONEXPIRED;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.aUTHORIZATIONEXPIRED(this.aUTHORIZATIONEXPIRED);
        }

        @JsonCreator
        private AUTHORIZATIONEXPIREDCase(JsonNode jsonNode) throws IOException {
            this.aUTHORIZATIONEXPIRED = ApiHelper.deserialize(jsonNode,
                AUTHORIZATIONEXPIRED.class);
        }

        @Override
        public String toString() {
            return aUTHORIZATIONEXPIRED.toString();
        }
    }

    /**
     * This is a implementation class for AUTHORIZATIONALREADYCAPTUREDCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AUTHORIZATIONALREADYCAPTURED")
    private static class AUTHORIZATIONALREADYCAPTUREDCase extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private AUTHORIZATIONALREADYCAPTURED aUTHORIZATIONALREADYCAPTURED;

        AUTHORIZATIONALREADYCAPTUREDCase(AUTHORIZATIONALREADYCAPTURED aUTHORIZATIONALREADYCAPTURED) {
            this.aUTHORIZATIONALREADYCAPTURED = aUTHORIZATIONALREADYCAPTURED;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.aUTHORIZATIONALREADYCAPTURED(this.aUTHORIZATIONALREADYCAPTURED);
        }

        @JsonCreator
        private AUTHORIZATIONALREADYCAPTUREDCase(JsonNode jsonNode) throws IOException {
            this.aUTHORIZATIONALREADYCAPTURED = ApiHelper.deserialize(jsonNode,
                AUTHORIZATIONALREADYCAPTURED.class);
        }

        @Override
        public String toString() {
            return aUTHORIZATIONALREADYCAPTURED.toString();
        }
    }

    /**
     * This is a implementation class for MAXCAPTUREAMOUNTEXCEEDEDCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "MAXCAPTUREAMOUNTEXCEEDED")
    private static class MAXCAPTUREAMOUNTEXCEEDEDCase extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private MAXCAPTUREAMOUNTEXCEEDED mAXCAPTUREAMOUNTEXCEEDED;

        MAXCAPTUREAMOUNTEXCEEDEDCase(MAXCAPTUREAMOUNTEXCEEDED mAXCAPTUREAMOUNTEXCEEDED) {
            this.mAXCAPTUREAMOUNTEXCEEDED = mAXCAPTUREAMOUNTEXCEEDED;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mAXCAPTUREAMOUNTEXCEEDED(this.mAXCAPTUREAMOUNTEXCEEDED);
        }

        @JsonCreator
        private MAXCAPTUREAMOUNTEXCEEDEDCase(JsonNode jsonNode) throws IOException {
            this.mAXCAPTUREAMOUNTEXCEEDED = ApiHelper.deserialize(jsonNode,
                MAXCAPTUREAMOUNTEXCEEDED.class);
        }

        @Override
        public String toString() {
            return mAXCAPTUREAMOUNTEXCEEDED.toString();
        }
    }

    /**
     * This is a implementation class for PAYEEACCOUNTLOCKEDORCLOSED2Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PAYEEACCOUNTLOCKEDORCLOSED2")
    private static class PAYEEACCOUNTLOCKEDORCLOSED2Case extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private PAYEEACCOUNTLOCKEDORCLOSED2 pAYEEACCOUNTLOCKEDORCLOSED2;

        PAYEEACCOUNTLOCKEDORCLOSED2Case(PAYEEACCOUNTLOCKEDORCLOSED2 pAYEEACCOUNTLOCKEDORCLOSED2) {
            this.pAYEEACCOUNTLOCKEDORCLOSED2 = pAYEEACCOUNTLOCKEDORCLOSED2;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.pAYEEACCOUNTLOCKEDORCLOSED2(this.pAYEEACCOUNTLOCKEDORCLOSED2);
        }

        @JsonCreator
        private PAYEEACCOUNTLOCKEDORCLOSED2Case(JsonNode jsonNode) throws IOException {
            this.pAYEEACCOUNTLOCKEDORCLOSED2 = ApiHelper.deserialize(jsonNode,
                PAYEEACCOUNTLOCKEDORCLOSED2.class);
        }

        @Override
        public String toString() {
            return pAYEEACCOUNTLOCKEDORCLOSED2.toString();
        }
    }

    /**
     * This is a implementation class for PAYERACCOUNTLOCKEDORCLOSEDCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PAYERACCOUNTLOCKEDORCLOSED")
    private static class PAYERACCOUNTLOCKEDORCLOSEDCase extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private PAYERACCOUNTLOCKEDORCLOSED pAYERACCOUNTLOCKEDORCLOSED;

        PAYERACCOUNTLOCKEDORCLOSEDCase(PAYERACCOUNTLOCKEDORCLOSED pAYERACCOUNTLOCKEDORCLOSED) {
            this.pAYERACCOUNTLOCKEDORCLOSED = pAYERACCOUNTLOCKEDORCLOSED;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.pAYERACCOUNTLOCKEDORCLOSED(this.pAYERACCOUNTLOCKEDORCLOSED);
        }

        @JsonCreator
        private PAYERACCOUNTLOCKEDORCLOSEDCase(JsonNode jsonNode) throws IOException {
            this.pAYERACCOUNTLOCKEDORCLOSED = ApiHelper.deserialize(jsonNode,
                PAYERACCOUNTLOCKEDORCLOSED.class);
        }

        @Override
        public String toString() {
            return pAYERACCOUNTLOCKEDORCLOSED.toString();
        }
    }

    /**
     * This is a implementation class for PAYEEACCOUNTRESTRICTED2Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PAYEEACCOUNTRESTRICTED2")
    private static class PAYEEACCOUNTRESTRICTED2Case extends Unprocessableentityerror422responseissuesItems {

        @JsonValue
        private PAYEEACCOUNTRESTRICTED2 pAYEEACCOUNTRESTRICTED2;

        PAYEEACCOUNTRESTRICTED2Case(PAYEEACCOUNTRESTRICTED2 pAYEEACCOUNTRESTRICTED2) {
            this.pAYEEACCOUNTRESTRICTED2 = pAYEEACCOUNTRESTRICTED2;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.pAYEEACCOUNTRESTRICTED2(this.pAYEEACCOUNTRESTRICTED2);
        }

        @JsonCreator
        private PAYEEACCOUNTRESTRICTED2Case(JsonNode jsonNode) throws IOException {
            this.pAYEEACCOUNTRESTRICTED2 = ApiHelper.deserialize(jsonNode,
                PAYEEACCOUNTRESTRICTED2.class);
        }

        @Override
        public String toString() {
            return pAYEEACCOUNTRESTRICTED2.toString();
        }
    }

    /**
     * This is a custom deserializer class for Unprocessableentityerror422responseissuesItems.
     */
    protected static class Unprocessableentityerror422responseissuesItemsDeserializer
            extends JsonDeserializer<Unprocessableentityerror422responseissuesItems> {

        @Override
        public Unprocessableentityerror422responseissuesItems deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(INVALIDCURRENCYCODE2Case.class,
                    CANNOTBEZEROORNEGATIVECase.class, DECIMALPRECISIONCase.class,
                    DECIMALSNOTSUPPORTEDCase.class, TRANSACTIONREFUSED1Case.class,
                    AUTHORIZATIONVOIDEDCase.class, MAXCAPTURECOUNTEXCEEDEDCase.class,
                    DUPLICATEINVOICEID1Case.class, AUTHCAPTURECURRENCYMISMATCHCase.class,
                    PAYERCANNOTPAY1Case.class, AUTHORIZATIONDENIEDCase.class,
                    AUTHORIZATIONEXPIREDCase.class, AUTHORIZATIONALREADYCAPTUREDCase.class,
                    MAXCAPTUREAMOUNTEXCEEDEDCase.class, PAYEEACCOUNTLOCKEDORCLOSED2Case.class,
                    PAYERACCOUNTLOCKEDORCLOSEDCase.class,
                    PAYEEACCOUNTRESTRICTED2Case.class), false);
        }
    }

}
