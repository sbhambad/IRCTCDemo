package com.zuneeue.irctcinfo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zuneeue.irctcinfo.R;
import com.zuneeue.irctcinfo.models.routes.Route;

import java.util.List;

/**
 * Created by chinmaynaphade on 03/03/16.
 */
public class TrainScheduleListAdapter extends RecyclerView.Adapter<TrainScheduleListAdapter.ViewHolder> {
    List<Route> mItems;

    public TrainScheduleListAdapter(List<Route> items) {
        super();
        mItems = items;
    }

    public void addAll(List<Route> items) {
        mItems = items;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.recycler_train_schedule, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.no.setText(mItems.get(position).getNo() + "");
        holder.station.setText(mItems.get(position).getFullname());
        holder.state.setText(mItems.get(position).getState());
        holder.day.setText(mItems.get(position).getDay() + "");
        holder.arrival.setText(mItems.get(position).getScharr());
        holder.departure.setText(mItems.get(position).getSchdep());
        holder.distance.setText(mItems.get(position).getDistance() + "");
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView no, station, state, day, arrival, departure, distance;

        public ViewHolder(View itemView) {
            super(itemView);
            no = (TextView) itemView.findViewById(R.id.no);
            station = (TextView) itemView.findViewById(R.id.station);
            state = (TextView) itemView.findViewById(R.id.state);
            day = (TextView) itemView.findViewById(R.id.day);
            arrival = (TextView) itemView.findViewById(R.id.arrival);
            departure = (TextView) itemView.findViewById(R.id.departure);
            distance = (TextView) itemView.findViewById(R.id.distance);

        }
    }
}
