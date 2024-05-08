package com.example.homew5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    List<Car> cars = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        CarAdapter carAdapter = new CarAdapter(this, cars);
        recyclerView.setAdapter(carAdapter);
    }

    private void setInitialData() {
        cars.add(new Car("BMW M4", "Автомобили M BMW 4 серии Coupe впечатляющим образом сочетают в себе эстетическую привлекательность, харизму и фирменный спортивный стиль.",
                R.drawable.bmw));
        cars.add(new Car("Mercedes AMG GT", "Mercedes-Benz AMG GT оснащён бензиновыми двигателями, Мощность двигателей Mercedes-Benz AMG GT — от 367 до 843 л. с.",
                R.drawable.amg));
        cars.add(new Car("Audi R8", "спортивный среднемоторный двухместный автомобиль, выпускающийся в двух вариантах исполнения: купе и родстер.",
                R.drawable.audi));
    }
}