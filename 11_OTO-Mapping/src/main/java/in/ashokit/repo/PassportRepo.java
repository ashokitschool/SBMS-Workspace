package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer>{

}
