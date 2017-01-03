package poc.com.br.poc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import poc.com.br.poc.handler.DataBaseHandler;
import poc.com.br.poc.model.Contact;

public class MainActivity extends AppCompatActivity {

    private EditText edtNome;
    private EditText edtEmail;
    private Button btnSubmit, btnListar;
    private DataBaseHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edt_nome);
        edtEmail = (EditText) findViewById(R.id.edt_email);
        btnSubmit = (Button) findViewById(R.id.btn_submit);
        btnListar = (Button) findViewById(R.id.btn_listar);

        db = new DataBaseHandler(this);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, edtNome.getText() + " - " + edtEmail.getText(), Toast.LENGTH_SHORT).show();
                db.addContact(new Contact(edtNome.getText().toString(), edtEmail.getText().toString()));
            }
        });


        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(i);
                finish();
                /*List<Contact> contacts = db.getAllContacts();

                for (Contact cn : contacts) {
                    String log = "Id: " + cn.getId() + " ,Name: " + cn.getName() + " ,Email: " + cn.getEmail();
                    // Writing Contacts to log
                    Log.d("Name: ", log);
                }*/
            }
        });
    }

    public boolean checker(String s){
        return true;
    }

}
