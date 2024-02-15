
# PAYERACTIONREQUIRED

## Structure

`PAYERACTIONREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayerActionRequiredIssueEnum`](../../doc/models/payer-action-required-issue-enum.md) | Optional | - | PayerActionRequiredIssueEnum getIssue() | setIssue(PayerActionRequiredIssueEnum issue) |
| `Description` | [`PayerActionRequiredDescriptionEnum`](../../doc/models/payer-action-required-description-enum.md) | Optional | - | PayerActionRequiredDescriptionEnum getDescription() | setDescription(PayerActionRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYER_ACTION_REQUIRED",
  "description": "Transaction cannot complete successfully, instruct the buyer to return to PayPal."
}
```

