package fr.noether.panini

data class Panini(val isVegan: Boolean = true) {
    fun addIngredient(salad: Ingredient): Panini {
        return Panini()
    }



    companion object {
        fun empty(): Panini {
            return Panini()
        }
    }

}
