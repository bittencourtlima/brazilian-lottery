package br.com.bittencourt.lottery.core.mappers

interface ResponseMapper<R,D> {
    fun toDomain(response: R): D
}