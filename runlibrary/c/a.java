package i.runlibrary.c;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import i.app.FileProvider;
import i.app.iActivity;
import i.runlibrary.a.i;
import i.runlibrary.a.s;
import i.runlibrary.app.AppInfo;
import i.runlibrary.app.gj.txcl;
import i.runlibrary.app.v.tx;
import i.runlibrary.app.v.图像;
import i.runlibrary.app.工具.图像处理;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.net.DatagramSocket;

public final class a {
    public static Intent a(Context context, Object obj) {
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        if (obj instanceof txcl) {
            return ((txcl) obj).tx;
        }
        if (obj instanceof 图像处理) {
            return ((图像处理) obj).f64.tx;
        }
        if (obj instanceof Drawable) {
            return ((BitmapDrawable) obj).getBitmap();
        }
        Drawable drawable;
        if (obj instanceof ImageView) {
            drawable = ((ImageView) obj).getDrawable();
        } else {
            ImageView imageView;
            if (obj instanceof tx) {
                imageView = ((tx) obj).st;
            } else if (obj instanceof 图像) {
                imageView = ((图像) obj).f133;
            } else if (obj instanceof Integer) {
                return BitmapFactory.decodeResource(context.getResources(), s.d(obj));
            } else {
                String valueOf = String.valueOf(obj);
                return valueOf.startsWith("@") ? FileProvider.a(context, FileProvider.a(context, valueOf)) : i.runlibrary.a.a.a(FileProvider.a(context, valueOf));
            }
            drawable = imageView.getDrawable();
        }
        return ((BitmapDrawable) drawable).getBitmap();
    }

    private static Drawable a(Context context, int i) {
        Drawable drawable = null;
        try {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(i, typedValue, true);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(typedValue.resourceId, new int[]{i});
            drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        } catch (Exception e) {
            e.printStackTrace();
            return drawable;
        }
    }

    public static Drawable a(Object obj, Context context) {
        if (obj instanceof Drawable) {
            return (Drawable) obj;
        }
        Drawable bitmapDrawable;
        if (obj instanceof Bitmap) {
            bitmapDrawable = new BitmapDrawable(context.getResources(), (Bitmap) obj);
        } else if (obj instanceof txcl) {
            bitmapDrawable = new BitmapDrawable(context.getResources(), ((txcl) obj).tx);
        } else if (obj instanceof 图像处理) {
            bitmapDrawable = new BitmapDrawable(context.getResources(), ((图像处理) obj).f64.tx);
        } else {
            ImageView imageView;
            if (obj instanceof ImageView) {
                imageView = (ImageView) obj;
            } else if (obj instanceof tx) {
                imageView = ((tx) obj).st;
            } else if (!(obj instanceof 图像)) {
                return b(obj, context);
            } else {
                imageView = ((图像) obj).f133;
            }
            return imageView.getDrawable();
        }
        return bitmapDrawable;
    }

    public static View a(Context context, LayoutInflater layoutInflater, int i, Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{Context.class});
            declaredConstructor.setAccessible(true);
            ViewGroup viewGroup = (ViewGroup) declaredConstructor.newInstance(new Object[]{context});
            viewGroup.setLayoutParams(new LayoutParams(-2, -2));
            return a(layoutInflater, i, viewGroup);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        layoutInflater.inflate(i, viewGroup);
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeAllViews();
        return childAt;
    }

    public static iActivity a(AppInfo appInfo, Class cls) {
        try {
            Object newInstance = cls.newInstance();
            if (newInstance instanceof iActivity) {
                iActivity iactivity = (iActivity) newInstance;
                AppInfo appInfo2 = iactivity._APPINFO;
                appInfo2.a = appInfo.a;
                appInfo2.aa = appInfo.aa;
                appInfo2.c = appInfo.c;
                appInfo2._st_Cache = appInfo._st_Cache;
                return iactivity;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void a(View view, Object obj, i iVar) {
        if (view != null) {
            Drawable drawable = null;
            if (obj == null) {
                String str = "";
                if (view instanceof RadioButton) {
                    ((RadioButton) view).setText(str);
                    return;
                } else if (view instanceof CheckBox) {
                    ((CheckBox) view).setText(str);
                    return;
                } else if (view instanceof TextView) {
                    ((TextView) view).setText(str);
                    return;
                } else {
                    if (view instanceof ImageView) {
                        ((ImageView) view).setImageDrawable(null);
                    }
                    return;
                }
            }
            String str2 = "(html)";
            String valueOf;
            if (view instanceof RadioButton) {
                if (obj instanceof Boolean) {
                    ((RadioButton) view).setChecked(obj.equals(Boolean.valueOf(true)));
                } else if (obj instanceof Integer) {
                    ((RadioButton) view).setText(view.getContext().getString(s.d(obj)));
                } else {
                    valueOf = String.valueOf(obj);
                    RadioButton radioButton = (RadioButton) view;
                    if (valueOf.startsWith(str2)) {
                        radioButton.setText(Html.fromHtml(valueOf.substring(6)));
                    } else {
                        radioButton.setText(valueOf);
                    }
                }
            } else if (view instanceof CheckBox) {
                if (obj instanceof Boolean) {
                    ((CheckBox) view).setChecked(obj.equals(Boolean.valueOf(true)));
                } else if (obj instanceof Integer) {
                    ((CheckBox) view).setText(view.getContext().getString(s.d(obj)));
                } else {
                    valueOf = String.valueOf(obj);
                    CheckBox checkBox = (CheckBox) view;
                    if (valueOf.startsWith(str2)) {
                        checkBox.setText(Html.fromHtml(valueOf.substring(6)));
                    } else {
                        checkBox.setText(valueOf);
                    }
                }
            } else if (!(view instanceof TextView)) {
                if (view instanceof ImageView) {
                    if (obj instanceof Number) {
                        ((ImageView) view).setImageResource(((Number) obj).intValue());
                    } else if (obj instanceof Drawable) {
                        ((ImageView) view).setImageDrawable((Drawable) obj);
                    } else if (obj instanceof Bitmap) {
                        ((ImageView) view).setImageDrawable(new BitmapDrawable(view.getContext().getResources(), (Bitmap) obj));
                    } else if (obj instanceof txcl) {
                        ((ImageView) view).setImageDrawable(new BitmapDrawable(view.getContext().getResources(), ((txcl) obj).tx));
                    } else if (obj instanceof 图像处理) {
                        ((ImageView) view).setImageDrawable(new BitmapDrawable(view.getContext().getResources(), ((图像处理) obj).f64.tx));
                    } else if (obj instanceof ImageView) {
                        ((ImageView) view).setImageDrawable(((ImageView) obj).getDrawable());
                    } else if (obj instanceof tx) {
                        ((ImageView) view).setImageDrawable(((tx) obj).st.getDrawable());
                    } else if (obj instanceof 图像) {
                        ((ImageView) view).setImageDrawable(((图像) obj).f133.getDrawable());
                    } else if (iVar == null) {
                        ((ImageView) view).setImageDrawable(b(obj, view.getContext()));
                    } else {
                        ImageView imageView = (ImageView) view;
                        valueOf = obj.toString();
                        String toLowerCase = valueOf.toLowerCase();
                        SoftReference softReference = (SoftReference) iVar.b.get(toLowerCase);
                        if (softReference != null) {
                            drawable = (Drawable) softReference.get();
                        }
                        if (drawable != null) {
                            imageView.setImageDrawable(drawable);
                            return;
                        }
                        if (!(toLowerCase.startsWith("http:") || toLowerCase.startsWith("https:"))) {
                            if (!toLowerCase.startsWith("ftp:")) {
                                iVar.b(imageView, valueOf, toLowerCase);
                            }
                        }
                        iVar.a(imageView, valueOf, toLowerCase);
                    }
                }
            } else if (obj instanceof Integer) {
                ((TextView) view).setText(view.getContext().getString(s.d(obj)));
            } else {
                valueOf = String.valueOf(obj);
                TextView textView = (TextView) view;
                if (valueOf.startsWith(str2)) {
                    textView.setText(Html.fromHtml(valueOf.substring(6)));
                } else {
                    textView.setText(valueOf);
                }
            }
        }
    }

    private static Drawable b(Object obj, Context context) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return context.getResources().getDrawable(((Number) obj).intValue());
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("@")) {
            return new BitmapDrawable(context.getResources(), FileProvider.a(context, FileProvider.a(context, obj2)));
        }
        if (!(obj2.startsWith("%") || obj2.startsWith("$"))) {
            if (!obj2.startsWith("/")) {
                if (obj2.startsWith("#")) {
                    return new DatagramSocket(Color.parseColor(obj2));
                }
                e eVar;
                if (obj2.equals("through")) {
                    eVar = new e(context);
                    obj2 = "#10000000";
                    return e.a(Color.parseColor(obj2), Color.parseColor(obj2), Color.parseColor("#00000000"));
                } else if (obj2.equals("white")) {
                    eVar = new e(context);
                    obj2 = "#e6eaf7";
                    return e.a(Color.parseColor(obj2), Color.parseColor(obj2), Color.parseColor("#ffffff"));
                } else if (!obj2.equals("black")) {
                    return obj2.equals("selectableitem") ? a(context, 16843534) : obj2.equals("selectableitemborderless") ? a(context, 16843868) : obj2.matches("[0-9]+") ? context.getResources().getDrawable(Integer.parseInt(obj2)) : null;
                } else {
                    eVar = new e(context);
                    obj2 = "#202020";
                    return e.a(Color.parseColor(obj2), Color.parseColor(obj2), Color.parseColor("#000000"));
                }
            }
        }
        return new BitmapDrawable(context.getResources(), i.runlibrary.a.a.a(FileProvider.a(context, obj2)));
    }
}