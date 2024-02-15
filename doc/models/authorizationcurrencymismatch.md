
# AUTHORIZATIONCURRENCYMISMATCH

## Structure

`AUTHORIZATIONCURRENCYMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthorizationCurrencyMismatchIssueEnum`](../../doc/models/authorization-currency-mismatch-issue-enum.md) | Optional | - | AuthorizationCurrencyMismatchIssueEnum getIssue() | setIssue(AuthorizationCurrencyMismatchIssueEnum issue) |
| `Description` | [`AuthorizationCurrencyMismatchDescriptionEnum`](../../doc/models/authorization-currency-mismatch-description-enum.md) | Optional | - | AuthorizationCurrencyMismatchDescriptionEnum getDescription() | setDescription(AuthorizationCurrencyMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AUTHORIZATION_CURRENCY_MISMATCH",
  "description": "The currency of the authorization should be same as that in which the Order was created and approved by the Payer. Please check the 'currency_code' and try again."
}
```

