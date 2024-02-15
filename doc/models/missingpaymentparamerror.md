
# MISSINGPAYMENTPARAMERROR

## Structure

`MISSINGPAYMENTPARAMERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CustomerInitiatedPaymentRequiredParamEnum`](../../doc/models/customer-initiated-payment-required-param-enum.md) | Optional | - | CustomerInitiatedPaymentRequiredParamEnum getIssue() | setIssue(CustomerInitiatedPaymentRequiredParamEnum issue) |
| `Description` | [`ReqParamCustPresentInitiatorEnum`](../../doc/models/req-param-cust-present-initiator-enum.md) | Optional | - | ReqParamCustPresentInitiatorEnum getDescription() | setDescription(ReqParamCustPresentInitiatorEnum description) |

## Example (as JSON)

```json
{
  "issue": "REQUIRED_PARAMETER_FOR_CUSTOMER_INITIATED_PAYMENT",
  "description": "This parameter is required when the customer is present. If the customer is not present, indicate so by sending payment_initiator=`MERCHANT`. For details, see <a href=\"https://developer.paypal.com/docs/api/orders/v2/#definition-card_stored_credential\">Stored Credential</a>."
}
```

