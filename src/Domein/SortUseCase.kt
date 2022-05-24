package Domein

import Data.RepositoryImpl

class SortUseCase(val command: RepositoryImpl) {
    fun sortUseCase(): List<Product> {
        return command.listAndSort().sortedBy { it.name }
    }
}