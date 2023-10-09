package uz.ikhtidev.mobilemp2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import uz.ikhtidev.mobilemp2.databinding.ActivityMainBinding
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            btnFriedChines1.setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Fried Chines taomlarini buyurtma berdingiz :)",
                    Toast.LENGTH_SHORT
                ).show()
            }
            btnFriedChines1.setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Fried Chines taomlarini buyurtma berdingiz :)",
                    Toast.LENGTH_SHORT
                ).show()
            }
            btnHotDeal.setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Burger va Do'stlar nomli taomnomamiz sizga yoqadi deb umid qilamiz!!!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    fun bottomBtnClick(view: View) {

        clearBottomContentColor()
        val myView = view as LinearLayout
        val icon = myView.getChildAt(0) as ImageView
        val text = myView.getChildAt(1) as TextView

        icon.setColorFilter(resources.getColor(R.color.colorRed))
        text.setTextColor(resources.getColor(R.color.colorRed))
    }

    private fun clearBottomContentColor() {
        binding.iconHome.setColorFilter(resources.getColor(R.color.iconColor))
        binding.iconOrders.setColorFilter(resources.getColor(R.color.iconColor))
        binding.iconSearch.setColorFilter(resources.getColor(R.color.iconColor))
        binding.iconProfile.setColorFilter(resources.getColor(R.color.iconColor))

        binding.tvHome.setTextColor(resources.getColor(R.color.iconColor))
        binding.tvOrders.setTextColor(resources.getColor(R.color.iconColor))
        binding.tvSearch.setTextColor(resources.getColor(R.color.iconColor))
        binding.tvProfile.setTextColor(resources.getColor(R.color.iconColor))
    }
}