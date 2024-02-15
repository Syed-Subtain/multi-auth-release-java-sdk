
# PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR

## Structure

`PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaymentSourceInfoCannotBeVerified1IssueEnum`](../../doc/models/payment-source-info-cannot-be-verified-1-issue-enum.md) | Optional | - | PaymentSourceInfoCannotBeVerified1IssueEnum getIssue() | setIssue(PaymentSourceInfoCannotBeVerified1IssueEnum issue) |
| `Description` | [`UnverifiedPaymentSourceAndAddressCombinationEnum`](../../doc/models/unverified-payment-source-and-address-combination-enum.md) | Optional | - | UnverifiedPaymentSourceAndAddressCombinationEnum getDescription() | setDescription(UnverifiedPaymentSourceAndAddressCombinationEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYMENT_SOURCE_INFO_CANNOT_BE_VERIFIED",
  "description": "The combination of the payment_source name, billing address, shipping name and shipping address could not be verified. Please correct this information and try again by creating a new order."
}
```

