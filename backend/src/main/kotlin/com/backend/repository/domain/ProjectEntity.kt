package com.backend.repository.domain

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

@NodeEntity
data class ProjectEntity(@Id @GeneratedValue
                         var id: Long,
                         var name: String,
                         var owner: UserEntity,
                         @Relationship
                         var boards: List<BoardEntity>)