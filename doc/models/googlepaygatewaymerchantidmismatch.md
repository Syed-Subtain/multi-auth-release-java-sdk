
# GOOGLEPAYGATEWAYMERCHANTIDMISMATCH

## Structure

`GOOGLEPAYGATEWAYMERCHANTIDMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`GooglePayGatewayMerchantIdMismatchIssueEnum`](../../doc/models/google-pay-gateway-merchant-id-mismatch-issue-enum.md) | Optional | - | GooglePayGatewayMerchantIdMismatchIssueEnum getIssue() | setIssue(GooglePayGatewayMerchantIdMismatchIssueEnum issue) |
| `Description` | [`InvalidGooglePayMerchantIdEnum`](../../doc/models/invalid-google-pay-merchant-id-enum.md) | Optional | - | InvalidGooglePayMerchantIdEnum getDescription() | setDescription(InvalidGooglePayMerchantIdEnum description) |

## Example (as JSON)

```json
{
  "issue": "GOOGLE_PAY_GATEWAY_MERCHANT_ID_MISMATCH",
  "description": "The gateway merchant ID in Google Pay token is not valid. This could be because the gateway merchant Id that was authorized by payer/buyer on Google Pay does not match with the API caller of the order."
}
```

