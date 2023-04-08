package com.drovo.expandablerecyclerviewtest.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.drovo.expandablerecyclerviewtest.R
import com.drovo.expandablerecyclerviewtest.databinding.ItemParentBinding
import com.drovo.expandablerecyclerviewtest.model.MainModel

class MainAdapter(
    private val collections: List<MainModel>
): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_parent, parent, false)
        return MainViewHolder(view)
    }

    override fun getItemCount() = collections.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collections[position]
            txtviwTitle.text = collection.title

            val subItemAdapter = SubItemAdapter(collection.subItemModels)
            recyclerviewSubItem.adapter = subItemAdapter

            cardviwParent.setOnClickListener {
                recyclerviewSubItem.visibility = if (recyclerviewSubItem.isShown) View.GONE else View.VISIBLE
            }
        }
    }

    inner class MainViewHolder(
        itemView: View
    ): RecyclerView.ViewHolder(
        itemView
    ){
        val binding: ItemParentBinding = ItemParentBinding.bind(itemView)
    }

}