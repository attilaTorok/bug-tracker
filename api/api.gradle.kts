plugins {
	id("org.springframework.boot") version "2.2.4.RELEASE"
}

dependencies {
	implementation(project(":backend"))

	compile("org.springframework.boot:spring-boot-starter")

	implementation("org.springframework.boot:spring-boot-starter-data-rest")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("de.codecentric:spring-boot-admin-starter-client")
	implementation("de.codecentric:spring-boot-admin-starter-server")

	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	compileOnly("org.projectlombok:lombok")

	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
	testImplementation("org.springframework.security:spring-security-test")

	//developmentOnly("org.springframework.boot:spring-boot-devtools")

}