package com.backend.dal.transformer

import com.backend.repository.domain.ProjectEntity
import com.backend.service.domain.Project
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