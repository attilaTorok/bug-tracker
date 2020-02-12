dependencies {
    //implementation project(':common') //to depend on another project
    implementation("org.springframework.boot:spring-boot-starter-data-neo4j")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

}