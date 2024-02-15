
# Bank Response

Full representation of a Bank Payment Token.

## Structure

`BankResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AchDebit` | [`ACHDebitResponse`](../../doc/models/ach-debit-response.md) | Optional | ACH Debit Response. | ACHDebitResponse getAchDebit() | setAchDebit(ACHDebitResponse achDebit) |

## Example (as JSON)

```json
{
  "ach_debit": {
    "verification_status": "verification_status6"
  }
}
```

