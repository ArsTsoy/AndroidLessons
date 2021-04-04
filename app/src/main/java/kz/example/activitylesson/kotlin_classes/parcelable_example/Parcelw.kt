package kz.example.activitylesson.kotlin_classes.parcelable_example

import android.os.Parcel
import android.os.Parcelable

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 3/31/21
 */

class Parcelw(
    val a: Int
): Parcelable {
    constructor(parcel: Parcel) : this(parcel.readInt())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(a)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Parcelw> {
        override fun createFromParcel(parcel: Parcel): Parcelw {
            return Parcelw(parcel)
        }

        override fun newArray(size: Int): Array<Parcelw?> {
            return arrayOfNulls(size)
        }
    }
}