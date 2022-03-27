package br.com.andersonchoren.conversordemoeda.model

interface IObserver {
    fun updateUI(data:MutableMap<String,Any>)
}