
# PAYMENTSOURCECANNOTBEUSEDERROR

## Structure

`PAYMENTSOURCECANNOTBEUSEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaymentSourceCannotBeUsed1IssueEnum`](../../doc/models/payment-source-cannot-be-used-1-issue-enum.md) | Optional | - | PaymentSourceCannotBeUsed1IssueEnum getIssue() | setIssue(PaymentSourceCannotBeUsed1IssueEnum issue) |
| `Description` | [`PaymentSourceCannotBeUsed1DescriptionEnum`](../../doc/models/payment-source-cannot-be-used-1-description-enum.md) | Optional | - | PaymentSourceCannotBeUsed1DescriptionEnum getDescription() | setDescription(PaymentSourceCannotBeUsed1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYMENT_SOURCE_CANNOT_BE_USED",
  "description": "The provided payment source cannot be used to pay for the order. Please try again with a different payment source by creating a new order."
}
```

