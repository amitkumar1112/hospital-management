import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class mydatabase extends SQLiteOpenHelper {
    private static String dbname = "my database";
    private static int dbversion = 1;
    Context ct;
    mydatabase(Context c) {
        super(c, dbname, null, dbversion);
        ct = c;
    }
    @Override
    public void onCreate (SQLiteDatabase sqLiteDatabase) {
        Toast.makeText(ct, "in oncreate", Toast.LENGTH_LONG).show();
        String s = "create table info(name text,age integer,address text, ailment text) ";
        sqLiteDatabase.execSQL(s);

    }
    public void insertvalues(String s1,int s2, String s3, String s4){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("name",s1);
        cv.put("age",s2);
        cv.put("address",s3);
        cv.put("ailment",s4);

        db.insert("info",null,cv);
        Toast.makeText(ct,"insrt complete",Toast.LENGTH_LONG).show();
    }
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int il){}
}
