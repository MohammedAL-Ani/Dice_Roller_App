package com.example.mango

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter



@BindingAdapter(value = ["app:setupDice"])
fun setupDice(view:View ,numDice:NumberRollDice?){
    when (numDice){
        NumberRollDice.dice1 -> {
            setType(view,R.drawable.dice_1,"1")

        }
        NumberRollDice.dice2 ->  {
            setType(view,R.drawable.dice_2,"2")

        }
        NumberRollDice.dice3 ->  {
            setType(view,R.drawable.dice_3,"3")

        }
        NumberRollDice.dice4 ->  {
            setType(view,R.drawable.dice_4,"4")

        }
        NumberRollDice.dice5 ->  {
            setType(view,R.drawable.dice_5,"5")

        }
        NumberRollDice.dice6 -> {
            setType(view, R.drawable.dice_6, "6")
        }
    }
}


fun  setType (view: View , idImage:Int,numberDice:String){
    if (view is ImageView)
        view.setImageResource(idImage)
    else
        (view as TextView).text = numberDice
}








