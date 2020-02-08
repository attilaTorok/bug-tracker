package com.bugtracker.service.domain

data class Board(var id: Long,
                 var name: String,
                 var labels: List<Label>,
                 var tickets: List<Ticket>)