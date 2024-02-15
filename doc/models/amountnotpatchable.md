
# AMOUNTNOTPATCHABLE

## Structure

`AMOUNTNOTPATCHABLE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AmountNotPatchableIssueEnum`](../../doc/models/amount-not-patchable-issue-enum.md) | Optional | - | AmountNotPatchableIssueEnum getIssue() | setIssue(AmountNotPatchableIssueEnum issue) |
| `Description` | [`AmountNotPatchableDescriptionEnum`](../../doc/models/amount-not-patchable-description-enum.md) | Optional | - | AmountNotPatchableDescriptionEnum getDescription() | setDescription(AmountNotPatchableDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AMOUNT_NOT_PATCHABLE",
  "description": "The amount cannot be updated as the 'payer' has chosen and approved a specific financing offer for a given amount. Please Create a new Order with the updated Order amount and have the 'payer' approve the new payment terms."
}
```

