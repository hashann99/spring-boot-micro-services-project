package com.hashan.users.repo;

import com.hashan.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{
    @Query(value = "select * from user where user_Id=?1",nativeQuery = true)
    User findUserById(Long userId);
}
