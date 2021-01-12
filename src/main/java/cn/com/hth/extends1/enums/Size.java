package cn.com.hth.extends1.enums;

public enum Size {
    SMALL("S","SS"),
    MEDIUM("M","SS");


    private String ss;
    private    String aa ;
    private Size(String aa,String ss) {
        this.ss = ss;
        this.aa = aa;
    }

    public String getSs() {
        return ss;
    }

    public String getAa() {
        return aa;
    }
}
