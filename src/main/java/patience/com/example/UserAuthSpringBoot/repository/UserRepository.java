package patience.com.example.UserAuthSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import patience.com.example.UserAuthSpringBoot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
