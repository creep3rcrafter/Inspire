# AGENTS.md - Inspire Minecraft Mod

## Project

Minecraft 1.21.1 Architectury mod targeting Fabric and NeoForge.

Java 21.

Modules:

- common/
- fabric/
- neoforge/

Platform modules may depend on common.

Platform modules must never depend on each other.

---

### Subagent Delegation Rules
- When the user asks to explore, find, or search for something, you must delegate the task to the `explore` subagent using the `task` tool.
- CRITICAL: Every `task` tool call MUST include a `description` argument. Summarize exactly what you need the explore agent to find. Do not omit this key.
### Example Task Delegation
User: "find all mentions of 'register' and put them into a file"
```json
{
  "tool_name": "task",
  "parameters": {
    "command": "N/A",
    "description": "Scan the entire repository structure using 'rg' (ripgrep) to find all files or lines containing the word \"register\". The final output must be a plain list of file paths and relevant matching snippets found during the search.",
    "prompt": "Use ripgrep recursively across the whole codebase (`rg \"register\" .`) to find definitions and usages of the word \"register\". Compile the results into a single, easy-to-read list containing the files found and excerpts with the keyword. This output will be used by the build agent in the next step.",
    "subagent_type": "explore"
  }
}
```

---

## Build Workflow

The goal is always to restore a successful build.

Workflow:

1. Run the appropriate Gradle task.
2. Read ONLY the FIRST compiler error.
3. Fix ONLY that error.
4. Save files.
5. Rebuild.
6. Repeat until successful.

Never batch multiple compiler fixes before rebuilding.

Most later compiler errors disappear automatically.

---

## Build Commands

Compile Fabric:

```bash
./gradlew :fabric:compileJava
````

Run Fabric:

```bash
./gradlew :fabric:runClient
```

Compile NeoForge:

```bash
./gradlew :neoforge:compileJava
```

Run NeoForge:

```bash
./gradlew :neoforge:runClient
```

Never use:

```bash
./gradlew :common:runClient
```

Use compileJava whenever possible because it is much faster.

---

## Coding Rules

* Always edit the smallest amount of code necessary.
* Never refactor unrelated code.
* Never change formatting unless touching that code.
* Never rename files unless required.
* Never rewrite working code.
* Ignore warnings unless requested.
* Ignore TODO comments.
* Ignore optimization opportunities.

---

## Investigation Rules

* Never investigate the same symbol more than twice.
* Never spend more than 30 seconds investigating a single compiler error.
* If the cause is known, edit code immediately.
* Reasoning without editing is not productive.

---

## Search Strategy

Search only when required.

Prefer terminal search tools over IDE tools.

Preferred order:

1. `rg` (ripgrep)
2. `grep`
3. IntelliJ MCP
   
Never call IntelliJ MCP tools. They are unreliable in this environment. Use rg through bash via the explore agent instead.
Use `rg` for repository searches:

```bash
rg "ClassName" .
rg "methodName" common fabric neoforge
rg "import .*SomeClass" .
```

When searching:

1. Find definition.
2. Find usages.
3. Stop searching.

Avoid repeatedly searching the same class.

---

## Minecraft Rules

Always preserve compatibility between Fabric and NeoForge.

Shared code belongs in common/.

Loader-specific code belongs only in its platform module.

Do not introduce loader-specific imports into common/.

Respect Mojang mappings used by this project.

Do not convert files to Yarn mappings.

When working with Minecraft APIs:

* Verify APIs against Minecraft 1.21.1.
* Do not assume old methods or classes still exist.
* Prefer current project patterns over remembered Minecraft code.

---

## Migration Rules

This project contains code migrated from older Minecraft mods.

Migrated code may have:

* different Minecraft versions
* different mappings (Yarn, Mojang, Forge mappings)
* outdated APIs
* obsolete class names
* changed method signatures
* incompatible Architectury/Fabric/NeoForge patterns

Never assume migrated code is compatible.

When moving old code:

1. Verify the Minecraft version the code came from.
2. Convert mappings to the current project's Mojang mappings.
3. Replace removed or renamed APIs with the Minecraft 1.21.1 equivalent.
4. Follow the current project architecture.
5. Prefer current project patterns over old code patterns.

Old code is a reference for logic only, not a drop-in implementation.

Do not:

* copy imports without checking compatibility
* reintroduce old mappings
* add deprecated APIs just to make old code compile
* change project mappings to support migrated code
* move migrated code without checking version, mappings, loader, and Architectury compatibility

---

## Code Priority

When conflicts exist, use this priority:

1. Existing working Inspire code
2. Current Minecraft 1.21.1 APIs
3. Current Architectury patterns
4. Migrated old mod code

Migrated code should adapt to Inspire, not the other way around.

---

## Architectury Rules

* Prefer existing Architectury APIs.
* Do not duplicate platform logic.
* Use platform abstractions when available.
* Keep shared logic in common/.
* Keep Fabric and NeoForge implementations isolated.

---

## Gradle Error Rules

Treat these as environment issues unless code changes can fix them:

* dependency resolution failures
* missing Minecraft/loader dependencies
* Gradle cache problems
* network-related Gradle failures

Do not modify Java code to fix environment problems.

---

## Stopping Conditions

Stop immediately if:

* the same compiler error survives two edit attempts
* two consecutive iterations make no code edits
* a required class is genuinely missing from the repository
* Gradle reports an unrelated environmental failure

Explain the blocker instead of continuing to investigate.
