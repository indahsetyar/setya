package com.indahserba.app.data.model

import kotlinx.android.parcel.Parcelize

@Parcelize
data class News (
    val judul: String = "",
    val link: String = "",
    val poster: String= "",
    val tipe: String = "",
    val waktu: String = ""
) : Parcelable