package com.nobodylikes.me.ReactiveSpring02.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nobodylikes.me.ReactiveSpring02.Model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
