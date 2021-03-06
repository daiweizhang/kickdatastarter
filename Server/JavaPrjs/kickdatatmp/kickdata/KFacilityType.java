package kickdata;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;


@Entity
@Access(AccessType.PROPERTY)
public class KFacilityType implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6384296851611395845L;
	private int id;
	private String typename;
	private String tablename;


	public KFacilityType() {
		// TODO Auto-generated constructor stub
	}
	
	public KFacilityType(int id, String typename, String tablename) {
		this.id = id;
		this.typename = typename;
		this.tablename = tablename;
	}
	
	@Id @GeneratedValue
	public int getid() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Basic
	public String getTableName() {
		return tablename;
	}
	
	public void setTableName(String tablename) {
		this.tablename = tablename;
	}
	
	@Basic
	public String getTypeName() {
		return typename;
	}
	public void setTypeName(String typename) {
		this.typename = typename;
	}
	
	@OneToMany(mappedBy="KFacilityType")
	public Collection<KFacility> Facilities;
	
	@OneToMany(mappedBy="KFacilityType")
	public Collection<KFacility> Rights;

}
