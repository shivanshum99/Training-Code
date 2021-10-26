package caseStudy;

import java.util.*;

public class Project {
	private long budget;
	private String name;
	private int id;
	private long expense;
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	Project(){}
	Project(int id,String name,long budget){
		this.budget=budget;
		this.name=name;
		this.id = id;
		this.expense=0;
	}

	@Override
	public String toString() {
		return ", Id : "+this.id +", Project Name: "+ this.name +", Budget: "+this.budget;
	}

	public static void main(String[] args) {
		Project project1= new Project(1,"ATT",1000);
		Project project2= new Project(2,"Google",320);
		User user1 =new User(1,"User1",100,project1);
		User user2 = new User(2,"User2",150,project2);
		User user3 = new User(3,"User3",500,project1);

		ArrayList<User> usersList = new ArrayList<>();
		usersList.add(user1);
		usersList.add(user2);
		usersList.add(user3);
		ArrayList<User> project1Users = new ArrayList<>();
		ArrayList<User> project2Users = new ArrayList<>();
		for(User user:usersList) {
			if(user.getProject().getId() == 1) {
				project1Users.add(user);
			}else if(user.getProject().getId()==2) {
				project2Users.add(user);
			}
		}
		System.out.println("Project 1 " + project1Users);
		System.out.println("Project 2 " + project2Users);
		System.out.print("Project 1: Total Cost= ");
		System.out.print(project1.getBudget()-project1.getExpense());
		System.out.print(" credit of ");
		System.out.print(project1.getExpense());
		System.out.println(" available");

		System.out.print("Project 2: Total Cost= ");
		System.out.print(project2.getBudget()-project2.getExpense());
		System.out.print(" credit of ");
		System.out.print(project2.getExpense());
		System.out.println(" available");





	}

	public long getExpense() {
		return expense;
	}

	public void setExpense(long expense) {
		this.expense = expense;
	}

}
class User{
	private int id;
	private long salary;
	private String name;
	private Project project;
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "User Id: "+this.id +", User Name: "+
				this.name +", User Salary: "+this.salary+
				", Project: "+this.project+"\n";
	}
	User(){}
	User(int id,String name,long salary,Project project){
		this.salary=salary;
		this.name=name;
		this.id = id;
		this.project = project;
		project.setExpense(project.getExpense()+salary);
	}

}