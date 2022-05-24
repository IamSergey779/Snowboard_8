package Domein

import Data.RepositoryImpl

class SellUseCase(val product: RepositoryImpl) {

    fun sellUseCase(name: String): List<Product> {
        return product.sellProduct(name)
    }
}