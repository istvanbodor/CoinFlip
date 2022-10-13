package com.example.coinflip;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    private ImageView kep;
    private Button fejgomb, irasgomb;
    private TextView gyozelem, dobasok, vereseg;
    private String tipp;
    private int tippelt;
    private int tippek;
    private int gyozelmek;
    private int veresegek;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        fejgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipp ="fej";
                tippelt = (int)(Math.random()*2+1);
                tippek++;
                if (tippelt==1)
                {
                    kep.setImageResource(R.drawable.heads);
                    gyozelmek++;
                    Toast.makeText(MainActivity.this, "Fej", Toast.LENGTH_SHORT).show();
                    dobasok.setText("Dobások :" +tippek);
                    gyozelem.setText("Győzelem: "+gyozelmek);

                }
                else {
                    kep.setImageResource(R.drawable.tails);
                    veresegek++;
                    Toast.makeText(MainActivity.this, "Írás", Toast.LENGTH_SHORT).show();
                    dobasok.setText("Dobások :" +tippek);
                    vereseg.setText("Vereség: "+veresegek);
                }
                if (tippek ==5) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);

                    if (gyozelmek>veresegek)
                    {
                        builder1.setTitle("Gratulálok, nyert!");
                        builder1.setMessage("Szeretne újat játszani?");
                    }
                    else {
                        builder1.setTitle("Vereség");
                        builder1.setMessage("Szeretne újat játszani?");
                    }


                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Igen",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    kep.setImageResource(R.drawable.heads);
                                    gyozelmek =0;
                                    veresegek =0;
                                    tippek =0;
                                    dobasok.setText("Dobások :" +tippek);
                                    vereseg.setText("Vereség: "+ veresegek);
                                    gyozelem.setText("Győzelem: "+gyozelmek);

                                }
                            });

                    builder1.setNegativeButton(
                            "Nem",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    finish();
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();


                }

            }
        });
        irasgomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipp ="iras";
                tippelt = (int)(Math.random()*2+1);
                tippek++;
                if (tippelt==1)
                {
                    kep.setImageResource(R.drawable.heads);
                    veresegek++;
                    Toast.makeText(MainActivity.this, "Fej", Toast.LENGTH_SHORT).show();
                    dobasok.setText("Dobások :" +tippek);
                    vereseg.setText("Vereség: "+veresegek);

                }
                else {
                    kep.setImageResource(R.drawable.tails);
                    gyozelmek++;
                    Toast.makeText(MainActivity.this, "Írás", Toast.LENGTH_SHORT).show();
                    dobasok.setText("Dobások :" +tippek);
                    gyozelem.setText("Győzelem: "+gyozelmek);
                }


                if (tippek ==5) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);

                    if (gyozelmek>veresegek)
                    {
                        builder1.setTitle("Gratulálok, nyert!");
                        builder1.setMessage("Szeretne újat játszani?");
                    }
                    else {
                        builder1.setTitle("Vereség");
                        builder1.setMessage("Szeretne újat játszani?");
                    }


                    builder1.setCancelable(false);

                    builder1.setPositiveButton(
                            "Igen",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    kep.setImageResource(R.drawable.heads);
                                    gyozelmek =0;
                                    veresegek =0;
                                    tippek =0;
                                    dobasok.setText("Dobások :" +tippek);
                                    vereseg.setText("Vereség: "+ veresegek);
                                    gyozelem.setText("Győzelem: "+gyozelmek);

                                }
                            });

                    builder1.setNegativeButton(
                            "No",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    finish();
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();


                }



            }

        });




    }

    private void init(){
        this.kep = findViewById(R.id.kep);
        this.fejgomb = findViewById(R.id.fejgomb);
        this.irasgomb = findViewById(R.id.irasgomb);
        this.gyozelem = findViewById(R.id.gyozelem);
        this.vereseg = findViewById(R.id.vereseg);
        this.dobasok = findViewById(R.id.dobasok);
        this.tipp ="";
        this.tippelt = 0;
        tippek =0;
        gyozelmek =0;
        veresegek =0;


    }
}