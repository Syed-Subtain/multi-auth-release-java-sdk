
# Paypal Wallet Response Allof 2

## Structure

`PaypalWalletResponseAllof2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Optional | The account identifier for a PayPal account.<br>**Constraints**: *Minimum Length*: `13`, *Maximum Length*: `13`, *Pattern*: `^[2-9A-HJ-NP-Z]{13}$` | String getAccountId() | setAccountId(String accountId) |
| `PhoneNumber` | [`Phone`](../../doc/models/phone.md) | Optional | The phone number, in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). | Phone getPhoneNumber() | setPhoneNumber(Phone phoneNumber) |

## Example (as JSON)

```json
{
  "account_id": "account_id4",
  "phone_number": {
    "country_code": "country_code2",
    "national_number": "national_number6",
    "extension_number": "extension_number8"
  }
}
```

