
# PAYEEACCOUNTNOTVERIFIED

## Structure

`PAYEEACCOUNTNOTVERIFIED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeAccountNotVerifiedIssueEnum`](../../doc/models/payee-account-not-verified-issue-enum.md) | Optional | - | PayeeAccountNotVerifiedIssueEnum getIssue() | setIssue(PayeeAccountNotVerifiedIssueEnum issue) |
| `Description` | [`PayeeAccountNotVerifiedDescriptionEnum`](../../doc/models/payee-account-not-verified-description-enum.md) | Optional | - | PayeeAccountNotVerifiedDescriptionEnum getDescription() | setDescription(PayeeAccountNotVerifiedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_ACCOUNT_NOT_VERIFIED",
  "description": "Payee has not verified their account with PayPal. The selected payment method requires the recipient to have a verified PayPal account before transactions can be processed on their behalf."
}
```

