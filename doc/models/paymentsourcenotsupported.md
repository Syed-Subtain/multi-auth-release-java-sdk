
# PAYMENTSOURCENOTSUPPORTED

## Structure

`PAYMENTSOURCENOTSUPPORTED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaymentSourceNotSupportedIssueEnum`](../../doc/models/payment-source-not-supported-issue-enum.md) | Optional | - | PaymentSourceNotSupportedIssueEnum getIssue() | setIssue(PaymentSourceNotSupportedIssueEnum issue) |
| `Description` | [`PaymentSourceNotSupportedDescriptionEnum`](../../doc/models/payment-source-not-supported-description-enum.md) | Optional | - | PaymentSourceNotSupportedDescriptionEnum getDescription() | setDescription(PaymentSourceNotSupportedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYMENT_SOURCE_NOT_SUPPORTED",
  "description": "The payer selected method of payment is not supported when multiple purchase units are specified for an Order."
}
```

