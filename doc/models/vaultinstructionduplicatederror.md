
# VAULTINSTRUCTIONDUPLICATEDERROR

## Structure

`VAULTINSTRUCTIONDUPLICATEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`VaultInstructionDuplicated1IssueEnum`](../../doc/models/vault-instruction-duplicated-1-issue-enum.md) | Optional | - | VaultInstructionDuplicated1IssueEnum getIssue() | setIssue(VaultInstructionDuplicated1IssueEnum issue) |
| `Description` | [`VaultInstructionDuplicated1DescriptionEnum`](../../doc/models/vault-instruction-duplicated-1-description-enum.md) | Optional | - | VaultInstructionDuplicated1DescriptionEnum getDescription() | setDescription(VaultInstructionDuplicated1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "VAULT_INSTRUCTION_DUPLICATED",
  "description": "Only one vault instruction is allowed. Please use `vault.store_in_vault` to provide vault instruction."
}
```

