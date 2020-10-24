package com.rafael.numeroaleatorio

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {

    private val _numeroAleatorio = MutableLiveData<String>()
    val numeroAleatorio: LiveData<String>
        get() = _numeroAleatorio

    fun gerarNumero() {
        val numeros = List(11) { Random.nextInt(0, 9) }
        val numero = StringBuilder()
        for (i in 0..10) {
            numero.append(numeros[i])
        }
        _numeroAleatorio.value = numero.toString()
    }
}