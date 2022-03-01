package br.com.bittencourt.lottery.commons.mappers

interface ResponseMapper<R,D> {
    fun toDomain(response: R): D
}