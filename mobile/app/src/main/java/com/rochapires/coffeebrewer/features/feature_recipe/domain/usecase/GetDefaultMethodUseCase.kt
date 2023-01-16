package com.rochapires.coffeebrewer.features.feature_recipe.domain.usecase

import com.rochapires.coffeebrewer.features.feature_recipe.domain.repository.UserPreferencesRepository

class GetDefaultMethodUseCase(
    private val repository: UserPreferencesRepository
) {
    suspend operator fun invoke(): Int?  {
        return repository.getDefaultMethod()
    }
}