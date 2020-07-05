package sucaisheng.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import sucaisheng.pojo.Car;

import javax.annotation.Resource;

@Component(value = "school")
public class School {
    private String name;
    private int num;
    @Resource(name = "car1")
    private Car car;

    public String getName() {
        return name;
    }

    @Value("哈理工")
    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    @Value("1967")
    public void setNum(int num) {
        this.num = num;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", car=" + car +
                '}';
    }
}
