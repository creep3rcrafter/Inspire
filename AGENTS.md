# AGENTS.md - Inspire Minecraft Mod

## Architecture

This is a multi-loader Minecraft mod using **Architectury** to share code between Fabric and NeoForge.

### Module Responsibilities

- `common/`: Core logic, no loader-specific imports. Other modules depend on this.
- `fabric/`: Fabric-specific bootstrapping, must not import from `neoforge/`.
- `neoforge/`: NeoForge-specific bootstrapping, must not import from `fabric/`.

**Rule**: Platform modules may depend on `common`, but never on each other.

## Essential Commands

- Build: `./gradlew build`
- Run Fabric client: `./gradlew :fabric:runClient`
- Run NeoForge client: `./gradlew :neoforge:runClient`
- Clean: `./gradlew clean`

Build order: `common` → platform (Automated by Gradle subproject dependencies).

## Key Files & Quirks

| File | Purpose |
|------|---------|
| `src/main/resources/{platform}.accesswidener` | Minecraft access wideners (required for field/method visibility) |
| `{platform}.mixins.json` / `{platform}.client.mixins.json` | Mixin configuration - verify mappings match Minecraft version |

**Important**: Changes to `common` require a rebuild of dependent platforms before testing.

## Environment

- **Minecraft Version**: 1.21.1
- **Java Version**: 21 (source/target compatibility)
- **Gradle JVM Args**: `-Xmx4G` (`gradle.properties`)
