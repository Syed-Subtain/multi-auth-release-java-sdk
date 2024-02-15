
# CARDNUMBERREQUIREDERROR

## Structure

`CARDNUMBERREQUIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CardNumberRequired1IssueEnum`](../../doc/models/card-number-required-1-issue-enum.md) | Optional | - | CardNumberRequired1IssueEnum getIssue() | setIssue(CardNumberRequired1IssueEnum issue) |
| `Description` | [`CardNumberRequired1DescriptionEnum`](../../doc/models/card-number-required-1-description-enum.md) | Optional | - | CardNumberRequired1DescriptionEnum getDescription() | setDescription(CardNumberRequired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CARD_NUMBER_REQUIRED",
  "description": "The card number is required when attempting to process payment with card."
}
```

