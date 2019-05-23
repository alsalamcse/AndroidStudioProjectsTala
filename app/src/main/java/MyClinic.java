public class MyClinic {
////////////////
    private String name;
    private String illness;
    private long _id;                          ///////////
    private String therapysort;
    private String allergy;
    /////////////
    public MyClinic(String name,String illness,Long _id,String therapysort,String allergy){
        this._id=_id;
        this.allergy=allergy;
        this.illness=illness;
        this.name=name;
        this.therapysort=therapysort;
    }

    public MyClinic() {

    }

    public long get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getAllergy() {
        return allergy;
    }

    public String getIllness() {
        return illness;
    }

    public String getTherapysort() {
        return therapysort;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void setTherapysort(String therapysort) {
        this.therapysort = therapysort;
    }
    public String ToString(){
        return "The Patient Name:"+this.name+"ID:"+this._id+"The Illness Sort:"+this.illness+"The Therapy Sort:"+this.therapysort+"Is There Any Allergy?"+this.allergy;

    }
}
