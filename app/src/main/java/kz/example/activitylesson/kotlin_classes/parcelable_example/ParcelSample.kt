package kz.example.activitylesson.kotlin_classes.parcelable_example

import android.os.Parcel
import android.os.Parcelable

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 3/31/21
 */


data class ParcelSample(
    val a: Int,
    val b: String,
    val parcelw: Parcelw
): Parcelable {

//    constructor(parcel: Parcel) : this(
//        parcel.readInt(),
//        parcel.readString() ?: ""
//    )
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeInt(a)
//        parcel.writeString(b)
//        parcel.writeParcelable()
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<ParcelSample> {
//        override fun createFromParcel(parcel: Parcel): ParcelSample {
//            return ParcelSample(parcel)
//        }
//
//        override fun newArray(size: Int): Array<ParcelSample?> {
//            return arrayOfNulls(size)
//        }
//    }
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readParcelable(Parcelw::class.java.classLoader) ?: Parcelw(1)
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(a)
        parcel.writeString(b)
        parcel.writeParcelable(parcelw, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ParcelSample> {
        override fun createFromParcel(parcel: Parcel): ParcelSample {
            return ParcelSample(parcel)
        }

        override fun newArray(size: Int): Array<ParcelSample?> {
            return arrayOfNulls(size)
        }
    }
}