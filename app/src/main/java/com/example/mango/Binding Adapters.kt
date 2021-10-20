package com.example.mango


import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter


@BindingAdapter(value = ["Mohammed"])
fun setImageDice(view:ImageView ,numDice:NumberRollDice?){
    when (numDice){
        NumberRollDice.dice1 -> view.setImageResource(R.drawable.dice_1)
        NumberRollDice.dice2 -> view.setImageResource(R.drawable.dice_2)
        NumberRollDice.dice3 -> view.setImageResource(R.drawable.dice_3)
        NumberRollDice.dice4 -> view.setImageResource(R.drawable.dice_4)
        NumberRollDice.dice5 -> view.setImageResource(R.drawable.dice_5)
        NumberRollDice.dice6 -> view.setImageResource(R.drawable.dice_6)

    }
}

