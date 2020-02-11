package com.bugtracker.web.controller

import com.bugtracker.service.ProjectService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class ProjectController {

    @Autowired
    private lateinit var projectService: ProjectService

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/project/{id}")
    fun getProject(@PathVariable id: Long) = projectService.findById(id)



}
