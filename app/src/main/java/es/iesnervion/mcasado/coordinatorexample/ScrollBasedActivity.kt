package es.iesnervion.mcasado.coordinatorexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.iesnervion.mcasado.coordinatorexample.databinding.ActivityMainBinding
import es.iesnervion.mcasado.coordinatorexample.databinding.ActivityScrollBasedBinding

class ScrollBasedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityScrollBasedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_scroll_based)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        binding.toolbar.title = title
        // You can add the code for your FAB also.
    }

}