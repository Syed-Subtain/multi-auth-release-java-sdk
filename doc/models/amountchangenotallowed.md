
# AMOUNTCHANGENOTALLOWED

## Structure

`AMOUNTCHANGENOTALLOWED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AmountChangeNotAllowedIssueEnum`](../../doc/models/amount-change-not-allowed-issue-enum.md) | Optional | - | AmountChangeNotAllowedIssueEnum getIssue() | setIssue(AmountChangeNotAllowedIssueEnum issue) |
| `Description` | [`AmountChangeNotAllowedDescriptionEnum`](../../doc/models/amount-change-not-allowed-description-enum.md) | Optional | - | AmountChangeNotAllowedDescriptionEnum getDescription() | setDescription(AmountChangeNotAllowedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AMOUNT_CHANGE_NOT_ALLOWED",
  "description": "The amount specified is different from the amount authorized by payer."
}
```

