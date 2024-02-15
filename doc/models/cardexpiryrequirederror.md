
# CARDEXPIRYREQUIREDERROR

## Structure

`CARDEXPIRYREQUIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CardExpiryRequired1IssueEnum`](../../doc/models/card-expiry-required-1-issue-enum.md) | Optional | - | CardExpiryRequired1IssueEnum getIssue() | setIssue(CardExpiryRequired1IssueEnum issue) |
| `Description` | [`CardExpiryRequired1DescriptionEnum`](../../doc/models/card-expiry-required-1-description-enum.md) | Optional | - | CardExpiryRequired1DescriptionEnum getDescription() | setDescription(CardExpiryRequired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CARD_EXPIRY_REQUIRED",
  "description": "The card expiry is required when attempting to process payment with card."
}
```

