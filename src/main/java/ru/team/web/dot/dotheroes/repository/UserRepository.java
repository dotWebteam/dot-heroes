package ru.team.web.dot.dotheroes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.team.web.dot.dotheroes.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(String login);
}
