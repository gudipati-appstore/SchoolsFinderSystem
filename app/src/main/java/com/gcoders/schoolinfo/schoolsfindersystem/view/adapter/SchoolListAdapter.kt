package com.gcoders.schoolinfo.schoolsfindersystem.view.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.gcoders.schoolinfo.schoolsfindersystem.R
import com.gcoders.schoolinfo.schoolsfindersystem.model.SchoolListInfo


class SchoolListAdapter(private val schoolListInfoObject: List<SchoolListInfo>, private val buttonClick: SchoolInfoClickListener) : RecyclerView.Adapter<SchoolListAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolListAdapter.MyViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val imageView = inflater.inflate(R.layout.school_list_data, parent, false)

        return MyViewHolder(imageView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val schoolContent = schoolListInfoObject[position]

        holder.textview_school_name.text = (position + 1).toString() + ". " + schoolContent.schoolName
        holder.textview_school_name.setOnClickListener { buttonClick.onSchoolInfoClick(schoolContent) }

    }

    override fun getItemCount(): Int {
        return schoolListInfoObject.size
    }


    interface SchoolInfoClickListener {
        fun onSchoolInfoClick(schoolListInfo: SchoolListInfo)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textview_school_name: TextView

        init {
            textview_school_name = itemView.findViewById(R.id.textview_school_name)
        }
    }
}
