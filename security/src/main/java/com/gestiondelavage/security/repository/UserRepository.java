package com.gestiondelavage.security.repository;

import com.gestiondelavage.security.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    // Récupérer tous les clients
    @Override
    List<User> findAll();

    // Récupérer un User par son identifiant
    @Override
    Optional<User> findById(Long id);

    // recuperer un user par le nom


    // Créer un nouveau user
    User save(User user);

    // Mettre à jour un user existent
    User saveAndFlush(User user);

    // Supprimer un user
    void deleteById(Long id);

    User findByLogin (String login);


}




