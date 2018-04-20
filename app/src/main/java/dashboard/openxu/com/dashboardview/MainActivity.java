package dashboard.openxu.com.dashboardview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import dashboard.openxu.com.dashboardview.dashboard.DashBoardItem;
import dashboard.openxu.com.dashboardview.dashboard.DashBoardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DashBoardView dashBoardView = (DashBoardView)findViewById(R.id.dashBoardView);

        dashBoardView.setLoading(false);
        List<DashBoardItem> dataList = new ArrayList<>();
        dataList.add(new DashBoardItem(Color.GRAY, "普通", 30));
        dataList.add(new DashBoardItem(Color.BLUE, "严重", 40));
        dataList.add(new DashBoardItem(Color.BLACK, "超标", 30));
        //设置数据
        dashBoardView.setData(dataList);
        //设置指标
        dashBoardView.setPro(70);
    }
}
