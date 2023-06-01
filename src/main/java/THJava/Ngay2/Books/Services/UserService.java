package THJava.Ngay2.Books.Services;

import THJava.Ngay2.Books.Models.User;
import org.springframework.stereotype.Service;
import THJava.Ngay2.Books.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public void save(User user)
    {
        userRepository.save(user);
    }
}
