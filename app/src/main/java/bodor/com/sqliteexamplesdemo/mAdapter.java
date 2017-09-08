package bodor.com.sqliteexamplesdemo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public class mAdapter extends BaseAdapter {
    private List<Person> mPersonList;
    private Activity mActivity;
    private LayoutInflater mLayoutInflater ;


    public mAdapter(List<Person> mPersonList, Activity mActivity) {
        this.mPersonList = mPersonList;
        this.mActivity = mActivity;
        mLayoutInflater = mActivity.getLayoutInflater();
    }

    @Override
    public int getCount() {
        return mPersonList.size();
    }

    @Override
    public Person getItem(int i) {
        return mPersonList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view ==null){
            view = mLayoutInflater.inflate(R.layout.row,null);
        }

        TextView id = view.findViewById(R.id.text_id);
        TextView name = view.findViewById(R.id.text_name);
        TextView email = view.findViewById(R.id.text_email);

        id.setText(mPersonList.get(i).getId()+"");
        name.setText(mPersonList.get(i).getName());
        email.setText(mPersonList.get(i).getEmail());

        return view;
    }
}
