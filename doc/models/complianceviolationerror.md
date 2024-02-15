
# COMPLIANCEVIOLATIONERROR

## Structure

`COMPLIANCEVIOLATIONERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ComplianceViolation1IssueEnum`](../../doc/models/compliance-violation-1-issue-enum.md) | Optional | - | ComplianceViolation1IssueEnum getIssue() | setIssue(ComplianceViolation1IssueEnum issue) |
| `Description` | [`ComplianceViolation1DescriptionEnum`](../../doc/models/compliance-violation-1-description-enum.md) | Optional | - | ComplianceViolation1DescriptionEnum getDescription() | setDescription(ComplianceViolation1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "COMPLIANCE_VIOLATION",
  "description": "Transaction is declined due to compliance violation."
}
```

