package com.example.aulafragment.Fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.aulafragment.R

class ConversasFragment : Fragment() {
    private lateinit var btnExecutar: Button
    private lateinit var textNome: TextView
    private lateinit var editNome: EditText

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("ciclo_vida", "onAttachConversas")
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("ciclo_vida", "onCreateViewConversas")
        var view = inflater.inflate(R.layout.fragment_conversas, container, false)
        btnExecutar = view.findViewById(R.id.btn_executar)
        textNome = view.findViewById(R.id.textNome)
        editNome = view.findViewById(R.id.editTextNome)


        btnExecutar.setOnClickListener {
            var nome = editNome.text.toString()
            textNome.text = nome
        }
        return view

    }
//    Depreciado
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("ciclo_vida", "onViewCreatedConversas")
        super.onViewCreated(view, savedInstanceState)
    }
    override fun onStart() {
        Log.i("ciclo_vida", "onStartConversas")
        super.onStart()
    }

    override fun onResume() {
        Log.i("ciclo_vida", "onResumeConversas")
        super.onResume()
    }

    override fun onPause() {
        Log.i("ciclo_vida", "onPauseConversas")
        super.onPause()
    }

    override fun onStop() {
        Log.i("ciclo_vida", "onStopConversas")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("ciclo_vida", "onDestroyConversas")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("ciclo_vida", "onDetachConversas")
        super.onDetach()
    }
}