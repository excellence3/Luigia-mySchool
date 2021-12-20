package it.ntt.myschool.BootstapData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.ntt.myschool.model.SchoolClass;
import it.ntt.myschool.model.Student;
import it.ntt.myschool.repository.SchoolClassRepository;
import it.ntt.myschool.repository.StudentRepository;

@Component
public class BootstrapData  implements CommandLineRunner
{
     @Autowired
    private SchoolClassRepository schoolClassRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception
    {
       
        SchoolClass class1= new SchoolClass("1A");
        SchoolClass class2= new SchoolClass("1B");
        SchoolClass class3= new SchoolClass("1C");

        Student s1=new Student("Bugs","Bunny",10,class1);
        Student s2=new Student("Duffy","Duck",10,class1);
        Student s3=new Student("Porky","Pig",10,class2);
        Student s4=new Student("Speedy","Gonzales",10,class2);
        Student s5=new Student("Wile E","Coyote",10,class3);
        Student s6=new Student("Lola","Bunny",10,class3);

        schoolClassRepository.save(class1);
        schoolClassRepository.save(class2);
        schoolClassRepository.save(class3);
        studentRepository.save(s1);
        studentRepository.save(s2);
        studentRepository.save(s3);
        studentRepository.save(s4);
        studentRepository.save(s5);
        studentRepository.save(s6);

       
    }
    
}
