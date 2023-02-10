package service;

import model.Ingredient;
import model.Recipe;

import java.util.Optional;

public interface RecipeService {
    Recipe save(Recipe recipe);

    Optional<Recipe> getById(Long id);
}
