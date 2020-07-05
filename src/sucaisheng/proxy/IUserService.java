package sucaisheng.proxy;

import sucaisheng.pojo.User;

public interface IUserService {
    void addUser();
    User getUser(int id);
    void deletedUser(int id);
    void updateUser(int id);
}
