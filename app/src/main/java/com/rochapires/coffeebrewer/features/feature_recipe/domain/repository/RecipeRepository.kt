package com.rochapires.coffeebrewer.features.feature_recipe.domain.repository

import com.rochapires.coffeebrewer.features.feature_recipe.domain.model.Method
import com.rochapires.coffeebrewer.features.feature_recipe.domain.model.Recipe

interface RecipeRepository {
    suspend fun insertRecipe(recipe: Recipe)
    suspend fun deleteRecipe(recipe: Recipe)

    suspend fun getMethods(): List<Method>
    suspend fun getMethodById(id: String): Method?
    suspend fun getRecipesByMethodId(id: String): List<Recipe>
    suspend fun getRecipeById(id: String): Recipe?
}