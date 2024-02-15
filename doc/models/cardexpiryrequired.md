
# CARDEXPIRYREQUIRED

## Structure

`CARDEXPIRYREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CardExpiryRequiredIssueEnum`](../../doc/models/card-expiry-required-issue-enum.md) | Optional | - | CardExpiryRequiredIssueEnum getIssue() | setIssue(CardExpiryRequiredIssueEnum issue) |
| `Description` | [`CardExpiryRequiredDescriptionEnum`](../../doc/models/card-expiry-required-description-enum.md) | Optional | - | CardExpiryRequiredDescriptionEnum getDescription() | setDescription(CardExpiryRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CARD_EXPIRY_REQUIRED",
  "description": "The card expiry is required when attempting to process payment with card."
}
```

