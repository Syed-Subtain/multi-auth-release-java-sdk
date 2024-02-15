
# PAYMENTSOURCEDECLINEDBYPROCESSOR

## Structure

`PAYMENTSOURCEDECLINEDBYPROCESSOR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaymentSourceDeclinedByProcessorIssueEnum`](../../doc/models/payment-source-declined-by-processor-issue-enum.md) | Optional | - | PaymentSourceDeclinedByProcessorIssueEnum getIssue() | setIssue(PaymentSourceDeclinedByProcessorIssueEnum issue) |
| `Description` | [`PaymentSourceDeclinedByProcessorDescriptionEnum`](../../doc/models/payment-source-declined-by-processor-description-enum.md) | Optional | - | PaymentSourceDeclinedByProcessorDescriptionEnum getDescription() | setDescription(PaymentSourceDeclinedByProcessorDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYMENT_SOURCE_DECLINED_BY_PROCESSOR",
  "description": "The provided payment source is declined by the processor. Please try again with a different payment source by creating a new order."
}
```

