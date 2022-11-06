package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> listCars(Integer count) {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car("car1", 1991, "color1"));
        listCars.add(new Car("car2", 1992, "color2"));
        listCars.add(new Car("car3", 1993, "color3"));
        listCars.add(new Car("car4", 1994, "color4"));
        listCars.add(new Car("car5", 1995, "color5"));
        return listCars.stream().limit(count).toList();
    }
}
