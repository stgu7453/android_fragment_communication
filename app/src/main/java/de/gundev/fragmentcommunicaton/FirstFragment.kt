package de.gundev.fragmentcommunicaton

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import java.lang.RuntimeException

class FirstFragment: Fragment() {

    interface OnFragmentInteractionListener {
        fun onFirstFragmentInteraction(text: String)
    }

    private var listener: OnFragmentInteractionListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView =  inflater.inflate(R.layout.first_fragment, container, false)

        val btn1 = rootView.findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            listener?.onFirstFragmentInteraction("Sending data from fragment1...")
        }

        return rootView
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener){
            listener = context
        }else{
            throw RuntimeException("$context must implement interface 'OnFragmentInteractionListener'")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


}
