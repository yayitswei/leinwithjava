# leinwithjava

Library to illustrate an issue compiling Java files in Leiningen projects.

`lein run` will run the project, but will always compile the Java source in main/java/, even if the file is stale.

## Usage

Try `lein run` multiple times and observe that Leiningen compiles the Java source each time. Tested with `Leiningen 2.3.2 on Java 1.6.0_51 Java HotSpot(TM) 64-Bit Server VM`.
