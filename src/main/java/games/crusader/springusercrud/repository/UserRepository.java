package games.crusader.springusercrud.repository;

import games.crusader.springusercrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findByUsername(@Param("username") String username);
}
