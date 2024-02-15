
# NOPAYMENTSOURCEPROVIDED

## Structure

`NOPAYMENTSOURCEPROVIDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NoPaymentSourceProvidedIssueEnum`](../../doc/models/no-payment-source-provided-issue-enum.md) | Optional | - | NoPaymentSourceProvidedIssueEnum getIssue() | setIssue(NoPaymentSourceProvidedIssueEnum issue) |
| `Description` | [`NoPaymentSourceProvidedDescriptionEnum`](../../doc/models/no-payment-source-provided-description-enum.md) | Optional | - | NoPaymentSourceProvidedDescriptionEnum getDescription() | setDescription(NoPaymentSourceProvidedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "NO_PAYMENT_SOURCE_PROVIDED",
  "description": "At least one payment method is required within the payment source."
}
```

