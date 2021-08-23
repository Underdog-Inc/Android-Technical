# Underdog Technical Challenge
Given the current skeleton of a project, let's complete the implementation to get something on screen. I would like you to build a simple scrolling grid of characters. You can find information on the structure of your data below, along with some other resources that are already included in the project.

For the screen, I would like to see a **loading state** immediately (let's assume the data came from an actual API), then a 2xN grid of scrolling items that each display character name, number of episodes, image, and if they are favorited or not (heart icon).  UI decisions are up to you, but let's keep it simple for the sake of time.  Upon clicking the heart icon, it should toggle accordingly.

If there is time, I would like you to:
    
1. Persist the favorited Characters between app launches
2. Implement `CharacterViewModel.onCharacterUpdated()`

## Picasso
Image loading library: https://square.github.io/picasso/

## Moshi
JSON (de)serialization library: https://github.com/square/moshi

## API Documentation
The data we are working with for this project can be found here: https://rickandmortyapi.com/documentation

## JSON Format
Located inside the `../src/main/res/raw` folder, there exists a file named `characters.json`.  This file contains a well formatted JSON object that contains a list of `Character` objects. Each character follows this structure:
```
id: Int (unique)
name: String,
status: String,
species: String,
type: String,
gender: String,
origin: Origin(name: String, url: String)
location: Location(name: String, url: String)
episode: List<String>?
url: String (image url)
created: String (ISO timestamp)
```