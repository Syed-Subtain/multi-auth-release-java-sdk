
# SETUPERRORFORBANKERROR

## Structure

`SETUPERRORFORBANKERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`SetupErrorForBank1IssueEnum`](../../doc/models/setup-error-for-bank-1-issue-enum.md) | Optional | - | SetupErrorForBank1IssueEnum getIssue() | setIssue(SetupErrorForBank1IssueEnum issue) |
| `Description` | [`SetupErrorForBank1DescriptionEnum`](../../doc/models/setup-error-for-bank-1-description-enum.md) | Optional | - | SetupErrorForBank1DescriptionEnum getDescription() | setDescription(SetupErrorForBank1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "SETUP_ERROR_FOR_BANK",
  "description": "The API Caller account setup, for bank payments, is incomplete or incorrect. Please contact your PayPal account manager."
}
```

