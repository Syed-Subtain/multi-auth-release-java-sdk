
# MAXAUTHORIZATIONCOUNTEXCEEDED

## Structure

`MAXAUTHORIZATIONCOUNTEXCEEDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MaxAuthorizationCountExceededIssueEnum`](../../doc/models/max-authorization-count-exceeded-issue-enum.md) | Optional | - | MaxAuthorizationCountExceededIssueEnum getIssue() | setIssue(MaxAuthorizationCountExceededIssueEnum issue) |
| `Description` | [`MaxAuthorizationCountExceededDescriptionEnum`](../../doc/models/max-authorization-count-exceeded-description-enum.md) | Optional | - | MaxAuthorizationCountExceededDescriptionEnum getDescription() | setDescription(MaxAuthorizationCountExceededDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MAX_AUTHORIZATION_COUNT_EXCEEDED",
  "description": "Maximum number of authorization allowed for the order is reached. Please contact Customer Support if you need to increase your limit."
}
```

