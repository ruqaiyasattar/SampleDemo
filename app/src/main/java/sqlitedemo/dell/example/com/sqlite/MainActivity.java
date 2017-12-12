package sqlitedemo.dell.example.com.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public  EditText name;
    public  EditText phone;
    public Button save,get;
    public ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // name=(EditText)findViewById(R.id.name);
       // phone=(EditText)findViewById(R.id.phone);
        //save=(Button) findViewById(R.id.save);
        //get=(Button)findViewById(R.id.get);
        mListView=(ListView)findViewById(R.id.show);

  //      String nam=name.getText().toString();
//        int phon= Integer.parseInt(phone.getText().toString());

        ArrayList<contact> contacts=new ArrayList<>();
        contacts.add(new contact("name",1223));

        contacts.add(new contact("name",1223));

        contacts.add(new contact("name",1223));
        customAdapter adapter=new customAdapter(this,contacts);
        mListView.setAdapter(adapter);

    }


}
