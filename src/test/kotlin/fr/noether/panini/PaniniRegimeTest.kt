package fr.noether.panini

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaniniRegimeTest {

    @Test
    internal fun `panini containing only one vegan ingredient should be vegan`() {
        val salad = Ingredient.vegan()
        val panini = Panini.empty()
            .addIngredient(salad)

        assertThat(panini.isVegan)
    }
}

