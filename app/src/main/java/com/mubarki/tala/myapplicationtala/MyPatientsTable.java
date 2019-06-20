package com.mubarki.tala.myapplicationtala;

        import android.content.ContentValues;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

        import com.mubarki.tala.myapplicationtala.MyClinic;

        import java.util.ArrayList;

public class MyPatientsTable extends SQLiteOpenHelper { //

    private static final int DATABASE_VERSION = 1; // number the version
    private static final String DATABASE_NAME = "PATIENTS_DB";// name
    private static final String TABLE_PATIENTS = "PATIENTS_TBL";// The name of the TABLE
    ///////////////////////
    private static final String KEY_NAME="name";
    private static final String KEY_ID="_id";
    private static final String KEY_ILLNESS="illness"; ////
    private static final String KEY_THETHERAPYSORT="therapysort";
    private static final String KEY_ALLERGY="allergy";

    public MyPatientsTable(Context context)
    {
        super(context,DATABASE_NAME, null ,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String sqlCreate = "CREATE TABLE "+TABLE_PATIENTS+"("
                +KEY_ID+"INTEGER PRIMARY KEY,"
                +KEY_ALLERGY+"TEXT"
                +KEY_ILLNESS+"TEXT"
                +KEY_NAME+"TEXT"
                +KEY_THETHERAPYSORT+"TEXT"
                +")";
        db.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sqlDrop="DROP TABLE IF EXISTS "+ TABLE_PATIENTS;
        db.execSQL(sqlDrop);
        onCreate(db);
    }
    public long addPatient(MyClinic patient){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(KEY_NAME,patient.getName());
        values.put(KEY_ALLERGY,patient.getAllergy());
        values.put( KEY_ILLNESS,patient.getIllness());
        values.put(KEY_THETHERAPYSORT,patient.getTherapysort());
        long row=db.insert(TABLE_PATIENTS,null,values);
        db.close();
        return row;
    }
    public int updatePatient(MyClinic patient){
        SQLiteDatabase db=this.getWritableDatabase();
        /////////////
        ContentValues values=new ContentValues();
        values.put(KEY_NAME,patient.getName());
        values.put(KEY_ALLERGY,patient.getAllergy());
        values.put( KEY_ILLNESS,patient.getIllness());
        values.put(KEY_THETHERAPYSORT,patient.getTherapysort());
        int num=db.update(TABLE_PATIENTS,values,KEY_ID+"="+patient.get_id(),null);
        db.close();
        return num;
    }
    public int deletePatientById(MyPharmacy medicine){
        SQLiteDatabase db =this.getWritableDatabase();
        int num=db.delete(TABLE_PATIENTS,KEY_ID+"="+medicine.get_id1(),null);
        db.close();
        return num;
    }
    public ArrayList<MyClinic> getAllMedicine()
    {
        ArrayList<MyClinic> patientsList=new ArrayList<MyClinic>();
        String selectQuery="SELECT*FROM "+TABLE_PATIENTS;
        SQLiteDatabase db =this.getWritableDatabase();
        Cursor coursor =db.rawQuery(selectQuery,null);
        boolean flag=coursor.moveToFirst();
        while (flag==true){
            MyClinic patient=new MyClinic();
            patient.set_id(coursor.getLong(0));
            patient.setIllness(coursor.getString(2));
            patient.setName(coursor.getString(1));
            patient.setAllergy(coursor.getString(3));
            patient.setTherapysort(coursor.getString(4));
            patientsList.add(patient);
            flag=coursor.moveToNext();
        }
        return patientsList;
    }
}
