package bodor.com.sqliteexamplesdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText textid,textname,textemail;
    Button add,update,delete;
    ListView lstPerson;

    List<Person> data = new ArrayList<>();
    DataBaseHelper db;
    private mAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DataBaseHelper(this);

        add = (Button) findViewById(R.id.add);
        update = (Button) findViewById(R.id.update);
        delete = (Button) findViewById(R.id.delete);
        lstPerson = (ListView) findViewById(R.id.container);

        textid = (EditText) findViewById(R.id.Id_input);
        textname = (EditText) findViewById(R.id.Name_input);
        textemail = (EditText) findViewById(R.id.Email_input);
        refreshData();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person person  = new Person(Integer.parseInt(textid.getText().toString()),textname.getText().toString(),textemail.getText().toString());
                db.addPerson(person);
                refreshData();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person person  = new Person(Integer.parseInt(textid.getText().toString()),textname.getText().toString(),textemail.getText().toString());
                db.updatePerson(person);
                refreshData();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person person  = new Person(Integer.parseInt(textid.getText().toString()),textname.getText().toString(),textemail.getText().toString());
                db.deletePerson(person);
                refreshData();
            }
        });

    }





    private void refreshData(){
        data = db.getAllPerson();
        adapter = new mAdapter(data,MainActivity.this);
        lstPerson.setAdapter(adapter);
    }

}
