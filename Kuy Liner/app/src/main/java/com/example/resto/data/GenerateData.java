package com.example.resto.data;

import com.example.resto.R;
import com.example.resto.model.Menu;

import java.util.ArrayList;
import java.util.List;

import static com.example.resto.model.Menu.TIPE_MAKANAN;
import static com.example.resto.model.Menu.TIPE_MINUMAN;
import static com.example.resto.model.Menu.TIPE_SNACK;

public class GenerateData {

    public static List<Menu> getListMenuMakanan() {
        List<Menu> listMenuMakanan = new ArrayList<>();

        listMenuMakanan.add(new Menu(
                R.drawable.chickenburger,
                TIPE_MAKANAN,
                "Chicken Burger",
                "Rp. 34.000",
                "Chicken Burger dari bahan pilihan yang berkualitas baik, dengan roti kualitas terbaik, daun selada yang masih segar serta daging ayam pilihan yang berkualitas dengan baik"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.burgerblack,
                TIPE_MAKANAN,
                "Black Burger",
                "Rp. 38.000",
                "Black Burger terbuat dari charcoal yang berguna untuk mendetox lemak dalam tubuh yang di padukan dengan sayur-sayuran dan daging ayam yang renyah serta di tambah dengan lapisan keju"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.burgerdaging,
                TIPE_MAKANAN,
                "Beef Burger",
                "Rp. 36.000",
                "Dengan menggunakan daging sapi pilihan dan berkualitas serta dengan tekstur yang pas cocok untuk semua usia"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.burgerkeju1,
                TIPE_MAKANAN,
                "Cheese Burger",
                "Rp. 37.000",
                "pengeluaran Burger terbaru dengan warna yang sedikit berbeda dan berkualitas baik tersedia dengan daging pilihan, keju berkualitas, dan sayuran yang terbaik dari hasil panen"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.burgerspicy,
                TIPE_MAKANAN,
                "Spicy Burger",
                "Rp. 40.000",
                "Spicy Burger ini menu terbaru dari kami dengan tampilan warna dan rasa terbaru dengan rasa pedas yang lebih pedas dari saus biasa"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.hotdog,
                TIPE_MAKANAN,
                "Hot Dog",
                "Rp. 24.000",
                "Hot Dog terbuat dari sosis yang terbalut dengan roti dengan tambahan saus dan mayonais yang berkualitas baik dan di ambil dari sosis pilihan dari daging yang segar"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.kebab,
                TIPE_MAKANAN,
                "Kebab",
                "Rp. 26.000",
                "Kebab merupakan makanan asal Turki dengan menggunakan daging-daging yang diolah terlebih dahulu dan ditambahkan sayur-sayuran hasil dari panen yang berkualitas"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.sandwich,
                TIPE_MAKANAN,
                "Sandwich",
                "Rp. 20.000",
                "Sandwich makanan dengan sayuran terbaik dari hasil panen dan ditambahkan dengan telur yang berkualitas dan beef daging yang diolah dengan hygienis"
        ));

        return listMenuMakanan;
    }

    public static List<Menu> getListMenuMinuman() {
        List<Menu> listMenuMinuman = new ArrayList<>();

        listMenuMinuman.add(new Menu(
                R.drawable.bubblegum1,
                TIPE_MINUMAN,
                "Ice Bubble Gum",
                "Rp. 15.000",
                "Bubble Gum atau yang biasa dikenal dengan permen karet ini sudah banyak penggemarnya, bubble gum bukan hanya sekedar dalam bentuk permen karet saja, kini kamu bisa mencoba sensasi manisnya bubble gum dalam sebuah minuman"
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.cappucino1,
                TIPE_MINUMAN,
                "Ice Cappucino",
                "Rp. 12.000",
                "Cappucino merupakan minuman khas Italia yang dibuat dari espresso dan susu, tetapi referensi lain juga ada yang menyebutkan bahwa kapucino berawal dari biji biji kopi tentara Turki,"
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.taroblend1,
                TIPE_MINUMAN,
                "Ice Taro Blend",
                "Rp. 16.000",
                "Taro merupakan salah satu jenis makanan yang sangat populer. Bentuk aslinya menyerupai dengan kentang dan ubi. Taro ini memiliki rasa manis dan sedikit rasa kacang, warna ungunya yang menjadi ciri khas dari makanan ini."
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.strawberry,
                TIPE_MINUMAN,
                "Ice Strawberry Blend",
                "Rp. 13.000",
                "Minuman dari buah strawberry yang di olah dengan cara d blender atau d jus dan dapat ditambahkan topping seperti choco chips, marshmellow, dan lain sebagainya."
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.caramel,
                TIPE_MINUMAN,
                "Hot Carramel",
                "Rp. 16.000",
                "Minuman yang dari susu kental manis putih di tambahkan dengan creamer bubuk dan gula dengan takaran sesuai selera dan di sajikan dengan kondisi panas atau hangat"
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.mochacino,
                TIPE_MINUMAN,
                "Hot Moccacino",
                "Rp. 16.000",
                "Minuman ini menjadi salah satu minuman olahan kopi yang banyak digemari. Pada dasarnya, mochaccino merupakan perpaduan espresso, cokelat, dan susu yang telah disteam (diuapkan dangan uap panas)."
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.kopitubruk,
                TIPE_MINUMAN,
                "Kopi Tubruk",
                "Rp. 10.000",
                "Kopi tubruk adalah minuman kopi dari Indonesia yang dibuat dengan mendidihkan biji kopi bersama dengan gula. Kopi ini memiliki kesamaan dengan kopi dari Turki dan Yunani dalam hal kepekatannya."
        ));

        return listMenuMinuman;
    }

    public static List<Menu> getListMenuSnack() {
        List<Menu> listMenuSnack = new ArrayList<>();

        listMenuSnack.add(new Menu(
                R.drawable.ayamkrispi1,
                TIPE_SNACK,
                "Cryspi Chicken",
                "Rp. 12.000",
                "Cemilan yang sering favorit saat ini terbuat dari ayam yang diselimuti dengan tepung renyah dan di sajikan dengan saus tomat atau mayonaise."
        ));
        listMenuSnack.add(new Menu(
                R.drawable.jamurkrispi1,
                TIPE_SNACK,
                "Jamur Crispi",
                "Rp. 14.000",
                "Cemilan ini sering di gemari kalangan muda dengan olahan dari jamur tiram yang di goreng dengan di baluti tepung krispi dan di sajikan dengan tambahan saus tomat atau saus sambal dan mayonaise."
        ));
        listMenuSnack.add(new Menu(
                R.drawable.kentang1,
                TIPE_SNACK,
                "French Fries",
                "Rp. 10.000",
                "Kentang goreng adalah hidangan yang dibuat dari potongan-potongan kentang yang digoreng dalam minyak goreng panas. Di dalam menu rumah-rumah makan, kentang goreng yang dipotong panjang-panjang dan digoreng dalam keadaan terendam di dalam minyak goreng panas"
        ));
        listMenuSnack.add(new Menu(
                R.drawable.onionring1,
                TIPE_SNACK,
                "Onion Ring",
                "Rp. 14.000",
                "Biasanya onion ring crispy ini dihidangkan bersama masakan lainnya. Rasanya yang enak, gurih serta manis dari bawang bombay. Onion ring crispy ini disajikan dengan saus sambal botolan, saus tomat, mayonaise serta sambal pedas sesuai selera."
        ));
        listMenuSnack.add(new Menu(
                R.drawable.rotibakar1,
                TIPE_SNACK,
                "Roti Bakar",
                "Rp. 12.000",
                "Terbuat dari bahan dasar roti dan selai berbagai rasa seperti coklat, strawberry, kacang dan lain lain yang kemudian di panggang atau di bakar dengan teflon hingga berubah warna yang sedikit kecoklatan."
        ));
        listMenuSnack.add(new Menu(
                R.drawable.tahubakso1,
                TIPE_SNACK,
                "Tahu Bakso",
                "Rp. 10.000",
                "Salah satu cemilan yang yang terbuat dari tahu yang di belah dan d masukkan daging ayam atau sapi yang di giling. Dapat di sajikan dengan tambahan sambal kecap dan cabe rawit atau dengan saus sambal yang sesuai selera."
        ));

        return listMenuSnack;
    }
}
