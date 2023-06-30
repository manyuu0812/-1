package com.example.message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class MessageAdapter extends ArrayAdapter<String> {

    private Context context;
    private ArrayList<String> messages;

    public MessageAdapter(Context context, ArrayList<String> messages) {
        super(context, 0, messages);
        this.context = context;
        this.messages = messages;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.message_item, parent, false);
        }

        String message = messages.get(position);

        TextView messageTextView = convertView.findViewById(R.id.messageTextView);
        messageTextView.setText(message);

        return convertView;
    }
}
