package fr.noether.panini

data class Panini(val isVegan: Boolean = true, val isVegetarian: Boolean = false) {
    fun addIngredient(ingredient: Ingredient): Panini {
        if (this.isVegan && ingredient.isVegetarian()) {
            return Panini(false, true)
        }
        return Panini()
    }



    companion object {
        fun empty(): Panini {
            return Panini()
        }
    }

}
