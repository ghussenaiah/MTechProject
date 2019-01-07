package dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import model.Student;

public class StudentDaoInterfaceImp implements StudentDaoInterface {

	
	
	HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public int save(Student st) {
		
		int i=(Integer)ht.save(st);
		return i;
	}

	@Override
	public Student find(int id) {
		
	Student st=(Student)ht.get(Student.class, id);
		
		return st;
	}

}
