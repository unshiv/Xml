package JaxbOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;

import org.example.student.Address;
import org.example.student.Marks;
import org.example.student.Student;


public class Marshelling {
	public static void main(String[] args) throws JAXBException, FileNotFoundException, DatatypeConfigurationException {
		
		   // create JAXB context and instantiate marshaller
	    JAXBContext context = JAXBContext.newInstance(Student.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    Student std = new Student();
	    std.setName("vishnu");
	    std.setNumber(101);
	    
	    
	    Address home = new Address();
	    home.setCity("Irving");
	    home.setStreetName("Las Collinas");
	    home.setZip("75063");
	    
	    Address communication = new Address();
	    communication.setCity("Ohio");
	    communication.setStreetName("Fairborn");
	    communication.setZip("516434");
	  
	    Marks marks = new Marks();
		marks.setSubject("maths");
		marks.setMarks(60);
		marks.setMaxMarks(100);

	   
		// Write JAXB object to File or any other stream. Here bookstore JAXB domain obj.
	    m.marshal(std , new File("C:/Users/sprak/Desktop/IMCS/Student.xml")); 

		
	}
}

