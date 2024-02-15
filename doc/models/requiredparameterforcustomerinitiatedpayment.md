
# REQUIREDPARAMETERFORCUSTOMERINITIATEDPAYMENT

## Structure

`REQUIREDPARAMETERFORCUSTOMERINITIATEDPAYMENT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`RequiredParamForCustomerInitiatedPaymentEnum`](../../doc/models/required-param-for-customer-initiated-payment-enum.md) | Optional | - | RequiredParamForCustomerInitiatedPaymentEnum getIssue() | setIssue(RequiredParamForCustomerInitiatedPaymentEnum issue) |
| `Description` | [`ReqParamCustPresentInitiatorMerchEnum`](../../doc/models/req-param-cust-present-initiator-merch-enum.md) | Optional | - | ReqParamCustPresentInitiatorMerchEnum getDescription() | setDescription(ReqParamCustPresentInitiatorMerchEnum description) |

## Example (as JSON)

```json
{
  "issue": "REQUIRED_PARAMETER_FOR_CUSTOMER_INITIATED_PAYMENT",
  "description": "This parameter is required when the customer is present. If the customer is not present, indicate so by sending payment_initiator=`MERCHANT`. For details, see <a href=\"https://developer.paypal.com/docs/api/orders/v2/#definition-card_stored_credential\">Stored Credential</a>."
}
```

