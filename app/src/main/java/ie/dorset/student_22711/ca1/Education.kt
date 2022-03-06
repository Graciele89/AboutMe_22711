package ie.dorset.student_22711.ca1

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Education: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.education)

        // to return to home page
        val returnButtonEducation = findViewById<Button>(R.id.returnButtonEducation)
        returnButtonEducation.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        //to go to next activity Skills
        val nextButtonEducation = findViewById<Button>(R.id.nextButtonEducation)
        nextButtonEducation.setOnClickListener{
            val intent = Intent(this, Skills::class.java)
            startActivity(intent)
        }
    }
}


