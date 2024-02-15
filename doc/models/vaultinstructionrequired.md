
# VAULTINSTRUCTIONREQUIRED

## Structure

`VAULTINSTRUCTIONREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`VaultInstructionRequiredIssueEnum`](../../doc/models/vault-instruction-required-issue-enum.md) | Optional | - | VaultInstructionRequiredIssueEnum getIssue() | setIssue(VaultInstructionRequiredIssueEnum issue) |
| `Description` | [`VaultInstructionRequiredDescriptionEnum`](../../doc/models/vault-instruction-required-description-enum.md) | Optional | - | VaultInstructionRequiredDescriptionEnum getDescription() | setDescription(VaultInstructionRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "VAULT_INSTRUCTION_REQUIRED",
  "description": "Vault instruction is required. Please use `vault.store_in_vault` to provide vault instruction."
}
```

