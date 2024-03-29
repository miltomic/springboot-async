# SpringBoot Service Starter Code

Boilerplate code for a typical Spring Boot Async service

### Prerequisites

What things you need to install the software and how to install them

* Installed [JDK 11](https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html)
* Environment variable ```JAVA_HOME``` needs to point to above JDK 11, e.g.```JAVA_HOME =/usr/lib/jvm/java-11-openjdk-amd64```

### Running

After all services in are started by docker compose just trigger Gradle ```bootRun``` task by executing one of the following:

* ```./gradlew bootRun``` on Linux environments
* ```gradlew bootRun``` on Windows

You can see available endpoints on http://localhost:8080/starter/swagger-ui/index.html

## Built With

* [Gradle](https://gradle.org/) - Dependency Management

## License

This project is licensed under the GNU General Public License - see the [LICENSE.md](LICENSE.md) file for details
