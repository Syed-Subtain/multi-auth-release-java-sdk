
# PAYMENTSOURCECANNOTBEUSED

## Structure

`PAYMENTSOURCECANNOTBEUSED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaymentSourceCannotBeUsedIssueEnum`](../../doc/models/payment-source-cannot-be-used-issue-enum.md) | Optional | - | PaymentSourceCannotBeUsedIssueEnum getIssue() | setIssue(PaymentSourceCannotBeUsedIssueEnum issue) |
| `Description` | [`PaymentSourceCannotBeUsedDescriptionEnum`](../../doc/models/payment-source-cannot-be-used-description-enum.md) | Optional | - | PaymentSourceCannotBeUsedDescriptionEnum getDescription() | setDescription(PaymentSourceCannotBeUsedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYMENT_SOURCE_CANNOT_BE_USED",
  "description": "The provided payment source cannot be used to pay for the order. Please try again with a different payment source by creating a new order."
}
```

