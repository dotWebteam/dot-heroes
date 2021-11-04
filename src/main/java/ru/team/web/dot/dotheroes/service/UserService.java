package ru.team.web.dot.dotheroes.service;

import org.springframework.stereotype.Service;
import ru.team.web.dot.dotheroes.entity.User;
import ru.team.web.dot.dotheroes.repository.UserRepository;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

}
