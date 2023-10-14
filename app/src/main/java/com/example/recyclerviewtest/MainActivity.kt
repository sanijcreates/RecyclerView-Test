package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var contacts: ArrayList<Contact>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rvContacts = findViewById<View>(R.id.rvContacts) as RecyclerView

        contacts = Contact.createContactsList(20)

        val adapter= ContactsAdapter(contacts)

        rvContacts.adapter = adapter

        rvContacts.layoutManager = LinearLayoutManager(this)

    }
}