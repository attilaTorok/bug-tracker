package com.bugtracker.repository.domain

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id
import org.neo4j.ogm.annotation.NodeEntity

@NodeEntity
data class LabelEntity(@Id @GeneratedValue
                       var id: Long,
                       var name: String)