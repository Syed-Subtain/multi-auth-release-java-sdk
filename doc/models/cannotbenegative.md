
# CANNOTBENEGATIVE

## Structure

`CANNOTBENEGATIVE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CannotBeNegativeIssueEnum`](../../doc/models/cannot-be-negative-issue-enum.md) | Optional | - | CannotBeNegativeIssueEnum getIssue() | setIssue(CannotBeNegativeIssueEnum issue) |
| `Description` | [`CannotBeNegativeDescriptionEnum`](../../doc/models/cannot-be-negative-description-enum.md) | Optional | - | CannotBeNegativeDescriptionEnum getDescription() | setDescription(CannotBeNegativeDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CANNOT_BE_NEGATIVE",
  "description": "Must be greater than or equal to 0. If the currency supports decimals, only two decimal place precision is supported."
}
```

