package com.example.movie_app.data.model

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
@Entity(primaryKeys = ["id"])
data class MovieEntity(

    @PrimaryKey(autoGenerate = true)
    @SerializedName("id")
    @Expose
    private val id: Long? = null,

    @SerializedName(value = "header", alternate = ["title", "name"])
    @Expose
    private val header: String? = null,

    @SerializedName("poster_path")
    @Expose
    private val posterPath: String? = null,

    @SerializedName(value = "description", alternate = ["",""])
    private val description: String? = null,

    @SerializedName("release_date")
    @Expose
    private val releaseDate: String? = null,

    @SerializedName("runtime")
    @Expose
    private val runTime: Long? = null,

    @SerializedName("status")
    @Expose
    private val status: String? = null
) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readValue(Long::class.java.classLoader) as? Long,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Long::class.java.classLoader) as? Long,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(header)
        parcel.writeString(posterPath)
        parcel.writeString(description)
        parcel.writeString(releaseDate)
        parcel.writeValue(runTime)
        parcel.writeString(status)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MovieEntity> {
        override fun createFromParcel(parcel: Parcel): MovieEntity {
            return MovieEntity(parcel)
        }

        override fun newArray(size: Int): Array<MovieEntity?> {
            return arrayOfNulls(size)
        }
    }

}