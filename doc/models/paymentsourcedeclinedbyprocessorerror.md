
# PAYMENTSOURCEDECLINEDBYPROCESSORERROR

## Structure

`PAYMENTSOURCEDECLINEDBYPROCESSORERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaymentSourceDeclinedByProcessor1IssueEnum`](../../doc/models/payment-source-declined-by-processor-1-issue-enum.md) | Optional | - | PaymentSourceDeclinedByProcessor1IssueEnum getIssue() | setIssue(PaymentSourceDeclinedByProcessor1IssueEnum issue) |
| `Description` | [`PaymentSourceDeclinedByProcessor1DescriptionEnum`](../../doc/models/payment-source-declined-by-processor-1-description-enum.md) | Optional | - | PaymentSourceDeclinedByProcessor1DescriptionEnum getDescription() | setDescription(PaymentSourceDeclinedByProcessor1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYMENT_SOURCE_DECLINED_BY_PROCESSOR",
  "description": "The provided payment source is declined by the processor. Please try again with a different payment source by creating a new order."
}
```

