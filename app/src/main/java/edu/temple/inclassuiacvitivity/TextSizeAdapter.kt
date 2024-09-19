package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val sizes: Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return sizes.size
    }

    override fun getItem(position: Int): Any {
        return sizes[position]
    }

    override fun getItemId(position: Int): Long {
        // Return the item's ID
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val textView = convertView as? TextView ?: TextView(context)
        val size = sizes[position]
        textView.text = size.toString()
        textView.textSize = 20f
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = convertView as? TextView ?: TextView(context)
        val size = sizes[position]
        textView.text = size.toString()
        textView.textSize = size.toFloat()
        return textView
    }
}
