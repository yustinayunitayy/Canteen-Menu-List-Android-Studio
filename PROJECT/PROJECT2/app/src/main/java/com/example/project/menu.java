package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class menu extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        view.findViewById(R.id.btnstall1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("masmokel");
            }
        });

        view.findViewById(R.id.btnstall2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("JOlicious Menu");
            }
        });

        view.findViewById(R.id.btnstall3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("Masakan Bunda Menu");
            }
        });
        view.findViewById(R.id.btnstall4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("Cafe President University Menu");
            }
        });
        view.findViewById(R.id.btnstall5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("Rumah Makan Padang Maninjau Indah Menu");
            }
        });

        view.findViewById(R.id.nextPageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextBlankPage();
            }
        });

        return view;
    }

    private void openMenuListFragment(String menuTitle) {
        MenuListFragment menuListFragment = new MenuListFragment();
        Bundle args = new Bundle();
        args.putString("menuTitle", menuTitle);
        menuListFragment.setArguments(args);

        FragmentManager fragmentManager = getParentFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, menuListFragment)
                .addToBackStack(null)
                .commit();
    }

    private void openNextBlankPage() {
        menu2 blankFragment = new menu2();
        FragmentManager fragmentManager = getParentFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, blankFragment)
                .addToBackStack(null)
                .commit();
    }
}
