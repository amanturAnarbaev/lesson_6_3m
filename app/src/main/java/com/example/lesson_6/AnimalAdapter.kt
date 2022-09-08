package com.example.lesson_6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AnimalAdapter(private val animal_list: ArrayList<Animal_class>) :
    RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_animal, parent, false)
        return AnimalViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
       holder.bind(animal_list.get(position))

    }

    override fun getItemCount(): Int {
        return animal_list.size

    }

    //View Holder
    inner class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val text: TextView = itemView.findViewById(R.id.text_item)

        fun bind(animal: Animal_class) {
            val image: ImageView = itemView.findViewById(R.id.image_item)
            text.text = animal.name
            Glide.with(image).load(animal.image).into(image)
        }
    }

}