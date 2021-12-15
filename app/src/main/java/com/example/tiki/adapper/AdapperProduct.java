package com.example.tiki.adapper;

import static android.widget.Toast.makeText;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.tiki.MainActivity;
import com.example.tiki.R;
import com.example.tiki.module.entity.ItemsItem;
import com.example.tiki.module.entity.Response;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapperProduct extends RecyclerView.Adapter<AdapperProduct.AdapperProductViewHolder>  {

     private Context mcontext;
     private List<ItemsItem> lItem;
    private ItemClickListener clickListener;

    public AdapperProduct(List<ItemsItem> lItem) {
        this.lItem = lItem;
    }

    public AdapperProduct(Context mcontext) {
        this.mcontext = mcontext;
    }
    public void setData(List<ItemsItem> l){
        this.lItem=l;
        notifyDataSetChanged();
    }

    public AdapperProduct(Context mcontext, List<ItemsItem> lItem, ItemClickListener clickListener) {
        this.mcontext = mcontext;
        this.lItem = lItem;
        this.clickListener = clickListener;
    }

    public AdapperProduct(Context mcontext, List<ItemsItem> lItem) {
        this.mcontext = mcontext;
        this.lItem = lItem;
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
        ItemsItem u =lItem.get(position);
        String url;
        if(u==null)
            return;
        url= u.getImages().get(0);
        Picasso.get().load(url+"").into(holder.img_p);
        //Log.d("dgdfg",""+u.getImages2()+"---| ");
        holder.tv_nameP.setText(u.getTitle()+"");
        holder.ClickItem(u);
        //holder.tv_caID.setText(u.getCategoryId()+ " ");

//        holder.img_p.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mcontext, "Data has been saved successfully!", Toast.LENGTH_LONG).show();
//                Log.d("---> nhấn", "test");
//            }
//        });
    }

    @Override
    public int getItemCount() {
        if(lItem!=null){
            return lItem.size();
        }
        return 0;
    }

    //khởi tạo class viewholder
    public class AdapperProductViewHolder extends RecyclerView.ViewHolder {

        //private ItemCar
        //thiết kết viewholder
        private final ImageView img_p;
        private final TextView tv_nameP;// tv_caID, tv_nameP;
        public AdapperProductViewHolder(@NonNull View itemView) {
            super(itemView);
            img_p = itemView.findViewById(R.id.img_Product);
            //tv_caID = itemView.findViewById(R.id.category_id);
            tv_nameP = itemView.findViewById(R.id.name_product);
        }
        public void ClickItem(ItemsItem i){

            img_p.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("---> nhấn", "test   "+i.getTitle());
                    //Toast.makeText(mcontext, "dfsdfsdfs", Toast.LENGTH_LONG).show();
                }
            });
        }
    }
    public interface ItemClickListener{
        public void onClickItems(ItemsItem itemsItem);
    }

}
