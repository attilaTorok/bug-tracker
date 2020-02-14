package com.backend.repository

import com.backend.repository.domain.ProjectEntity
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface ProjectRepository : Neo4jRepository<ProjectEntity, Long> {
}