
# MAXVALUEEXCEEDED

## Structure

`MAXVALUEEXCEEDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MaxValueExceededIssueEnum`](../../doc/models/max-value-exceeded-issue-enum.md) | Optional | - | MaxValueExceededIssueEnum getIssue() | setIssue(MaxValueExceededIssueEnum issue) |
| `Description` | [`MaxValueExceededDescriptionEnum`](../../doc/models/max-value-exceeded-description-enum.md) | Optional | - | MaxValueExceededDescriptionEnum getDescription() | setDescription(MaxValueExceededDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MAX_VALUE_EXCEEDED",
  "description": "Should be less than or equal to 999999999999999.99."
}
```

