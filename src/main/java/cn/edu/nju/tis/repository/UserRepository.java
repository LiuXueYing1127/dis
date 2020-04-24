package cn.edu.nju.tis.repository;

import cn.edu.nju.tis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author cruck
 * @Description
 * @Date 11:46 2020/4/16
 * @Param
 * @return
 **/
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByAccount(String account);

    List<User> findByType(String type);

    User findByName(String name);

    User findByNameAndType(String name, String type);

    //根据用户名密码查找用户
    User findFirstByNameAndPsw(String username, String password);

}
