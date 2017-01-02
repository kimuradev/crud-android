package poc.com.br.poc.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import poc.com.br.poc.R;
import poc.com.br.poc.model.Contact;

/**
 * Created by Leandro on 02/01/2017.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {


    public ContactAdapter(Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Contact contact = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.txt_nome);
        TextView tvEmail = (TextView) convertView.findViewById(R.id.txt_email);
        // Populate the data into the template view using the data object
        tvName.setText(contact.getName().toString());
        tvEmail.setText(contact.getEmail().toString());
        // Return the completed view to render on screen
        return convertView;
    }


}
