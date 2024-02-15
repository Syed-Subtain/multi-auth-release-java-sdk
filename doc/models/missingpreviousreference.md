
# MISSINGPREVIOUSREFERENCE

## Structure

`MISSINGPREVIOUSREFERENCE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MissingPreviousReferenceIssueEnum`](../../doc/models/missing-previous-reference-issue-enum.md) | Optional | - | MissingPreviousReferenceIssueEnum getIssue() | setIssue(MissingPreviousReferenceIssueEnum issue) |
| `Description` | [`MissingPreviousReferenceDescriptionEnum`](../../doc/models/missing-previous-reference-description-enum.md) | Optional | - | MissingPreviousReferenceDescriptionEnum getDescription() | setDescription(MissingPreviousReferenceDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MISSING_PREVIOUS_REFERENCE",
  "description": "For Merchant initiated network token transactions, either the payment_source.card.stored_credential.previous_network_transaction_reference or payment_source.card.stored_credential.previous_transaction_reference must be included in the request."
}
```

