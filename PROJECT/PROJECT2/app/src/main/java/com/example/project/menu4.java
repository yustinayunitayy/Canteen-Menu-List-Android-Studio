package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


public class menu4 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu_4, container, false);

        view.findViewById(R.id.btnstall16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("Waroenk Plat D Menu");
            }
        });

        view.findViewById(R.id.btnstall17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("q Menu");
            }
        });

        view.findViewById(R.id.btnstall18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openMenuListFragment("r Menu");
            }
        });
        view.findViewById(R.id.btnstall19).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("s Menu");
            }
        });
        view.findViewById(R.id.btnstall20).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("t Menu");
            }
        });

        view.findViewById(R.id.previousPageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
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

    private void goBack() {
        getParentFragmentManager().popBackStack();
    }
}