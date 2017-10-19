package com.example.best_fan.beautiful_weather.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.best_fan.beautiful_weather.R;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/14.
 */

public class WeatherAdapter extends BaseAdapter {
    private List<Map<String, Object>> mdate;
    private LayoutInflater mInflater = null;

    public WeatherAdapter(Context context, List<Map<String, Object>> date)
    {
        //根据context上下文加载布局，这里的是Demo17Activity本身，即this
        this.mInflater = LayoutInflater.from(context);
        this.mdate=date;
        Log.i("tag", "WeatherAdapter: "+mdate);
    }
    @Override
    public int getCount() {
        //How many items are in the data set represented by this Adapter.
        //在此适配器中所代表的数据集中的条目数
        return mdate.size();
    }
    @Override
    public Object getItem(int position) {
        // Get the data item associated with the specified position in the data set.
        //获取数据集中与指定索引对应的数据项
        return mdate.get(position);
    }
    @Override
    public long getItemId(int position) {
        //Get the row id associated with the specified position in the list.
        //获取在列表中与指定索引对应的行id
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        //如果缓存convertView为空，则需要创建View
        if(convertView == null)
        {
            holder = new ViewHolder();
            //根据自定义的Item布局加载布局
            convertView = mInflater.inflate(R.layout.listview, null);
            holder.img = (ImageView)convertView.findViewById(R.id.iv_icon);
            holder.date = (TextView)convertView.findViewById(R.id.tv_date);
            holder.weather = (TextView)convertView.findViewById(R.id.tv_weather);
            holder.temp=convertView.findViewById(R.id.tv_temp);
            //将设置好的布局保存到缓存中，并将其设置在Tag里，以便后面方便取出Tag
            convertView.setTag(holder);
        }else
        {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.img.setImageResource((Integer) mdate.get(position).get("img"));
        holder.weather.setText((String)mdate.get(position).get("weather"));
        holder.date.setText((String)mdate.get(position).get("date"));
        holder.temp.setText((String)mdate.get(position).get("temp"));

        return convertView;
    }

    //ViewHolder静态类
    static class ViewHolder
    {
        public ImageView img;
        public TextView weather;
        public TextView date;
        public TextView temp;

    }
}
