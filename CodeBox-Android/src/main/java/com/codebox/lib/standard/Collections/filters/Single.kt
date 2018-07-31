package com.codebox.lib.standard.Collections.filters


inline fun <T> Iterable<T>.itemIndexd(predicate: (T) -> Boolean): Pair<T, Int> {
    var index = 0
    for (element in this) {
        if (predicate(element))
            return element to index
        index++
    }
    throw NoSuchElementException("Collection contains no element matching the predicate.")
}

inline fun <T> Iterable<T>.itemIndexedNull(predicate: (T) -> Boolean): Pair<T, Int>? {
    var index = 0
    for (element in this) {
        if (predicate(element))
            return element to index
        index++
    }
    return null
}
