
# VAULTINSTRUCTIONREQUIREDERRORRESPONSE

## Structure

`VAULTINSTRUCTIONREQUIREDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`VaultInstructionRequired3IssueEnum`](../../doc/models/vault-instruction-required-3-issue-enum.md) | Optional | - | VaultInstructionRequired3IssueEnum getIssue() | setIssue(VaultInstructionRequired3IssueEnum issue) |
| `Description` | [`VaultInstructionRequired3DescriptionEnum`](../../doc/models/vault-instruction-required-3-description-enum.md) | Optional | - | VaultInstructionRequired3DescriptionEnum getDescription() | setDescription(VaultInstructionRequired3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "VAULT_INSTRUCTION_REQUIRED",
  "description": "Vault instruction is required. Please use `vault.store_in_vault` to provide vault instruction."
}
```

