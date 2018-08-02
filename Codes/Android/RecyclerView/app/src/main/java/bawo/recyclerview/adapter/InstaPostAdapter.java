package bawo.recyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import bawo.recyclerview.DetailActivity;
import bawo.recyclerview.R;
import bawo.recyclerview.model.InstagramPost;

public class InstaPostAdapter extends RecyclerView.Adapter<InstaPostAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<InstagramPost> datasets;
    public InstaPostAdapter(Context context, ArrayList<InstagramPost> datasets){
        this.context = context;
        this.datasets = datasets;
    }
    @NonNull
    @Override
    public InstaPostAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //getting our xml
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull InstaPostAdapter.MyViewHolder holder, int position) {
            InstagramPost instagramPost = datasets.get(position);
            holder.imageView.setImageResource(instagramPost.getImageId());
            holder.textView.setText(instagramPost.getTitle());
    }

    @Override
    public int getItemCount() {
        return datasets.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.itemView_imageVies_image);
            textView = itemView.findViewById(R.id.itemView_textView_title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("index", getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }
}
