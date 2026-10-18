# wrnzoom

Clientseitiger Fabric-Zoom-Mod für Minecraft **26.3**. Mit gedrückter Taste
**C** wird das Sichtfeld auf 30 gesetzt; beim Loslassen wird der vorherige
Wert wiederhergestellt.

## Voraussetzungen

- Minecraft 26.3 und Java 25
- Fabric Loader 0.20.0 oder neuer
- Fabric API 0.163.0+26.3 für Minecraft 26.3
- Zum Entwickeln: JDK 25 und Gradle 9.8.1 (Fabric Loom 1.19.1)

## Build und Installation

Im Repository mit JDK 25 und Gradle 9.8.1 ausführen:

```sh
gradle build
```

Der Checkout enthält nur die Wrapper-Konfiguration; deshalb wird ein
installiertes Gradle benötigt. Das Mod-JAR liegt anschließend unter
`build/libs/untitled1-1.0-SNAPSHOT.jar`. Dieses JAR zusammen mit der passenden
Fabric API in den `mods`-Ordner des Minecraft-26.3-Clients kopieren.

Für die Entwicklungsinstanz:

```sh
gradle runClient
```

Im Client prüfen, dass C das Sichtfeld auf 30 setzt und Loslassen den vorherigen
Wert wiederherstellt. Der Gradle-Build kompiliert den Clientcode; ein interaktiver
Clienttest benötigt eine grafische Sitzung.

Die CI baut mit Java 25 und Gradle 9.8.1. Für eine Cloud-Umgebung ohne grafische
Sitzung ist `gradle build` der Buildcheck.
