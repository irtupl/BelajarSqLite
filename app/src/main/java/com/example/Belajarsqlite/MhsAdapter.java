package com.example.Belajarsqlite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cobarecyclerview.R;

import java.util.ArrayList;

public class MhsAdapter extends RecyclerView.Adapter<MhsAdapter.MhsVH> {

    private ArrayList<MhsModel> mhsList ;

    public MhsAdapter(ArrayList<MhsModel> mhsList) {
        this.mhsList = mhsList;
    }

    @NonNull
    @Override
    public MhsVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater LayoutInflater = android.view.LayoutInflater.from(parent.getContext());
        View V = LayoutInflater.inflate(R.layout.item_listmhs, parent, false);

        return new MhsVH(V);
    }

    @Override
    public void onBindViewHolder(@NonNull MhsVH holder, int position) {
        int evenNumber = 0;
        if(position == 0) {
            evenNumber = 1;
        }else if(position==1) {
            evenNumber = 3;
        }else if(position==2) {
            evenNumber = 5;
        }else if(position==3) {
            evenNumber = 7;
        }else if(position==4) {
            evenNumber = 9;
        }else{
            evenNumber = 00;
        }
        holder.tvNamaVal.setText(mhsList.get(position).getNama());
        holder.tvNimVal.setText(mhsList.get(position).getNim());
        holder.tvNoHpVal.setText(mhsList.get(position).getNohp());

    }

    @Override
    public int getItemCount() {
        return mhsList.size();
    }

    public class MhsVH extends RecyclerView.ViewHolder {

        private TextView tvNamaVal, tvNimVal, tvNoHpVal;

        public MhsVH(@NonNull View itemView) {
            super(itemView);

            tvNamaVal = itemView.findViewById(R.id.tvNamaVal);
            tvNimVal = itemView.findViewById(R.id.tvNimVal);
            tvNoHpVal = itemView.findViewById(R.id.tvNoHpVal);

        }
    }
}
