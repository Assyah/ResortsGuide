package com.amr.assyahmuhammad.resortsguide;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListHolder> {

    List<ViewAdapter> resorts;
    public ListAdapter(List<ViewAdapter>resorts){
        this.resorts=resorts;
    }
    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row=LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_layout,parent,false);
        ListHolder holder=new ListHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(ListHolder holder, int position) {
        ViewAdapter resort=resorts.get(position);
        holder.name.setText(resort.name);
        holder.price.setText(resort.price);
    }

    @Override
    public int getItemCount() {
        return resorts.size();
    }

    class ListHolder extends RecyclerView.ViewHolder{
        TextView name, price;

        public ListHolder(View itemView) {
            super(itemView);
            name=(TextView) itemView.findViewById(R.id.resortname);
            price=(TextView) itemView.findViewById(R.id.resortprice);
        }
    }
}
