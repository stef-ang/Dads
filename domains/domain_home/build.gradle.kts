apply {
    from("$rootDir/domains/domain.gradle.kts")
}

dependencies {
    // domains
    "implementation"(project(":domain_common"))

    // libs
    "implementation"(project(":lib_database"))
    "implementation"(project(":lib_remote"))
}
