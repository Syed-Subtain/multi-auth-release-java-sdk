
# PAYERACTIONREQUIREDERROR

## Structure

`PAYERACTIONREQUIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayerActionRequired1IssueEnum`](../../doc/models/payer-action-required-1-issue-enum.md) | Optional | - | PayerActionRequired1IssueEnum getIssue() | setIssue(PayerActionRequired1IssueEnum issue) |
| `Description` | [`PayerActionRequired1DescriptionEnum`](../../doc/models/payer-action-required-1-description-enum.md) | Optional | - | PayerActionRequired1DescriptionEnum getDescription() | setDescription(PayerActionRequired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYER_ACTION_REQUIRED",
  "description": "Transaction cannot complete successfully, instruct the buyer to return to PayPal."
}
```

