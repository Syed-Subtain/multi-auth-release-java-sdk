
# CARDNUMBERREQUIRED

## Structure

`CARDNUMBERREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CardNumberRequiredIssueEnum`](../../doc/models/card-number-required-issue-enum.md) | Optional | - | CardNumberRequiredIssueEnum getIssue() | setIssue(CardNumberRequiredIssueEnum issue) |
| `Description` | [`CardNumberRequiredDescriptionEnum`](../../doc/models/card-number-required-description-enum.md) | Optional | - | CardNumberRequiredDescriptionEnum getDescription() | setDescription(CardNumberRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CARD_NUMBER_REQUIRED",
  "description": "The card number is required when attempting to process payment with card."
}
```

