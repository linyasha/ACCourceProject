package ru.linyashik.accourceproject

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class FragmentMoviesList: Fragment() {
    private var btnItemFilm: onClickListenerToMoveDetails? = null
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_list, container, false)
        view.findViewById<CardView>(R.id.card).apply{
                setOnClickListener{
                    btnItemFilm?.moveToWatchDetailsFilm()
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
