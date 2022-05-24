import Data.RepositoryImpl
import Domein.AddUseCase
import Domein.ListUseCase
import Domein.SellUseCase
import Domein.SortUseCase
import Presenter.Presenter
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val listOfProduct = RepositoryImpl()
    val listProduct = ListUseCase(listOfProduct)
    val sortProduct = SortUseCase(listOfProduct)
    val addProduct = AddUseCase(listOfProduct)
    val sellProduct = SellUseCase(listOfProduct)
    val presenter = Presenter(listProduct, sortProduct, addProduct, sellProduct)

    while (true) {
        println("User please enter command: list, sorted, add, sell, exit")
        val userInput = readln().lowercase()
        val result = presenter.UserCommand(userInput)
        if (result.isEmpty()) {
            println("End program!")
            exitProcess(0)
        } else {
            println(result)
        }
    }
}