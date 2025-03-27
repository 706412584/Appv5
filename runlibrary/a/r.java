package i.runlibrary.a;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public final class r {
    public static SQLiteDatabase a(Context context, String str, boolean z) {
        if (z) {
            try {
                return context.openOrCreateDatabase(str, 0, null);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        d.a(str, false);
        return SQLiteDatabase.openOrCreateDatabase(str, null);
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(new e("DROP TABLE ").append(str).toString());
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            sQLiteDatabase.execSQL(new e("CREATE TABLE ").append(str).append(" (").append(str2).append(")").toString());
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            sQLiteDatabase.execSQL(new e("INSERT INTO ").append(str).append(" (").append(str2).append(") VALUES (").append(str3).append(")").toString());
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean b(Context context, String str, boolean z) {
        if (z) {
            str = context.getDatabasePath(str).getAbsolutePath();
        }
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(str, null, 1);
            if (openDatabase != null) {
                openDatabase.close();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean b(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(new e("SELECT count(name) as c FROM sqlite_master where type='table' and name='").append(str).append("'").toString(), null);
            if (rawQuery.moveToNext() && rawQuery.getInt(0) > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String str3 = "DELETE FROM ";
        if (str2 != null) {
            try {
                str = new e(str3).append(str).append(" WHERE ").append(str2).toString();
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
        str = new e(str3).append(str).toString();
        sQLiteDatabase.execSQL(str);
        return true;
    }

    public static boolean b(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        String str4 = " SET ";
        String str5 = "UPDATE ";
        if (str3 != null) {
            try {
                str = new e(str5).append(str).append(str4).append(str2).append("  WHERE ").append(str3).toString();
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
        str = new e(str5).append(str).append(str4).append(str2).toString();
        sQLiteDatabase.execSQL(str);
        return true;
    }

    public static Cursor c(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        String str4 = " from ";
        String str5 = "SELECT ";
        if (str3 == null) {
            return sQLiteDatabase.rawQuery(new e(str5).append(str).append(str4).append(str2).toString(), null);
        }
        try {
            return sQLiteDatabase.rawQuery(new e(str5).append(str).append(str4).append(str2).append(" WHERE ").append(str3).toString(), null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}