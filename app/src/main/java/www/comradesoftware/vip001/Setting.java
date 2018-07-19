package www.comradesoftware.vip001;

public class Setting implements www.comradesoftware.vip.i.ISetting {

    @Override
    public String getAppID() {
        return "vip";
    }

    @Override
    public String getAppName() {
        return "会员app";
    }

    @Override
    public boolean getDebug() {
        return false;
    }

    @Override
    public String getDomain() {
        return "http://app.1m1m.cc/";
    }

}
