public class Mycontacts {
    private String name;
    private String phonenumber;
    private long _id;
public Mycontacts()
{

    }
public Mycontacts(String name,String phonenumber){
    this.name=name;
    this.phonenumber=phonenumber;
}
public Mycontacts(int id,String name,String phone_numbernumber){
    this._id=_id;
    this.name=name;
    this.phonenumber=phone_numbernumber;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public long get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
    return "PhoneNumber"+this.phonenumber+"Name"+this.name+"id"+this._id;
    }
}