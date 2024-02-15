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
import com.paypal.sandbox.apim.models.INVALIDCOUNTRYCODEERROR;
import com.paypal.sandbox.apim.models.INVALIDPARAMETERSYNTAXERROR1;
import com.paypal.sandbox.apim.models.INVALIDPARAMETERVALUEERROR1;
import com.paypal.sandbox.apim.models.INVALIDSTRINGLENGTHERROR1;
import com.paypal.sandbox.apim.models.MALFORMEDREQUESTJSONRESULT;
import com.paypal.sandbox.apim.models.MISSINGREQUIREDPARAMETERERROR1;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = OrdersAuthorize400IssuesItems.OrdersAuthorize400IssuesItemsDeserializer.class)
public abstract class OrdersAuthorize400IssuesItems {
    
    /**
     * This is INVALID_COUNTRY_CODE_ERROR case.
     * @param iNVALIDCOUNTRYCODEERROR INVALIDCOUNTRYCODEERROR value for iNVALIDCOUNTRYCODEERROR.
     * @return The INVALIDCOUNTRYCODEERRORCase object.
     */
    public static OrdersAuthorize400IssuesItems fromINVALIDCOUNTRYCODEERROR(
            INVALIDCOUNTRYCODEERROR iNVALIDCOUNTRYCODEERROR) {
        return iNVALIDCOUNTRYCODEERROR == null ? null : new INVALIDCOUNTRYCODEERRORCase(iNVALIDCOUNTRYCODEERROR);
    }

    /**
     * This is INVALID_PARAMETER_VALUE_ERROR1 case.
     * @param iNVALIDPARAMETERVALUEERROR1 INVALIDPARAMETERVALUEERROR1 value for iNVALIDPARAMETERVALUEERROR1.
     * @return The INVALIDPARAMETERVALUEERROR1Case object.
     */
    public static OrdersAuthorize400IssuesItems fromINVALIDPARAMETERVALUEERROR1(
            INVALIDPARAMETERVALUEERROR1 iNVALIDPARAMETERVALUEERROR1) {
        return iNVALIDPARAMETERVALUEERROR1 == null ? null : new INVALIDPARAMETERVALUEERROR1Case(iNVALIDPARAMETERVALUEERROR1);
    }

    /**
     * This is MISSING_REQUIRED_PARAMETER_ERROR1 case.
     * @param mISSINGREQUIREDPARAMETERERROR1 MISSINGREQUIREDPARAMETERERROR1 value for mISSINGREQUIREDPARAMETERERROR1.
     * @return The MISSINGREQUIREDPARAMETERERROR1Case object.
     */
    public static OrdersAuthorize400IssuesItems fromMISSINGREQUIREDPARAMETERERROR1(
            MISSINGREQUIREDPARAMETERERROR1 mISSINGREQUIREDPARAMETERERROR1) {
        return mISSINGREQUIREDPARAMETERERROR1 == null ? null : new MISSINGREQUIREDPARAMETERERROR1Case(mISSINGREQUIREDPARAMETERERROR1);
    }

    /**
     * This is INVALID_STRING_LENGTH_ERROR1 case.
     * @param iNVALIDSTRINGLENGTHERROR1 INVALIDSTRINGLENGTHERROR1 value for iNVALIDSTRINGLENGTHERROR1.
     * @return The INVALIDSTRINGLENGTHERROR1Case object.
     */
    public static OrdersAuthorize400IssuesItems fromINVALIDSTRINGLENGTHERROR1(
            INVALIDSTRINGLENGTHERROR1 iNVALIDSTRINGLENGTHERROR1) {
        return iNVALIDSTRINGLENGTHERROR1 == null ? null : new INVALIDSTRINGLENGTHERROR1Case(iNVALIDSTRINGLENGTHERROR1);
    }

    /**
     * This is INVALID_PARAMETER_SYNTAX_ERROR1 case.
     * @param iNVALIDPARAMETERSYNTAXERROR1 INVALIDPARAMETERSYNTAXERROR1 value for iNVALIDPARAMETERSYNTAXERROR1.
     * @return The INVALIDPARAMETERSYNTAXERROR1Case object.
     */
    public static OrdersAuthorize400IssuesItems fromINVALIDPARAMETERSYNTAXERROR1(
            INVALIDPARAMETERSYNTAXERROR1 iNVALIDPARAMETERSYNTAXERROR1) {
        return iNVALIDPARAMETERSYNTAXERROR1 == null ? null : new INVALIDPARAMETERSYNTAXERROR1Case(iNVALIDPARAMETERSYNTAXERROR1);
    }

    /**
     * This is MALFORMED_REQUEST_JSON_RESULT case.
     * @param mALFORMEDREQUESTJSONRESULT MALFORMEDREQUESTJSONRESULT value for mALFORMEDREQUESTJSONRESULT.
     * @return The MALFORMEDREQUESTJSONRESULTCase object.
     */
    public static OrdersAuthorize400IssuesItems fromMALFORMEDREQUESTJSONRESULT(
            MALFORMEDREQUESTJSONRESULT mALFORMEDREQUESTJSONRESULT) {
        return mALFORMEDREQUESTJSONRESULT == null ? null : new MALFORMEDREQUESTJSONRESULTCase(mALFORMEDREQUESTJSONRESULT);
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
        R iNVALIDCOUNTRYCODEERROR(INVALIDCOUNTRYCODEERROR iNVALIDCOUNTRYCODEERROR);

        R iNVALIDPARAMETERVALUEERROR1(INVALIDPARAMETERVALUEERROR1 iNVALIDPARAMETERVALUEERROR1);

        R mISSINGREQUIREDPARAMETERERROR1(MISSINGREQUIREDPARAMETERERROR1 mISSINGREQUIREDPARAMETERERROR1);

        R iNVALIDSTRINGLENGTHERROR1(INVALIDSTRINGLENGTHERROR1 iNVALIDSTRINGLENGTHERROR1);

        R iNVALIDPARAMETERSYNTAXERROR1(INVALIDPARAMETERSYNTAXERROR1 iNVALIDPARAMETERSYNTAXERROR1);

        R mALFORMEDREQUESTJSONRESULT(MALFORMEDREQUESTJSONRESULT mALFORMEDREQUESTJSONRESULT);
    }

    /**
     * This is a implementation class for INVALIDCOUNTRYCODEERRORCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "INVALIDCOUNTRYCODEERROR")
    private static class INVALIDCOUNTRYCODEERRORCase extends OrdersAuthorize400IssuesItems {

        @JsonValue
        private INVALIDCOUNTRYCODEERROR iNVALIDCOUNTRYCODEERROR;

        INVALIDCOUNTRYCODEERRORCase(INVALIDCOUNTRYCODEERROR iNVALIDCOUNTRYCODEERROR) {
            this.iNVALIDCOUNTRYCODEERROR = iNVALIDCOUNTRYCODEERROR;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.iNVALIDCOUNTRYCODEERROR(this.iNVALIDCOUNTRYCODEERROR);
        }

        @JsonCreator
        private INVALIDCOUNTRYCODEERRORCase(JsonNode jsonNode) throws IOException {
            this.iNVALIDCOUNTRYCODEERROR = ApiHelper.deserialize(jsonNode,
                INVALIDCOUNTRYCODEERROR.class);
        }

        @Override
        public String toString() {
            return iNVALIDCOUNTRYCODEERROR.toString();
        }
    }

    /**
     * This is a implementation class for INVALIDPARAMETERVALUEERROR1Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "INVALIDPARAMETERVALUEERROR1")
    private static class INVALIDPARAMETERVALUEERROR1Case extends OrdersAuthorize400IssuesItems {

        @JsonValue
        private INVALIDPARAMETERVALUEERROR1 iNVALIDPARAMETERVALUEERROR1;

        INVALIDPARAMETERVALUEERROR1Case(INVALIDPARAMETERVALUEERROR1 iNVALIDPARAMETERVALUEERROR1) {
            this.iNVALIDPARAMETERVALUEERROR1 = iNVALIDPARAMETERVALUEERROR1;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.iNVALIDPARAMETERVALUEERROR1(this.iNVALIDPARAMETERVALUEERROR1);
        }

        @JsonCreator
        private INVALIDPARAMETERVALUEERROR1Case(JsonNode jsonNode) throws IOException {
            this.iNVALIDPARAMETERVALUEERROR1 = ApiHelper.deserialize(jsonNode,
                INVALIDPARAMETERVALUEERROR1.class);
        }

        @Override
        public String toString() {
            return iNVALIDPARAMETERVALUEERROR1.toString();
        }
    }

    /**
     * This is a implementation class for MISSINGREQUIREDPARAMETERERROR1Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "MISSINGREQUIREDPARAMETERERROR1")
    private static class MISSINGREQUIREDPARAMETERERROR1Case extends OrdersAuthorize400IssuesItems {

        @JsonValue
        private MISSINGREQUIREDPARAMETERERROR1 mISSINGREQUIREDPARAMETERERROR1;

        MISSINGREQUIREDPARAMETERERROR1Case(MISSINGREQUIREDPARAMETERERROR1 mISSINGREQUIREDPARAMETERERROR1) {
            this.mISSINGREQUIREDPARAMETERERROR1 = mISSINGREQUIREDPARAMETERERROR1;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mISSINGREQUIREDPARAMETERERROR1(this.mISSINGREQUIREDPARAMETERERROR1);
        }

        @JsonCreator
        private MISSINGREQUIREDPARAMETERERROR1Case(JsonNode jsonNode) throws IOException {
            this.mISSINGREQUIREDPARAMETERERROR1 = ApiHelper.deserialize(jsonNode,
                MISSINGREQUIREDPARAMETERERROR1.class);
        }

        @Override
        public String toString() {
            return mISSINGREQUIREDPARAMETERERROR1.toString();
        }
    }

    /**
     * This is a implementation class for INVALIDSTRINGLENGTHERROR1Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "INVALIDSTRINGLENGTHERROR1")
    private static class INVALIDSTRINGLENGTHERROR1Case extends OrdersAuthorize400IssuesItems {

        @JsonValue
        private INVALIDSTRINGLENGTHERROR1 iNVALIDSTRINGLENGTHERROR1;

        INVALIDSTRINGLENGTHERROR1Case(INVALIDSTRINGLENGTHERROR1 iNVALIDSTRINGLENGTHERROR1) {
            this.iNVALIDSTRINGLENGTHERROR1 = iNVALIDSTRINGLENGTHERROR1;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.iNVALIDSTRINGLENGTHERROR1(this.iNVALIDSTRINGLENGTHERROR1);
        }

        @JsonCreator
        private INVALIDSTRINGLENGTHERROR1Case(JsonNode jsonNode) throws IOException {
            this.iNVALIDSTRINGLENGTHERROR1 = ApiHelper.deserialize(jsonNode,
                INVALIDSTRINGLENGTHERROR1.class);
        }

        @Override
        public String toString() {
            return iNVALIDSTRINGLENGTHERROR1.toString();
        }
    }

    /**
     * This is a implementation class for INVALIDPARAMETERSYNTAXERROR1Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "INVALIDPARAMETERSYNTAXERROR1")
    private static class INVALIDPARAMETERSYNTAXERROR1Case extends OrdersAuthorize400IssuesItems {

        @JsonValue
        private INVALIDPARAMETERSYNTAXERROR1 iNVALIDPARAMETERSYNTAXERROR1;

        INVALIDPARAMETERSYNTAXERROR1Case(INVALIDPARAMETERSYNTAXERROR1 iNVALIDPARAMETERSYNTAXERROR1) {
            this.iNVALIDPARAMETERSYNTAXERROR1 = iNVALIDPARAMETERSYNTAXERROR1;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.iNVALIDPARAMETERSYNTAXERROR1(this.iNVALIDPARAMETERSYNTAXERROR1);
        }

        @JsonCreator
        private INVALIDPARAMETERSYNTAXERROR1Case(JsonNode jsonNode) throws IOException {
            this.iNVALIDPARAMETERSYNTAXERROR1 = ApiHelper.deserialize(jsonNode,
                INVALIDPARAMETERSYNTAXERROR1.class);
        }

        @Override
        public String toString() {
            return iNVALIDPARAMETERSYNTAXERROR1.toString();
        }
    }

    /**
     * This is a implementation class for MALFORMEDREQUESTJSONRESULTCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "MALFORMEDREQUESTJSONRESULT")
    private static class MALFORMEDREQUESTJSONRESULTCase extends OrdersAuthorize400IssuesItems {

        @JsonValue
        private MALFORMEDREQUESTJSONRESULT mALFORMEDREQUESTJSONRESULT;

        MALFORMEDREQUESTJSONRESULTCase(MALFORMEDREQUESTJSONRESULT mALFORMEDREQUESTJSONRESULT) {
            this.mALFORMEDREQUESTJSONRESULT = mALFORMEDREQUESTJSONRESULT;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mALFORMEDREQUESTJSONRESULT(this.mALFORMEDREQUESTJSONRESULT);
        }

        @JsonCreator
        private MALFORMEDREQUESTJSONRESULTCase(JsonNode jsonNode) throws IOException {
            this.mALFORMEDREQUESTJSONRESULT = ApiHelper.deserialize(jsonNode,
                MALFORMEDREQUESTJSONRESULT.class);
        }

        @Override
        public String toString() {
            return mALFORMEDREQUESTJSONRESULT.toString();
        }
    }

    /**
     * This is a custom deserializer class for OrdersAuthorize400IssuesItems.
     */
    protected static class OrdersAuthorize400IssuesItemsDeserializer
            extends JsonDeserializer<OrdersAuthorize400IssuesItems> {

        @Override
        public OrdersAuthorize400IssuesItems deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(INVALIDCOUNTRYCODEERRORCase.class,
                    INVALIDPARAMETERVALUEERROR1Case.class, MISSINGREQUIREDPARAMETERERROR1Case.class,
                    INVALIDSTRINGLENGTHERROR1Case.class, INVALIDPARAMETERSYNTAXERROR1Case.class,
                    MALFORMEDREQUESTJSONRESULTCase.class), false);
        }
    }

}
