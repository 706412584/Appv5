package i.runlibrary.b;

import java.io.FileInputStream;

public final class e {
    private static long a(FileInputStream fileInputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (fileInputStream.available() > 0) {
            j += (long) fileInputStream.read(bArr, 0, 4096);
        }
        return j;
    }

    /*  JADX ERROR: NullPointerException in pass: BlockSplitter
        java.lang.NullPointerException: Attempt to invoke virtual method 'boolean jadx.core.dex.attributes.AttrNode.contains(jadx.core.dex.attributes.AType)' on a null object reference
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.connectExceptionHandlers(Unknown Source:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.setupConnections(Unknown Source:58)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.splitBasicBlocks(Unknown Source:22)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(Unknown Source:13)
        	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:9)
        	at jadx.core.dex.visitors.DepthTraversal.visit(Unknown Source:41)
        	at jadx.core.ProcessClass.process(Unknown Source:54)
        	at jadx.core.ProcessClass.processDependencies(Unknown Source:22)
        	at jadx.core.ProcessClass.process(Unknown Source:68)
        	at jadx.api.JadxDecompiler.processClass(Unknown Source:4)
        	at jadx.api.JavaClass.decompile(Unknown Source:19)
        */
    public static boolean a(android.content.Context r13, android.net.Uri r14, java.io.File r15) {
        /*
        r0 = "r";
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 1;
        r3 = 24;
        if (r1 >= r3) goto L_0x0016;
    L_0x0009:
        r13 = r14.getPath();
        r14 = r15.getAbsolutePath();
        r13 = i.runlibrary.a.d.a(r13, r14, r2);
        return r13;
    L_0x0016:
        r3 = r13.getContentResolver();
        r1 = 0;
        if (r3 == 0) goto L_0x00da;
    L_0x001d:
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r4 = r14;
        r3 = r3.query(r4, r5, r6, r7, r8);
        if (r3 == 0) goto L_0x00da;
    L_0x0028:
        r3.moveToFirst();
        r4 = "_size";
        r4 = r3.getColumnIndex(r4);
        r4 = r3.getLong(r4);
        r6 = 0;
        r8 = 0;
        r9 = r13.getContentResolver();	 Catch:{ Exception -> 0x0072 }
        r9 = r9.openAssetFileDescriptor(r14, r0);	 Catch:{ Exception -> 0x0072 }
        r10 = r9.getLength();	 Catch:{ Exception -> 0x006f }
        r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r12 == 0) goto L_0x004d;
    L_0x0048:
        r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r12 <= 0) goto L_0x004d;
    L_0x004c:
        r4 = r10;
    L_0x004d:
        r10 = r9.createInputStream();	 Catch:{ IOException -> 0x006d }
        r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r11 != 0) goto L_0x0078;
    L_0x0055:
        r4 = a(r10);	 Catch:{ IOException -> 0x0069, Exception -> 0x006b }
        r10.close();	 Catch:{ IOException -> 0x005c, Exception -> 0x006b }
    L_0x005c:
        r11 = r13.getContentResolver();
        r9 = r11.openAssetFileDescriptor(r14, r0);
        r10 = r9.createInputStream();
        goto L_0x0078;
        goto L_0x0078;
        r0 = move-exception;
        goto L_0x0075;
        r10 = r8;
        goto L_0x0078;
        r0 = move-exception;
        r10 = r8;
        goto L_0x0075;
        r0 = move-exception;
        r9 = r8;
        r10 = r9;
    L_0x0075:
        r0.printStackTrace();
    L_0x0078:
        if (r10 != 0) goto L_0x009d;
    L_0x007a:
        r0 = r13.getContentResolver();	 Catch:{ Exception -> 0x009c }
        r0 = r0.openInputStream(r14);	 Catch:{ Exception -> 0x009c }
        r0 = (java.io.FileInputStream) r0;	 Catch:{ Exception -> 0x009c }
        r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r10 != 0) goto L_0x009a;
    L_0x0088:
        a(r0);	 Catch:{ Exception -> 0x009a }
        r0.close();	 Catch:{ IOException -> 0x008e }
    L_0x008e:
        r13 = r13.getContentResolver();
        r13 = r13.openInputStream(r14);
        r13 = (java.io.FileInputStream) r13;
        r10 = r13;
        goto L_0x009d;
    L_0x009a:
        r10 = r0;
        goto L_0x009d;
    L_0x009d:
        if (r10 == 0) goto L_0x00d2;
    L_0x009f:
        r13 = r15.getParentFile();	 Catch:{ Exception -> 0x00c3 }
        r14 = r13.exists();	 Catch:{ Exception -> 0x00c3 }
        if (r14 != 0) goto L_0x00ac;	 Catch:{ Exception -> 0x00c3 }
    L_0x00a9:
        r13.mkdirs();	 Catch:{ Exception -> 0x00c3 }
    L_0x00ac:
        r13 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x00c3 }
        r13.<init>(r15);	 Catch:{ Exception -> 0x00c3 }
        r14 = 6666; // 0x1a0a float:9.341E-42 double:3.2934E-320;
        r14 = new byte[r14];	 Catch:{ Exception -> 0x00bf }
    L_0x00b5:
        r15 = r10.read(r14);	 Catch:{ Exception -> 0x00bf }
        if (r15 <= 0) goto L_0x00c9;	 Catch:{ Exception -> 0x00bf }
    L_0x00bb:
        r13.write(r14, r1, r15);	 Catch:{ Exception -> 0x00bf }
        goto L_0x00b5;
        r14 = move-exception;
        r8 = r13;
        r13 = r14;
        goto L_0x00c4;
        r13 = move-exception;
    L_0x00c4:
        r13.printStackTrace();
        r13 = r8;
        r2 = 0;
    L_0x00c9:
        if (r13 == 0) goto L_0x00ce;
    L_0x00cb:
        r13.close();	 Catch:{ IOException -> 0x00ce }
    L_0x00ce:
        r10.close();	 Catch:{ IOException -> 0x00d1 }
        r1 = r2;
    L_0x00d2:
        if (r9 == 0) goto L_0x00d7;
    L_0x00d4:
        r9.close();	 Catch:{ IOException -> 0x00d7 }
    L_0x00d7:
        r3.close();	 Catch:{ Exception -> 0x00da }
    L_0x00da:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: i.runlibrary.b.e.a(android.content.Context, android.net.Uri, java.io.File):boolean");
    }
}