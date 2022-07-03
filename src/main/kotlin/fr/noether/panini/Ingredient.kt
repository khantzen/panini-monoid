package fr.noether.panini

data class Ingredient(val regime: Regime) {
    fun isVegetarian(): Boolean {
        return regime == Regime.Vegetarian
    }

    fun combineWith(other: Ingredient): Ingredient {
        return Ingredient(
            regime.combineWith(other.regime)
        )

    }

    companion object {
        fun vegan(): Ingredient {
            return Ingredient(Regime.Vegan)
        }

        fun vegetarian(): Ingredient {
            return Ingredient(Regime.Vegetarian)
        }

        fun neutral(): Ingredient {
            return Ingredient(Regime.Vegan)
        }
    }

}
