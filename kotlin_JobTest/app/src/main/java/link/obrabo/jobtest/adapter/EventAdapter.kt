package link.obrabo.jobtest.adapter

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row_event.view.*
import link.obrabo.jobtest.R
import link.obrabo.jobtest.model.EventResponse


class EventAdapter(val movieList: ArrayList<EventResponse>, val activity: FragmentActivity?) :
        RecyclerView.Adapter<EventAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_event, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: EventAdapter.ViewHolder, position: Int) {
        holder.bindItems(movieList[position], position, activity, movieList)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(event: EventResponse, i: Int, activity: FragmentActivity?, list: ArrayList<EventResponse>) {

             itemView.txtAuthor.text = event.author
             itemView.txtBody.text = event.status
        }
    }

    public fun clean(){
        val size = movieList.size
        if (size > 0) {
            for (i in 0 until size) {
                movieList.removeAt(0)
            }
            this.notifyItemRangeRemoved(0, size)
        }
    }
}