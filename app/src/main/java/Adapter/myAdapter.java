package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.matkinson.xrecycleview.R;

import java.util.List;

import Model.ListItem;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private Context context;
    private List<ListItem> ListItems;

    public myAdapter(Context context, List listItems){
        this.context=context;
        this.ListItems=ListItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        public TextView name;
        public  TextView description;
        public ViewHolder(@NonNull View itemView){
            super(itemView);

            name=itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
        }
    }
}
