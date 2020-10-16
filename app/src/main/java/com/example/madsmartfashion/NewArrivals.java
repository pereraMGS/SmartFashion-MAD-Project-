package com.example.madsmartfashion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewArrivals extends AppCompatActivity {

    private Button button1;
    private String username;
    TextView price1,price8,price2,price3,price4,price5,price6,price7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_arrivals);

        price1 = findViewById(R.id.WClothLKR1);
        price2 = findViewById(R.id.WClothLKR2);
        price3 = findViewById(R.id.WClothLKR3);
        price4 = findViewById(R.id.WClothLKR4);
        price5 = findViewById(R.id.MClothLKR1);
        price6 = findViewById(R.id.MClothLKR2);
        price7 = findViewById(R.id.MClothLKR3);
        price8 = findViewById(R.id.MClothLKR4);

        username = getIntent().getStringExtra("username");
    }

    public void add1(View view) {
        String iPrice;

        iPrice = price1.getText().toString();

        Intent intent = new Intent(NewArrivals.this,ShoppingCart.class);
        intent.putExtra("iPrice", iPrice);
        intent.putExtra("womencloth1", R.drawable.girl5);
        intent.putExtra("username",username);
        startActivity(intent);
    }

    public void add2(View view) {
        String iPrice;

        iPrice = price2.getText().toString();

        Intent intent = new Intent(NewArrivals.this,ShoppingCart.class);
        intent.putExtra("iPrice", iPrice);
        intent.putExtra("womencloth2", R.drawable.girl4);
        intent.putExtra("username",username);
        startActivity(intent);
    }

    public void add3(View view) {
        String iPrice;

        iPrice = price3.getText().toString();

        Intent intent = new Intent(NewArrivals.this,ShoppingCart.class);
        intent.putExtra("iPrice", iPrice);
        intent.putExtra("womencloth3", R.drawable.girl3);
        intent.putExtra("username",username);
        startActivity(intent);
    }

    public void add4(View view) {
        String iPrice;

        iPrice = price4.getText().toString();

        Intent intent = new Intent(NewArrivals.this,ShoppingCart.class);
        intent.putExtra("iPrice", iPrice);
        intent.putExtra("womencloth4", R.drawable.girl2);
        intent.putExtra("username",username);
        startActivity(intent);
    }

    public void add5(View view) {
        String iPrice;

        iPrice = price5.getText().toString();

        Intent intent = new Intent(NewArrivals.this,ShoppingCart.class);
        intent.putExtra("iPrice", iPrice);
        intent.putExtra("mencloth1", R.drawable.men4);
        intent.putExtra("username",username);
        startActivity(intent);
    }

    public void add6(View view) {
        String iPrice;

        iPrice = price6.getText().toString();

        Intent intent = new Intent(NewArrivals.this,ShoppingCart.class);
        intent.putExtra("iPrice", iPrice);
        intent.putExtra("mencloth2", R.drawable.man1);
        intent.putExtra("username",username);
        startActivity(intent);
    }

    public void add7(View view) {
        String iPrice;

        iPrice = price7.getText().toString();

        Intent intent = new Intent(NewArrivals.this,ShoppingCart.class);
        intent.putExtra("iPrice", iPrice);
        intent.putExtra("mencloth3", R.drawable.men3);
        intent.putExtra("username",username);
        startActivity(intent);
    }

    public void add8(View view) {
        String iPrice;

        iPrice = price8.getText().toString();

        Intent intent = new Intent(NewArrivals.this,ShoppingCart.class);
        intent.putExtra("iPrice", iPrice);
        intent.putExtra("mencloth4", R.drawable.man2);
        intent.putExtra("username",username);
        startActivity(intent);
    }

    public void shoppingCart(View view){
        Intent intent3= new Intent(this, ShoppingCart.class);
        startActivity(intent3);
    }
}