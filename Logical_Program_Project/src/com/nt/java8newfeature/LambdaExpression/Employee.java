package com.nt.java8newfeature.LambdaExpression;

public class Employee {
	

	private int Empno;
	private String EmpName;
	private String EmpAddress;
	private int EmpRegno;

	
  

   
	public Employee(int empno, String empName, String empAddress, int empRegno) {
		super();
		this.Empno = empno;
		this.EmpName = empName;
		this.EmpAddress = empAddress;
		this.EmpRegno = empRegno;
	}

	public void setEmpno(int Empno) {
		this.Empno=Empno;
	}
	
	public int getEmpno() {
		return this.Empno;
	}
	
	
	public void setEmpName(String EmpName) {
		this.EmpName=EmpName;
	}
	
	
	public String getEmpName() {
		return this.EmpName;
	}
	
	public void setEmpAddress(String EmpAddress) {
		this.EmpAddress=EmpAddress;
	}
	
    public String getEmpAddress() {
    	return this.EmpAddress;
    }
    
    public void setEmpRegno(int EmpRegno) {
    	this.EmpRegno=EmpRegno;
    }
    
    public int getEmpRegno() {
    	return this.EmpRegno;
    }
    
    @Override
	public String toString() {
		return "Employee [Empno=" + Empno + ", EmpName=" + EmpName + ", EmpAddress=" + EmpAddress + ", EmpRegno="
				+ EmpRegno + "]";
	}
    
    
}