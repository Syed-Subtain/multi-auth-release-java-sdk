
# Pay Pal Wallet

A resource that identifies a PayPal Wallet is used for payment.

## Structure

`PayPalWallet`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `VaultId` | `String` | Optional | The PayPal-generated ID for the payment_source stored within the Vault.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9a-zA-Z_-]+$` | String getVaultId() | setVaultId(String vaultId) |
| `EmailAddress` | `String` | Optional | The email address of the PayPal account holder.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: `(?:[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+(?:\.[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+)*\|(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\|\[(?:(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9]))\.){3}(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9])\|[a-zA-Z0-9-]*[a-zA-Z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `Name` | [`Name`](../../doc/models/name.md) | Optional | The name of the PayPal account holder. Supports only the `given_name` and `surname` properties. | Name getName() | setName(Name name) |
| `Phone` | [`PhoneWithType`](../../doc/models/phone-with-type.md) | Optional | The phone number of the customer. Available only when you enable the **Contact Telephone Number** option in the <a href="https://www.paypal.com/cgi-bin/customerprofileweb?cmd=_profile-website-payments">**Profile & Settings**</a> for the merchant's PayPal account. The `phone.phone_number` supports only `national_number`. | PhoneWithType getPhone() | setPhone(PhoneWithType phone) |
| `BirthDate` | `String` | Optional | The birth date of the PayPal account holder in `YYYY-MM-DD` format.<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])$` | String getBirthDate() | setBirthDate(String birthDate) |
| `TaxInfo` | [`TaxInformation`](../../doc/models/tax-information.md) | Optional | The tax information of the PayPal account holder. Required only for Brazilian PayPal account holder's. Both `tax_id` and `tax_id_type` are required. | TaxInformation getTaxInfo() | setTaxInfo(TaxInformation taxInfo) |
| `Address` | [`PortablePostalAddressMediumGrained`](../../doc/models/portable-postal-address-medium-grained.md) | Optional | The address of the PayPal account holder. Supports only the `address_line_1`, `address_line_2`, `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties. Also referred to as the billing address of the customer. | PortablePostalAddressMediumGrained getAddress() | setAddress(PortablePostalAddressMediumGrained address) |
| `Attributes` | [`PayPalWalletAttributes`](../../doc/models/pay-pal-wallet-attributes.md) | Optional | Additional attributes associated with the use of this wallet. | PayPalWalletAttributes getAttributes() | setAttributes(PayPalWalletAttributes attributes) |
| `ExperienceContext` | [`PayPalWalletExperienceContext`](../../doc/models/pay-pal-wallet-experience-context.md) | Optional | Customizes the payer experience during the approval process for payment with PayPal.<blockquote><strong>Note:</strong> Partners and Marketplaces might configure <code>brand_name</code> and <code>shipping_preference</code> during partner account setup, which overrides the request values.</blockquote> | PayPalWalletExperienceContext getExperienceContext() | setExperienceContext(PayPalWalletExperienceContext experienceContext) |
| `BillingAgreementId` | `String` | Optional | The PayPal billing agreement ID. References an approved recurring payment for goods or services.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `128`, *Pattern*: `^[a-zA-Z0-9-]+$` | String getBillingAgreementId() | setBillingAgreementId(String billingAgreementId) |

## Example (as JSON)

```json
{
  "vault_id": "vault_id8",
  "email_address": "email_address8",
  "name": {
    "prefix": "prefix8",
    "given_name": "given_name2",
    "surname": "surname8",
    "middle_name": "middle_name0",
    "suffix": "suffix0"
  },
  "phone": {
    "phone_type": "FAX",
    "phone_number": {
      "country_code": "country_code2",
      "national_number": "national_number6",
      "extension_number": "extension_number8"
    }
  },
  "birth_date": "birth_date4"
}
```

