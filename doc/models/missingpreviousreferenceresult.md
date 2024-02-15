
# MISSINGPREVIOUSREFERENCERESULT

## Structure

`MISSINGPREVIOUSREFERENCERESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MissingPreviousReference2IssueEnum`](../../doc/models/missing-previous-reference-2-issue-enum.md) | Optional | - | MissingPreviousReference2IssueEnum getIssue() | setIssue(MissingPreviousReference2IssueEnum issue) |
| `Description` | [`MissingPreviousReference2DescriptionEnum`](../../doc/models/missing-previous-reference-2-description-enum.md) | Optional | - | MissingPreviousReference2DescriptionEnum getDescription() | setDescription(MissingPreviousReference2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MISSING_PREVIOUS_REFERENCE",
  "description": "For Merchant initiated network token transactions, either the payment_source.card.stored_credential.previous_network_transaction_reference or payment_source.card.stored_credential.previous_transaction_reference must be included in the request."
}
```

