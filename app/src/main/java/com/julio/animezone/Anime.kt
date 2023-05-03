package com.julio.animezone

data class Anime(
    val id: Int,
    val title: String,
    val synopsis: String,
    val imageUrl: String, override val size: Int
) : List<Anime> {
    override fun contains(element: Anime): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<Anime>): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(index: Int): Anime {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: Anime): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<Anime> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: Anime): Int {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<Anime> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<Anime> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<Anime> {
        TODO("Not yet implemented")
    }
}
