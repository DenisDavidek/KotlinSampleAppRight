package sk.denis.davidek.androidkotlinsample.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by denisdavidek on 1/31/18.
 */
class ForecastListAdapter(private val items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ForecastViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
 return ForecastViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
    holder.textView.text = items[position]
    }

    override fun getItemCount(): Int = items.size

class ForecastViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}