public class MyPharmacy {
    private String nameMedecine,resone,Damege;
    private double Percent;
    private long _id1;


    public MyPharmacy(){
        this.nameMedecine=nameMedecine;
        this.resone=resone;
        this.Damege=Damege;
        this.Percent=Percent;
        this._id1=_id1;
    }

    public double getPercent() {
        return Percent;
    }

    public String getDamege() {
        return Damege;
    }

    public String getNameMedecine() {
        return nameMedecine;
    }

    public String getResone() {
        return resone;
    }

    public void setDamege(String damege) {
        Damege = damege;
    }

    public void setNameMedecine(String nameMedecine) {
        this.nameMedecine = nameMedecine;
    }

    public void setPercent(double percent) {
        Percent = percent;
    }

    public void setResone(String resone) {
        this.resone = resone;
    }

    public long get_id1() {
        return _id1;
    }

    public void set_id1(long _id1) {
        this._id1 = _id1;
    }

    public String toString() {
        return "The Name Of It:"+this.nameMedecine+"Why Did You Gave It To Your Patient "+this.resone+"Is There Any Damege on the Patients Helth?"+this.Percent+"How Many Percent People take it:"+ this.Damege+"His ID Is:"+this._id1;
    }


}