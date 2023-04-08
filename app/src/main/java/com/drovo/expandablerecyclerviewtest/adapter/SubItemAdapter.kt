package com.drovo.expandablerecyclerviewtest.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.drovo.expandablerecyclerviewtest.R
import com.drovo.expandablerecyclerviewtest.databinding.ItemSubListBinding
import com.drovo.expandablerecyclerviewtest.model.SubItemModel

class SubItemAdapter(
    private val subItemModels: List<SubItemModel>
): RecyclerView.Adapter<SubItemAdapter.SubItemViewHolder>() {

    inner class SubItemViewHolder(
        itemView: View
    ): RecyclerView.ViewHolder(
        itemView
    ){
        val binding: ItemSubListBinding = ItemSubListBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_sub_list, parent, false)
        return SubItemViewHolder(view)
    }

    override fun getItemCount() = subItemModels.size

    override fun onBindViewHolder(holder: SubItemViewHolder, position: Int) {
        holder.binding.apply {
            txtciwName.text = subItemModels[position].subItemTitle
        }
    }

}