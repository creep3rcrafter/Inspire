# Agent Instructions: Inspire Mod

## Architecture & Structure

- **Multi-Platform (Architectury)**: This is a Minecraft mod targeting both Fabric and NeoForge.

- **Module Layout**:
  - `common/`: Core logic, shared items, blocks, entities, registries, and API definitions.
  - `fabric/`: Fabric-specific implementations and glue code.
  - `neoforge/`: NeoForge-specific implementations and glue code.

- **Dependency Flow**:
    ```
    fabric → common ← neoforge
    ```

- **Important Rule**:
  - Gameplay logic should always be placed in `common/` first.
  - Only use `fabric/` or `neoforge/` for code that cannot be abstracted using Architectury or shared systems.
  - Never add dependencies from `common/` into platform-specific modules.

---

## Tech Stack

- **Minecraft Version**: 1.21.1
- **Java Version**: Java 21
- **Build System**: Gradle
- **Loader Framework**: Architectury Loom
- **Platforms**:
  - Fabric
  - NeoForge

---

## Code Organization Rules

- Always inspect existing code patterns before creating new systems.

- Prefer existing:
  - Registries
  - Utilities
  - Event systems
  - Networking systems
  - Architectury abstractions

- Avoid:
  - Duplicate systems
  - Unnecessary refactors
  - Rewriting working code

---

## Critical Workflow Notes

- **Logic Placement**:
  - Put shared gameplay features in `common/`.
  - Only put platform-specific code in `fabric/` or `neoforge/`.

- **Verification**:
  - When modifying `common/`, verify compatibility with both platforms when possible.

- **Environment**:
  - Ensure Java 21 is being used.
  - Confirm the correct Minecraft mappings are being used.

- **Efficiency**:
  - Use search tools before opening large files.
  - Avoid loading unnecessary files into context.
  - Summarize large logs before analyzing them.
  - Never run a command longer than 4 minutes without reporting progress.
  - If a command appears frozen, stop it and explain what happened.

---

## Development Workflow

Before making changes:

1. Inspect the relevant files.
2. Search for similar implementations.
3. Understand how the current system works.
4. Explain the planned change before editing.

When making changes:

- Make the smallest possible change.
- Avoid unrelated modifications.
- Keep existing architecture patterns.

---

## Verification

After modifying code:

Run:

```bash
./gradlew build