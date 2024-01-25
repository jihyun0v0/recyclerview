package com.example.recyclerview

import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.RecyclerView.Adapter

class MainAdapter() : Adapter, Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainAdapter> {
        override fun createFromParcel(parcel: Parcel): MainAdapter {
            return MainAdapter(parcel)
        }

        override fun newArray(size: Int): Array<MainAdapter?> {
            return arrayOfNulls(size)
        }
    }
}