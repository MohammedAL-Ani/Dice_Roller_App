package com.example.mango

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter



@BindingAdapter(value = ["setupDice"])
fun setupDice(view:View ,numDice:NumberRollDice?){

    when (numDice){
        NumberRollDice.dice1 -> {

            if (view is ImageView)
                view.setImageResource(R.drawable.dice_1)
            else
                (view as TextView).text = "1"
        }
        NumberRollDice.dice2 ->  {
            if (view is ImageView)
                view.setImageResource(R.drawable.dice_2)
            else
                (view as TextView).text = "2"
        }
        NumberRollDice.dice3 ->  {
            if (view is ImageView)
                view.setImageResource(R.drawable.dice_3)
            else
                (view as TextView).text = "3"
        }
        NumberRollDice.dice4 ->  {
            if (view is ImageView)
                view.setImageResource(R.drawable.dice_4)
            else
                (view as TextView).text = "4"
        }
        NumberRollDice.dice5 ->  {
            if (view is ImageView)
                view.setImageResource(R.drawable.dice_5)
            else
                (view as TextView).text = "5"
        }
        NumberRollDice.dice6 ->  {
            if (view is ImageView)
                view.setImageResource(R.drawable.dice_6)
            else
                (view as TextView).text = "6"
        }
    }

}




