package com.example.mango.ui



import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mango.NumberRollDice
import com.example.mango.model.RollDice
import com.example.mango.setImageDice


class ViewModelRollDice:ViewModel() {

   val rolldice = MutableLiveData<NumberRollDice>()
 //   private val rollDiceRespone = RollDice()
//    private val _rollDiceLive = MutableLiveData<RollDice>()
//    val rollDiceLive : LiveData<RollDice>
//    get() = _rollDiceLive


    fun setImageDiceRandomly(){

        rolldice.postValue(NumberRollDice.values().random())

    }



}