package com.backend.service.domain

data class User(var id: Long,
                var name: String,
                var project: Project)