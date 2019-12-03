package com.minhaopiniao.opiniaodetudo.model.repository

import com.minhaopiniao.opiniaodetudo.model.Review
import java.util.*

class ReviewRepository{

    private constructor()

    companion object {
        val instance : ReviewRepository = ReviewRepository()
    }

    private val data = mutableListOf<Review>()

    fun save(name: String, review: String) {
        data.add(Review(UUID.randomUUID().toString(), name, review));
    }

    fun listAll(): List<Review> {
        return data.toList()
    }

}