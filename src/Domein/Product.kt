package Domein

class Product(val name: String, val price: Int, val stiffness: Int) {
    override fun toString(): String {
        return "$name -> $price -> $stiffness"
    }
}