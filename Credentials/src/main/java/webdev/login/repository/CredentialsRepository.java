package webdev.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webdev.login.entity.CredentialsEntity;

public interface CredentialsRepository extends JpaRepository<CredentialsEntity, Integer> {

}
