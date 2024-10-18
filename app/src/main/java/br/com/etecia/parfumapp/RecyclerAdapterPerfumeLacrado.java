package br.com.etecia.parfumapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterPerfumeLacrado extends RecyclerView.Adapter<RecyclerAdapterPerfumeLacrado.ViewHolder> {

    //criando variaveis globais para representar a lista e o contexto
    private Context context;
    private List<PerfumeLacrado> lstPerfumeLacrado;


    //criando o construtor
    public RecyclerAdapterPerfumeLacrado(Context context, List<PerfumeLacrado> lstPerfumeLacrado) {
        this.context = context;
        this.lstPerfumeLacrado = lstPerfumeLacrado;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_perfumes_lacrados,parent,false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idModeloTituloPerfumeLacrado.setText(lstPerfumeLacrado.get(position).getTitulo());
        holder.idModeloImagemPerfumeLacrado.setImageResource(lstPerfumeLacrado.get(position).getImagem());

        //criar o clique no card

    }


    @Override
    public int getItemCount() {
        return lstPerfumeLacrado.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //Criando variável que irá representar o xml no java
        CardView idModeloPerfumeLacrado;
        ImageView idModeloImagemPerfumeLacrado;
        TextView idModeloTituloPerfumeLacrado;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Apresentando o java para o xml do modelo
            idModeloPerfumeLacrado = itemView.findViewById(R.id.idModeloPerfumeLacrado);
            idModeloTituloPerfumeLacrado = itemView.findViewById(R.id.idModeloTituloPerfumeLacrado);
            idModeloImagemPerfumeLacrado = itemView.findViewById(R.id.idModeloImagemPerfumeLacrado);
        }
    }

}