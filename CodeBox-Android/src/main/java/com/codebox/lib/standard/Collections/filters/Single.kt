package com.codebox.lib.standard.Collections.filters


inline fun <T> Iterable<T>.singleIndex(predicate: (T) -> Boolean): Pair<T, Int> {
    var index = 0
    for (element in this) {
        if (predicate(element))
            return element to index
        index++
    }
    throw NoSuchElementException("Collection contains no element matching the predicate.")
}
