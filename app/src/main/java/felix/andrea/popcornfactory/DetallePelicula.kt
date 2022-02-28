package felix.andrea.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*
import kotlinx.android.synthetic.main.pelicula.*


class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val bundle = intent.extras

        if(bundle != null){
            movie_image.setImageResource(bundle.getInt("header"))
            movie_title.setText(bundle.getString("nombre"))
            movie_description.setText(bundle.getString("sinopsis"))
        }

    }
}