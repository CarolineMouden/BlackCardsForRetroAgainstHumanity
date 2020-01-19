package com.example.retroagainsthumanity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val B_SEL = "SELECTIONS"
    val B_CURRENT = "CURRENT"

    val selection = ArrayList<String>()
    val allCards = ArrayList<String>()
    val random = Random(1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        allCards.addAll(resources.getStringArray(R.array.cards_selection))
        action_next.setOnClickListener { nextCard() }
        action_reset.setOnClickListener { resetCards() }

        savedInstanceState?.getStringArrayList(B_SEL)?.let { selection.addAll(it) }
        savedInstanceState?.getString(B_CURRENT)?.let { current.text = it }

        if (current.text.isEmpty()) {
            nextCard()
        }
    }

    fun nextCard() {
        if (selection.isEmpty()) {
            resetCards()
        } else {
            val index = random.nextInt(selection.size)
            current.text = selection.get(index).replace("_B_", "_______")
            selection.removeAt(index)
        }
    }

    fun resetCards() {
        selection.clear()
        selection.addAll(allCards)
        nextCard()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(B_CURRENT, current.text.toString())
        outState.putStringArrayList(B_SEL, selection)
        super.onSaveInstanceState(outState)
    }
}
