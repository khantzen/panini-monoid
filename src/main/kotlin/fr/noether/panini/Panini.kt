package fr.noether.panini

data class Panini(val ingredient: Ingredient) {
    fun add(newIngredient: Ingredient): Panini {
        return Panini(this.ingredient.combineWith(newIngredient))
    }

    fun regime() : Regime = ingredient.regime

    companion object {
        fun empty(): Panini {
            return Panini(Ingredient.neutral())
        }
    }

}
