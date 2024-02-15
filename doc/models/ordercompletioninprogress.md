
# ORDERCOMPLETIONINPROGRESS

## Structure

`ORDERCOMPLETIONINPROGRESS`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderCompletionInProgressIssueEnum`](../../doc/models/order-completion-in-progress-issue-enum.md) | Optional | - | OrderCompletionInProgressIssueEnum getIssue() | setIssue(OrderCompletionInProgressIssueEnum issue) |
| `Description` | [`OrderCompletionInProgressDescriptionEnum`](../../doc/models/order-completion-in-progress-description-enum.md) | Optional | - | OrderCompletionInProgressDescriptionEnum getDescription() | setDescription(OrderCompletionInProgressDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_COMPLETION_IN_PROGRESS",
  "description": "The order was created with processing_instruction of ORDER_COMPLETE_ON_PAYMENT_APPROVAL. The customer has approved the payment and PayPal is still in the process of capturing the order on your behalf as instructed. Please try your request again."
}
```

