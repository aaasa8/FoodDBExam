package ddwu.com.mobile.fooddbexam

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ddwu.com.mobile.fooddbexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    lateinit var binding : ActivityMainBinding

//    lateinit var helper : FoodDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        helper = FoodDBHelper(this)

        binding.btnSelect.setOnClickListener{

        }

        binding.btnAdd.setOnClickListener{

        }

        binding.btnUpdate.setOnClickListener{

        }

        binding.btnRemove.setOnClickListener{

        }

    }

    fun addFood() {

    }

    fun modifyFood() {

    }

    fun deleteFood() {

    }

    fun showFoods() {
			val db = helper.readableDatabase
			val columns = null
			val selection = null
			val selectionArgs = null
			val cursor : Cursor = db.query(FoodDBHelper.TABLE_NAME, columns, selection, 
					selectionArgs, null, null, null, null)

			val foodList = arrayListOf<FoodDto>()

			with(cursor) {
				while(moveToNext()){
					val no = getInt(getColumnIndex(BaseColumns._ID))
					val food = getString(getColumnsIndex(FoodDBHelper,COL_FOOD))
					val country = getString(getColumnIndex(FoodDBHelper.COL_COUNTRY))
					val dto = FoodDto(no, food, country)
					foodList.add(dto)
				}
			}
			var result : String = ""

			for(dto in foodList){
					result += dto.toString() + "\n"
			}
			binding.tvDisplay.text = result
    }

}