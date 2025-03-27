package i.runlibrary.app;

import android.os.Build.VERSION;
import i.runlibrary.a.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class 字符 extends zf {

    public class json {
        public JSONObject json;

        public json(JSONObject jSONObject) {
            this.json = jSONObject;
        }

        public String json(Object obj) {
            return obj instanceof JSONObject ? ((JSONObject) obj).toString() : obj instanceof JSONArray ? ((JSONArray) obj).toString() : null;
        }

        /* renamed from: 删除 */
        public boolean m147(Object obj, Object obj2) {
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

        /* renamed from: 对象 */
        public JSONObject m223(Object obj, Object obj2) {
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

        /* renamed from: 对象列表 */
        public JSONArray m224(Object obj, Object obj2) {
            try {
                if (obj instanceof JSONObject) {
                    return ((JSONObject) obj).getJSONArray(obj2.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        /* renamed from: 获取 */
        public Object m225(Object obj, Object obj2) {
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

        /* renamed from: 设置 */
        public Object m226(Object obj, Object obj2, Object obj3) {
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

        /* renamed from: 长度 */
        public int m221(Object obj) {
            return obj instanceof JSONObject ? ((JSONObject) obj).length() : obj instanceof JSONArray ? ((JSONArray) obj).length() : -1;
        }
    }

    public class 正则表达式 {
        /* renamed from: 匹配器 */
        public Matcher f61;

        public 正则表达式(String str, String str2, int i) {
            this.f61 = Pattern.compile(str2, i).matcher(str);
        }

        /* renamed from: 匹配 */
        public boolean m227() {
            return this.f61.find();
        }

        /* renamed from: 匹配 */
        public boolean m228(int i) {
            return this.f61.find(i);
        }

        /* renamed from: 匹配组数量 */
        public int m229() {
            return this.f61.groupCount();
        }

        /* renamed from: 字符 */
        public String m230() {
            return this.f61.group();
        }

        /* renamed from: 字符 */
        public String m231(int i) {
            return this.f61.group(i);
        }

        /* renamed from: 开始位置 */
        public int m232() {
            return this.f61.start();
        }

        /* renamed from: 开始位置 */
        public int m233(int i) {
            return this.f61.start(i);
        }

        /* renamed from: 是否匹配成功 */
        public boolean m234() {
            return this.f61.matches();
        }

        /* renamed from: 替换一个 */
        public String m235(Object obj) {
            return this.f61.replaceFirst(obj.toString());
        }

        /* renamed from: 替换全部 */
        public String m236(Object obj) {
            return this.f61.replaceAll(obj.toString());
        }

        /* renamed from: 结束位置 */
        public int m237() {
            return this.f61.end();
        }

        /* renamed from: 结束位置 */
        public int m238(int i) {
            return this.f61.end(i);
        }
    }

    public 字符(AppInfo appInfo) {
        super(appInfo);
    }

    /* renamed from: json解析 */
    public json m200json(Object obj) {
        JSONObject eVar;
        try {
            eVar = new e(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
            eVar = null;
        }
        return eVar == null ? null : new json(eVar);
    }

    /* renamed from: 倒查 */
    public int m201(Object obj, Object obj2) {
        return super.dc(obj, obj2);
    }

    /* renamed from: 倒查 */
    public int m202(Object obj, Object obj2, Object obj3) {
        return super.dc(obj, obj2, obj3);
    }

    /* renamed from: 分割 */
    public String[] m203(Object obj, Object obj2) {
        return super.fg(obj, obj2);
    }

    /* renamed from: 分割 */
    public String[] m204(Object obj, Object obj2, Object obj3) {
        return super.fg(obj, obj2, obj3);
    }

    /* renamed from: 去除头尾空白 */
    public String m205(Object obj) {
        return super.qctwkg(obj);
    }

    /* renamed from: 取出 */
    public String m206(Object obj, Object obj2) {
        return super.qc(obj, obj2);
    }

    /* renamed from: 取出 */
    public String m207(Object obj, Object obj2, Object obj3) {
        return super.qc(obj, obj2, obj3);
    }

    /* renamed from: 字符 */
    public String m208(int i) {
        return super.zf(i);
    }

    /* renamed from: 字符 */
    public String m209(String str) {
        return super.zf(str);
    }

    /* renamed from: 存在 */
    public boolean m210(Object obj, Object obj2) {
        return super.cz(obj, obj2);
    }

    /* renamed from: 替换 */
    public String m211(Object obj, Object obj2, Object obj3) {
        return super.th(obj, obj2, obj3);
    }

    /* renamed from: 替换 */
    public String m212(Object obj, Object obj2, Object obj3, Object obj4) {
        return super.th(obj, obj2, obj3, obj4);
    }

    /* renamed from: 查开头 */
    public boolean m213(Object obj, Object obj2) {
        return super.ckt(obj, obj2);
    }

    /* renamed from: 查结尾 */
    public boolean m214(Object obj, Object obj2) {
        return super.cjw(obj, obj2);
    }

    /* renamed from: 查询 */
    public int m215(Object obj, Object obj2) {
        return super.cx(obj, obj2);
    }

    /* renamed from: 查询 */
    public int m216(Object obj, Object obj2, Object obj3) {
        return super.cx(obj, obj2, obj3);
    }

    /* renamed from: 正则表达式 */
    public 正则表达式 m217(Object obj, Object obj2, Object obj3) {
        return new 正则表达式(obj.toString(), obj2.toString(), s.d(obj3));
    }

    /* renamed from: 等于 */
    public boolean m218(Object obj, Object obj2) {
        return super.dy(obj, obj2);
    }

    /* renamed from: 转换大写 */
    public String m219(Object obj) {
        return super.zhdx(obj);
    }

    /* renamed from: 转换小写 */
    public String m220(Object obj) {
        return super.zhxx(obj);
    }

    /* renamed from: 长度 */
    public int m221(Object obj) {
        return super.cd(obj);
    }

    /* renamed from: 随机数 */
    public long m222(Object obj, Object obj2) {
        return super.sjs(obj, obj2);
    }
}