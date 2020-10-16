package com.example.madsmartfashion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class customerHome extends AppCompatActivity{

    private ImageView LogoutIcon;
    //private Button button1;
    //private String username;
//    TextView price1,price8,price2,price3,price4,price5,price6,price7;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);

        LogoutIcon = (ImageView) findViewById(R.id.signOut);

//        price1 = findViewById(R.id.price1);
//        price2 = findViewById(R.id.price2);
//        price3 = findViewById(R.id.price3);
//        price4 = findViewById(R.id.price4);
//        price5 = findViewById(R.id.price5);
//        price6 = findViewById(R.id.price6);
//        price7 = findViewById(R.id.price7);
//        price8 = findViewById(R.id.price8);

        //username = getIntent().getStringExtra("username");

        LogoutIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(customerHome.this,SignUp.class);
                startActivity(intent);


            }
        });

        }

//    public void add1(View view) {
//        String iPrice;
//
//        iPrice = price1.getText().toString();
//
//        Intent intent = new Intent(customerHome.this,ShoppingCart.class);
//        intent.putExtra("iPrice", iPrice);
//        intent.putExtra("womencloth1", R.drawable.girl2);
//        intent.putExtra("username",username);
//        startActivity(intent);
//    }
//
//    public void add2(View view) {
//        String iPrice;
//
//        iPrice = price2.getText().toString();
//
//        Intent intent = new Intent(customerHome.this,ShoppingCart.class);
//        intent.putExtra("iPrice", iPrice);
//        intent.putExtra("womencloth2", R.drawable.girl1);
//        intent.putExtra("username",username);
//        startActivity(intent);
//    }
//
//    public void add3(View view) {
//        String iPrice;
//
//        iPrice = price3.getText().toString();
//
//        Intent intent = new Intent(customerHome.this,ShoppingCart.class);
//        intent.putExtra("iPrice", iPrice);
//        intent.putExtra("womencloth3", R.drawable.girl4);
//        intent.putExtra("username",username);
//        startActivity(intent);
//    }
//
//    public void add4(View view) {
//        String iPrice;
//
//        iPrice = price4.getText().toString();
//
//        Intent intent = new Intent(customerHome.this,ShoppingCart.class);
//        intent.putExtra("iPrice", iPrice);
//        intent.putExtra("womencloth4", R.drawable.girl6);
//        intent.putExtra("username",username);
//        startActivity(intent);
//    }
//
//    public void add5(View view) {
//        String iPrice;
//
//        iPrice = price5.getText().toString();
//.
//        Intent intent = new Intent(customerHome.this,ShoppingCart.class);
//        intent.putExtra("iPrice", iPrice);
//        intent.putExtra("mencloth1", R.drawable.man1);
//        intent.putExtra("username",username);
//        startActivity(intent);
//    }
//
//    public void add6(View view) {
//        String iPrice;
//
//        iPrice = price6.getText().toString();
//
//        Intent intent = new Intent(customerHome.this,ShoppingCart.class);
//        intent.putExtra("iPrice", iPrice);
//        intent.putExtra("mencloth2", R.drawable.man2);
//        intent.putExtra("username",username);
//        startActivity(intent);
//    }
//
//    public void add7(View view) {
//        String iPrice;
//
//        iPrice = price7.getText().toString();
//
//        Intent intent = new Intent(customerHome.this,ShoppingCart.class);
//        intent.putExtra("iPrice", iPrice);
//        intent.putExtra("mencloth3", R.drawable.men3);
//        intent.putExtra("username",username);
//        startActivity(intent);
//    }
//
//    public void add8(View view) {
//        String iPrice;
//
//        iPrice = price8.getText().toString();
//
//        Intent intent = new Intent(customerHome.this,ShoppingCart.class);
//        intent.putExtra("iPrice", iPrice);
//        intent.putExtra("mencloth4", R.drawable.men4);
//        intent.putExtra("username",username);
//        startActivity(intent);
//    }


    public void shoppingCart(View view){
        Intent intent1= new Intent(this, ShoppingCart.class);
        startActivity(intent1);
    }

    public void newArrivalButton(View view){
        Intent intent2= new Intent(this, NewArrivals.class);
        startActivity(intent2);
    }

    public void userProfile(View view){
        Intent intent3= new Intent(this, CustomerDetails.class);
        startActivity(intent3);
    }
}