package com.github.bayofmany.manictimeintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.bayofmany.manictimeintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
