package Data

import Domein.Product

interface Repository {
    fun listAndSort(): List<Product>
    fun addProduct(newProduct: Product): List<Product>
    fun sellProduct(name: String): List<Product>
}

class RepositoryImpl() : Repository {
    val snowboard_1 = Product("Joint", 87, 2)
    val snowboard_2 = Product("Burton", 98, 1)
    val snowboard_3 = Product("Atom", 79, 4)
    val snowboard_4 = Product("Solomon", 93, 3)

    private val listOfProduct = mutableListOf<Product>(snowboard_1, snowboard_2, snowboard_3, snowboard_4)

    override fun listAndSort(): List<Product> {
        return listOfProduct
    }

    //    override fun addProduct(newProduct: Product): List<Product> {
//        listOfProduct.add(newProduct)
//        return listOfProduct
//    }

    override fun addProduct(newProduct: Product): List<Product> {
        val result = listOfProduct.add(newProduct)
        return listOfProduct
    }

    override fun sellProduct(name: String): List<Product> {
        val delName = listOfProduct.find { it.name.lowercase() == name }
        listOfProduct.remove(delName)
        return listOfProduct
    }
}

