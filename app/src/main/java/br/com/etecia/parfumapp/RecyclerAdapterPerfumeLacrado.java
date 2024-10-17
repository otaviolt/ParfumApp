package br.com.etecia.parfumapp;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapterPerfumeLacrado extends RecyclerView.Adapter<RecyclerAdapterPerfumeLacrado.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //Criando variável que irá representar o xml no java
        CardView idModeloPerfumeLacrado;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Apresentando o java para o xml do modelo
            idModeloPerfumeLacrado = itemView.findViewById(R.id.idModeloPerfumeLacrado);
        }
    }

}