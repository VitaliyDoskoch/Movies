package com.doskoch.movies.database.modules.films.view

data class Film(
    var id: Long,
    var posterPath: String?,
    var title: String,
    var overview: String,
    var releaseDate: Long,
    var isFavourite: Boolean
)