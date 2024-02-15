
# DECIMALSNOTSUPPORTED

## Structure

`DECIMALSNOTSUPPORTED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DecimalsNotSupportedIssueEnum`](../../doc/models/decimals-not-supported-issue-enum.md) | Optional | - | DecimalsNotSupportedIssueEnum getIssue() | setIssue(DecimalsNotSupportedIssueEnum issue) |
| `Description` | [`DecimalsNotSupportedDescriptionEnum`](../../doc/models/decimals-not-supported-description-enum.md) | Optional | - | DecimalsNotSupportedDescriptionEnum getDescription() | setDescription(DecimalsNotSupportedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DECIMALS_NOT_SUPPORTED",
  "description": "Currency does not support decimals. Please refer to https://developer.paypal.com/docs/api/reference/currency-codes/ for more information."
}
```

