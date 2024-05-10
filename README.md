# Check spanner connectivity

## Build
```shell
mvn clean compile assembly:single
```
## Run
```shell
export GOOGLE_SPANNER_ENABLE_DIRECT_ACCESS=true
java -jar target/spannio-1.0-SNAPSHOT-jar-with-dependencies.jar
```
