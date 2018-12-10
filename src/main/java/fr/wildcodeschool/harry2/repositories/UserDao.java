package fr.wildcodeschool.harry2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.wildcodeschool.harry2.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}