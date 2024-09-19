package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val sizes: Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        // Return the number of items in the array
        return sizes.size
    }

    override fun getItem(position: Int): Any {
        // Return the size at the given position
        return sizes[position]
    }

    override fun getItemId(position: Int): Long {
        // Return the item's ID (in this case, we just return the position as the ID)
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val context = parent?.context ?: throw IllegalStateException("Parent view group is null")
        val textView = convertView as? TextView ?: TextView(context)

        // Set the text and size for each dropdown item based on the array
        val size = sizes[position]
        textView.text = size.toString()

        // Set the text size to represent the size value when in dropdown
        textView.textSize = size.toFloat()

        return textView
    }
}
