package com.backend.service.domain

data class Project(var id: Long,
                   var name: String,
                   var ownerId: Long,
                   var boardIds: List<Long>)