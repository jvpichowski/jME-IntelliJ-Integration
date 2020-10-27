package com.github.jvpichowski.jmeintellijintegration.services

import com.intellij.openapi.project.Project
import com.github.jvpichowski.jmeintellijintegration.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
