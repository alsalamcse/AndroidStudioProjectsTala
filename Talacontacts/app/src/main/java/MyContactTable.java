import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

import java.io.InterruptedIOException;


public class MyContactTable extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1; // number the version
    private static final String DATABASE_NAME="CONTACTS_DB";// name
    private static final String TABLE_CONTACTS="CONTACTS_TBL";// The name of the TABLE
    ////////////////
    private static final String KEY_ID="_id";
    private static final String KEY_NAME="name";
    private static final String KEY_PH_NO="phone_number";
    //////////////////////
     MyContactTable( Context context) {
        super(context,DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
