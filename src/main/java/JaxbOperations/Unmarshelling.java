package JaxbOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.example.student.Student;



public class Unmarshelling {

    public static void main(String[] args) throws JAXBException, FileNotFoundException, DatatypeConfigurationException {

        // instantiate unmarshaller.
        JAXBContext context = JAXBContext.newInstance(Student.class);
        Unmarshaller um = context.createUnmarshaller();
        Student student = (Student) um.unmarshal(new FileReader("C:/temp/book.xml"));
        System.out.println(student);
    }

}