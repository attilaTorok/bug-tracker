package com.bugtracker.dal.transformer

import com.bugtracker.repository.domain.ProjectEntity
import com.bugtracker.service.domain.Project
import org.springframework.stereotype.Component

@Component
class ProjectMapper : EntityDTOMapper<ProjectEntity, Project> {

    override fun fromEntity(entity: ProjectEntity) = Project(
            entity.id,
            entity.name,
            entity.owner.id,
            entity.boards.map { it.id }
    )

}