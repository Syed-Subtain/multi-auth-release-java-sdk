
# REFERENCEDCARDEXPIREDERROR

## Structure

`REFERENCEDCARDEXPIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ReferencedCardExpired1IssueEnum`](../../doc/models/referenced-card-expired-1-issue-enum.md) | Optional | - | ReferencedCardExpired1IssueEnum getIssue() | setIssue(ReferencedCardExpired1IssueEnum issue) |
| `Description` | [`ReferencedCardExpired1DescriptionEnum`](../../doc/models/referenced-card-expired-1-description-enum.md) | Optional | - | ReferencedCardExpired1DescriptionEnum getDescription() | setDescription(ReferencedCardExpired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REFERENCED_CARD_EXPIRED",
  "description": "The card underlying the token has expired and hence cannot be used to process a payment."
}
```

