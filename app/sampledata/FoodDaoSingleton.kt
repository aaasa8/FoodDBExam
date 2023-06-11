package ddwu.com.mobile.fooddbexam

import android.content.Context

class FoodDaoSingleton(val context: Context) {

    companion object {
        private var instance : FoodDaoSingleton? = null
        private lateinit var context : Context

        fun getInstance(context: Context) : FoodDaoSingleton {
            return instance ?: synchronized(this) {
                FoodDaoSingleton(context).also {
                    this.context = context
                    instance = it
                }
            }
        }
    }

}