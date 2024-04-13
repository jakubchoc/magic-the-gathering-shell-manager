
### Magic Card Finder CLI Application
Welcome to the Magic Card Finder CLI Application! This application allows you to search for Magic: The Gathering cards and sets using simple commands in your command-line interface.

## How to Use
> Clone the Repository: Clone the Git repository to your local machine.

> Build the Application: Build the Spring Boot application using Maven or Gradle.

> Run the Application: Execute the JAR file to start the CLI application.

## Available Commands
### Random: Get a random Magic: The Gathering card.
> Usage: random
 
<img width="1800" alt="Screenshot 2024-04-13 at 21 42 38" src="https://github.com/jakubchoc/magic-the-gathering-shell-manager/assets/87580791/ed2aaa67-1e52-41ef-a881-0a1b48a882a2">

### Name: Get a Magic: The Gathering card by exact name.
> Usage: name [card_name]

> Example: ***name "Lightning Bolt"***

<img width="1800" alt="Screenshot 2024-04-13 at 21 43 23" src="https://github.com/jakubchoc/magic-the-gathering-shell-manager/assets/87580791/a9c62cf5-94f7-4b81-b4b9-740e2d746ec8">

### autocomplete: Get autocomplete suggestions for Magic: The Gathering card names.
> Usage: autocomplete [search_word]

> Example: ***autocomplete "Light"***
After entering the search word, choose one of the suggested cards by entering its corresponding number.

<img width="1800" alt="Screenshot 2024-04-13 at 21 44 09" src="https://github.com/jakubchoc/magic-the-gathering-shell-manager/assets/87580791/21e49305-4014-46bf-9bd9-271c1b9a7925">
<img width="1800" alt="Screenshot 2024-04-13 at 21 44 49" src="https://github.com/jakubchoc/magic-the-gathering-shell-manager/assets/87580791/916061e9-dbbb-4ef4-9393-488e5a431512">

### sets: Get information about a specific Magic: The Gathering set by its code.

> Usage: sets [set code]

> Example: ***sets pip*** Than you can click and show one of cards.

### all sets: Get information about all Magic: The Gathering sets.

> Usage: all sets [sort_by] [reverse_sort]

> Example: ***all sets name true***. Than you can chose one of set by entering set code. Will be open window with graphical view of card and than you can **click** and show one of them.

> Available sorting options: name, date, card_count, released_at.

<img width="1800" alt="Screenshot 2024-04-13 at 21 48 03" src="https://github.com/jakubchoc/magic-the-gathering-shell-manager/assets/87580791/7ae78211-fb2b-4065-8a00-ed2661a331fe">
<img width="1800" alt="Screenshot 2024-04-13 at 21 47 31" src="https://github.com/jakubchoc/magic-the-gathering-shell-manager/assets/87580791/f0c224be-78d2-470f-b72c-4141f4ea0dee">


## API Source
The application uses the API provided by [Scryfall](https://scryfall.com/) to fetch Magic: The Gathering card data.
