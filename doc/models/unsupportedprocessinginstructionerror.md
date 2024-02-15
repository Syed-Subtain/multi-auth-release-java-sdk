
# UNSUPPORTEDPROCESSINGINSTRUCTIONERROR

## Structure

`UNSUPPORTEDPROCESSINGINSTRUCTIONERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`UnsupportedProcessingInstruction1IssueEnum`](../../doc/models/unsupported-processing-instruction-1-issue-enum.md) | Optional | - | UnsupportedProcessingInstruction1IssueEnum getIssue() | setIssue(UnsupportedProcessingInstruction1IssueEnum issue) |
| `Description` | [`UnsupportedProcessingInstruction1DescriptionEnum`](../../doc/models/unsupported-processing-instruction-1-description-enum.md) | Optional | - | UnsupportedProcessingInstruction1DescriptionEnum getDescription() | setDescription(UnsupportedProcessingInstruction1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "UNSUPPORTED_PROCESSING_INSTRUCTION",
  "description": "The specified processing_instruction is not supported for the given payment_source. Please refer to https://developer.paypal.com/api/orders/v2/#definition-processing_instruction for the list of payment_source that can be specified with this value."
}
```

