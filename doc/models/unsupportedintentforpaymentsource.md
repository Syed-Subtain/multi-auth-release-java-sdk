
# UNSUPPORTEDINTENTFORPAYMENTSOURCE

## Structure

`UNSUPPORTEDINTENTFORPAYMENTSOURCE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`UnsupportedIntentForPaymentSourceIssueEnum`](../../doc/models/unsupported-intent-for-payment-source-issue-enum.md) | Optional | - | UnsupportedIntentForPaymentSourceIssueEnum getIssue() | setIssue(UnsupportedIntentForPaymentSourceIssueEnum issue) |
| `Description` | [`UnsupportedIntentForPaymentSourceDescriptionEnum`](../../doc/models/unsupported-intent-for-payment-source-description-enum.md) | Optional | - | UnsupportedIntentForPaymentSourceDescriptionEnum getDescription() | setDescription(UnsupportedIntentForPaymentSourceDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "UNSUPPORTED_INTENT_FOR_PAYMENT_SOURCE",
  "description": "`intent=AUTHORIZE` is not supported for the specified payment_source. Only `intent=CAPTURE` is supported."
}
```

