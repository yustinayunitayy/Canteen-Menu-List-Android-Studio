package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class menu2 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu_2, container, false);

        view.findViewById(R.id.btnstall6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("K'Bab Menu");
            }
        });

        view.findViewById(R.id.btnstall7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("Comeback Food to Campus Menu");
            }
        });

        view.findViewById(R.id.btnstall8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("Kurnia Juice Menu");
            }
        });
        view.findViewById(R.id.btnstall9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("PU-NORMAL Menu");
            }
        });
        view.findViewById(R.id.btnstall10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("FAMILY KANTIN Menu");
            }
        });

        view.findViewById(R.id.nextPageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextBlankPage();
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

    private void openNextBlankPage() {
        menu3 blankFragment = new menu3();
        FragmentManager fragmentManager = getParentFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, blankFragment)
                .addToBackStack(null)
                .commit();
    }

    private void goBack() {
        getParentFragmentManager().popBackStack();
    }
}