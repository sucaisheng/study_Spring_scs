package sucaisheng.proxy;

import org.springframework.stereotype.Service;
import sucaisheng.pojo.User;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public void addUser() {
        System.out.println("添加user");
    }

    @Override
    public User getUser(int id) {
        System.out.println("获取一个user");
        return null;
    }

    @Override
    public void deletedUser(int id) {
        System.out.println("删除一个user");
    }

    @Override
    public void updateUser(int id) {
        System.out.println("更新user");
    }
}
