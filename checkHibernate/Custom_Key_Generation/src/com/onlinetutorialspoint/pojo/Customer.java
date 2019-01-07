package com.onlinetutorialspoint.pojo;

public class Customer implements java.io.Serializable {
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerId;
    private String customerName;
    private String city;
 
    
    
    public Customer() {
		super();
		
	}

	public Customer(String customerId, String customerName, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
	}

	public String getCustomerId() {
        return customerId;
    }
 
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
 
    public String getCustomerName() {
        return customerName;
    }
 
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
}