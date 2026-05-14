# proto-gen-java

Generated Java bindings for the shared protobuf schemas defined in
[`altessa-s/proto`](https://github.com/altessa-s/proto). Do not edit
files in this repository by hand — they are regenerated and pushed
automatically on every push to `main` / `develop` and every `vX.Y.Z` tag.

## Coordinates

- Group: `io.altessa`
- Artifact: `proto-gen-java`
- Hosted on: [GitHub Packages](https://docs.github.com/en/packages)

## Install (Gradle)

```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/altessa-s/proto-gen-java")
        credentials {
            username = providers.gradleProperty("gpr.user").orNull
                ?: System.getenv("GITHUB_ACTOR")
            password = providers.gradleProperty("gpr.token").orNull
                ?: System.getenv("GITHUB_TOKEN")
        }
    }
}

dependencies {
    implementation("io.altessa:proto-gen-java:<version>")
}
```

The `gpr.token` must be a personal access token with the `read:packages`
scope.

## Versioning

Versions are kept in lockstep with `altessa-s/proto` tags. Snapshots
from `main` are published as `<sha>-SNAPSHOT`.

## License

MIT — see [LICENSE](LICENSE).
