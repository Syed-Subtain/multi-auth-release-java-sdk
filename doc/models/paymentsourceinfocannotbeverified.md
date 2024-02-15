
# PAYMENTSOURCEINFOCANNOTBEVERIFIED

## Structure

`PAYMENTSOURCEINFOCANNOTBEVERIFIED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaymentSourceInfoCannotBeVerifiedIssueEnum`](../../doc/models/payment-source-info-cannot-be-verified-issue-enum.md) | Optional | - | PaymentSourceInfoCannotBeVerifiedIssueEnum getIssue() | setIssue(PaymentSourceInfoCannotBeVerifiedIssueEnum issue) |
| `Description` | [`PaymentSourceInfoCannotBeVerifiedDescriptionEnum`](../../doc/models/payment-source-info-cannot-be-verified-description-enum.md) | Optional | - | PaymentSourceInfoCannotBeVerifiedDescriptionEnum getDescription() | setDescription(PaymentSourceInfoCannotBeVerifiedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYMENT_SOURCE_INFO_CANNOT_BE_VERIFIED",
  "description": "The combination of the payment_source name, billing address, shipping name and shipping address could not be verified. Please correct this information and try again by creating a new order."
}
```

