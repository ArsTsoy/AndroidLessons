package kz.example.activitylesson.recycler_view.recycler_view_components

/**
 * @author Arslan Tsoy <t.me/arslantsoy> on 4/4/21
 */

interface ItemClickListener<T> {

    fun onClick(model: T): Unit
}