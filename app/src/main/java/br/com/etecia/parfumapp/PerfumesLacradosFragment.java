package br.com.etecia.parfumapp;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class PerfumesLacradosFragment extends Fragment {

    private List<PerfumeLacrado> lstPerfumeLacrado;
    RecyclerView idRecPerfumesLacrados;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfumes_lacrados, container, false);

        idRecPerfumesLacrados = view.findViewById(R.id.idRecPerfumesLacrados);

        //carregando os objetos na lista
        lstPerfumeLacrado = new ArrayList<>();
        lstPerfumeLacrado.add(new PerfumeLacrado("Lattafa Khamrah", R.drawable.khamrah));
        lstPerfumeLacrado.add(new PerfumeLacrado("Invictus", R.drawable.invictus));
        lstPerfumeLacrado.add(new PerfumeLacrado("Ultra Male", R.drawable.ultramale));
        lstPerfumeLacrado.add(new PerfumeLacrado("Hugo Boss", R.drawable.hugoboss));
        lstPerfumeLacrado.add(new PerfumeLacrado("212 Heroes", R.drawable.heroes));
        lstPerfumeLacrado.add(new PerfumeLacrado("212 vip Black", R.drawable.black));
        lstPerfumeLacrado.add(new PerfumeLacrado("Versace Eros", R.drawable.eros));
        lstPerfumeLacrado.add(new PerfumeLacrado("Phantom", R.drawable.phantom));
        lstPerfumeLacrado.add(new PerfumeLacrado("Azzaro Most Wanted", R.drawable.azzaro));
        lstPerfumeLacrado.add(new PerfumeLacrado("Nishane Ani", R.drawable.ani));

        //carregando o adaptador
        RecyclerAdapterPerfumeLacrado adapterPerfumeLacrado = new RecyclerAdapterPerfumeLacrado(getContext(),lstPerfumeLacrado);

        idRecPerfumesLacrados.setLayoutManager(new GridLayoutManager(getContext(),2));

        idRecPerfumesLacrados.setAdapter(adapterPerfumeLacrado);


        return view;


    }
}
