package com.example.ums

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ums.databinding.ItemListBinding

class CustomAdapter(val list: List<User>,val custom:OnItemClickListener): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    inner class  ViewHolder(val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User){
            binding.apply {
                tvName.text = user.name
                tvCode.text = user.code
                tvRecourse.text = user.maluot
            }

            binding.root.setOnClickListener{
                custom.onItemClick(adapterPosition)
            }
        }
    }
    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(list[position])
    }
}
