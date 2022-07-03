package fr.noether.panini

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaniniRegimeTest {

    @Test
    internal fun `panini containing only one vegan ingredient should be vegan`() {
        val bread = Ingredient.vegan()
        val panini = Panini.empty()
            .add(bread)

        assertThat(panini.regime()).isEqualTo(Regime.Vegan)
    }

    @Test
    internal fun `panini containing only one vegetarian ingredient should be vegetarian`() {
        val cheese = Ingredient.vegetarian()
        val panini = Panini.empty()
            .add(cheese)

        assertThat(panini.regime()).isEqualTo(Regime.Vegetarian)
    }
}

