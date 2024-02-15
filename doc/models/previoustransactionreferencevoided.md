
# PREVIOUSTRANSACTIONREFERENCEVOIDED

## Structure

`PREVIOUSTRANSACTIONREFERENCEVOIDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PreviousTransactionReferenceVoidedIssueEnum`](../../doc/models/previous-transaction-reference-voided-issue-enum.md) | Optional | - | PreviousTransactionReferenceVoidedIssueEnum getIssue() | setIssue(PreviousTransactionReferenceVoidedIssueEnum issue) |
| `Description` | [`PreviousTransactionReferenceVoidedDescriptionEnum`](../../doc/models/previous-transaction-reference-voided-description-enum.md) | Optional | - | PreviousTransactionReferenceVoidedDescriptionEnum getDescription() | setDescription(PreviousTransactionReferenceVoidedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PREVIOUS_TRANSACTION_REFERENCE_VOIDED",
  "description": "The status of authorization referenced by `previous_transaction_reference` is `VOIDED` and hence cannot be used for this order. Please use a `previous_transaction_reference` whose status is not `VOIDED`."
}
```

