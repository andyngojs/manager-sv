package app;
/**
 *
 * @author Administrator
 */
public class Students {
    private String name , date , lop , nganh , phone ;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
       this.name = name ;
    }
    
    public String getDate() {
        return date ;
    }
    public void setDate(String date) {
        this.date = date ;
    }
    
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public String getNganh() {
        return nganh;
    }
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public Object[] toObject() {
        return new Object[] {
            this.getName() , this.getDate() , this.getLop() , this.getNganh() , this.getPhone()
        };
    }
}
