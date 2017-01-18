package com.ecar.encryption;


public class EncryUtil  implements IEncryptionUtil{
    static {
        System.loadLibrary("ENCRYP");
    }


    //roadparking
    protected native String mUrlParse(String url);

    protected native String mGetEncryptionValuePair(String url,
                                                    String signKey,
                                                    String appKey,
                                                    String imei,
                                                    String trampTime,
                                                    String sid);

    protected native String mGetEncryptionUrl(String url,
                                              String key);

    //yitingche
    protected native String mGetEncryptionValuePair_YTC(String url, String signKey, String appKey, String imei, String trampTime, String sid);


    //pda
    protected native String mSign(String url, String signParam, String requestKey);


}