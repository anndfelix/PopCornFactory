package felix.andrea.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnInicio: Button = findViewById(R.id.button_inicio) as Button

        btnInicio.setOnClickListener {
            var intent: Intent = Intent(this,InicioActivity::class.java)
            startActivity(intent)
        }


    }
}