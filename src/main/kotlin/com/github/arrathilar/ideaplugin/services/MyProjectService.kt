package com.github.arrathilar.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.arrathilar.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
