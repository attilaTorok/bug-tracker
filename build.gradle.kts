plugins {
    id("java-library")
    id("org.springframework.boot") version "2.2.4.RELEASE" apply false
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    kotlin("jvm") version "1.3.61"
    kotlin("plugin.spring") version "1.3.61"
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    kotlinCompilerClasspath("org.jetbrains.kotlin:kotlin-stdlib")
    kotlinCompilerClasspath("org.jetbrains.kotlin:kotlin-script-runtime")
    kotlinCompilerClasspath("org.jetbrains.kotlin:kotlin-reflect")
    kotlinCompilerClasspath("org.jetbrains:annotations:13.0")
}

subprojects {

    group = "com.bugtracker"
    version = "0.0.1-SNAPSHOT"

    apply(plugin = "java")
    apply(plugin = "kotlin")
    apply(plugin = "io.spring.dependency-management")

    repositories {
        jcenter()
        mavenCentral()
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.boot:spring-boot-dependencies:2.2.4.RELEASE")
        }
    }

}