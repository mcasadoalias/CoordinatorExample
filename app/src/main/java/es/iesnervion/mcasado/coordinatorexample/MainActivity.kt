package es.iesnervion.mcasado.coordinatorexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.iesnervion.mcasado.coordinatorexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        binding.btnLayoutBased.setOnClickListener {
            startActivity(Intent(this, LayoutBasedActivity::class.java))
        }

        binding.btnScrollBased.setOnClickListener {
            startActivity(Intent(this, ScrollBasedActivity::class.java))

        }
    }

}