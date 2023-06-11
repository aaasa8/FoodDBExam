package ddwu.com.mobile.fooddbexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ddwu.com.mobile.fooddbexam.databinding.ActivityRemoveBinding

class RemoveActivity : AppCompatActivity() {

    lateinit var removeBinding : ActivityRemoveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        removeBinding = ActivityRemoveBinding.inflate(layoutInflater)
        setContentView(removeBinding.root)
    }
}