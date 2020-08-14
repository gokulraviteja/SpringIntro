package com.grt.repos;

import com.grt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo  extends JpaRepository<User,Integer> {

}
