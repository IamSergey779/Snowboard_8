package Presenter

import Domein.*

class Presenter(
    val listProduct: ListUseCase,
    val sortProduct: SortUseCase,
    val addProduct: AddUseCase,
    val sellProduct: SellUseCase
) {
    fun UserCommand(userInput: String): List<Product> {
        return if (userInput == "list") {
            listProduct.listUseCase()
        } else if (userInput == "sorted") {
            sortProduct.sortUseCase()
        } else if (userInput == "add") {
            println(
                """
                Please input new product in the format:
                Name snowboard, price snowboard, stiffness snowboard
            """.trimIndent()
            )
            val addNewProduct = readln().lowercase()
            addProduct.addUseCase(addNewProduct)
        } else if (userInput == "sell") {
            println("Please input name sell product")
            val sellName = readln().toString().lowercase()
            sellProduct.sellUseCase(sellName)
        } else listOf()
    }
}