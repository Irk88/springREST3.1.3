package web.Service;


import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void edit(User user);

    void removeUserById(Long id);
}
