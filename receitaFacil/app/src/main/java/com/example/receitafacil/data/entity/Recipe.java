package com.example.receitafacil.data.entity;

@Entity(tableName = "recipe")
public class Recipe {
    @PrimaryKey(autoGenerate = true) public long id;
    @NonNull public String name;
    public String description;
    public String photoUri;
    public String category;
    public long createdAt;
}

