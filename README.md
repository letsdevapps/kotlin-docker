# Kotlin Docker

## SDKMAN

Utilizei o sdk para gestão do kotlin e gradle. Teria a versão manual tambem (https://gradle.org/install/)

    curl -s "https://get.sdkman.io" | bash
    source "$HOME/.sdkman/bin/sdkman-init.sh"

    sdk install kotlin

    sdk install gradle 9.2.1

## Iniciar pelo gradle

    gradle init --type kotlin-application

## Build

Alterações no arquivo build.gradle.kts, por exemplo, adicionar manifest ao build para poder executar via "java -jar"

Config do manifest para Gradle (build.gradle.kts,)

    tasks.jar {
        manifest {
            attributes["Main-Class"] = "com.pro.AppKt" // Replace with your actual main class
        }
    }

Config do manifest para Maven (pom.xml)

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.3.0</version> <!-- Use a recent version -->
                <configuration>
                    <archive>
                        <manifest>
                            <addClasspath>true</addClasspath>
                            <mainClass>com.yourpackage.YourMainClassKt</mainClass> <!-- Replace with your actual main class -->
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>

## Compile & Run

    ./gradlew clean build

    ./gradlew run

    java -jar app/build/libs/app.jar

## Docker

    docker build -t kotlin-docker .
   
    docker run -it --rm --name kotlin-docker kotlin-docker

