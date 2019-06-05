package movie.bw.com.zing;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * @Author：梁金子
 * @Date：2019/6/5 19:40
 * @Description：描述信息
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }
}
