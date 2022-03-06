package ie.dorset.student_22711.ca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

const val MAIN_ACT_KEY = "mainAct"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // Log.i(MAIN_ACT_KEY, "Hello, activity created")

//
//             val snackbar = Snackbar.make(this,frame_layout,"gracieleludwig@yahoo.com.br", Snackbar.LENGTH_INDEFINITE)
//             snackbar.setAction(this, "Close", View.OnContextClickListener {
//        Toast.makeText(this, "gracieleludwig@yahoo.com.br", Toast.LENGTH_LONG).show()
//           })
//            snackbar.show()
//       val emailButton = findViewById<Button>(R.id.emailButton)
//       Snackbar.make(this, "gracieleludwig@yahoo.com.br", Snackbar.LENGTH_LONG).show()

//        val contextView = findViewById<View>(R.id.emailButton)
//        Snackbar.make(contextView, R.string.my_email, Snackbar.LENGTH_SHORT)
//            .show()

        val educationButton = findViewById<Button>(R.id.educationButton)
        educationButton.setOnClickListener {
            val intent = Intent(this, Education::class.java)
            startActivity(intent)
        }

        val skillsButton = findViewById<Button>(R.id.skillsButton)
        skillsButton.setOnClickListener {
            val intent = Intent(this, Skills::class.java)
            startActivity(intent)
        }

        val hobbiesButton = findViewById<Button>(R.id.hobbiesButton)
        hobbiesButton.setOnClickListener {
            val intent = Intent(this, Hobbies::class.java)
            startActivity(intent)
        }

        val achievementsButton = findViewById<Button>(R.id.achievementsButton)
        achievementsButton.setOnClickListener {
            val intent = Intent(this, Achievements::class.java)
            startActivity(intent)
        }
        Toast.makeText(this, "gracieleludwig@yahoo.com.br", Toast.LENGTH_LONG).show()
    }
}