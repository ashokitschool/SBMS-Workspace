package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Address;
import in.ashokit.entities.Employee;
import in.ashokit.repo.AddressRepo;
import in.ashokit.repo.EmpRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmpRepo empRepo;

	@Autowired
	private AddressRepo addrRepo;

	public void deleteEmp() {
		empRepo.deleteById(1);
	}

	public void getAddrData() {
		Optional<Address> findById = addrRepo.findById(1);
	}

	public void getEmpData() {
		Optional<Employee> findById = empRepo.findById(1);
	}

	public void saveEmpData() {

		Employee emp = new Employee();
		emp.setEmpName("John");
		emp.setSalary(1000.00);

		Address a1 = new Address();
		a1.setCity("Hyd");
		a1.setState("TG");
		a1.setType("Present");
		a1.setEmp(emp); // setting emp to addr

		Address a2 = new Address();
		a2.setCity("GNT");
		a2.setState("AP");
		a2.setType("Permanent");
		a2.setEmp(emp); // setting emp to addr

		List<Address> addrList = Arrays.asList(a1, a2);
		emp.setAddr(addrList); // setting addr list to emp

		empRepo.save(emp);

	}

}
