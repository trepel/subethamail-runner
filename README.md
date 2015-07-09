# subethamail-runner
Simple maven project that starts SubEtha SMTP server. Then it waits until you press any non-whitespache key and Enter. After that it reads all messages and stops the SubEtha SMTP server.

You can import this as a maven project to your favourite IDE and run it via IDE.

You can also use command line.

```
mvn clean package
cd target
java -jar subethamail-runner-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```
