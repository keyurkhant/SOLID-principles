package solid.good.s;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserManager {
    private List<User> userList;

    public UserManager() {
        userList = new ArrayList<>();
    }

    public void registerUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public List<User> searchUsersByName(String name) {
        return userList.stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<User> searchUsersByAddress(String address) {
        return userList.stream()
                .filter(user -> user.getAddress().equalsIgnoreCase(address))
                .collect(Collectors.toList());
    }
}
