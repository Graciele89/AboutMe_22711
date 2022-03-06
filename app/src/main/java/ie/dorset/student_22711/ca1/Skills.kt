package ie.dorset.student_22711.ca1

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Skills: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skills)

        // to return to home page
        val returnButtonSkills = findViewById<Button>(R.id.returnButtonSkills)
        returnButtonSkills.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        //go to next activity Hobbies
        val nextButtonSkills = findViewById<Button>(R.id.nextButtonSkills)
        nextButtonSkills.setOnClickListener{
            val intent = Intent(this, Hobbies::class.java)
            startActivity(intent)
        }
    }
}
