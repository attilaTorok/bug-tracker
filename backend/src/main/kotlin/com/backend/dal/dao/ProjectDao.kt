package com.backend.dal.dao

import com.backend.dal.transformer.EntityDTOMapper
import com.backend.repository.ProjectRepository
import com.backend.repository.domain.ProjectEntity
import com.backend.service.domain.Project
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
