package ie.dorset.student_22711.ca1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Achievements: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.achievements)

        // to return to home page
        val returnButtonAchievements = findViewById<Button>(R.id.returnButtonAchievements)
        returnButtonAchievements.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        //to exit app
        val exitButtonAchievements = findViewById<Button>(R.id.exitButtonAchievements)
        exitButtonAchievements.setOnClickListener{
            finishAffinity()
        }
    }
}