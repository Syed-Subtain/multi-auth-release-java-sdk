
# MISSINGPARAMCIPERRORRESP

## Structure

`MISSINGPARAMCIPERRORRESP`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`RequiredParamForCustInitiatedPaymentIssueEnum`](../../doc/models/required-param-for-cust-initiated-payment-issue-enum.md) | Optional | - | RequiredParamForCustInitiatedPaymentIssueEnum getIssue() | setIssue(RequiredParamForCustInitiatedPaymentIssueEnum issue) |
| `Description` | [`ReqParamCustPresentInitiatorMerchErrorEnum`](../../doc/models/req-param-cust-present-initiator-merch-error-enum.md) | Optional | - | ReqParamCustPresentInitiatorMerchErrorEnum getDescription() | setDescription(ReqParamCustPresentInitiatorMerchErrorEnum description) |

## Example (as JSON)

```json
{
  "issue": "REQUIRED_PARAMETER_FOR_CUSTOMER_INITIATED_PAYMENT",
  "description": "This parameter is required when the customer is present. If the customer is not present, indicate so by sending payment_initiator=`MERCHANT`. For details, see <a href=\"https://developer.paypal.com/docs/api/orders/v2/#definition-card_stored_credential\">Stored Credential</a>."
}
```

