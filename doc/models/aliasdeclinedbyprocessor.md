
# ALIASDECLINEDBYPROCESSOR

## Structure

`ALIASDECLINEDBYPROCESSOR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AliasDeclinedByProcessorIssueEnum`](../../doc/models/alias-declined-by-processor-issue-enum.md) | Optional | - | AliasDeclinedByProcessorIssueEnum getIssue() | setIssue(AliasDeclinedByProcessorIssueEnum issue) |
| `Description` | [`AliasDeclinedByProcessorDescriptionEnum`](../../doc/models/alias-declined-by-processor-description-enum.md) | Optional | - | AliasDeclinedByProcessorDescriptionEnum getDescription() | setDescription(AliasDeclinedByProcessorDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ALIAS_DECLINED_BY_PROCESSOR",
  "description": "The provided alias was declined by the processor. Please create a new order with a different alias_key and/or alias_label and try again."
}
```

