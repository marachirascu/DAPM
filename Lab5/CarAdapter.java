package com.example.lab5;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class CarAdapter extends BaseAdapter {
    private Activity context;
    private ArrayList<Car> cars;

    public CarAdapter (Activity context) {
        //TODO
        this.context = context;
        cars = new ArrayList<Car>();
    }

    public void addCar(String nameCar, int resource){
        Car car = new Car();
        car.name = nameCar;
        car.imageResource = resource;
        cars.add(car);
        this.notifyDataSetChanged();
    }

    // TODO efficient?? -> NO because of the inflater -> we should recycle
    public View getView(int i, View view, ViewGroup viewGroup) {
        View element;

        LayoutInflater layoutInflater = context.getLayoutInflater();
        element = layoutInflater.inflate(R.layout.list_item, null);
        TagCar car = new TagCar();
        car.name = element.findViewById(R.id.tv_name_element);
        car.image = element.findViewById(R.id.iv_image_element);
        element.setTag(car);

        TagCar tag = (TagCar) element.getTag();
        tag.name.setText(cars.get(i).name);
        tag.image.setImageResource(cars.get(i).imageResource);
        return element;
    }


    @Override
    public int getCount() {
        return cars.size();
    }

    @Override
    public Object getItem(int position) {
        return cars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
