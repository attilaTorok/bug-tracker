package com.backend.repository.domain

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id
import org.neo4j.ogm.annotation.NodeEntity

@NodeEntity
data class TicketEntity(@Id @GeneratedValue var id: Long,
                        var title: String,
                        var description: String)