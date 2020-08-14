package in.nit.rahul.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empserv")
public class EmpService {

	@Value("EMP_SRV")
	private String mode;
	
	@Autowired
	//@Qualifier("empJpaRepo")
	private IEmpRepo repo;

	@Override
	public String toString() {
		return "EmpService [mode=" + mode + ", repo=" + repo + "]";
	}
	
	
}
