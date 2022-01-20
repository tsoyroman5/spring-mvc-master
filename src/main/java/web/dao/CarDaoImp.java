package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car(1111, "KIA", "Roman"));
        carList.add(new Car(2222, "MERCEDES", "Milana"));
        carList.add(new Car(3333, "BENTLEY", "Elena"));
        carList.add(new Car(4444, "BMW", "Andrey"));
        carList.add(new Car(5555, "TOYOTA", "Grigoriy"));
    }

    public List<Car> getCarList() {
        return carList;
    }
}
