package ie.dorset.student_22711.ca1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Hobbies: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hobbies)

        // to return to home page
        val returnButtonHobbies = findViewById<Button>(R.id.returnButtonHobbies)
        returnButtonHobbies.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        //go to next activity Achievements
        val nextButtonHobbies = findViewById<Button>(R.id.nextButtonHobbies)
        nextButtonHobbies.setOnClickListener{
            val intent = Intent(this, Achievements::class.java)
            startActivity(intent)
        }
    }
}