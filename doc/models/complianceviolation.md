
# COMPLIANCEVIOLATION

## Structure

`COMPLIANCEVIOLATION`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ComplianceViolationIssueEnum`](../../doc/models/compliance-violation-issue-enum.md) | Optional | - | ComplianceViolationIssueEnum getIssue() | setIssue(ComplianceViolationIssueEnum issue) |
| `Description` | [`ComplianceViolationDescriptionEnum`](../../doc/models/compliance-violation-description-enum.md) | Optional | - | ComplianceViolationDescriptionEnum getDescription() | setDescription(ComplianceViolationDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "COMPLIANCE_VIOLATION",
  "description": "Transaction is declined due to compliance violation."
}
```

