
# Unsupported Intent 1

## Structure

`UnsupportedIntent1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`UnsupportedIntent1IssueEnum`](../../doc/models/unsupported-intent-1-issue-enum.md) | Optional | - | UnsupportedIntent1IssueEnum getIssue() | setIssue(UnsupportedIntent1IssueEnum issue) |
| `Description` | [`UnsupportedIntent1DescriptionEnum`](../../doc/models/unsupported-intent-1-description-enum.md) | Optional | - | UnsupportedIntent1DescriptionEnum getDescription() | setDescription(UnsupportedIntent1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "UNSUPPORTED_INTENT",
  "description": "`intent=AUTHORIZE` is not supported for multiple purchase units. Only `intent=CAPTURE` is supported."
}
```

