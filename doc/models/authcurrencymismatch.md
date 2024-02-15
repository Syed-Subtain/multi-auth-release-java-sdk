
# AUTHCURRENCYMISMATCH

## Structure

`AUTHCURRENCYMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthCurrencyMismatchIssueEnum`](../../doc/models/auth-currency-mismatch-issue-enum.md) | Optional | - | AuthCurrencyMismatchIssueEnum getIssue() | setIssue(AuthCurrencyMismatchIssueEnum issue) |
| `Description` | [`AuthCurrencyMismatchDescriptionEnum`](../../doc/models/auth-currency-mismatch-description-enum.md) | Optional | - | AuthCurrencyMismatchDescriptionEnum getDescription() | setDescription(AuthCurrencyMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AUTH_CURRENCY_MISMATCH",
  "description": "The currency specified during reauthorization should be the same as the currency specified in the original authorization. Please check the currency of the authorization for which you are trying to reauthorize and try again."
}
```

