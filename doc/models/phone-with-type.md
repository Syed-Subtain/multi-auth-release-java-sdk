
# Phone With Type

The phone information.

## Structure

`PhoneWithType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PhoneType` | [`PhoneTypeEnum`](../../doc/models/phone-type-enum.md) | Optional | The phone type. | PhoneTypeEnum getPhoneType() | setPhoneType(PhoneTypeEnum phoneType) |
| `PhoneNumber` | [`Phone`](../../doc/models/phone.md) | Required | The phone number, in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). Supports only the `national_number` property. | Phone getPhoneNumber() | setPhoneNumber(Phone phoneNumber) |

## Example (as JSON)

```json
{
  "phone_type": "FAX",
  "phone_number": {
    "country_code": "country_code2",
    "national_number": "national_number6",
    "extension_number": "extension_number8"
  }
}
```

