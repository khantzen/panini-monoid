package fr.noether.panini

import javax.print.attribute.standard.MediaSize.Other

enum class Regime {
    Vegan,
    Vegetarian;

    fun combineWith(other: Regime): Regime {
        if (this == Vegan) {
            return other;
        }
        return this;
    }

}
