package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars;

    @Override
    public List<Car> getCarsList() {
        cars = new ArrayList<>();
        cars.add(new Car("Audi", "Red", 200));
        cars.add(new Car("BMW", "Black", 250));
        cars.add(new Car("Mercedes", "White", 230));
        cars.add(new Car("LADA", "Brown", 180));
        cars.add(new Car("Chevrolet", "Yellow", 320));
        return cars;
    }

    @Override
    public List<Car> getCarsListByCount(int count) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            cars.add(getCarsList().get(i));
        }
        return cars;
    }
}
