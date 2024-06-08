package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MenuListFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_list, container, false);


        TextView menuTitleTextView = view.findViewById(R.id.menu_title_textview);
        RecyclerView menuRecyclerView = view.findViewById(R.id.menu_recycler_view);

        Bundle args = getArguments();
        if (args != null) {
            String menuTitle = args.getString("menuTitle");
            menuTitleTextView.setText(menuTitle);

            List<String> menuList = new ArrayList<>();
            if (menuTitle.equals("Masakan Bunda Menu")) {
                menuList.add("Ayam Goreng");
                menuList.add("Nasi Campur");
                menuList.add("Gado Gado");
                menuList.add("Pempek");
                menuList.add("Nasi Ikan Asap");
                menuList.add("Nasi Rica-Rica");
                menuList.add("Seblak");
                menuList.add("Soto");
                menuList.add("Nasi Bakar (kuning)");

            } else if (menuTitle.equals("JOlicious Menu")) {
                menuList.add("Macchiato Signature = Rp.14.000");
                menuList.add("Choco Silverqueen");
                menuList.add("Choco Caramel");
                menuList.add("Choco Banana");
                menuList.add("Milk Tea");
                menuList.add("Thai Tea");
                menuList.add("Tiramisu");
                menuList.add("Matcha");
                menuList.add("Oreo");
                menuList.add("Taro");
                menuList.add(" ");
                menuList.add("Yogurt = Rp.18.000");
                menuList.add("Mango");
                menuList.add("Strawberry");
                menuList.add("Lychee");
                menuList.add("Vanilla");
                menuList.add(" ");
                menuList.add("Squash = Rp.12.000");
                menuList.add("Orange");
                menuList.add("Mango");
                menuList.add("Melon");
                menuList.add("Fruit Punch");


            } else if (menuTitle.equals("Cafe President University Menu")) {
                menuList.add("Nasi Jagal = Rp.20.000");
                menuList.add("Nasi Goreng Oriental = Rp.15.000");
                menuList.add("Kwetiaw Oriental = Rp.15.000");
                menuList.add("Spicy Hot Wing = Rp.18.000");
                menuList.add("Chicken Katsu = Rp.18.000");
                menuList.add("Chicken Steak = Rp.18.000");
                menuList.add("Chicken Crispy = Rp.18.000");
                menuList.add("Ayam Penyet = Rp.18.000");
                menuList.add("Ayam Bakar = Rp.18.000");
                menuList.add("Rice Bowl = Rp.18.000");
                menuList.add("Nasi Rames = Rp.15.000");


            } else if (menuTitle.equals("Rumah Makan Padang Maninjau Indah Menu")) {
                menuList.add("Paket Nasi Ayam Gulai = Rp.18.000");
                menuList.add("Paket Nasi Ayam Bakar = Rp.18.000");
                menuList.add("Paket Nasi Ayam Goreng = Rp.18.000");
                menuList.add("Paket Nasi Ayam Balado = Rp.18.000");
                menuList.add("Paket Nasi Ikan Goreng Balado = Rp.16.000");
                menuList.add("Paket Nasi Ikan Bakar = Rp.16.000");
                menuList.add("Paket Nasi Telor Dadar = Rp.12.000");
                menuList.add("Paket Nasi Telor Balado = Rp.12.000");
                menuList.add("Paket Nasi Sop Pindang = Rp.20.000");
                menuList.add("Paket Nasi Cincang = Rp.18.000");
                menuList.add("Paket Nasi Kikil = Rp.23.000");
                menuList.add("Paket Nasi Rendang = Rp.18.000");
                menuList.add("Paket Nasi Kepala Kakap = Rp.23.000");
                menuList.add("Paket Nasi Dendeng = Rp.20.000");
                menuList.add("Paket Nasi Ati Ampela = Rp.13.000");

            } else if (menuTitle.equals("K'Bab Menu")) {
                menuList.add("Package");
                menuList.add("Kebab + French Fries = Rp.20.000");
                menuList.add("Burger + French Fries = Rp.20.000");
                menuList.add("Hotdog + French Fries = Rp.20.000");
                menuList.add("A La Carte");
                menuList.add("Kebab Reguler = Rp.15.000");
                menuList.add("Kebab Large = Rp.18.000");
                menuList.add("Burger = Rp.15.000");
                menuList.add("Hotdog = Rp.15.000");
                menuList.add("Tuna Mayo Toast = Rp.15.000");
                menuList.add("Chicken Toast = Rp.15.000");
                menuList.add("Crispy Dori Toast = Rp.15.000");
                menuList.add("Original Cane = Rp.9.000");
                menuList.add("Choco Cheese Cane = Rp.12.000");
                menuList.add("French Fries  = Rp.10.000");
                menuList.add("Extra Topping");
                menuList.add("Cheddar Cheese = Rp.3.000");
                menuList.add("Mozzarella Cheese = Rp.5.000");
                menuList.add("Kebab Meat = Rp.7.000");

            } else if (menuTitle.equals("Comeback Food to Campus Menu")) {
                menuList.add("Nasi + Soto Betawi = Rp.15.000");
                menuList.add("Nasi + Tongseng Ayam = Rp.20.000");
                menuList.add(" ");
                menuList.add("Nasi + Ayam Rica-Rica = Rp.18.000");
                menuList.add("Nasi + Ayam Saos Padang = Rp.18.000");
                menuList.add("Nasi + Ayam Goreng Mentega = Rp.18.000");
                menuList.add("Nasi + Ayam Bakar = Rp.18.000");
                menuList.add("Nasi + Ayam Crispy Mayo = Rp.18.000");
                menuList.add(" ");
                menuList.add("Nasi + Udang Crispy Saus Padang = Rp.20.000");
                menuList.add("Nasi + Cumi Crispy Asam Manis = Rp.20.000");
                menuList.add("Nasi + Cumi Asam Manis = 20.000");
                menuList.add(" ");
                menuList.add("Nasi Goreng Shanghai = Rp.15.000");
                menuList.add("Nasi Goreng Gila = Rp.15.000");
                menuList.add("Nasi Goreng Ijo Spesial = Rp.18.000");
                menuList.add("Nasi Goreng Seafood = Rp.20.000");
                menuList.add("Nasi Goreng Ayam Bakar = Rp.21.000");
                menuList.add(" ");
                menuList.add("Kwetiaw Biasa = Rp.15.000");
                menuList.add("Kwetiaw Special = Rp.18.000");


            } else if (menuTitle.equals("Kurnia Juice Menu")) {
                menuList.add("Alpukat = Rp.12.000");
                menuList.add("Mangga = Rp.10.000");
                menuList.add("Buah Naga = Rp.10.000");
                menuList.add("Jambu = Rp.10.000");
                menuList.add("Melon = Rp.10.000");
                menuList.add("Strawberry = Rp.10.000");
                menuList.add("Kiwi = Rp.10.000");
                menuList.add("Belimbing = Rp.10.000");
                menuList.add("Nanas = Rp.10.000");
                menuList.add("Apel = Rp.10.000");
                menuList.add("Pisang = Rp.10.000");
                menuList.add("Jeruk = Rp.10.000");
                menuList.add("Buah Pear = Rp.10.000");
                menuList.add("Sirsak = Rp.10.000");
                menuList.add("Wortel = Rp.10.000");
                menuList.add("Tomat = Rp.10.000");
                menuList.add("Terong Belanda = Rp.10.000");
                menuList.add("Juice Mix = Rp.15.000");
                menuList.add("Ice / Hot Jeruk = Rp.5.000");
                menuList.add("Ice / Hot Teh = Rp.4.000");
                menuList.add("Ice / Hot Tawar = Rp.2.000");
                menuList.add("Cappucino Cincau = Rp.10.000");
                menuList.add("Lemon Teh = Rp.10.000");
                menuList.add("Es Kedongdong = Rp.10.000");

            } else if (menuTitle.equals("FAMILY KANTIN Menu")) {
                menuList.add("Package");
                menuList.add("Soto Ayam = Rp 10.000");
                menuList.add("Ayam Penyet = Rp 15.000");
                menuList.add("Siomay = Rp 10.000");
                menuList.add("Siomay + Telor = Rp 15.000");
                menuList.add("Nasi Kuning = Rp 15.000");
                menuList.add("Nasi Campur Ayam Rica-rica = Rp 15.000");
                menuList.add("Nasi Campur Telur = Rp 13.000");
                menuList.add("Aneka Gorengan = Rp 15.000");
                menuList.add("Es Teh Manis = Rp 5.000");
                menuList.add("Es Teh Tawar = Rp 3.000");

            } else if (menuTitle.equals("PU-NORMAL Menu")) {
                menuList.add("Nasi Pecel + Telur = Rp.12.000");
                menuList.add("Paket Ayam Bakar = Rp.18.000");
                menuList.add("Paket Ayam Goreng = Rp.17.000");
                menuList.add("Paket Ayam Penyet = Rp.17.000");
                menuList.add("Paket Ayam Goreng = Rp.15.000");
                menuList.add("Paket Ayam Telor = Rp.10.000");
                menuList.add("Indomie Polos = Rp.8.000");
                menuList.add("Indomie Telur = Rp.12.000");
                menuList.add("Mie Gaul = Rp.10.000");
                menuList.add("Mie Jumbo Polos = Rp.10.000");
                menuList.add("Mie Jumbo Telur = Rp.14.000");
                menuList.add("Mie Double Polos = Rp.14.000");
                menuList.add("Mie Double Telur = Rp.17.000");
                menuList.add("Mie Tek Tek = Rp.15.000");
                menuList.add("Pop Mie = Rp.8.000");
                menuList.add("Nasi Goreng Gila = Rp.15.000");
                menuList.add("Kentang Goreng = Rp.12.000");
                menuList.add(" ");
                menuList.add("Aneka Toping: ");
                menuList.add("Bakso = Rp.3.000");
                menuList.add("Ayam = Rp.3.000");
                menuList.add("Ceker = Rp.3.000");
                menuList.add("Kornet = Rp.2.000");
                menuList.add("Sosis = Rp.2.000");
                menuList.add("Pangsit = Rp.2.000");

            } else if (menuTitle.equals("Baso Pojok Menu")) {
                menuList.add("Package");
                menuList.add("Bakso Urat = Rp 15.000");
                menuList.add("Bakso Halus = Rp 12.000");
                menuList.add("Bakso Telur = Rp 15.000");
                menuList.add("Bakso Malang = Rp 15.000");
                menuList.add("Es Teh Legit = Rp 4.000");

            } else if (menuTitle.equals("KURNIA FOOD Menu")) {
                menuList.add("Package");
                menuList.add("Mie Ayam");
                menuList.add("Mie Ayam Bakso = Rp 18.000");
                menuList.add("Kwetiau Kuah = Rp 15.000");
                menuList.add("Bakso Biasa = Rp 13.000");
                menuList.add("Bakso Jumbo = Rp 18.000");
                menuList.add("Martabak Telor");
                menuList.add("Pisang Goreng");
                menuList.add("Tahu Bakso");
                menuList.add("Sosis Solo");
                menuList.add("Big Sosis");
                menuList.add("Kentang");

            } else if (menuTitle.equals("Roemah_Radang Menu")) {
                menuList.add("Package");
                menuList.add("Mie Yamin Biasa = Rp 15.000");
                menuList.add("Mie Yamin Baso = Rp 18.000");
                menuList.add("Mie Ayam Biasa = Rp 15.000");
                menuList.add("Mie Ayam Baso = Rp 18.000");
                menuList.add("Kwetiau Ayam Biasa = Rp 15.000");
                menuList.add("Kwetiau Ayam Baso = Rp 18.000");
                menuList.add("Bihun Ayam Biasa = Rp 15.000");
                menuList.add("Bihun Ayam Baso = Rp 18.000");
                menuList.add("Gado-gado = Rp 15.000");
                menuList.add("Lontong = Rp 13.000");
                menuList.add("Ketoprak = Rp 15.000");
                menuList.add("Nasi Bakar = Rp 10.000");


            } else if (menuTitle.equals("DAPUR MBAK'E Menu")) {
                menuList.add("Package");
                menuList.add("Nasi Campur (Nasi Putih + Orek Tempe + Mie Goreng + Tumis Sayur + Telur Balado) = Rp 15.000");
                menuList.add("Chicken Katsu (Nasi Putih + Salad + Chicken Katsu + Nugger) = Rp 17.000");
                menuList.add("Ayam Geprek (Nasi Putih + Lalapan + Ayam Geprek + Tahu Tempe) = Rp 17.000");
                menuList.add("Beef Teriyaki (Nasi Putih + Salad + Beef Teriyaki + Nugger) = Rp 20.000");
                menuList.add("Ayam Teriyaki (Nasi Putih + Salad + Ayam Teriyaki + Nugger) = Rp 20.000");
                menuList.add("Cumi Mercon (Nasi Putih + Tumis Sayur + Cumi Mercon + Tahu Tempe) = Rp 20.000");
                menuList.add("Cumi Balado (Nasi Putih + Tumis Sayur + Cumi Balado + Tahu Tempe) = Rp 20.000");

            } else if (menuTitle.equals("Kedai SEHATI Menu")) {
                menuList.add("Package");
                menuList.add("Dadar Crispy Geprek = Rp 12.000");
                menuList.add("Chicken Geprek = Rp 17.000");
                menuList.add("Chicken Pop = Rp 17.000");
                menuList.add("Chicken Katsu = Rp 17.000");
                menuList.add("Chicken Karage = Rp 17.000");
                menuList.add("Chicken Blackpaper = Rp 17.000");
                menuList.add("Chicken Spicy = Rp 17.000");
                menuList.add("Ayam Kecap Wijen = Rp 17.000");
                menuList.add("Ayam Goreng Mentega = Rp 17.000");
                menuList.add("Ayam Kremes = Rp 17.000");
                menuList.add("Dori Filet Asam Manis = Rp 17.000");
                menuList.add("Udang Tempura = Rp 17.000");
                menuList.add("Ayam Selimut Telur = Rp 17.000");
                menuList.add("Es Teh Manis = Rp 3.000");
                menuList.add("Pisang Coklat Keju =Rp10.000");

            } else if (menuTitle.equals("Waroenk Plat D Menu")) {
                menuList.add("Makanan");
                menuList.add("Seblak Original = Rp 15.000");
                menuList.add("Baso Aci = Rp 15.000");
                menuList.add("Soto Bandung = Rp 20.000");
                menuList.add("Basreng Karedok = Rp 15.000");
                menuList.add("Basreng Bumbu Tabur = Rp 10.000");
                menuList.add("Cuankie = Rp 15.000");
                menuList.add("Seblak Rafael = Rp 15.000");
                menuList.add("Mie Tek Tek = Rp 20.000");
                menuList.add("Goreng Ulen = Rp 10.000");
                menuList.add("Nasi Putih = Rp 5.000");
                menuList.add("Roti Bakar Bandung = Rp 15.000");
                menuList.add("Nasi Telor Kecap = Rp 12.000");
                menuList.add("Sop Daging Sapi = Rp 20.000");
                menuList.add("Sop Ceker = Rp 15.000");
                menuList.add(" ");
                menuList.add("Minuman");
                menuList.add("Es Teh Manis");
                menuList.add("Air Mineral");
                menuList.add("Aneka Minuman (Lemon Tea, NutriSari, Dll)");
                menuList.add("Kopi Hitam");
                menuList.add("Kopi Susu");
            }

    MenuAdapter adapter = new MenuAdapter(menuList);
            menuRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            menuRecyclerView.setAdapter(adapter);
        }

        return view;
    }
}