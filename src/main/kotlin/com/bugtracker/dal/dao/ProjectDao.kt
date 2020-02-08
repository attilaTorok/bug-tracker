package com.bugtracker.dal.dao

import com.bugtracker.dal.transformer.EntityDTOMapper
import com.bugtracker.dal.transformer.ProjectMapper
import com.bugtracker.repository.ProjectRepository
import com.bugtracker.repository.domain.ProjectEntity
import com.bugtracker.service.domain.Project
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ProjectDao {

    @Autowired
    private lateinit var projectRepository: ProjectRepository

    @Autowired
    private lateinit var projectMapper: EntityDTOMapper<ProjectEntity, Project>

    fun findById(id: Long) = projectMapper.fromEntity(projectRepository.findById(id).get())

}