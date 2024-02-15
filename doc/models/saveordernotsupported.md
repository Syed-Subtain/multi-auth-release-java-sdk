
# SAVEORDERNOTSUPPORTED

## Structure

`SAVEORDERNOTSUPPORTED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`SaveOrderNotSupportedIssueEnum`](../../doc/models/save-order-not-supported-issue-enum.md) | Optional | - | SaveOrderNotSupportedIssueEnum getIssue() | setIssue(SaveOrderNotSupportedIssueEnum issue) |
| `Description` | [`SaveOrderNotSupportedDescriptionEnum`](../../doc/models/save-order-not-supported-description-enum.md) | Optional | - | SaveOrderNotSupportedDescriptionEnum getDescription() | setDescription(SaveOrderNotSupportedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "SAVE_ORDER_NOT_SUPPORTED",
  "description": "The API caller account is setup in a way that does not allow it to be used for saving the order. This functionality is not available for PayPal Commerce Platform for Platforms & Marketplaces."
}
```

