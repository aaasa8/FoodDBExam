package ddwu.com.mobile.fooddbexam

data class FoodDto(val no: Int, var food: String, var country: String) {
    override fun toString() = "$no - $food ( $country )"
}
