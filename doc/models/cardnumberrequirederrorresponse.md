
# CARDNUMBERREQUIREDERRORRESPONSE

## Structure

`CARDNUMBERREQUIREDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CardNumberRequired2IssueEnum`](../../doc/models/card-number-required-2-issue-enum.md) | Optional | - | CardNumberRequired2IssueEnum getIssue() | setIssue(CardNumberRequired2IssueEnum issue) |
| `Description` | [`CardNumberRequired2DescriptionEnum`](../../doc/models/card-number-required-2-description-enum.md) | Optional | - | CardNumberRequired2DescriptionEnum getDescription() | setDescription(CardNumberRequired2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CARD_NUMBER_REQUIRED",
  "description": "The card number is required when attempting to process payment with card."
}
```

