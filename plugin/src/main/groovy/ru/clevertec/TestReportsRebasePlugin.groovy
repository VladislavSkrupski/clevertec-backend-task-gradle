package ru.clevertec

import org.gradle.api.Project
import org.gradle.api.Plugin

class TestReportsRebasePlugin implements Plugin<Project> {
    void apply(Project project) {
        project.tasks.register('moveToRootReportsDir') {
            dependsOn project.tasks.getByName('test')
            onlyIf {
                project.file("$project.buildDir/reports").exists()
            }
            doLast {
                ant.move(
                        file:
                                "$project.buildDir/reports",
                        todir:
                                "$project.rootDir/reports/$project.name")
            }
        }
    }
}
