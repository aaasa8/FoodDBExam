package ddwu.com.mobile.fooddbexam

import android.content.Context

class FoodDao(val context: Context) {

    val foodList = ArrayList<FoodDto>()

    fun readFoods() : ArrayList<FoodDto> {
        return foodList
    }

    fun addFood(food: FoodDto) {

    }

    fun updateFood(food: FoodDto) {

    }

    fun deleteFood(id : Int) {

    }
}