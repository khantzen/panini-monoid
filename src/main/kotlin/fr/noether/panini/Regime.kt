package fr.noether.panini

import javax.print.attribute.standard.MediaSize.Other

enum class Regime(val order: Int) {
    Vegan(order = 0),
    Vegetarian(order = 1),
    Pescetarian(order = 2);

    fun combineWith(other: Regime) =
        if (this.order > other.order) {
            this
        } else {
            other
        }

}
