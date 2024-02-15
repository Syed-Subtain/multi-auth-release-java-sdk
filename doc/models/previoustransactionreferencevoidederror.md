
# PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR

## Structure

`PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PreviousTransactionReferenceVoided1IssueEnum`](../../doc/models/previous-transaction-reference-voided-1-issue-enum.md) | Optional | - | PreviousTransactionReferenceVoided1IssueEnum getIssue() | setIssue(PreviousTransactionReferenceVoided1IssueEnum issue) |
| `Description` | [`PreviousTransactionReferenceVoided1DescriptionEnum`](../../doc/models/previous-transaction-reference-voided-1-description-enum.md) | Optional | - | PreviousTransactionReferenceVoided1DescriptionEnum getDescription() | setDescription(PreviousTransactionReferenceVoided1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PREVIOUS_TRANSACTION_REFERENCE_VOIDED",
  "description": "The status of authorization referenced by `previous_transaction_reference` is `VOIDED` and hence cannot be used for this order. Please use a `previous_transaction_reference` whose status is not `VOIDED`."
}
```

