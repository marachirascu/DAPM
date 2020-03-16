package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView listOfCars;
    CarAdapter carAdapter;
    private EditText addNewCar; //masinaNoua
    private Button addButton; //butonAdauga

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int image = R.drawable.lab5_car_icon;

        // TODO 1 : connect the ListView from the java to the xml
        listOfCars = (ListView) findViewById(R.id.lv_list_cars);
        // TODO 2: initialize the object carAdapter
        carAdapter = new CarAdapter(this);
        // TODO 3: set the carAdapter adapter for list of cars
        listOfCars.setAdapter(carAdapter);
        // TODO 4: in the carAdapter, add 4 cars (addCar())
        carAdapter.addCar("Dacia", image);
        carAdapter.addCar("Renault", image);
        carAdapter.addCar("Nissan", image);
        carAdapter.addCar("Mazda", image);

        addNewCar = (EditText) findViewById(R.id.ed_new_car);
        addButton = (Button) findViewById(R.id.b_add_car);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = addNewCar.getText().toString();

                carAdapter.addCar(addNewCar.getText().toString(), image);
                addNewCar.setText("");
            }
        });
    }
}

class Car {
   String name;
   int imageResource;
}

class TagCar {
    TextView name;
    ImageView image;
}