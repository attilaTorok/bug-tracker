package com.bugtracker.repository.domain

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id
import org.neo4j.ogm.annotation.NodeEntity

@NodeEntity
data class BoardEntity(@Id @GeneratedValue var id: Long,
                       var name: String,
                       var labels: List<LabelEntity>,
                       var tickets: List<TicketEntity>)