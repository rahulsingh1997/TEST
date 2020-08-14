package in.nit.rahul.bean;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class EmpjdbcRepo implements IEmpRepo{

	@Value("Employee-JDBC")
	private String model;

	@Override
	public String toString() {
		return "EmpjdbcRepo [model=" + model + "]";
	}
	
	
}
