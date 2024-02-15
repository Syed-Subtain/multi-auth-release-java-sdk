
# Max Value Exceeded 1

## Structure

`MaxValueExceeded1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MaxValueExceeded1IssueEnum`](../../doc/models/max-value-exceeded-1-issue-enum.md) | Optional | - | MaxValueExceeded1IssueEnum getIssue() | setIssue(MaxValueExceeded1IssueEnum issue) |
| `Description` | [`MaxValueExceeded1DescriptionEnum`](../../doc/models/max-value-exceeded-1-description-enum.md) | Optional | - | MaxValueExceeded1DescriptionEnum getDescription() | setDescription(MaxValueExceeded1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MAX_VALUE_EXCEEDED",
  "description": "Should be less than or equal to 999999999999999.99."
}
```

