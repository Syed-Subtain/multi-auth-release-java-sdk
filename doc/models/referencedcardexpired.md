
# REFERENCEDCARDEXPIRED

## Structure

`REFERENCEDCARDEXPIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ReferencedCardExpiredIssueEnum`](../../doc/models/referenced-card-expired-issue-enum.md) | Optional | - | ReferencedCardExpiredIssueEnum getIssue() | setIssue(ReferencedCardExpiredIssueEnum issue) |
| `Description` | [`ReferencedCardExpiredDescriptionEnum`](../../doc/models/referenced-card-expired-description-enum.md) | Optional | - | ReferencedCardExpiredDescriptionEnum getDescription() | setDescription(ReferencedCardExpiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REFERENCED_CARD_EXPIRED",
  "description": "The card underlying the token has expired and hence cannot be used to process a payment."
}
```

