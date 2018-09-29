package example.service.impl;

import example.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class userServiceImpl implements UserService {

    @Override
    public String findAllUsers() {

        return "This msg from impl";
    }
}
