import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class MyMedicineTable extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1; // number the version
    private static final String DATABASE_NAME = "MEDECINE_DB";// name
    private static final String TABLE_MEDECINE = "MEDECINE_TBL";// The name of the TABLE
    private static final String KEY_ID = "_id";
    ///////////
    private static final String KEY_NAME = "nameMedecine";
    private static final String KEY_RESONE = "resone";
    private static final String KEY_DAMEGE = "Damege";
    private static final String KEY_PERCENT = "Percent";

    public MyMedicineTable(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreate = "CREATE TABLE " + TABLE_MEDECINE + "("
                + KEY_DAMEGE + "TEXT"
                + KEY_NAME + "TEXT"
                + KEY_PERCENT + "TEXT"
                + KEY_RESONE + "TEXT"
                + ")";
        db.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sqlDrop = "DROP TABLE IF EXISTS " + TABLE_MEDECINE;
        db.execSQL(sqlDrop);
        onCreate(db);

    }

    public long addPatient(MyPharmacy medicine) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values1 = new ContentValues();
        values1.put(KEY_NAME, medicine.getNameMedecine());
        values1.put(KEY_RESONE, medicine.getResone());
        values1.put(KEY_DAMEGE, medicine.getDamege());
        values1.put(KEY_PERCENT, medicine.getPercent());
        long row = db.insert(TABLE_MEDECINE, null, values1);
        db.close();
        return row;
    }

    public int updatePatient(MyPharmacy medicine) {
        SQLiteDatabase db = this.getWritableDatabase();
        /////////////
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, medicine.getNameMedecine());
        values.put(KEY_RESONE, medicine.getResone());
        values.put(KEY_DAMEGE, medicine.getDamege());
        values.put(KEY_PERCENT, medicine.getPercent());
        int num = db.update(TABLE_MEDECINE, values, KEY_ID + "=" + medicine.get_id1(), null);
        db.close();
        return num;
    }

    public int deletePatientById(MyPharmacy medicine) {
        SQLiteDatabase db = this.getWritableDatabase();
        int num = db.delete(TABLE_MEDECINE, KEY_ID + "=" + medicine.get_id1(), null);
        db.close();
        return num;
    }

    public ArrayList<MyPharmacy> getAllPatient()
    {
        ArrayList<MyPharmacy> medicineList = new ArrayList<MyPharmacy>();
        String selectQuery = "SELECT*FROM " + TABLE_MEDECINE;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor coursor = db.rawQuery(selectQuery, null);
        boolean flag=coursor.moveToFirst();
        while (flag==true){
            MyPharmacy medicine=new MyPharmacy();
            medicine.set_id1(coursor.getLong(0));
            medicine.setPercent(coursor.getDouble(2));
            medicine.setNameMedecine(coursor.getString(1));
            medicine.setResone(coursor.getString(3));
            medicine.setDamege(coursor.getString(4));
            medicineList.add(medicine);
            flag=coursor.moveToNext();
            //555

        }
        return medicineList;
    }
}



