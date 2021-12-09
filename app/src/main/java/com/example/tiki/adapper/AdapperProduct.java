package com.example.tiki.adapper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tiki.R;

import java.util.List;

public class AdapperProduct extends RecyclerView.Adapter<AdapperProduct.AdapperProductViewHolder>  {

     private Context mcontext;
     private List<User> lUser;

    public AdapperProduct(Context mcontext) {
        this.mcontext = mcontext;
    }
    public void setData(List<User> l){
        this.lUser=l;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public AdapperProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_product,parent,false);
        return new AdapperProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapperProductViewHolder holder, int position) {
        User u =lUser.get(position);
        if(u==null)
            return;
        holder.img_p.setImageResource(u.get_image());
        holder.tv_caID.setText(u.get_category_id());
        holder.tv_nameP.setText(u.get_nameP());
    }

    @Override
    public int getItemCount() {
        if(lUser!=null){
            return lUser.size();
        }
        return 0;
    }

    //khởi tạo class viewholder
    public class AdapperProductViewHolder extends RecyclerView.ViewHolder {

        //thiết kết viewholder
        private ImageView img_p;
        private TextView tv_caID, tv_nameP;
        public AdapperProductViewHolder(@NonNull View itemView) {
            super(itemView);
            img_p = itemView.findViewById(R.id.image_product);
            tv_caID = itemView.findViewById(R.id.category_id);
            tv_nameP = itemView.findViewById(R.id.name_product);
        }
    }
}
