package com.github.erichsilvestre.intellijhttpcalltransformplugin.services

import com.intellij.openapi.project.Project
import com.github.erichsilvestre.intellijhttpcalltransformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
