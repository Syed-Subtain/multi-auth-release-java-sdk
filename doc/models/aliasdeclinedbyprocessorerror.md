
# ALIASDECLINEDBYPROCESSORERROR

## Structure

`ALIASDECLINEDBYPROCESSORERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AliasDeclinedByProcessor1IssueEnum`](../../doc/models/alias-declined-by-processor-1-issue-enum.md) | Optional | - | AliasDeclinedByProcessor1IssueEnum getIssue() | setIssue(AliasDeclinedByProcessor1IssueEnum issue) |
| `Description` | [`AliasDeclinedByProcessor1DescriptionEnum`](../../doc/models/alias-declined-by-processor-1-description-enum.md) | Optional | - | AliasDeclinedByProcessor1DescriptionEnum getDescription() | setDescription(AliasDeclinedByProcessor1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ALIAS_DECLINED_BY_PROCESSOR",
  "description": "The provided alias was declined by the processor. Please create a new order with a different alias_key and/or alias_label and try again."
}
```

