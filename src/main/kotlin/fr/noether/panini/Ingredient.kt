package fr.noether.panini

data class Ingredient(val regime: Regime) {
    fun isVegetarian(): Boolean {
        return regime == Regime.Vegetarian
    }

    companion object {
        fun vegan(): Ingredient {
            return Ingredient(Regime.Vegan)
        }

        fun vegetarian(): Ingredient {
            return Ingredient(Regime.Vegetarian)
        }
    }

}
