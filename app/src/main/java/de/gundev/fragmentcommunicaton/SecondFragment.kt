package de.gundev.fragmentcommunicaton

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment: Fragment() {

    private var text: String? = null
    private lateinit var textView: TextView


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.second_fragment, container, false)

        textView = rootView.findViewById(R.id.messageTextView)

        return rootView
    }

    fun updateText(text: String){
        this.text = text
        textView.text = text
    }
}