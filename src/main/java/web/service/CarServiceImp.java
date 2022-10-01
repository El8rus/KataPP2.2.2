package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {
    @Override
    public List<Car> addCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", 2020, "red"));
        cars.add(new Car("Cadillac", 2015, "yellow"));
        cars.add(new Car("Mercedes-Benz", 2013, "blue"));
        cars.add(new Car("Porsche", 2019, "white"));
        cars.add(new Car("BMW", 2015, "black"));
        return cars;
    }

    @Override
    public List<Car> getCarList(Integer count) {
        return addCarList().stream().limit(count < 0 ? 0 : count).collect(Collectors.toList());
    }

}

