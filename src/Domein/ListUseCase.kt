package Domein

import Data.RepositoryImpl

class ListUseCase(val product: RepositoryImpl) {
    fun listUseCase(): List<Product> {
        return product.listAndSort().shuffled()
    }
}