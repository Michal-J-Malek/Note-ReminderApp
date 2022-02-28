package com.example.note_efi;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MakeNote extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notey);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater2 = getMenuInflater();
        inflater2.inflate(R.menu.note_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.save) {
            finish();
        }
            return true;
    }
}