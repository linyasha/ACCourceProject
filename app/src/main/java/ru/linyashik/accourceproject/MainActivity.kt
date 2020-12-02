package ru.linyashik.accourceproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), onClickListenerToMoveDetails {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.main_container, FragmentMoviesList())
                    .commit()
        }
    }
    override fun moveToWatchDetailsFilm() {
        supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.main_container, FragmentMoviesDetails())
                .commit()
    }
    override fun moveToList() {
       var count = supportFragmentManager.backStackEntryCount
        if(count == 0) super.onBackPressed()
        else supportFragmentManager.popBackStack()
    }
}
    
