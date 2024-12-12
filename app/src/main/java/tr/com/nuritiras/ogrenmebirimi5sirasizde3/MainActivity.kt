package tr.com.nuritiras.ogrenmebirimi5sirasizde3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val isim= findViewById<EditText>(R.id.editTextText).text.toString()
        val soyisim= findViewById<EditText>(R.id.editTextText2).text.toString()

        button1.setOnClickListener {
            selamVer(isim)
        }

        button2.setOnClickListener {
            selamVer(isim, soyisim)
        }

    }

    fun selamVer(isim: String){
        Toast.makeText(this, "Merhaba $isim", Toast.LENGTH_SHORT).show()
    }

    fun selamVer(isim: String, soyisim: String){
        Toast.makeText(this, "İyi günler $isim $soyisim", Toast.LENGTH_SHORT).show()
    }
}