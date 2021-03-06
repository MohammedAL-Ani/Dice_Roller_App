package com.example.mango.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mango.util.NumberRollDice

class ViewModelRollDice : ViewModel() {

    private val _rolldice = MutableLiveData<NumberRollDice>(NumberRollDice.dice1)
    val rolldice: LiveData<NumberRollDice>
        get() = _rolldice


    fun setRollDiceRandomly() {

        _rolldice.postValue(NumberRollDice.values().random())

    }

}