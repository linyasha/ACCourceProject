package ru.linyashik.accourceproject

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class FragmentMoviesDetails: Fragment() {
    private var btnItemFilm: onClickListenerToMoveDetails? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_details, container, false)
        view.findViewById<FrameLayout>(R.id.back).apply{
            setOnClickListener{
                btnItemFilm?.moveToList()
            }
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is onClickListenerToMoveDetails) btnItemFilm = context
    }

    override fun onDetach() {
        super.onDetach()
        btnItemFilm = null
    }
}

