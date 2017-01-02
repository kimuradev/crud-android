package poc.com.br.poc;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CursorAdapter;
import android.widget.ListView;

import java.util.List;

import poc.com.br.poc.adapter.ContactAdapter;
import poc.com.br.poc.handler.DataBaseHandler;
import poc.com.br.poc.model.Contact;

/**
 * Created by Leandro on 02/01/2017.
 */

public class ListViewActivity extends AppCompatActivity{

    private SQLiteDatabase database;
    private CursorAdapter dataSource;

    private ListView listView;
    private DataBaseHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_activity);

        dbHandler = new DataBaseHandler(this);

        List<Contact> contacts = dbHandler.getAllContacts();

        ListView contactList = (ListView) findViewById(R.id.list);

        /*ArrayAdapter<Contact> adapter = new ArrayAdapter<Contact>(this,
                android.R.layout.simple_list_item_1, contacts);
        contactList.setAdapter(adapter);*/

        //Using custom adapter
        ContactAdapter cAdapter = new ContactAdapter(this,R.layout.list_item, contacts);
        contactList.setAdapter(cAdapter);
    }
}
