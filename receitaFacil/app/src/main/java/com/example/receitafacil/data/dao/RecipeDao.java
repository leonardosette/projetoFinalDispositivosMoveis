package com.example.receitafacil.data.dao;

@Dao
public interface RecipeDao {

    @Insert long insert(Recipe recipe);

    @Update void update(Recipe recipe);

    @Delete void delete(Recipe recipe);

    @Transaction
    @Query("SELECT * FROM recipe WHERE id = :id")
    LiveData<RecipeWithDetails> loadRecipe(long id);

    @Query("SELECT * FROM recipe ORDER BY createdAt DESC")
    LiveData<List<Recipe>> loadAll();
}

