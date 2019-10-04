package com.example.movie_app.base

import com.example.movie_app.utils.Status
import java.util.*

class Resource<T> constructor(val status : Status, var data: T? = null, val message: String? = null, val date : Date? = null) {
    companion object{
        fun<T> success(data: T?, date: Date?) : Resource<T>{
            return Resource(status = Status.SUCCESS, data = data, date = date)
        }
        fun<T> error(msg: String?, )

    }


}