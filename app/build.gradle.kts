
plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.guava)
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("5.12.1")
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "com.pro.AppKt" // Replace with your actual main class
}

//application {
//    mainClass.set("com.pro.AppKt") // Replace with your actual main class
//}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.pro.AppKt" // Replace with your actual main class
    }
}

/* Config do manifest para Maven
pom.xml
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
*/
