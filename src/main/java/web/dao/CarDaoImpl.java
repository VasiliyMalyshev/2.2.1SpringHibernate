package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getAllCars() {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("BMW", "Black", "777"));
        allCars.add(new Car("Hyundai", "Silver", "35"));
        allCars.add(new Car("UAZ", "Green", "1000"));
        allCars.add(new Car("Volvo", "Blue", "88"));
        allCars.add(new Car("Lada", "Red", "2108"));
        return allCars;
    }
}
