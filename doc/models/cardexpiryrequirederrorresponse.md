
# CARDEXPIRYREQUIREDERRORRESPONSE

## Structure

`CARDEXPIRYREQUIREDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CardExpiryRequired2IssueEnum`](../../doc/models/card-expiry-required-2-issue-enum.md) | Optional | - | CardExpiryRequired2IssueEnum getIssue() | setIssue(CardExpiryRequired2IssueEnum issue) |
| `Description` | [`CardExpiryRequired2DescriptionEnum`](../../doc/models/card-expiry-required-2-description-enum.md) | Optional | - | CardExpiryRequired2DescriptionEnum getDescription() | setDescription(CardExpiryRequired2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CARD_EXPIRY_REQUIRED",
  "description": "The card expiry is required when attempting to process payment with card."
}
```

