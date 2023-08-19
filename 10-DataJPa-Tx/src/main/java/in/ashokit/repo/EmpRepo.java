package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entites.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
