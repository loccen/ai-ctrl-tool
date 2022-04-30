package com.github.loccen.aictrltool.services

import com.intellij.openapi.project.Project
import com.github.loccen.aictrltool.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
