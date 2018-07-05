package org.tact.model;


import javax.persistence.*;

@Entity
@Table(name = "tip")
public class Tip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tip_id")
    private Integer tipId;

    @Column(name = "tips", nullable = false)
    private String tips;

    @Column(name = "added_by", nullable = false)
    private String addedBy;

    public Tip() {
    }

    public Tip(Integer bookingId, String tips, String addedBy) {
        this.tipId = bookingId;
        this.tips = tips;
        this.addedBy = addedBy;
    }

    public Integer getTipId(){
    	return this.tipId;
    }
    
    public void setTipId(Integer tipId){
    	this.tipId = tipId;
    }
    
    public String getTips(){
    	return this.tips;
    }
    
    public void setTips(String tips){
    	this.tips = tips;
    }
    
    public String getAddedBy(){
    	return this.addedBy;
    }
    
    public void setAddedBy(String addedBy){
    	this.addedBy = addedBy;
    }

	@Override
	public String toString() {
		return "Tip [tipId=" + tipId + ", tips=" + tips + ", addedBy=" + addedBy + "]";
	}
}
