package beans;

import java.util.Set;

public class Faculty {
	
	private int fid;
	private String name;
	private int exp;
	private Set<Cource> cources;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public Set<Cource> getCources() {
		return cources;
	}
	public void setCources(Set<Cource> cources) {
		this.cources = cources;
	}
	

}
