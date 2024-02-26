package hkw.onlineLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hkw.onlineLibrary.model.User;

public interface UserRepo extends JpaRepository<User, String  > {
}
