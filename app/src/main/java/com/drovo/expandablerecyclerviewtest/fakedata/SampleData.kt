package com.drovo.expandablerecyclerviewtest.fakedata

import com.drovo.expandablerecyclerviewtest.model.MainModel
import com.drovo.expandablerecyclerviewtest.model.SubItemModel

object SampleData {
    private val flowers = listOf(
        SubItemModel("Rose"),
        SubItemModel("Lilly"),
        SubItemModel("Tigar"),
        SubItemModel("Deer"),
        SubItemModel("Horse"),
    )

    val collections = listOf(
        MainModel("All flowers", flowers),
        MainModel("All Cars", flowers),
        MainModel("All Animals", flowers),
        MainModel("All Trees", flowers),
        MainModel("All Person", flowers),
        MainModel("All Cities", flowers)
    )
}