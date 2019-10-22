package id.ac.upnjatim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class KuisActivity extends AppCompatActivity {

    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;

    public static int hasil, benar, salah;
    String[] pertanyaan_kuis = new String[]{
            "Soal - 1. \n\nAda Berapakah Fakultas di UPN 'Veteran' Jawa Timur ? ",
            "Soal - 2. \n\nYang Merupakan Karakteristik Bahasa Pemrograman Android Adalah ... ?",
            "Soal - 3. \n\nTahun Berapakah Pengesahan Resmi UPN 'Veteran' Jawa Timur Menjadi Perguruan Tinggi Negeri (PTN) ?",
            "Soal - 4. \n\nObjek Apa Yang Disimpan di Dalam onSaveInstanceState ?",
            "Soal - 5. \n\nBerapakah Jumlah Program Studi yang ada di UPN 'Veteran' Jawa Timur ?",
            "Soal - 6. \n\nFile Manakah Yang Digunakan Untuk Menyimpan Data Informasi Aplikasi Android ?",
            "Soal - 7. \n\nYang Merupakan Bagian Jargon UPN 'Veteran' Jawa Timur Ialah ?",
            "Soal - 8. \n\nMethod Yang Dipanggil Saat Activity Pertama Kali Dibuat, Merupakan Fungsi Dari Method ... ?",
            "Soal - 9. \n\nDiantara Pernyataan berikut \n 1. Polymorphisme \n 2. Encapsulation \n 3. Multiple Intheritance \n \nManakah Konsep Yang 'TIDAK' Terdapat di Pemrograman Android ?",
            "Soal - 10. \n\nSiapakah Yang Menjabati Sebagai Rektor UPN 'Veteran' Jawa Timur Pada Tahun ini (2019) ?"
    };

    String[] pilihan_jawaban = new String[]{
            "A. 6", "B. 7", "C. 8", "D. 9",
            "A. Tidak Memiliki Library", "B. Structured Programming", "C. Object Oriented Programming", "D. Semua Jawaban Salah",
            "A. 2014", "B. 2015", "C. 2016", "E. 2017",
            "A. Bundles", "B. String", "C. Activity", "D. Tidak ada",
            "A. 22", "B. 24", "C. 26", "D. 28",
            "A. MainActivity.java", "B. Strings.xml", "C. Dimens.xml", "D. AndroidManifest.xml",
            "A. Inovasi & Damai", "B. Prestasi & Sentosa", "C. Inovasi & Prestasi", "D. Sukses & Bersahaja",
            "A. onStart()", "B. onFreeze()", "C. onRestart()", "D. onCreate()",
            "A. Semua Salah", "B. 1", "C. 2", "D. 3",
            "A. Prof. Dr. Ir. Akhmad Fauzi, M.MT.", "B. Dr. Ir. Sukendah, M.Sc.", "C. Prof. Dr. Ir. Muhammad Anis, M.Met", "D. Prof. Abdul Haris"
    };

    String[] jawaban_benar = new String[]{
            "B. 7",
            "C. Object Oriented Programming",
            "A. 2014",
            "A. Bundles",
            "B. 24",
            "D. AndroidManifest.xml",
            "C. Inovasi & Prestasi",
            "D. onCreate()",
            "D. 3",
            "A. Prof. Dr. Ir. Akhmad Fauzi, M.MT."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        pertanyaan = (TextView) findViewById(R.id.pertanyaan);
        rg = (RadioGroup) findViewById(R.id.radio_group);
        PilihanA = (RadioButton) findViewById(R.id.PilihanA);
        PilihanB = (RadioButton) findViewById(R.id.PilihanB);
        PilihanC = (RadioButton) findViewById(R.id.PilihanC);
        PilihanD = (RadioButton) findViewById(R.id.PilihanD);

        pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

    }

    public void next(View view) {
        if (PilihanA.isChecked() || PilihanB.isChecked() || PilihanC.isChecked() || PilihanD.isChecked()) {
            RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);

            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor]))
                benar++;
            else
                salah++;

            nomor++;

            if (nomor < pertanyaan_kuis.length) {
                pertanyaan.setText(pertanyaan_kuis[nomor]);
                PilihanA.setText(pilihan_jawaban[(nomor * 4) + 0]);
                PilihanB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilihanC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilihanD.setText(pilihan_jawaban[(nomor * 4) + 3]);
            } else {
                Intent selesai = new Intent(getApplicationContext(), HasilKuis.class);
                startActivity(selesai);
            }

        } else {
            Toast.makeText(this, "Pilih Jawaban Dulu", Toast.LENGTH_SHORT).show();
        }
    }
}
