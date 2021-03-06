package curso_intermedio.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.curso_php.R;

import java.util.ArrayList;

import curso_intermedio.temas.Temain_4;

public class AdapIT4 extends RecyclerView.Adapter<AdapIT4.MyViewHolder> {
    Context context;
    ArrayList<Temain_4> tema4s;

    public AdapIT4 (Context c, ArrayList<Temain_4> tm4){
        context = c;
        tema4s = tm4;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.row_inter4,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvti4_titulo.setText(tema4s.get(position).getTitulo4i());
        holder.tvti4_descripcion.setText(tema4s.get(position).getDescripcion4i());

        Glide.with(context)
                .load(tema4s.get(position).getImage4i())
                .into(holder.imageti4);
}

    @Override
    public int getItemCount() {
        return tema4s.size();
    }
/////////////////////////////////////////////////////////////////////////////
    class  MyViewHolder extends  RecyclerView.ViewHolder{

        TextView tvti4_titulo,tvti4_descripcion;
        ImageView imageti4;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvti4_titulo = (TextView) itemView.findViewById(R.id.tvti4_titulo);
            tvti4_descripcion = (TextView) itemView.findViewById(R.id.tvti4_descripcion);

            imageti4 = (ImageView) itemView.findViewById(R.id.imageti4);

        }
    }
}
