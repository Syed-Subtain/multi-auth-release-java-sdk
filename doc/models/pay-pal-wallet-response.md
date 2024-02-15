
# Pay Pal Wallet Response

The PayPal Wallet response.

## Structure

`PayPalWalletResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EmailAddress` | `String` | Optional | The email address of the PayPal account holder.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: `(?:[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+(?:\.[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+)*\|(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\|\[(?:(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9]))\.){3}(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9])\|[a-zA-Z0-9-]*[a-zA-Z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `AccountId` | `String` | Optional | The PayPal-assigned ID for the PayPal account holder.<br>**Constraints**: *Minimum Length*: `13`, *Maximum Length*: `13`, *Pattern*: `^[2-9A-HJ-NP-Z]{13}$` | String getAccountId() | setAccountId(String accountId) |
| `Name` | [`Name`](../../doc/models/name.md) | Optional | The name of the PayPal account holder. Supports only the `given_name` and `surname` properties. | Name getName() | setName(Name name) |
| `PhoneType` | [`PhoneTypeEnum`](../../doc/models/phone-type-enum.md) | Optional | The phone type. | PhoneTypeEnum getPhoneType() | setPhoneType(PhoneTypeEnum phoneType) |
| `PhoneNumber` | [`CanonicalInternationalPhoneNumber`](../../doc/models/canonical-international-phone-number.md) | Optional | The phone number, in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). Available only when you enable the **Contact Telephone Number** option in the <a href="https://www.paypal.com/cgi-bin/customerprofileweb?cmd=_profile-website-payments">**Profile & Settings**</a> for the merchant's PayPal account. Supports only the `national_number` property. | CanonicalInternationalPhoneNumber getPhoneNumber() | setPhoneNumber(CanonicalInternationalPhoneNumber phoneNumber) |
| `BirthDate` | `String` | Optional | The birth date of the PayPal account holder in `YYYY-MM-DD` format.<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])$` | String getBirthDate() | setBirthDate(String birthDate) |
| `TaxInfo` | [`TaxInformation`](../../doc/models/tax-information.md) | Optional | The tax information of the PayPal account holder. Required only for Brazilian PayPal account holder's. Both `tax_id` and `tax_id_type` are required. | TaxInformation getTaxInfo() | setTaxInfo(TaxInformation taxInfo) |
| `Address` | [`PortablePostalAddressMediumGrained`](../../doc/models/portable-postal-address-medium-grained.md) | Optional | The address of the PayPal account holder. Supports only the `address_line_1`, `address_line_2`, `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties. Also referred to as the billing address of the customer. | PortablePostalAddressMediumGrained getAddress() | setAddress(PortablePostalAddressMediumGrained address) |
| `Attributes` | [`PayPalWalletAttributesResponse`](../../doc/models/pay-pal-wallet-attributes-response.md) | Optional | Additional attributes associated with the use of a PayPal Wallet. | PayPalWalletAttributesResponse getAttributes() | setAttributes(PayPalWalletAttributesResponse attributes) |

## Example (as JSON)

```json
{
  "email_address": "email_address8",
  "account_id": "account_id2",
  "name": {
    "prefix": "prefix8",
    "given_name": "given_name2",
    "surname": "surname8",
    "middle_name": "middle_name0",
    "suffix": "suffix0"
  },
  "phone_type": "MOBILE",
  "phone_number": {
    "national_number": "national_number6"
  }
}
```

