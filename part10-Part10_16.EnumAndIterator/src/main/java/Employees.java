
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class Employees {
    
    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        
        peopleToAdd.stream().forEach(s -> this.employees.add(s));
    }
    
    public void print() {
        
        Iterator<Person> list = this.employees.iterator();
        
        while (list.hasNext()) {
            System.out.println(list.next());
        }
    }
    
    public void print(Education education) {
        
        Iterator<Person> list = this.employees.iterator();
        
        while (list.hasNext()) {
            
            Person person = list.next();
            
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education) {
        
        Iterator<Person> list = this.employees.iterator();
        
        while (list.hasNext()) {
            
            if (list.next().getEducation().equals(education)) {
                list.remove();
            }
        }
    }
}
