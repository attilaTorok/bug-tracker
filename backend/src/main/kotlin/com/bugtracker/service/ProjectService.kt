package com.bugtracker.service

import com.bugtracker.dal.dao.ProjectDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProjectService {

    @Autowired
    private lateinit var projectDao: ProjectDao

    @Transactional(readOnly = true)
    fun findById(id: Long) = projectDao.findById(id)

}