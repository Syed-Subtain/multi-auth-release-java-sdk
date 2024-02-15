
# DECLINEDDUETORELATEDTXNERROR

## Structure

`DECLINEDDUETORELATEDTXNERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DeclinedDueToRelatedTxn1IssueEnum`](../../doc/models/declined-due-to-related-txn-1-issue-enum.md) | Optional | - | DeclinedDueToRelatedTxn1IssueEnum getIssue() | setIssue(DeclinedDueToRelatedTxn1IssueEnum issue) |
| `Description` | [`DeclinedDueToRelatedTxn1DescriptionEnum`](../../doc/models/declined-due-to-related-txn-1-description-enum.md) | Optional | - | DeclinedDueToRelatedTxn1DescriptionEnum getDescription() | setDescription(DeclinedDueToRelatedTxn1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DECLINED_DUE_TO_RELATED_TXN",
  "description": "One or more transactions in this Order did not succeed. Since this Order is being processed as an All or None Order, if one or more transactions in this Order do not succeed, then all purchase units are marked declined and will not be processed."
}
```

