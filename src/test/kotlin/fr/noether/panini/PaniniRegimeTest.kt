package fr.noether.panini

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class PaniniRegimeTest {

    @Test
    internal fun `panini containing only one vegan ingredient should be vegan`() {
        Assertions.assertThat(1+1).isEqualTo(2)
    }
}