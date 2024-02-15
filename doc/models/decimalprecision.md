
# DECIMALPRECISION

## Structure

`DECIMALPRECISION`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DecimalPrecisionIssueEnum`](../../doc/models/decimal-precision-issue-enum.md) | Optional | - | DecimalPrecisionIssueEnum getIssue() | setIssue(DecimalPrecisionIssueEnum issue) |
| `Description` | [`DecimalPrecisionDescriptionEnum`](../../doc/models/decimal-precision-description-enum.md) | Optional | - | DecimalPrecisionDescriptionEnum getDescription() | setDescription(DecimalPrecisionDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DECIMAL_PRECISION",
  "description": "If the currency supports decimals, only two decimal place precision is supported."
}
```

