package in.nit.rahul.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//("repo")
@Primary
public class EmpJparepo implements IEmpRepo {

	@Value("Employee-JPA")
	private String model;

	@Override
	public String toString() {
		return "EmpJparepo [model=" + model + "]";
	}	
}
