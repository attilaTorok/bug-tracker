package com.bugtracker.service.domain

data class User(var id: Long,
                var name: String,
                var project: Project)