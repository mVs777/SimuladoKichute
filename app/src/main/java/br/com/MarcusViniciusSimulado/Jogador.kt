package br.com.MarcusViniciusSimulado

import android.os.Parcel
import android.os.Parcelable


data class Jogador (val jogadorNome: String, val jogadorClasse: String) : Parcelable{
    constructor(parcel: Parcel)  : this(
        parcel.readString(),
        parcel.readString())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(jogadorNome)
        parcel.writeString(jogadorClasse)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Jogador> {
        override fun createFromParcel(parcel: Parcel): Jogador {
            return Jogador(parcel)
        }

        override fun newArray(size: Int): Array<Jogador?> {
            return arrayOfNulls(size)
        }
    }


}