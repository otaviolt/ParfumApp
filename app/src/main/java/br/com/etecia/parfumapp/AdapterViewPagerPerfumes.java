package br.com.etecia.parfumapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import br.com.etecia.parfumapp.PerfumesDecantsFragment;
import br.com.etecia.parfumapp.PerfumesLacradosFragment;

public class AdapterViewPagerPerfumes extends FragmentStateAdapter {

    public AdapterViewPagerPerfumes(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new PerfumesLacradosFragment();
            case 1:
                return new PerfumesDecantsFragment();
            default:
                return new PerfumesLacradosFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}