package com.example.mvvmgroceryapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//This is a data class that will store data.
//The GroceryEntitites class will create a table in the database.
//Inside of the database it will contain three columns.
//Pay close attention to the syntax here as we can use this syntax for
//future Room Database implementations
@Entity(tableName = "grocery_items")

data class GroceryEntities(

    //create an itemName variable to store names of grocery items.
    @ColumnInfo(name = "itemName")
    var itemName: String,

    //create itemQuantity variable store store quantity of grocery items.
    @ColumnInfo(name = "itemQuantity")
    var itemQuantity: Int,

    //create an itemPrice variable to store price of grocery items.
    @ColumnInfo(name = "itemPrice")
    var itemPrice: Int
) {
    //Primary key is a unique key for use with different databases or tables.
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
