package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCarList(Integer count) {
        if (count == null) {
            return carDao.getCarList();
        } else if (count > 0 & count <= 5) {
            return carDao.getCarList().subList(0, count);
        } else {
            return carDao.getCarList();
        }
    }
}
