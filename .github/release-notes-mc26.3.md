WRNzoom `1.0-SNAPSHOT` compatibility prerelease for the Minecraft 26.3 Fabric client and Java 25. This is a client mod, not a Bukkit/Paper server plugin.

Download `untitled1-1.0-SNAPSHOT.jar` and place it in the client's `mods` folder. Install Fabric Loader >=0.20.0 and matching Fabric API for Minecraft 26.3 (>=0.163.0+26.3). `SHA256SUMS` contains the checksum of this exact release build.

The zoom key uses Minecraft 26.3's SDL-compatible C-key mapping. A prior smoke check against the Minecraft 26.3 runtime verified the key identity and pressed/released state. The release workflow performs a clean Gradle build before uploading the final runtime JAR; source JARs are excluded. This repository has no automated test sources. The visible FOV change and graphical in-game behavior were not tested.
