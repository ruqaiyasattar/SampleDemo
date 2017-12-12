package sqlitedemo.dell.example.com.sqlite;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 11/11/2017.
 */

public class customAdapter extends ArrayAdapter<contact> {
ArrayList<contact> mContacts;

    public customAdapter(@NonNull Context context, ArrayList<contact> contacts) {
        super(context, 0,contacts);
        mContacts = contacts;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);
        }
        TextView name=convertView.findViewById(R.id.name);
        TextView phone=convertView.findViewById(R.id.phone);
        ImageView del=convertView.findViewById(R.id.del);
        ImageView edit=convertView.findViewById(R.id.update);
        final contact contact1=mContacts.get(position);
        name.setText(contact1.getName());
        phone.setText(String.valueOf(contact1.getPhone()));

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return  convertView;
    }
}
