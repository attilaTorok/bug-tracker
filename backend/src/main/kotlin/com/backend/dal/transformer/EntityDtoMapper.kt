package com.backend.dal.transformer

interface EntityDTOMapper<in E, out D> {

    fun mapFromEntities(entities: Collection<E>): Collection<D> {
        return entities.map { fromEntity(it) }
    }

    fun fromEntity(entity: E): D

}