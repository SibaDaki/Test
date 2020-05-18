package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity

public class ServiceEntity {
	
	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Please enter Service Name")
    @Column(name = "serviceName")
	private String serviceName;
	
	@NotBlank(message = "Please enter AD Group")
    @Column(name = "adGroup")
	private String adGroup;  
	
	@NotBlank(message = "Please enter Username")
    @Column(name = "username")
	private String username;   
	
	@NotBlank(message = "Please enter Password")
    @Column(name = "pasword")
	private String pasword; 
	
	@NotBlank(message = "Please enter Username")
    @Column(name = "contractID")
	private String contractID;
	
	@NotBlank(message = "Please enter End Point")
    @Column(name = "endPoint")
	private String endPoint;
	
	@NotBlank(message = "Please enter Int L7 End Point")
    @Column(name = "l7EndPointInt")
	private String l7EndPointInt;
	
	@NotBlank(message = "Please enter Ext L7 End Point")
    @Column(name = "l7EndPointExt")
	private String l7EndPointExt;
	
	@NotBlank(message = "Please enter Consumer")
    @Column(name = "consumer")
	private String consumer;
		
	
	public long getId() {    
	    return id;    
	}   
	public void setId(long id) {    
	    this.id = id;    
	}  
	public String getServiceName() {    
	    return serviceName;    
	}   
	public void setServiceNmae(String serviceName) {    
	    this.serviceName = serviceName;    
	} 
	public String getAdGroup() {    
	    return adGroup;    
	}   
	public void setAdGroup(String adGroup) {    
	    this.adGroup = adGroup;    
	}  
	
	public String getUsername() {    
	    return username;    
	}   
	public void setUsername(String username) {    
	    this.username = username;    
	}  
	public String getPasword() {    
	    return pasword;    
	}   
	public void setPasword(String pasword) {    
	    this.pasword = pasword;    
	}  
	public String getContractID() {    
	    return contractID;    
	}   
	public void setContractID(String contractID) {    
	    this.contractID = contractID;    
	}  
	public String getEndPoint() {    
	    return endPoint;    
	}   
	public void setEndPoint(String endPoint) {    
	    this.endPoint = endPoint;    
	}  
	
	public String getL7EndPointInt() {    
	    return l7EndPointInt;    
	}   
	public void setL7EndPointIntp(String l7EndPointInt) {    
	    this.l7EndPointInt = l7EndPointInt;    
	}  
	public String getL7EndPointExt() {    
	    return l7EndPointExt;    
	}   
	public void setL7EndPointExt(String l7EndPointExt) {    
	    this.l7EndPointExt = l7EndPointExt;    
	}  
	public String getConsumer() {    
	    return consumer;    
	}   
	public void setConsumer(String consumer) {    
	    this.consumer = consumer;    
	}  

}
