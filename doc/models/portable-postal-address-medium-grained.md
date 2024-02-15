
# Portable Postal Address Medium Grained

The portable international postal address. Maps to [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata) and HTML 5.1 [Autofilling form controls: the autocomplete attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).

## Structure

`PortablePostalAddressMediumGrained`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `String` | Optional | The first line of the address, such as number and street, for example, `173 Drury Lane`. Needed for data entry, and Compliance and Risk checks. This field needs to pass the full address.<br>**Constraints**: *Maximum Length*: `300` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | The second line of the address, for example, a suite or apartment number.<br>**Constraints**: *Maximum Length*: `300` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressLine3` | `String` | Optional | The third line of the address, if needed. Examples include a street complement for Brazil, direction text, such as `next to Walmart`, or a landmark in an Indian address.<br>**Constraints**: *Maximum Length*: `100` | String getAddressLine3() | setAddressLine3(String addressLine3) |
| `AdminArea4` | `String` | Optional | The neighborhood, ward, or district. This is smaller than `admin_area_level_3` or `sub_locality`. Value is:<ul><li>The postal sorting code that is used in Guernsey and many French territories, such as French Guiana.</li><li>The fine-grained administrative levels in China.</li></ul><br>**Constraints**: *Maximum Length*: `100` | String getAdminArea4() | setAdminArea4(String adminArea4) |
| `AdminArea3` | `String` | Optional | The sub-locality, suburb, neighborhood, or district. This is smaller than `admin_area_level_2`. Value is:<ul><li>Brazil. Suburb, *bairro*, or neighborhood.</li><li>India. Sub-locality or district. Street name information isn't always available, but a sub-locality or district can be a very small area.</li></ul><br>**Constraints**: *Maximum Length*: `100` | String getAdminArea3() | setAdminArea3(String adminArea3) |
| `AdminArea2` | `String` | Optional | A city, town, or village. Smaller than `admin_area_level_1`.<br>**Constraints**: *Maximum Length*: `120` | String getAdminArea2() | setAdminArea2(String adminArea2) |
| `AdminArea1` | `String` | Optional | The highest-level sub-division in a country, which is usually a province, state, or ISO-3166-2 subdivision. This data is formatted for postal delivery, for example, `CA` and not `California`. Value, by country, is:<ul><li>UK. A county.</li><li>US. A state.</li><li>Canada. A province.</li><li>Japan. A prefecture.</li><li>Switzerland. A *kanton*.</li></ul><br>**Constraints**: *Maximum Length*: `300` | String getAdminArea1() | setAdminArea1(String adminArea1) |
| `PostalCode` | `String` | Optional | The postal code, which is the ZIP code or equivalent. Typically required for countries with a postal code or an equivalent. See [postal code](https://en.wikipedia.org/wiki/Postal_code).<br>**Constraints**: *Maximum Length*: `60` | String getPostalCode() | setPostalCode(String postalCode) |
| `CountryCode` | `String` | Required | The [2-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the country or region.<blockquote><strong>Note:</strong> The country code for Great Britain is <code>GB</code> and not <code>UK</code> as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.</blockquote><br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `AddressDetails` | [`AddressDetails`](../../doc/models/address-details.md) | Optional | The non-portable additional address details include fine-grain address information for Compliance, Risk, and other scenarios. This isn't portable with common third-party and open source applications. This can include data that is redundant with core fields. For example, `address_portable.address_line_1` is usually a combination of `address_details.street_number`, `street_name`, and `street_type`. | AddressDetails getAddressDetails() | setAddressDetails(AddressDetails addressDetails) |

## Example (as JSON)

```json
{
  "address_line_1": "address_line_16",
  "address_line_2": "address_line_24",
  "address_line_3": "address_line_30",
  "admin_area_4": "admin_area_42",
  "admin_area_3": "admin_area_36",
  "country_code": "country_code6"
}
```

