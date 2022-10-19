package kr.ac.kumoh.s20190703.prof.w0702explicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20190703.prof.w0702explicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExplicitIntent.setOnClickListener{
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }
        binding.btnImplicitIntent.setOnClickListener{
            val uri = Uri.parse("https://www.youtube.com/results?search_query=" +
                    binding.EditText.text)
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
            //https://www.youtube.com/results?search_query=%EC%95%84%EC%9D%B4%EC%9C%A0+%EB%85%B8%EB%9E%98%EB%B0%A9
        }

    }
}