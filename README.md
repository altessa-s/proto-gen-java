# proto-gen-java

Generated Java bindings for the
[altessa-s/proto](https://github.com/altessa-s/proto) schema.

This repository is auto-generated. Do not edit its files by hand — they are
regenerated from [`altessa-s/proto`](https://github.com/altessa-s/proto) and
pushed automatically on every push to `main` / `develop` and every `vX.Y.Z`
tag. The only hand-maintained file is this `README.md`.

## Installation

Published to [GitHub Packages](https://docs.github.com/en/packages) under group
`io.altessa`, artifact `proto-gen-java`.

### Gradle

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

## Packages

Generated with `java_multiple_files = true`, so each message, enum, and service
is its own top-level class in the listed Java package.

| Proto package | Java package | Description |
|---|---|---|
| `io.altessa.badrequest.v1` | `io.altessa.badrequest.v1` | `BadRequest` / `FieldViolation` error-detail payload for a `google.rpc.Status` with `INVALID_ARGUMENT`. |
| `io.altessa.serviceinfo.v1` | `io.altessa.serviceinfo.v1` | `ServiceInfo` runtime metadata plus the `ServiceInfoService.GetServiceInfo` introspection RPC. |
| `io.altessa.type.v1` | `io.altessa.type.v1` | General-purpose, domain-neutral value types (`Contact`, `DatePeriod`, `FileRef`, …) reused across services. |

## Usage

```java
import io.altessa.serviceinfo.v1.ServiceInfo;

ServiceInfo info = ServiceInfo.newBuilder()
    .setServiceName("billing-api")
    .setFullVersion("1.4.2+build.873")
    .build();
```

The gRPC service is `ServiceInfoService` with a single
`GetServiceInfo(GetServiceInfoRequest) returns (GetServiceInfoResponse)` RPC.

## Versioning

Versions track [`altessa-s/proto`](https://github.com/altessa-s/proto): a
`vX.Y.Z` tag on the schema repo produces the same release here, and the
`main` / `develop` branches follow the matching schema branches. Snapshots
from `main` are published as `<sha>-SNAPSHOT`.

## Contributing

This repository contains generated output only. To change what appears here,
edit the schemas or generation config in
[`altessa-s/proto`](https://github.com/altessa-s/proto); the next sync
regenerates and republishes these bindings.

## License

MIT — see [LICENSE](LICENSE).
