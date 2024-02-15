
# PREVIOUSREQUESTINPROGRESS

## Structure

`PREVIOUSREQUESTINPROGRESS`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`Conflicterror409responseIssuesItemsAnyof0IssueEnum`](../../doc/models/conflicterror-409-response-issues-items-anyof-0-issue-enum.md) | Optional | - | Conflicterror409responseIssuesItemsAnyof0IssueEnum getIssue() | setIssue(Conflicterror409responseIssuesItemsAnyof0IssueEnum issue) |
| `Description` | [`PreviousRequestInProgressDescriptionEnum`](../../doc/models/previous-request-in-progress-description-enum.md) | Optional | - | PreviousRequestInProgressDescriptionEnum getDescription() | setDescription(PreviousRequestInProgressDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PREVIOUS_REQUEST_IN_PROGRESS",
  "description": "A previous request on this resource is currently in progress. Please wait for sometime and try again. It is best to space out the initial and the subsequent request(s) to avoid receiving this error."
}
```

