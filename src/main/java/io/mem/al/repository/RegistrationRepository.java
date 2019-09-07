package io.mem.al.repository;

import io.mem.al.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    Registration findByUserName(String userName);
}
