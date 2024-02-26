package hkw.onlineLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hkw.onlineLibrary.model.User;
import hkw.onlineLibrary.repository.UserRepo;
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public boolean loginUser(String phoneNumber, String password) {
        User loginUser = userRepo.findByPhoneNumber(phoneNumber);
        return loginUser != null && loginUser.getPassword().equals(password);
    }

    public String saveUser(User user) {
        userRepo.save(user);
        return "Saved...";
    }
}
