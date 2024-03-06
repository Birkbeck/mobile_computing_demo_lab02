package gr.gkortsaridis.lab2_mobilecomputing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val birthdayWish = findViewById<TextView>(R.id.birthday_wish)
        birthdayWish.text = getString(R.string.birthday_message, "George")
    }
}