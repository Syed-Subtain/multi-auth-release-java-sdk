
# Cannot Be Negative 1

## Structure

`CannotBeNegative1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CannotBeNegative1IssueEnum`](../../doc/models/cannot-be-negative-1-issue-enum.md) | Optional | - | CannotBeNegative1IssueEnum getIssue() | setIssue(CannotBeNegative1IssueEnum issue) |
| `Description` | [`CannotBeNegative1DescriptionEnum`](../../doc/models/cannot-be-negative-1-description-enum.md) | Optional | - | CannotBeNegative1DescriptionEnum getDescription() | setDescription(CannotBeNegative1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CANNOT_BE_NEGATIVE",
  "description": "Must be greater than or equal to 0. If the currency supports decimals, only two decimal place precision is supported."
}
```

