package com.example.MachinePulse.daoimpl;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.MachinePulse.dao.MachinePulseDao;

@Repository
public class MachinePulseDaoImpl implements MachinePulseDao{
	
	@Autowired
	private Environment env;
	
	public String testService() {
		
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper objMpr = new ObjectMapper();
		
		
		
		/*SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
	    Proxy proxy= new Proxy(Type.HTTP, new InetSocketAddress("cis-india-pitc-bangalorez.proxy.corporate.ge.com", 80));
	    requestFactory.setProxy(proxy);
	    restTemplate.setRequestFactory(requestFactory);*/
		
	    ResponseEntity<String> soaData =  restTemplate.getForEntity(env.getProperty("test_url"),String.class);
	    String output = soaData.getBody();
	    
		return output;
	}
	
	/*@Override
	public String testService() {
		
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper objMpr = new ObjectMapper();
		
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
	    Proxy proxy= new Proxy(Type.HTTP, new InetSocketAddress("cis-india-pitc-bangalorez.proxy.corporate.ge.com", 80));
	    requestFactory.setProxy(proxy);
	    restTemplate.setRequestFactory(requestFactory);
		
	    Map<String, String> sampleInp = new HashMap<String, String>();
	    sampleInp.put("tfaSSO", "503017885");
	    sampleInp.put("tfaFirstName", "tfn");
	    sampleInp.put("tfaLastName", "tfl");
	    sampleInp.put("region", "reg");
	    sampleInp.put("managerSSO", "505050505");
	    sampleInp.put("managerFirstName", "mfn");
	    sampleInp.put("managerLastName", "mln");
	    sampleInp.put("serviceType", "st");
	    sampleInp.put("serviceTeam", "st");
	    sampleInp.put("ssoLogin", "505050505");
	    
	    ResponseEntity<String> soaData =  restTemplate.postForEntity(env.getProperty("test_post_url"),sampleInp,String.class);
	    String output = soaData.getBody();
	    
		return output;
	}*/
	

	
}
