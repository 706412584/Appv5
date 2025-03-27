package i.runlibrary.app;

import android.os.Build.VERSION;
import i.app.Downcenter;
import i.app.DownloadThreads.DownloadThread;
import i.runlibrary.a.a;
import i.runlibrary.a.s;
import i.runlibrary.app.v.dx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class zf {
    private AppInfo a = null;

    public class json {
        public JSONObject json;

        public json(JSONObject jSONObject) {
            this.json = jSONObject;
        }

        public int cd(Object obj) {
            return obj instanceof JSONObject ? ((JSONObject) obj).length() : obj instanceof JSONArray ? ((JSONArray) obj).length() : -1;
        }

        public dx dx(Object obj, Object obj2) {
            try {
                if (obj instanceof JSONObject) {
                    return ((JSONObject) obj).getJSONObject(obj2.toString());
                }
                if (obj instanceof JSONArray) {
                    return ((JSONArray) obj).getJSONObject(s.d(obj2));
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public JSONArray dxlb(Object obj, Object obj2) {
            try {
                if (obj instanceof JSONObject) {
                    return ((JSONObject) obj).getJSONArray(obj2.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public Object hq(Object obj, Object obj2) {
            try {
                if (obj instanceof JSONObject) {
                    return ((JSONObject) obj).get(obj2.toString());
                }
                if (obj instanceof JSONArray) {
                    return ((JSONArray) obj).get(s.d(obj2));
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String json(Object obj) {
            return obj instanceof JSONObject ? ((JSONObject) obj).toString() : obj instanceof JSONArray ? ((JSONArray) obj).toString() : null;
        }

        public boolean sc(Object obj, Object obj2) {
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).remove(obj2.toString());
            } else if (!(obj instanceof JSONArray) || VERSION.SDK_INT < 19) {
                return false;
            } else {
                try {
                    ((JSONArray) obj).remove(s.d(obj2));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return true;
        }

        public Object sz(Object obj, Object obj2, Object obj3) {
            try {
                if (obj instanceof JSONObject) {
                    return ((JSONObject) obj).put(obj2.toString(), obj3.toString());
                }
                if (obj instanceof JSONArray) {
                    return ((JSONArray) obj).put(s.d(obj2), obj3.toString());
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class zzbds {
        public Matcher m;

        public zzbds(String str, String str2, int i) {
            this.m = Pattern.compile(str2, i).matcher(str);
        }

        public int jswz() {
            return this.m.end();
        }

        public int jswz(int i) {
            return this.m.end(i);
        }

        public int kswz() {
            return this.m.start();
        }

        public int kswz(int i) {
            return this.m.start(i);
        }

        public boolean pp() {
            return this.m.find();
        }

        public boolean pp(int i) {
            return this.m.find(i);
        }

        public int ppzsl() {
            return this.m.groupCount();
        }

        public boolean sfppcg() {
            return this.m.matches();
        }

        public String thqb(Object obj) {
            return this.m.replaceAll(obj.toString());
        }

        public String thyg(Object obj) {
            return this.m.replaceFirst(obj.toString());
        }

        public String zf() {
            return this.m.group();
        }

        public String zf(int i) {
            return this.m.group(i);
        }
    }

    public zf(AppInfo appInfo) {
        this.a = appInfo;
    }

    public int cd(Object obj) {
        return obj == null ? -1 : a.a(obj.toString());
    }

    public boolean cjw(Object obj, Object obj2) {
        return obj == null ? false : obj.toString().endsWith(String.valueOf(obj2));
    }

    public boolean ckt(Object obj, Object obj2) {
        return obj == null ? false : obj.toString().startsWith(String.valueOf(obj2));
    }

    public int cx(Object obj, Object obj2) {
        if (obj instanceof String) {
            if (obj2 instanceof String) {
                return Downcenter.a((String) obj, (String) obj2);
            }
        }
        return -1;
    }

    public int cx(Object obj, Object obj2, Object obj3) {
        if ((obj instanceof String) && (obj2 instanceof String)) {
            if (obj3 instanceof Number) {
                return s.a((String) obj, (String) obj2, ((Number) obj3).intValue());
            }
        }
        return -1;
    }

    public boolean cz(Object obj, Object obj2) {
        return obj == null ? false : obj.toString().contains(String.valueOf(obj2));
    }

    public int dc(Object obj, Object obj2) {
        if (obj instanceof String) {
            if (obj2 instanceof String) {
                return s.b((String) obj, (String) obj2);
            }
        }
        return -1;
    }

    public int dc(Object obj, Object obj2, Object obj3) {
        if ((obj instanceof String) && (obj2 instanceof String)) {
            if (obj3 instanceof Number) {
                return s.b((String) obj, (String) obj2, ((Number) obj3).intValue());
            }
        }
        return -1;
    }

    public boolean dy(Object obj, Object obj2) {
        return obj == obj2 ? true : obj != null ? obj.equals(obj2) : obj2 != null ? obj2.equals(obj) : false;
    }

    public String[] fg(Object obj, Object obj2) {
        return obj == null ? null : s.c(obj.toString(), String.valueOf(obj2));
    }

    public String[] fg(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            return null;
        }
        boolean equals = obj3.equals(Boolean.valueOf(true));
        String obj4 = obj.toString();
        String valueOf = String.valueOf(obj2);
        return equals ? obj4.split(valueOf) : s.c(obj4, valueOf);
    }

    public json json(Object obj) {
        JSONObject eVar;
        try {
            eVar = new e(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
            eVar = null;
        }
        return eVar == null ? null : new json(eVar);
    }

    public String qc(Object obj, Object obj2) {
        return s.a(obj, obj2);
    }

    public String qc(Object obj, Object obj2, Object obj3) {
        return s.a(obj, obj2, obj3);
    }

    public String qctwkg(Object obj) {
        return obj == null ? null : a.b(obj.toString());
    }

    public long sjs(Object obj, Object obj2) {
        return DownloadThread.a(s.e(obj), s.e(obj2));
    }

    public String th(Object obj, Object obj2, Object obj3) {
        return obj == null ? null : s.a(obj.toString(), String.valueOf(obj2), String.valueOf(obj3));
    }

    public String th(Object obj, Object obj2, Object obj3, Object obj4) {
        return obj == null ? null : s.a(obj.toString(), String.valueOf(obj2), String.valueOf(obj3), obj4.equals(Boolean.valueOf(true)));
    }

    public String zf(int i) {
        return this.a.c.getString(i);
    }

    public String zf(String str) {
        return this.a.c.getString(this.a.getIdentifier(str, "string"));
    }

    public String zhdx(Object obj) {
        return obj == null ? null : s.d(obj.toString());
    }

    public String zhxx(Object obj) {
        return obj == null ? null : s.c(obj.toString());
    }

    public zzbds zzbds(Object obj, Object obj2, Object obj3) {
        return new zzbds(obj.toString(), obj2.toString(), s.d(obj3));
    }
}