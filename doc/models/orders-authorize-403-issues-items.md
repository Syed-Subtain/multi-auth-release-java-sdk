
# Orders Authorize 403 Issues Items

## Structure

`OrdersAuthorize403IssuesItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEligibleForTokenProcessingIssueEnum`](../../doc/models/not-eligible-for-token-processing-issue-enum.md) | Optional | - | NotEligibleForTokenProcessingIssueEnum getIssue() | setIssue(NotEligibleForTokenProcessingIssueEnum issue) |
| `Description` | [`NotEligibleForTokenProcessingDescriptionEnum`](../../doc/models/not-eligible-for-token-processing-description-enum.md) | Optional | - | NotEligibleForTokenProcessingDescriptionEnum getDescription() | setDescription(NotEligibleForTokenProcessingDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ELIGIBLE_FOR_TOKEN_PROCESSING",
  "description": "API caller is not enabled to process payments with the specified type of token. Please contact customer support to request permissions to process transactions with this type of token."
}
```

