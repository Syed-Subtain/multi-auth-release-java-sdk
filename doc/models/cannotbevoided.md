
# CANNOTBEVOIDED

## Structure

`CANNOTBEVOIDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthorizationsVoid422IssuesItemsAnyof2IssueEnum`](../../doc/models/authorizations-void-422-issues-items-anyof-2-issue-enum.md) | Optional | - | AuthorizationsVoid422IssuesItemsAnyof2IssueEnum getIssue() | setIssue(AuthorizationsVoid422IssuesItemsAnyof2IssueEnum issue) |
| `Description` | [`AuthorizationsVoid422IssuesItemsAnyof2DescriptionEnum`](../../doc/models/authorizations-void-422-issues-items-anyof-2-description-enum.md) | Optional | - | AuthorizationsVoid422IssuesItemsAnyof2DescriptionEnum getDescription() | setDescription(AuthorizationsVoid422IssuesItemsAnyof2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CANNOT_BE_VOIDED",
  "description": "A reauthorization cannot be voided. Please void the original parent authorization."
}
```

