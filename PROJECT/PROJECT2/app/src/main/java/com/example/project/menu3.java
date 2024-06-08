package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class menu3 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu_3, container, false);

        view.findViewById(R.id.btnstall11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("Baso Pojok Menu");
            }
        });

        view.findViewById(R.id.btnstall12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("KURNIA FOOD Menu");
            }
        });

        view.findViewById(R.id.btnstall13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("Roemah_Radang Menu");
            }
        });
        view.findViewById(R.id.btnstall14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("DAPUR MBAK'E Menu");
            }
        });
        view.findViewById(R.id.btnstall15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuListFragment("Kedai SEHATI Menu");
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
        menu4 blankFragment = new menu4();
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