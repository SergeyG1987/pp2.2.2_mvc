package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Mustang", 2021));
        cars.add(new Car("BMW", "X5", 2022));
        cars.add(new Car("Mercedes", "C-Class", 2020));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size() || count <= 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}