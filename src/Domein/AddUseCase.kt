package Domein

import Data.RepositoryImpl

class AddUseCase(val command: RepositoryImpl) {

    fun addUseCase(addNewProduct: String): List<Product> {
        val arrayUserProduct = addNewProduct.split(", ")
        val name = arrayUserProduct[0].replaceFirstChar { it.uppercase() }
        val price = arrayUserProduct[1].toInt()
        val stiffness = arrayUserProduct[2].toInt()
        val newProduct = Product(name, price, stiffness)
        return command.addProduct(newProduct)
    }
}