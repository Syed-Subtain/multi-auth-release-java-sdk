
# VAULTINSTRUCTIONREQUIREDERROR

## Structure

`VAULTINSTRUCTIONREQUIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`VaultInstructionRequired1IssueEnum`](../../doc/models/vault-instruction-required-1-issue-enum.md) | Optional | - | VaultInstructionRequired1IssueEnum getIssue() | setIssue(VaultInstructionRequired1IssueEnum issue) |
| `Description` | [`VaultInstructionRequired1DescriptionEnum`](../../doc/models/vault-instruction-required-1-description-enum.md) | Optional | - | VaultInstructionRequired1DescriptionEnum getDescription() | setDescription(VaultInstructionRequired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "VAULT_INSTRUCTION_REQUIRED",
  "description": "Vault instruction is required. Please use `vault.store_in_vault` to provide vault instruction."
}
```

