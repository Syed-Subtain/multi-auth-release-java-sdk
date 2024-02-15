
# PAYEEACCOUNTINVALID

## Structure

`PAYEEACCOUNTINVALID`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeAccountInvalidIssueEnum`](../../doc/models/payee-account-invalid-issue-enum.md) | Optional | - | PayeeAccountInvalidIssueEnum getIssue() | setIssue(PayeeAccountInvalidIssueEnum issue) |
| `Description` | [`PayeeAccountInvalidDescriptionEnum`](../../doc/models/payee-account-invalid-description-enum.md) | Optional | - | PayeeAccountInvalidDescriptionEnum getDescription() | setDescription(PayeeAccountInvalidDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_ACCOUNT_INVALID",
  "description": "Payee account specified is invalid. Please check the `payee.email_address` or `payee.merchant_id` specified and try again. Ensure that either  `payee.merchant_id` or `payee.email_address` is specified."
}
```

