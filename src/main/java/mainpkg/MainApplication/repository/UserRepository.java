package mainpkg.MainApplication.repository;

import mainpkg.MainApplication.modelClass.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
